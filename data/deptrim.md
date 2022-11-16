## Experiments

\# | project-module | original dependencies | debloated specialized compile-scope dependencies | generated pom files | successful builds | unsuccessful builds | comments |
-- | -------------- | --------------------- | ------------------------------------------------ | ------------------- | ----------------- | ------------------- | -------- |
1 | [tika-core](https://github.com/apache/tika/tree/main/tika-core) | 32 | 2 | 4 | 2 (50%) | 2 | problematic poms 2, 4 with `commons-io` |
2 | [undertow-core](https://github.com/undertow-io/undertow/tree/master/core) | 118 | 5 | 32 | 32 (100%) | 0 | all poms build |
3 | [pdfbox-pdfbox](https://github.com/apache/pdfbox/tree/trunk/pdfbox) | 23 | 6 | 64 | 14 (28%) | 50 | successful poms: 1, 3, 5, 7, 9, 11, 13, 15, 33, 35, 37, 39, 41, 43
4 | [pdfbox-fontbox](https://github.com/apache/pdfbox/tree/trunk/fontbox) | 11 | 2 | 4 | 2 (50%) | 2 | problematic poms 3, 4
5 | [httpcomponents-client-httpclient5](https://github.com/apache/httpcomponents-client/tree/master/httpclient5) | 95 | 4 | 16 | 16 (100%) | 0 | all poms build
6 | [tablesaw-core](https://github.com/jtablesaw/tablesaw/tree/master/core) | 50 | 12 | 4096 | | | |

## Steps
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
