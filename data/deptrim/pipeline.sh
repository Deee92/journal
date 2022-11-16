#!/bin/bash

logger="[DEPTRIM]"
poms=`find . -name "pom-debloated-spl-*.xml" | wc -l`
echo "${logger} Number of specialized poms:" ${poms}

cp pom.xml pom-original.xml
mkdir logs

for i in $(seq ${poms})
do
  echo "================================================================"
  echo "${logger} Working with pom-debloated-spl-"${i}".xml"
  echo "${logger} Setting as main pom"
  mv pom-debloated-spl-${i}.xml pom.xml
  logfile="logs/pom-"${i}".log"
  touch ${logfile}
  echo "${logger} Running mvn clean package and storing log in" ${logfile}
  mvn clean package >> ${logfile}
  echo "${logger} Restoring original pom"
  mv pom.xml pom-debloated-spl-${i}.xml
  echo "================================================================"
done
