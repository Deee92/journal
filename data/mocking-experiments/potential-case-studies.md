### Projects that could be used as case studies

\# | project | \# methods with mockable invocations | \# methods invoked with workload
---|---------|--------------------------------------|---------------------------------
1  | PDFBox | 76 | 
2  | GraphHopper ([config](https://github.com/Deee92/journal/blob/master/MOMs/jun-23-20.md)) | 
3  | Grobid (batch mode) |

___

#### Modifications for [BroadLeaf/DemoSite](https://github.com/BroadleafCommerce/DemoSite):
```
<properties>
  <debug.args>-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=${debug.port}</debug.args>
  <maven.compiler.source>11</maven.compiler.source>
  <maven.compiler.target>11</maven.compiler.target>
  <boot.jvm.memory>-Xmx1536M</boot.jvm.memory>
  <glowroot.plugin.jar>-javaagent:/home/dee/dev/glowroot/glowroot.jar</glowroot.plugin.jar>
  <boot.jvm.args>${boot.jvm.memory} ${debug.args} ${glowroot.plugin.jar}</boot.jvm.args>
  ...
</properties>
``` 

`mvn clean install` from DemoSite root
- from `site`, `mvn spring-boot:run`
  - localhost:8000
- from `admin`, `mvn spring-boot:run`
  - localhost:8081/admin
  - username: admin
  - password: admin
____

#### More case studies tried:

- BroadLeaf - total: 949, not-covered + pseudo-tested: 246 (loads of exceptions)
- Hedwig
- jsoup
- OpenTripPlanner
- GeoServer
