## Experiments

\# | project-module | all dependencies | runtime-scope dependencies | bloated dependencies | specialized dependencies | generated pom files | successful builds | unsuccessful builds | comments |
-- | -------------- | ---------------- | -------------------------- | -------------------- | ------------------------ | ------------------- | ----------------- | ------------------- | -------- |
1 | [tika-core](https://github.com/apache/tika/tree/main/tika-core) | 32 | 2 | 0 | 2 | 4 | 4 (100%) | 0 | all poms build |
2 | todo - [undertow-core](https://github.com/undertow-io/undertow/tree/master/core) | 118 | 11 | x | 5 | 32 | 32 (100%) | 0 | all poms build |
3 | todo - [pdfbox-pdfbox](https://github.com/apache/pdfbox/tree/trunk/pdfbox) | 23 | 7 | 1 transitive | 6 | 64 | ~14 (28%)~ 43  | ~50~ 21 | problematic poms with `io` and `bcprov-jdk18on`
4 | todo - [pdfbox-fontbox](https://github.com/apache/pdfbox/tree/trunk/fontbox) | 10 | 2 | 0 | 2 | 4 | 2 (50%) | 2 | problematic poms 3, 4
5 | [httpcomponents-client-httpclient5](https://github.com/apache/httpcomponents-client/tree/master/httpclient5) | 24 | 5 | x | 4 | 16 | 16 (100%) | 0 | all poms build
6 | todo - [tablesaw-core](https://github.com/jtablesaw/tablesaw/tree/master/core) | 49 | 16 | x | 12 | 4096 | 70 / 142 (49.3%) | 72 / 142 | (wip) |
6 | todo - [tablesaw-json](https://github.com/jtablesaw/tablesaw/tree/master/json) | 31 | 25 | x | 7 | 128 | 128 (100%) | 0 | all poms build |

## Steps

**_Implemented in [pipeline.sh](https://github.com/Deee92/journal/blob/master/data/deptrim/pipeline.sh)_**

- `git clone project.git`
- `cd project/`
- `mvn install -DskipTests`
- `cd module/`
- `mvn package`
- Invoke DepTrim
  ```
  mvn se.kth.castor:deptrim-maven-plugin:0.0.1:deptrim -DcreatePomTrimmed=true -DignoreScopes=test,provided,system,import,runtime
  ```
- `cp pom.xml pom-original.xml`
- For each specialized pom
  - set to main pom: `mv pom-debloated-spl-n.xml pom.xml`
  - `mvn clean package`
  - restore: `mv pom.xml pom-debloated-spl-n.xml`

## Notes
- `pom-debloated-spl-1.xml`: debloated, all unspecialized, equal to DepClean `pom-debloated.xml`
- `pom-debloated-spl-last.xml`: debloated, all specialized
