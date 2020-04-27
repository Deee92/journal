## [A Sense of Self for Unix Processes](https://www.cs.ubc.ca/~krasic/cse585/forrest96sense.pdf)

### Introduction

Computer security methods based on the way natural immune systems know themselves from other intruders\
"Artificial immune systems" with a rich sense of identity and protection\
Layer of general-purpose protection to augment current computer security systems\
A definition of self, complementary to traditional crypto and deterministic approaches

Analogy:
- specific immune response is a secondary mechanism that sits behind passive barriers like skin, mucous membrane
- innate responses like generalized inflammatory mechanisms

Natural immune system has several properties that are parallel to robust computer security
1. detection distributed, each copy of detection system unique
2. detection probabilistic and online
3. detectors designed to recognize foreign particles, not only ones have been previously seen

At file-authentication level, self = statically defined in terms of files containing programs and protected data

For general-purpose protective capabitlity, more flexible sense of self needed

Sense of self more dynamic for a computer system than for natural immune systems\
Users update software, edit files, run programs, new users and new machines added to network ...\
Definition of self must be sensitive to dangerous foreign activities

This paper gives preliminary results for a definition of self for Unix processes\
self == normal behavior\
short sequences of system calls in running processes generate a stable signature for normal behavior\
This signature
- has low variance over a wide range of normal operating conditions, is specific to each different kind of process, provides clear separation between different kinds of programs
- has a high probability of being perturbed when abnormal activities like attacks or attempts

### Related Work

Two basic approaches to intrusion detection
- misuse: known patterns of intrusion (intrusion signatures) used to identify
- anomaly: assumes that nature of intrusion is unknown, but that intrusion results in different behavior than normal
- combination of both: e.g., IDES

This paper considers anomaly detection\
Most of the previous work in anomaly detection considers anomalies in user behavior, user behaving out of character\
Anomalies detected via
- statistical profiles of users (IDES): Generation of user profiles is slowly adaptive (gradually accomodating changing user behavior), requires audit trail of actions for each user, abrupt changes flagged as irregular and indentified with intrusions
- inductive pattern generation (TIM)
- neural networks
- determination of normal behavior for privileged processes that run as root: no user profiles need to be defined, use of a program specification language to formally specify allowed operations (system calls and their parameters) => this paper is similar, except it uses a simpler representation of normal behavior instead of a formal specification and it ignores parameters

## _Expected program behavior accumulated by tracing normal runs of program_

### Definition of self

Program code stored on disk unlikely to cause damage until it runs\
System damage caused by running programs that execute system calls\
Root (privileged) processes
- more risky, dangerous than regular user processes
- have access to more resources
- limited range of behavior
- behavior relatively stable over time
- if they listen on a port, constitute a natural boundary for intruders
- Limitation: difficult to detect an intruder masquerading as another user if already in

=> attention paid to system calls by running privileged processes\

Every program implicitly defines a set of system call sequences that it can produce\
A subset of these produced during actual execution\
For any non-trivial program, actual sequence of system calls issued is huge\
**Short-term or local sequences are relatively consistent => can be used to define "normal" behavior or "self"**

Self or normal behaviour defined in terms of short sequences (lengths 5, 6, 11) of system calls in a running process 
Build a separate database of normal behavior for each process of interest, database specific to a particular architecture, software version, configuration, admin policies, usage patterns => unique definition of self for most systems\
(ignoring parameter values passed to system calls, timing info, instruction sequences between system calls)\
Construct stable database for a process, monitor ongoing process behavior\
mismatch in normal sequence from database and monitoring => anomaly

### Details

Two stages in algorithm:
1. scan traces of normal behavior, build database of characteristic normal patterns (observed sequences of system calls); trace forks individually, included with normal
2. scan new traces that might contain abnormal behavior (patterns not present in normal database)

example system call trace:
`open, read, mmap, mmap, open, getrlimit, mmap, close`\
database of normal behavior built by sliding window of size `k+1` across system call trace, one call may have many possible sequence of calls
e.g.,\
`open read mmap mmap`\
`open getrlimit mmap close`\

new traces checked against database with normal behavior via sliding window of size `k+1`, determining difference, check for presence and absence of legal sequences, record number of mismatches as a percentage of total possible number of mismatches\

