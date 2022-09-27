PDFBox: run workload script

Graphhopper:
- `java -Ddw.graphhopper.datareader.file=sweden-latest.osm.pbf -jar web/target/graphhopper-web-5.3.jar server config-example.yml`
- add javaagent per usual

Gephi:
- `gephi: mvn nbm:cluster-app nbm:run-platform`
- for javaagent, in `applications/gephi.conf`, add `-J-javaagent:/path/to/agent.jar`

Ttorrent:
- java -jar cli/build/ttorrent-cli-1.3.0-SNAPSHOT-shaded.jar ./ttorrent-file.torrent -o ./

