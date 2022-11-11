## Experiments

\# | project-module | original compile-scope dependencies | debloated specialized dependencies | generated pom files | successful builds | unsuccessful builds | comments |
-- | -------------- | ----------------------------------- | ---------------------------------- | ------------------- | ----------------- | ------------------- | -------- |
1 | [tika-core](https://github.com/apache/tika/tree/main/tika-core) | 32 | 2 | 4 | 2 | 2 | problematic poms 2, 4 with `commons-io` |
2 | [undertow-core](https://github.com/undertow-io/undertow/tree/master/core) | 118 | 5 | 32 | 32 | 0 | all poms build |

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