new trace:
`open, read, mmap, open, open, getrlimit, mmap, close`\
sliding window sequence:
`open read mmap open`\
`open open getrlimit mmap`\
=> MISMATCH => ABNORMAL

O(N) where N is length of trace

### Experiments

1. What size database needed to capture normal behavior? If database small, it defines a compact signature for a process that can be checked at runtime; If database large, checking at runtime will be expensive; size of database gives an estimate of variability in normal behavior of process
  - related question: how much normal behavior to sample to provide good coverage of the set of allowable sequences?
2. What percentage of possible system call sequences is covered by database of "normal" system call sequences?
3. Does this definition of normal behavior distinguish between different kinds of programs?
4. Does this definition of normal behavior detect anomalous behavior?

Focus on two programs
- `sendmail` - varied, complex, has documented attacks to test against
- `lpr` - smaller, more limited behavior

#### Building a normal database
- decisions about how much, what kind of normal behavior is appropriate
- generate artificial set of test messages to exercise all normal modes, or **_monitor real user mail_**, or a combination of the two

Enumerate potential sources of variation for normal `sendmail` operation - message length, number of messages, message content type, subject line, sender, receiver, mailers, forwarding, bounced emails, queuing...\
Generate 112 artificial set of test messages, with a combined length of > 1.5 million system calls\
Window size = 5, 6, 11\
for sliding window of 6, database produced with nearly 1500 entries\
database with traces of normal behavior compared with new trace\
If too much variability in normal behavior, anomalies/intruders might never be detected\
Runs made for 10000 system calls worth of behavior, and upto 1.5 million system calls - essentially zero mismatches from normal behavior\
Overall variability in normal behavior of `sendmail` at system call level was much smaller than expected => anomalies easier to detect

#### Distinguishing between processes
Testing of several processes against `sendmail` database with 1500 entries\
Significant number of "abnormalities" detected because very different functionality from `sendmail`, especially in case of `lpr`\
**_behavior of different processes easily distinguishable using sequence information alone_**

#### Anomalous behavior
Three types of behavior that differ from that of normal `sendmail`:
- traces of successful intrusions - 4 attacks executed and traced
- traces of failed attempts at intrusion - 2 unsuccessful attacks blocked by patches that were in place
- traces of error conditions - 1 (a forwarding loop / email bounce between machine to machine)
Each of these kinds of mismatches were compared with normal database and their numbers recorded\

### Discussion

Short sequences of system calls define a stable signature that can detect some common sources of anomalous behavior in `sendmail` and `lpr`.\
method requires easy computation, not a lot of storage, can be done online (at runtime) by kernel checking each system call made by processes running as root\
real-world data would help confirm the nature of normal behavior in practice\
two important assumptions of approach:
1. sequence of system calls executed by program is locally consistent during normal operation - satisfied by most programs because their code is usually static, system calls occur at fixed places within code; conditionals and function calls change relative order of system calls but don't necessarily add variations to short-range correlations 
2. some unusual short sequences of system calls will be executed when a security hole in a program is exploited - attack likely to be noticed if program enters unusual error state during attempted break-in, error condition executes a sequence of system calls not already covered by normal database; if intruder replaced/introduced code in running program; intruder forks running process to take control of system - will most likely be detected

Cases not covered
- race conditions
- intruder using another user account
- definition of self not evolving over time, unlike natural immune system
Method not designed to be cryptographically strong or completely reliable discriminator between normal and abnormal behavior, but as a lightweight real-time, perhaps secondary, tool for continuously checking executing code\
Additional mechanisms for more comprehensive security

Database also based on process environment, normal for one may be abnormal for another\
First step in building an artificial immune system for a computer, signature for self that is stable across a wide variety of normal behavior, sensitive to some anomalies, unique signature for different kinds of processes, considers dynamic patterns of activity rather than just static components

### Conclusion
Simple, practical, computationally efficient intrusion detection\
Inspired by human immune system\
Definition of self for privileged Unix processes in terms of normal patterns of short sequences of system calls\
Possible to distinguish between different processes this way\
Detection of foreign, abnormal behavior\
Not able to detect all attacks\

