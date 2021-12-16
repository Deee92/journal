### Running

`java -javaagent:/home/dee/dev/jacoco-0.8.8-20211214.101659-25/lib/jacocoagent.jar=destfile=/home/dee/dev/graphhopper/jacoco.exec -Ddw.graphhopper.datareader.file=/home/dee/Downloads/sweden-latest.osm.pbf -jar web/target/graphhopper-web-4.0.jar server config-example.yml `

### Production coverage

`java -jar /home/dee/dev/jacoco-0.8.8-20211214.101659-25/lib/jacococli.jar report ./jacoco.exec --classfiles ./map-matching/target/classes/com/ --classfiles ./core/target/classes/com/ --classfiles ./hmm-lib/target/classes/com/ --sourcefiles ./map-matching/src/main/java/ --sourcefiles ./core/src/main/java/ --sourcefiles hmm-lib/src/main/java/ --html ./jacoco-report`
