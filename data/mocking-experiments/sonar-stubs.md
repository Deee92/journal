
1. [ProjectsInWarningDaemonTest](https://github.com/SonarSource/sonarqube/blob/36a8b6ed6eaf2b595d4b4e4cb85fd96d555249a0/server/sonar-webserver-core/src/test/java/org/sonar/server/qualitygate/ProjectsInWarningDaemonTest.java#L178)
  
`when(lockManager.tryLock(any(), anyInt())).thenReturn(false);`

---

2. [EvaluatedConditionTest](https://github.com/SonarSource/sonarqube/blob/36a8b6ed6eaf2b595d4b4e4cb85fd96d555249a0/server/sonar-ce-task-projectanalysis/src/test/java/org/sonar/ce/task/projectanalysis/measure/qualitygatedetails/EvaluatedConditionTest.java#L34)

`when(SOME_METRIC.getKey()).thenReturn("dummy key");`

---

3. [QGChangeEmailTemplateTest](https://github.com/SonarSource/sonarqube/blob/36a8b6ed6eaf2b595d4b4e4cb85fd96d555249a0/server/sonar-server-common/src/test/java/org/sonar/server/qualitygate/notification/QGChangeEmailTemplateTest.java#L46)

`when(configuration.getServerBaseURL()).thenReturn("http://nemo.sonarsource.org");`

---

4. [CreateActionTest](https://github.com/SonarSource/sonarqube/blob/master/server/sonar-webserver-webapi/src/test/java/org/sonar/server/project/ws/CreateActionTest.java)

```
when(projectDefaultVisibility.get(any())).thenReturn(Visibility.PUBLIC);
when(projectDefaultVisibility.get(any())).thenReturn(Visibility.PUBLIC);
when(projectDefaultVisibility.get(any())).thenReturn(PRIVATE);
when(permissionTemplateService.hasDefaultTemplateWithPermissionOnProjectCreator(any(DbSession.class), any(ComponentDto.class))).thenReturn(true);
when(permissionTemplateService.hasDefaultTemplateWithPermissionOnProjectCreator(any(DbSession.class), any(ComponentDto.class))).thenReturn(true);
```
---

5. [DefaultSensorStorageTest](https://github.com/SonarSource/sonarqube/blob/master/sonar-scanner-engine/src/test/java/org/sonar/scanner/sensor/DefaultSensorStorageTest.java)

```
when(metricFinder.<Integer>findByKey(CoreMetrics.NCLOC_KEY)).thenReturn(CoreMetrics.NCLOC);
when(metricFinder.<String>findByKey(CoreMetrics.FUNCTION_COMPLEXITY_DISTRIBUTION_KEY)).thenReturn(CoreMetrics.FUNCTION_COMPLEXITY_DISTRIBUTION);
when(metricFinder.<Integer>findByKey(CoreMetrics.LINES_TO_COVER_KEY)).thenReturn(CoreMetrics.LINES_TO_COVER);

reportPublisher = mock(ReportPublisher.class);
final File reportDir = temp.newFolder();
reportWriter = new ScannerReportWriter(reportDir);
reportReader = new ScannerReportReader(reportDir);
when(reportPublisher.getWriter()).thenReturn(reportWriter); // getter, 1LOC
when(reportPublisher.getReader()).thenReturn(reportReader); // getter, 1LOC

when(branchConfiguration.isPullRequest()).thenReturn(true);
when(branchConfiguration.isPullRequest()).thenReturn(true);
when(branchConfiguration.isPullRequest()).thenReturn(true);
when(branchConfiguration.isPullRequest()).thenReturn(true);
```

---

6. [WorkDirectoriesInitializerTest](https://github.com/SonarSource/sonarqube/blob/master/sonar-scanner-engine/src/test/java/org/sonar/scanner/scan/WorkDirectoriesInitializerTest.java)

```
private final InputModuleHierarchy hierarchy = mock(InputModuleHierarchy.class);
private final DefaultInputModule root = mock(DefaultInputModule.class);
public TemporaryFolder temp = new TemporaryFolder();
rootWorkDir = temp.newFolder();
when(hierarchy.root()).thenReturn(root); // stub returning mocked object
createFilesToClean(rootWorkDir);
when(root.getWorkDir()).thenReturn(rootWorkDir.toPath());
when(project.getWorkDir()).thenReturn(rootWorkDir.toPath());

DefaultInputModule moduleA = mock(DefaultInputModule.class);
DefaultInputModule moduleB = mock(DefaultInputModule.class);
when(hierarchy.children(root)).thenReturn(Arrays.asList(moduleA));
when(hierarchy.children(moduleA)).thenReturn(Arrays.asList(moduleB));
File moduleAWorkdir = new File(rootWorkDir, "moduleA");
File moduleBWorkdir = new File(moduleAWorkdir, "moduleB");
when(moduleA.getWorkDir()).thenReturn(moduleAWorkdir.toPath());
when(moduleB.getWorkDir()).thenReturn(moduleBWorkdir.toPath());
```
---

7. [AsyncExecutionMBeanImplTest](https://github.com/SonarSource/sonarqube/blob/master/server/sonar-server-common/src/test/java/org/sonar/server/async/AsyncExecutionMBeanImplTest.java)

```
when(asyncExecutionMonitoring.getQueueSize()).thenReturn(12);
when(asyncExecutionMonitoring.getWorkerCount()).thenReturn(12);
when(asyncExecutionMonitoring.getLargestWorkerCount()).thenReturn(12);
```

---
