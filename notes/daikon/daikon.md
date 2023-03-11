## Steps
- [Download](http://plse.cs.washington.edu/daikon/download/) Daikon
- Install by following instructions in `/path/to/daikon-ver/doc/index.html` or simply run `make -C ./java dcomp_rt.jar` from `/path/to/daikon-ver/`
- `cd /path/to/daikon-ver/java/`
- copy `Sample.java` into `/path/to/daikon-ver/java/`
- `javac Sample.java`
- `java -cp .:../daikon.jar daikon.DynComp Sample`
- `java -cp .:../daikon.jar daikon.Chicory --daikon --comparability-file=Sample.decls-DynComp Sample`

## Output
```
Hello there
Sum: 42
Sum: 42
Sum: 6
Daikon version 5.8.16, released November 9, 2022; http://plse.cs.washington.edu/daikon.
Reading declaration files Processing trace data; reading 1 dtrace file:

===========================================================================
Sample:::OBJECT
this has only one value
this.dogName has only one value
this.dogName.toString == "Kaaju"
===========================================================================
Sample.Sample(java.lang.String):::ENTER
arg0 has only one value
arg0.toString == "Kaaju"
===========================================================================
Sample.Sample(java.lang.String):::EXIT
this.dogName == orig(arg0)
arg0.toString == orig(arg0.toString)
arg0.toString == "Kaaju"
===========================================================================
Sample.main(java.lang.String[]):::ENTER
arg0 has only one value
arg0.getClass().getName() == java.lang.String[].class
arg0[] == []
arg0[].toString == []
===========================================================================
Sample.main(java.lang.String[]):::EXIT
arg0[] == orig(arg0[])
arg0[] == []
arg0[].toString == []
===========================================================================
Sample.sum(int, int):::ENTER
arg0 one of { 3, 21, 22 }
arg1 one of { 3, 20, 21 }
===========================================================================
Sample.sum(int, int):::EXIT
this.dogName == orig(this.dogName)
this.dogName.toString == orig(this.dogName.toString)
return one of { 6, 42 }
Exiting Daikon.
```
