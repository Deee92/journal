## Clients of [`java-faker`](https://github.com/DiUS/java-faker)

Clients on [deps.dev](https://deps.dev/maven/com.github.javafaker%3Ajavafaker/1.0.2/dependents)

GitHub search string: `path:**/*.java /import com.github.javafaker.Faker/  NOT is:archived NOT is:fork language:Java`

OR with Sourcegraph: [search](https://sourcegraph.com/search?q=context:global+lang:Java+import+com.github.javafaker+NOT+repo:DiUS/java-faker+NOT+repo:eugenp/tutorials&patternType=standard&sm=0)

\# | project | `java-faker` version | tests | other usages
-- | ------- | -------------------- | ----- | ------------
1  | [Netflix/hollow](https://github.com/Netflix/hollow) | (`latest`) | ? | [`FakeDataGenerator`](https://github.com/Netflix/hollow/blob/master/hollow-fakedata/src/main/java/hollow/FakeDataGenerator.java)
2  | [AzureCosmosDB/labs](https://github.com/AzureCosmosDB/labs) | `1.0.2`, `0.17.2` | ? | multiple in [this](https://github.com/AzureCosmosDB/labs/tree/master/java/solutions/src/main/java/com/azure/cosmos/handsonlabs) package
3  | [geoserver/geoserver](https://github.com/geoserver/geoserver) | `1.0.2` | [`DataDirectoryGeoServerLoaderTest`](https://github.com/geoserver/geoserver/blob/main/src/community/datadir-catalog-loader/src/test/java/org/geoserver/catalog/datadir/DataDirectoryGeoServerLoaderTest.java)  | [`CatalogFaker`](https://github.com/geoserver/geoserver/blob/main/src/community/datadir-catalog-loader/src/test/java/org/geoserver/catalog/faker/CatalogFaker.java)
4  | [apache/hop](https://github.com/apache/hop) | `1.0.2` | [`FakerTypeTest`](https://github.com/apache/hop/blob/master/plugins/transforms/fake/src/test/java/org/apache/hop/pipeline/transforms/fake/FakerTypeTest.java) | some in [this](https://github.com/apache/hop/tree/master/plugins/transforms/fake/src/main/java/org/apache/hop/pipeline/transforms/fake) package
5  | [apache/shiro](https://github.com/apache/shiro) | `1.0.2` | ? | [`InMemoryStormtrooperDao`](https://github.com/apache/shiro/blob/main/integration-tests/jaxrs/app/src/main/java/org/apache/shiro/testing/jaxrs/app/dao/InMemoryStormtrooperDao.java)
6  | [sakaiproject/sakai](https://github.com/sakaiproject/sakai) | `0.13`, `0.4` | [`AssignmentServiceTest`](https://github.com/sakaiproject/sakai/blob/master/assignment/impl/src/test/org/sakaiproject/assignment/impl/AssignmentServiceTest.java) and [`ElasticSearchTest`](https://github.com/sakaiproject/sakai/blob/master/search/elasticsearch/impl/src/test/org/sakaiproject/search/elasticsearch/ElasticSearchTest.java) | [`SeedSitesAndUsersJob`](https://github.com/sakaiproject/sakai/blob/master/site-manage/site-manage-impl/impl/src/java/org/sakaiproject/sitemanage/impl/job/SeedSitesAndUsersJob.java)
7  | [nitrite/nitrite-java](https://github.com/nitrite/nitrite-java) | `1.0.2` | [`CollectionFindBySingleFieldIndexTest`](https://github.com/nitrite/nitrite-java/blob/main/nitrite/src/test/java/org/dizitart/no2/integration/collection/CollectionFindBySingleFieldIndexTest.java), [`ObjectRepositoryTest`](https://github.com/nitrite/nitrite-java/blob/main/nitrite/src/test/java/org/dizitart/no2/integration/repository/ObjectRepositoryTest.java), ... (19 test classes) | [`DataGenerator`](https://github.com/nitrite/nitrite-java/blob/main/nitrite-support/src/test/java/org/dizitart/no2/support/data/DataGenerator.java)
8  | [SORMAS-Foundation/SORMAS-Project](https://github.com/SORMAS-Foundation/SORMAS-Project) | `1.0.2` | many in [`e2e-tests`](https://github.com/SORMAS-Foundation/SORMAS-Project/tree/development/sormas-e2e-tests) | ?
9  | [geoserver/geoserver-cloud](https://github.com/geoserver/geoserver-cloud) | | ? | [`CatalogFaker`](https://github.com/geoserver/geoserver-cloud/blob/main/src/catalog/plugin/src/test/java/org/geoserver/catalog/faker/CatalogFaker.java)
10 | [Keyist-Ecommerce](https://github.com/antkaynak/Keyist-Ecommerce) | | multiple in [`backend.api`](https://github.com/antkaynak/Keyist-Ecommerce/tree/master/resource_server/src/test/java/com/commerce/backend/api) | ?


## Clients of [`datafaker`](https://github.com/datafaker-net/datafaker)

Search string: `path:**/*.java /import net.datafaker.Faker/ NOT is:archived NOT is:fork`

\# | project | `datafaker` version | \#tests | \#usages
-- | ------- | ------------------- | ------- | --------
1  | [HangarMC/Hangar](https://github.com/HangarMC/Hangar) | | |

