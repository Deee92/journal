/*
* parallel contruct creates threads (default usually number of cores, set with omp_set_num_threads(n))
* each thread executes the code within a structured block
* each thread waits at the "barrier" for other threads to finish 
*/
 
#include <stdio.h>
#include <omp.h>

int main(int argc, char* argv[]) {
  // Number of threads
  omp_set_num_threads(4);
// Parallel execution block ("structured block")
#pragma omp parallel
  {
    // This thread number
    int id = omp_get_thread_num();
    // Total number of threads
    int np = omp_get_num_threads();
    printf("Hello world from thread %d of %d\n", id, np);
  }
  printf("Outside of structured block\n");
  return 0;
}

// Compiling: gcc -fopenmp first-omp.c -o first-omp

