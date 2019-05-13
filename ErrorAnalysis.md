Title
Course - Section
Authors
Distributions of Model Accuracy
Analysis of different error types




Report: Error Analysis
Now that you understand how to interact with the classes in this project, your final task is to analyse the performance of kNN classification on the breastCancer.csv dataset.

Most importantly, we want to characterize

the amount of confidence we can put in our model

Each time you run the classification model, you should be getting a different accuracy. Why? (hint: lines 148-150 in DataSet.java)
Run the entire classification process 1000 times (load data, split into off 30% for a test set, evaluate model performance)
store the results of each run in a double[]; use the mean and standardDeviation methods in kNNMain.java to calculate how much performance can be expected to vary on unseen data
What is a sensible baseline against which we should compare our model's performance? (hint: line 200 in DataSet.java)
the types of errors that our classifier makes

Accuracy is only one way that we can evaluate model performance. However in the context of medical diagnosis, different types of classification errors carry importances.

what is a

False Positive?
False Negative?
Extend your analysis in the previous step (with the 1000 runs) to keep track of Recall and Precision as well.

What makes these two measures different?
What are sensible baseline for each of these measures?
how do the above results change with the hyperparameter k?

Describe your results, and answer the questions above in a short report written using Markdown in the files ErrorAnalysis.md template file in this repo. Submit in teams of 2 max (make sure to include both names).