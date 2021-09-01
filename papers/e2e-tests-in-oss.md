## [Looking for the Needle in the Haystack: End-to-end Tests in Open Source Projects](https://link.springer.com/chapter/10.1007/978-3-030-85347-1_4)

- Most testing datasets in research (+ bug datasets) focus on unit tests
- No public datasets on end-to-end tests
- e2e tests kept separate from unit tests, they're both run at different stages of the development lifecycle
- e2e tests typically need application to be deployed
- This paper: mining project repositories for e2e tests
- How: using heuristics based on e2e test best practices and common approaches in the industry

### Methodology
- Selecting some open source projects with e2e tests.
- Studying the selected projects in order to: a) check whether they actually included e2e tests; b) write down any relevant information about the tests (location, such as folders called e2e, integration, etc, and test case names.)
- Based on information about the test collected in the previous step, preparing a set of (12) criteria that can identify at least one of the selected projects.
- Select 100 popular public GitHub projects (> 500 stars, >= 300 forks, any language, not archived, created before 2015, also active after Jan 2020)
- Check every criterion on each of the projects, recording whether the criterion was positive or negative.
- Manually check every positive (i.e., a criterion that was successful) to discard false positives.
- Pruning the set of criteria, selecting only those (3) that are actually effective.
  - tests within `test/integration`, or `e2e/` folders, test case file names starting or ending in *IT*, or containing *e2e*, *system*, or *rest-assured*
- Automatically running the selected criteria over two different queries: 900 popular java projects, and 900 popular projects on any language.

### Results
- 344 of 900 Java projects, 270 of 900 projects in any lanuguage (no mention of intersection between two sets) fulfill one at least one criterion 
- Results not manually validated
- Dataset not consolidated yet
