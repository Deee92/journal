## [Contemporary software monitoring: a systematic mapping study](http://arxiv.org/abs/1912.05878)

- [Summary of v1](https://docs.google.com/presentation/d/1B1ttMn3agKpg82PpmaiiEFqXvgBYa9cjEmzwSAEIy0o/edit?usp=sharing)
- software testing: preventing failures and assessing reliability
- software monitoring (app + env logs): determine how system behaves in prod, detect and diagnose undesired behaviour
- does not often work for very complex systems, challenging to gain insight
- this study: systematic mapping of logging research from 108 papers in different domains (ML, SE, systems, ...); results:
  1. logging is a challenge in both open-source and industry projects
  2. ML is promising (huge amount of data, AIOps) for contextual analysis of source code for log recommendation but further investigation needed to assess usability of tools in practice
  3. not many studies address efficient persistence of log data
  4. opportunities to analyze app logs and evaluate SOTA log analysis techniques in a DevOps context
  
### Introduction
Tools:
- ELK - Elastic (search engine) Logstash (log processor, many plugins) Kibana (vis, query, exploration)
- Grafana (UI)
- Fluentd (log processing)

Issues with logging
- Decisions that developers must take: where and what to log
- Scale, many different components in software stack 
- Privacy, retention policies, getting value from data is costly, even with ML and big data

### Methodology
goal: discover, categorize, summarize key research results in logging; four parts: 
- perform preliminary searches to derive search criteria, build initial list of relevant studies from five data sources (Google Scholar, ACM DL, IEEE Xplore, Scopus, SpringerLink)
  - search query: `log AND (trace OR event OR software OR system OR code OR detect OR mining OR analysis OR monitoring OR
web OR technique OR develop OR pattern OR practice)`
- apply inclusion/exclusion criteria to get final list of selected papers from 1992 to 2018
  - de-duplication, merging, cleanup, filter (peer-reviewed, full research paper in English, primary study, "log" used in SE context)
- classify and extract data
- update results of survey to include papers from 2019 (96 + 12 = 108 papers from highly-ranked venues)

### Results
- Communities: SE, distributed systems, cloud computing, dependable systems, reliability engineering, knowledge discovery, data mining, security
- Research areas:
  - **log engineering**: developers' perspectives of logging practices, tools; 3 subcategories: empirical studies, log requirements, log implementation
  - **log infrastructure**: improving log processing and persistence; 2 subcategories: log parsing, log storage
  - **log analysis**: extracting knowledge from log data; 8 subcategories: anomaly detection, security and privacy, root cause analysis, failure prediction, QA, model inference and invariant mining, reliability and dependability, log platforms
  
### Discussion
- Log engineering: empirical studies highlight importance of better tooling support for developers. Requirements not pre-determined in many cases, so developers make decisions based on experience. ML can address context-specific decisions but there are disadvantages such as false positives, no 100% accuracy rate. Collaboration with the industry will help.
- Log infrastruture: log parsing cannot be done at a large scale with open-source applications because dataset unavailable. Collaboration with the industry required. Important applications for log parsing are log analysis, log compression, and log storage.
- Log analysis: most-studied and most-extensive area of log research, logs can be modelled and treated as a sequence of events, count vectors, graphs, accordingly different algorithms applied.

