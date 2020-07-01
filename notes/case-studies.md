1. checkstyle: https://github.com/checkstyle/checkstyle/tree/checkstyle-8.34
  - pure methods: 661
  - drop plugin.jar and/or json plugin as usual
  - in checkstyle `java -javaagent:/path/to/glowroot/glowroot.jar -jar target/checkstyle-8.34-all.jar -c google_checks.xml /path/to/java/file/or/project`

2. geoserver: https://github.com/geoserver/geoserver/tree/2.17.1
  - pure methods: 2974
  - jetty-maven-plugin: add `<jvmArgs>-javaagent:/home/user/glowroot/glowroot.jar</jvmArgs>` to `geoserver/src/web/app/pom.xml`
  - from geoserver/src `mvn package -DskipTests`
  - in geoserver/web/app `mvn jetty:run-forked`
  - http://localhost:8080/
  
Multiple agents:
  - https://github.com/glowroot/glowroot/wiki/Agent-Installation-(with-Embedded-Collector)#running-multiple-agents-on-a-single-box
  - glowroot.properties
  - -Dglowroot.agent.id=check1
  - port change to 4001 in admin.json
  - `java -javaagent:/path/to/glowroot/glowroot.jar -Dglowroot.agent.id=check1 -jar target/checkstyle-8.34-all.jar -c google_checks.xml /path/to/class/or/project`

