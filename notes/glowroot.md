### Current and planned workflow

1. Application source code (jitsi-videobridge / ttorrent / hedwig) vX.Y
2. Source code of this application as argument to pankti jar
3. Pure methods as per criteria
4. Build and run application with workload, attach glowroot as java agent (`java -jar -javaagent:path/to/glowroot.jar path/to/application-under-test.jar`)
5. Configure instrumentation (via JSON?) for all the pure methods in application
6. Export traces
7. Generate test cases with I/O pairs for all of these methods
Implementation ideas:
- Add json-only plugin to glowroot/plugins like [so](https://github.com/Deee92/journal/blob/master/notes/ttorrent.plugin.json)
- `java -javaagent:/path/to/glowroot/glowroot.jar -jar /path/to/ttorrent/cli/build/ttorrent-version-shaded-jar.jar -d 2 -o /path/to/download/directory /path/to/torrent/file.torrent`
- later: export json config for all pure methods to json plugin
- `java -jar /path/to/h2/bin/h2*.jar`, set JDBC url to `jdbc:h2:/path/to/glowroot/data/data`, browse traces, ...

### Background

#### Java agents
- Java source code compiled into bytecode (class files)
- Tnese dynamically linked and loaded into JVM for execution
- Java agents sit between the JVM and an application, lets us introduce logic into the compiled application code without modifications to source code
- Java agents do so through instrumentation
- Instrumentation: Modifying bytecode before it is dynamically loaded - several reasons why we might want to do that:
   - profiling: use of resources, ...
   - tracing: order of executions, I/O pairs for methods, ...
- Instrumentation libraries: ASM, Javassist, Bytebuddy, Spoon, ... (Glowroot also has an Instrumentation API)
- See Java instrumentation API (`java,lang.instrument`), JVM Tool Interface ([JVMTI](https://www.oracle.com/technical-resources/articles/javase/jvmti.html)) which implements JNI
- [Flame graphs](http://www.brendangregg.com/flamegraphs.html)

#### Profiling and flame graphs
- [Example](http://www.brendangregg.com/FlameGraphs/cpu-bash-flamegraph.svg)
- Visualization of a collection of stack traces
- x-axis => alphabetical stack sort (not ordered by timestamp) => can be merged
- y-axis => stack depth
- color => random / dimension
- width => number of samples
- TOS => what is running on CPU directly
- A wide TOS frame => (or its ancestors) candidate for optimization 
- Can take input from many profilers
- Understanding method calls in an unfamiliar application, the trace along an execution
- Can search with Ctrl-F, matched frames highlighted to show functions that may otherwise be scattered around
- Variants exist: flamegraphdiff in CI, icicle graphs are upside down
- Flame graph != flame chart (x-axis means time, usually for a single-threaded application)
- [Profiling Software Using perf and Flame Graphs](https://www.percona.com/blog/2019/11/20/profiling-software-using-perf-and-flame-graphs/)
- [Java performance profiling using flame graphs](https://medium.com/@maheshsenni/java-performance-profiling-using-flame-graphs-e29238130375)
- [How to profile JVM applications](https://www.lightbend.com/blog/profiling-jvm-applications)
- [The JVM on Fire – Using Flame Graphs to Analyse Performance](https://blog.codecentric.de/en/2017/09/jvm-fire-using-flame-graphs-analyse-performance/)
- [Profiling Java Applications with Async Profiler](https://hackernoon.com/profiling-java-applications-with-async-profiler-049s2790)
- https://github.com/cykl/hprof2flamegraph
- `java -agentpath:/home/user/dev/honest-profiler/liblagent.so=interval=7,logPath=/home/user/dev/honest-profiler/log.hpl -jar /home/user/ttorrent/cli/build/ttorrent-cli-1.2-shaded.jar -o ~/Downloads ~/Downloads/ubuntu-20.04-desktop-amd64.iso.torrent`
- With hprof2flamgefraph
  - `python3 stackcollapse_hpl.py /home/user/dev/honest-profiler/log.hpl > /home/user/dev/honest-profiler/output-folded.txt`
  - `perl flamegraph.pl /home/user/dev/honest-profiler/output-folded.txt > /home/user/dev/honest-profiler/output.svg`
- [Ttorrent - Profiling interval 7ms](https://github.com/Deee92/journal/blob/master/images/output7.svg)
- [Ttorrent - Profiling interval 3ms](https://github.com/Deee92/journal/blob/master/images/output3.svg)
- [Ttorrent - Profiling interval 1ms](https://github.com/Deee92/journal/blob/master/images/output1.svg)

#### Monitoring with [Glowroot](https://glowroot.org/)
- Low-overhead [APM](https://en.wikipedia.org/wiki/Application_performance_management) tool
- Embedded controller for standalone applications
- Central controller for distributed applications
- Web and background transactions
- Average, percentile, throughput response time
- Traces for slow requests and errors
- DB queries
- Thread and JVM profiling (and flame graphs)
- [Glowroot wiki](https://github.com/glowroot/glowroot/wiki)
- [@glowroot](https://twitter.com/glowroot/)

#### Instrumentation with Glowroot
1. Instrumentation UI
Easiest. Run Glowroot, use instrumentation UI, autocompletion, apply directly in UI, existing bytecode will be transformed on the fly => test new instrumentation instantly
2. Agent API ([javadoc](https://glowroot.org/javadoc/agent-api/0.13.6/))
Direct use by application code. Dependency on Agent API jar, annotate application code to give Glowroot additional details
3. JSON-only plugin
Build your instrumentation in the Instrumentation UI, then export all => this generates JSON instrumentation definitions that can be pasted into JSON-only plugin, drop this file into glowroot/plugins and restart JVM
4. Plugin API ([javadoc](https://glowroot.org/javadoc/agent-plugin-api/0.13.6/))
For more complex plugins => build jar with plugin class files and json file, drop into glowroot/plugins and restart JVM
Glowroot-official plugins for libraries and frameworks [here](https://github.com/glowroot/glowroot/tree/master/agent/plugins)
Examples
- [Test Glowroot Custom Plugin Jvm Instrumentation](http://arnaud-nauwynck.github.io/2019/05/10/Glowroot-custom-plugin.html)
- [A Custom Plugin for Apache Axis with Glowroot](https://thejavablog.wordpress.com/category/glowroot/)
TODO: figure out where to integrate instrumentation - application or tool

#### Glowroot community
_(TODO: find more, not exhaustive)_
- https://github.com/thefreebit/bullfrog
- https://www.meetup.com/fr-FR/Melbourne-Java-JVM-Users-Group/events/mjvzxlyxfbkb/
- https://www.oodlestechnologies.com/blogs/Setup-Glowroot-APM-for-Java-Application/
- https://www.xwiki.org/xwiki/bin/view/Documentation/AdminGuide/Monitoring
- https://wiki.deepnetsecurity.com/display/KB/How+to+use+Glowroot+with+DualShield
- https://thegreenbar.wordpress.com/2018/05/12/cool-tool-glowroot/
- http://programmersought.com/article/3227861542/;jsessionid=B5B73C713C4627F649A1C62E707F8388
- http://www.resileo-labs.com/server-monitoring

