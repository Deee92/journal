## [High Performance Computing](https://www-sciencedirect-com.focus.lib.kth.se/book/9780124201583/high-performance-computing)

### Chapter 1
**Supercomputers** - applications, impact in essentially all fields
- Initially for experimental nuclear research
- Rows of blinking lights, huge, noisy machines
- Maximized computational cabability + minimized time
- Workload/application/program for HPC represents the problem that otherwise might not be solved through empirical study/analysis/regular commercial computers - problems only HPCs can solve (read black hole mergers!)
- Factors that contribute to advancement of HPC/HPC is an interrelation of:
  - technology
  - architecture
  - programming methods
  - algorithms
  - system software (OS)
- Studying HPC:
  - supercomputing concepts
  - supercomputers
  - using and programming supercomputers
- Usual metrics to measure performance:
  - time
  - number of operations
- For HPCs, `flops` most common metric
  - floating-point operation = + or * of two real numbers (floats) represented in machine form
  - first supercomputer barely got kflops
  - today's fastest = 125 petaflops (10^15) => a quadrillion flop per second
  - benchmarked against standard programs (eg., "Linpack or HPL") for comparative eval (i.e., running equivalent programs "benchmarks"))
- Supercomputers
  - SOTA hardware
  - software that 
    - manages user workloads
    - has functions to transform user data to output results
    - manages internal memory
    - maintains (inter- and intra-) communication channels
    - manages mass/persistent storage for data, applications, software
    - handles IO channels
    - so basically, all the components of an OS - but scaled up
- Scale here => physical, logical parallelism
- Parallel: many things happening at the same time
- Distributed: things happening at a distance 
- User interfaces through programming lanugages, libraries, tools/libraries that help manipulate applications
- Important issues concerning performance
  - parallelism (most important), determining when task is performed + synchronization wrt resource sharing
  - determinism
  - correctness
  - performance debugging
  - performance portability
- Granularity of workloads determine programming model (and choice of parallelization library):
  - medium- or coarse-grained: no interactivity, "embarrassingly-parallel", "job-stream", highly-scaled massively parallel processors (MPPs) and clusters (sequential processes like **MPI** and variants)
  - fine-grained: multiple-threads, shared-memory system programming interfaces (**OpenMP**, **Cilk++**)

#### Supercomputer anatomy
- _Titan_ (ORNL) by Cray Inc. was fastest in 2012, still among top 10, 4000 sq ft, 27 petaflops, general-purpose, scientific research
- Heterogeneous architecture:
  - multiple processor/memory nodes (each node with a local OS instance)
  - lightweight OS kernel, system-wide OS
  - persistent storage + IO
  - runtime systems: user threads, address space, sync, ...
  - workflow management: languages, programming env tools/libraries, ...
  - applications
  - ...
- _Moore's law_ (Gordon Moore, co-founter, Intel): number of transistors on IC (device density) doubles ~ every 2 years.
- _Peak performance_: maximum rate at which operations can be accomplished theoretically by supercomputer hardware resources; usually measured in terms of flops; determined by combination of clock rate and hardware parallelism.
- _Sustained performance_: often less than peak performance, considered as a better metric; total average performance of application obtained over entire execution, total ("**wall clock time**", "**timeto solution**") required to complete program
- _Scalability_: ability to achieve increased performance for application by using bigger machines (in terms of processor cores)
- _Performance degradation_: all of system resources not utilized at all times; not due to a single part of system (measures exist to minimize degradation); sources of performance degradation:
  - **S** starvation: absence of work due to (lack of) parallelism, work not distributed evenly so as to keep all system resources busy
  - **L** latency: time taken by info to travel from one part of system to another, solutions include using cache hierarchies and multithreading
  - **O** overhead: amount of additional work beyond that actually required for computation; necessary for scheduling, resource management, synchronization, address translation, ... Overhead wastes operation time, resources; affects scalability and starvation
  - **W** waiting for contention: threads wait for access to resources, only one thread can be given access to the same single resource (hardware/software) at one time, another must wait till resource is freed. Often unpredictable.
- _Performance debugging/improvement_: hardware scaling, parallel algorithms, performance monitoring and profiling, work and data distribution, task granularity control, compiler optimizations, ... Increasing the nodes employed in the execution of application can improve performance but comes with its share of overhead (data and task distribution, synchronization, cache and TLB misses, page fault, ...)

#### Supercomputing history
- Continuous need to increase speed and concurrency
- Advancements in computer architecture and programming models
- Seven epochs:
  1. automated calculators through mechanical technologies
  2. von Neumann architecture in vacuum tubes
  3. instruction-level parallelism (transistors)
  4. vector processing and integration
  5. single-instruction multiple data array
  6. communicating sequential processors and VLSI
  7. multicore petaflops
- Device density, peak performance have seen exponential growth, semiconductor fabrication feature size approachine 5nm => "End of Moore's law". Other innovations (new families of architectures) will now drive advancements. Anton, quantum computing, neuromorphic architectures, ...
 
#### More resources
- [Designing and Building Applications for Extreme Scale Systems](http://wgropp.cs.illinois.edu/courses/cs598-s16/index.htm) 
- [MPI and OpenMP user guide](https://www.uppmax.uu.se/support/user-guides/mpi-and-openmp-user-guide/)
- [HPC on YouTube](https://www.youtube.com/results?search_query=high+performance+computing&page=&utm_source=opensearch)
- [Tutorials and articles](https://www.openmp.org/resources/tutorials-articles/)

