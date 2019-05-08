import java.util.List;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;



public class kNNMain{

  public static void main(String... args) throws FileNotFoundException{

    // TASK 1: Use command line arguments to point DataSet.readDataSet method to
    // the desired file. Choose a given DataPoint, and print its features and label

	
	 System.out.println("Please enter a file name that you want analyse");
	System.out.println("breastCancer.csv           ");
	System.out.println("data2DBinary.csv           ");
	System.out.println("data2DOneVsAll.csv         ");
	System.out.println("dataML.csv                 ");
	System.out.println("handwrittenDigits.csv      ");
	System.out.println("iris.csv                   ");
	System.out.println("microchip.csv              ");

	String input= null;
	Scanner userinput = new Scanner(System.in); 
	input = userinput.nextLine();	
	DataSet.readDataSet("H:\\w19-360420-machine-learning\\data\\" +input);

	
	System.out.println("Please enter degree for list of dataPoints with higher order polynomial X");
	Scanner in = new Scanner(System.in);
	int degree = in.nextInt();
	
	DataSet.readDataSetHigherOrderFeatures("H:\\w19-360420-machine-learning\\data\\"+input, degree);
	
	
	
	System.out.println("");
	
	System.out.println("is Numeric ? " +  DataSet.isNumeric("H:\\w19-360420-machine-learning\\data\\"+input));
	
	
	System.out.println("getLabels  " + DataSet.getLabels("H:\\w19-360420-machine-learning\\data\\"+input ));


    //TASK 2:Use the DataSet class to split the fullDataSet into Training and Held Out Test Dataset
	
	System.out.println("Please enter a fractioninput for TestSet");
	Scanner sc = new Scanner(System.in);
	double fractionTestSet = sc.nextInt();
	DataSet.getTestSet("H:\\w19-360420-machine-learning\\data\\"+input, fractionTestSet);
	
	System.out.println("Please enter a fractioninput for TrainingSet");
	Scanner op = new Scanner(System.in);
	double fractionTrainingSet = op.nextInt();
	
	
	DataSet.getTrainingSet("H:\\w19-360420-machine-learning\\data\\"+input, fractionTrainingSet );

	

    // TASK 3: Use the DataSet class methods to plot the 2D data (binary and multi-class)



    // TASK 4: write a new method in DataSet.java which takes as arguments to DataPoint objects,
    // and returns the Euclidean distance between those two points (as a double)



    // TASK 5: Use the KNNClassifier class to determine the k nearest neighbors to a given DataPoint,
    // and make a print a predicted target label



    // TASK 6: loop over the datapoints in the held out test set, and make predictions for Each
    // point based on nearest neighbors in training set. Calculate accuracy of model.


  }

}
