[Javassist tutorial](https://www.javassist.org/tutorial/tutorial.html)

[Javassist on YouTube](https://www.youtube.com/results?search_query=javassist&page=&utm_source=opensearch)

1. Find a way to compile
 - ttorrent
 - hedwig
 - jitsi-videobridge
2. 
```
// projectPath, candidateMethods available in PanktiMain
public void useJavassist(String projectPath, Set<CtMethod<?>> candidateMethods) throws Exception {
  ClassPool pool = ClassPool.getDefault();
  pool.insertClassPath(projectPath);
  for (CtMethod<?> candidateMethod : candidateMethods) {
    String path = candidateMethod.getParent().getPath().toString();
    // process path here
    CtClass cc = pool.get(path);
    System.out.println("Number of declared fields: " + cc.getDeclaredFields().length);
    // instrument here
  }
}
```

