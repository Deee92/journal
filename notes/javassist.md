[Javassist tutorial](https://www.javassist.org/tutorial/tutorial.html)

[Javassist on YouTube](https://www.youtube.com/results?search_query=javassist&page=&utm_source=opensearch)

[Javassist vs ASM](https://blog.newrelic.com/engineering/diving-bytecode-manipulation-creating-audit-log-asm-javassist/)

[Comparison of bytecode manipulation frameworks](https://stackoverflow.com/questions/9167436/dynamic-java-bytecode-manipulation-framework-comparison)

[Mapping class file paths with Java files](https://equaleyes.com/blog/2018/07/19/bytecode-manipulation/)

[Finding classes from the JAR](https://stackoverflow.com/questions/10953373/loading-another-class-with-javassist)

1. `mvn package -DskipTests`
 - ttorrent
 - hedwig
 - jitsi-videobridge
2. 
```
// projectPath, candidateMethods available in PanktiMain
public void useJavassist(String projectPath, Set<CtMethod<?>> candidateMethods) throws Exception {
  ClassPool pool = ClassPool.getDefault();
  // absolute path for class files => project path + build output directory of project 
  String absolutePathToClassFiles = projectPath + "target/classes"; // (e.g.)
  pool.insertClassPath(absolutePathToClassFiles);
  for (CtMethod<?> candidateMethod : candidateMethods) {
    String path = candidateMethod.getParent().getPath().toString();
    // process path here
    CtClass cc = pool.get(path);
    System.out.println("Number of declared fields: " + cc.getDeclaredFields().length);
    // instrument here
  }
}
```

