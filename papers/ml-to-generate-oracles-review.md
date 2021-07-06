## [Using Machine Learning to Generate Test Oracles: A Systematic Literature Review](https://arxiv.org/abs/2107.00906)

- Characterization of research efforts for oracle generation using ML, based on 22 recent and relevant studies:
  - oracle types
  - researcher goals
  - ML techniques used
  - open challenges
- Outputs from ML models: test verdict (P/F oracle), metamorphic relations (necessary property that must hold for a specific input, i.e. link between input and output), expected output (oracle) - most common
- Most studies use supervised or semi-supervised models
  - labelled system execution logs or code metadata
  - NN, SVM, AdaBoost, decision trees
- Generated oracles evaluated using mutation scores, accuracy, ROC
- Challenges: quality and quantity requirements for training data, model complexity (models for oracles of complex functions), benchmarks, reproducibility of results
- Recommendations: deep learning and ensemble techniques, hyperparameter tuning, retraining of models with time, benchmarks and open-science

### Introduction
- Test oracle problem in automated test generation - challenging to accurately determine the expected outcome for an operation based on test inputs
- Oracle estimation requires considerable human effort
- Studies using ML models to solve the oracle problem by generating or enhancing/supporting the generation of oracles
- Good background on testing, test oracles, ML, related work

### Methodology
- Systematic literature review to undestand **why** and **how** ML models (and **which** ones) are being used to generate oracles or support oracle generation
- **effect** of this integration
- potential **impact** in terms of **risks**
- RQs
  - RQ1 Which oracle types have been generated using ML?
  - RQ2 What is the goal of using machine learning as part of oracle generation?
  - RQ3 How was machine learning integrated into the process of oracle generation?
  - RQ4 Which ML techniques were used to perform or enhance oracle generation?
  - RQ5 How is the oracle generation process evaluated?
  - RQ6 What are limitations and open challenges in ML-based oracle generation? 
- Four phases:
  - initial study selection: search string with IEEE, ACM, Science Direct, Scopus published before November 2020 => 1936 studies
  - selection filtering: automated and manual filtering to remove all studies not related to test generation or that use ML for some other aspect of testing => 22 studies (2002 to 2020, with 50% from 2016 and later)
  - data extraction: finite set of 13 properties studied for the 22 selected studies to answer RQs
  - identify trends in extracted data

### Results, Discussion
- RQ1: Type of oracle - 12/22 studies use ML models to produce expected oracles (e.g., triangle problem, prime or not, ...), 6/12 produce metamorphic relations (sorting algos, matrix operations), 4/12 produce test verdicts (without running SUT, e.g., student enrolled to a program satisfies certain constraints)
- RQ2: Goal of ML models - automate/support decision process - either test verdict itself which serves as the oracle, or information that can be used to specify the oracle (metamorphic relations and expected output)
- RQ3: Integration with ML - supervised learning approaches, one RL, labelled execution logs or code metadata/features
- RQ4: ML models - NNs, SVM, AdaBoost, decision trees
- RQ5: Evaluation of ML model - mutation score, correct classification per labelled dataset, classification accuracy, ROC
- RQ6: Challenges: labelled training dataset challenging to assemble, and can lack in quantity and quality. Models must be retrained. Complex ML models for complex functions with many possible outputs. Hyperparameter tuning, use of DL required. No benchmarks and less focus on open-science.
