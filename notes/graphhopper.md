### Adding more profiles 

In `config_example.yml`:

```
  profiles:
    - name: car
      vehicle: car
      weighting: fastest
    - name: bike
      vehicle: bike
      weighting: fastest
      
  profiles_ch:
    - profile: car
    - profile: bike

```

More [here](https://docs.graphhopper.com/#section/Map-Data-and-Routing-Profiles/OpenStreetMap)

### Running

`java -javaagent:/home/dee/dev/jacoco-0.8.8-20211214.101659-25/lib/jacocoagent.jar=destfile=/home/dee/dev/graphhopper/jacoco.exec -Ddw.graphhopper.datareader.file=/home/dee/Downloads/sweden-latest.osm.pbf -jar web/target/graphhopper-web-4.0.jar server config-example.yml `

### Production coverage

`java -jar /home/dee/dev/jacoco-0.8.8-20211214.101659-25/lib/jacococli.jar report ./jacoco.exec --classfiles ./map-matching/target/classes/com/ --classfiles ./core/target/classes/com/ --classfiles ./hmm-lib/target/classes/com/ --sourcefiles ./map-matching/src/main/java/ --sourcefiles ./core/src/main/java/ --sourcefiles hmm-lib/src/main/java/ --html ./jacoco-report`

### Profiling (with [aync_profiler](https://github.com/jvm-profiling-tools/async-profiler))
- for issues with permission: https://github.com/jvm-profiling-tools/async-profiler/issues/253
  - `sysctl kernel.perf_event_paranoid=1`

`java -agentpath:/home/dee/dev/async-profiler-2.5.1-linux-x64/build/libasyncProfiler.so=start,file=/home/dee/dev/async-profiler-2.5.1-linux-x64/profile.html,interval=1000000,threads,alluser,dot,include=com.graphhopper.* -Ddw.graphhopper.datareader.file=/home/dee/Downloads/sweden-latest.osm.pbf -jar web/target/graphhopper-web-4.0.jar server config-example.yml`
