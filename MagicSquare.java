package Week6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Kevin Halliwell
 * 
 */
public class MagicSquare{
	
	/**
	 * Variables
	 */
	Boolean boolLoop = true; //used to break out of loops
	double total = 0; //total number of values entered size of the array
	double totalSqRt = 0; //square root of the total values entered
	double sum = 0; //used to find sum for comparison
	int rowSum = 0; //used to find sums of diagonals, rows, and columns
	int value = 0; //used to find value of array location
	int valueCounter = 0; //used to adjust value when finding columns
	final static int ZERO = 0; //constant zero variable
	final static int ONE = 1; //constant one variable
	final static int TWO = 2; //constant two variable
	double errorCheck = 0; //used to determine if the right amount of numbers were entered

	/**
	 * Used to check for duplicate values 
	 * @param array
	 * @return boolean
	 */
	public boolean duplicateValues(int[] array){
	    for (int i = ZERO; i < array.length - ONE; i++) {
	        for (int j = i + ONE; j < array.length; j++) {
	             if (array[i] == array[j]) {
	                 return false;
	             }
	        }
	    }              
	    return true;          
	}
	
	/*
	 * Magic square constructor. Initializes variables
	 */
	public MagicSquare(){
		
		boolLoop = true; 
		total = 0;
		totalSqRt = 0;
		sum = 0;
		rowSum = 0;
		value = 0;
		valueCounter = 0;
		errorCheck = 0; 
		
	}
	
	/*
	 * Input method. Gathers integer input from the user.
	 * @return int[] 
	 */
	public int[] input(){
		//open instance of scanner
		Scanner keyboard = new Scanner (System.in);
		
		ArrayList<Integer> ints = new ArrayList<Integer>();
		
		//loop to get user input
		//Prompt user for input and store in an array list
		System.out.println("Numbers can be entered using a space ('8 1 6') or on"
				+ " separate lines. Numbers cannot repeat.");
		System.out.println("Enter 'done' or any noninteger character when you are done"
				+ " entering numbers.");
		while (keyboard.hasNextInt()){ //Start looping to get input from user

			ints.add(keyboard.nextInt());
			
		}//End of looping for input from user
		
		keyboard.close();
		
		//Create the array for the magic square
		int magicSquareArray[];
		magicSquareArray = new int[ints.size()];
						
		//Fill the array from the array list
		for (int i = ZERO; i < ints.size(); i++){
				magicSquareArray[i] = ints.get(i);
		}
		return magicSquareArray;
	}
	
	/*
	 * Finds the square root of the total number of values entered.
	 * @param double a
	 * @return totalSqRt
	 */
	public double squareRoot(double a){
		totalSqRt = Math.sqrt(a);
		return totalSqRt;
	}
	
	/*
	 * Sets the size of the array.
	 * @param int a
	 */
	public void setSize(int a){
		total = a;
	}
	
	/*
	 * Gets the size of the array. Used for calculations.
	 * @return total
	 */
	public double getSize(){
		return total;
	}
	
	/*
	 * Computes and returns the sum of the magic square.
	 * @param double a, b
	 * @return sum
	 */
	public double sum(double a, double b){
		sum = ((a+ONE)/TWO) * b;
		return sum;
	}
	
	/*
	 * Ensures the correct number of values was entered.
	 * @param double a, b
	 * @return errorCheck
	 */
	public double errorCheck(double a, double b){
		errorCheck = a % b;
		return errorCheck;
	}
	
	/*
	 * Computes the value of the first diagonal
	 * @param int[] a
	 * @return rowSum
	 */
	public double firstDiagonal(int[] a){
		rowSum = ZERO;
		value = ZERO;
		boolLoop = true;
		while (boolLoop){
			value = ZERO;

			for (int i = ZERO; i < totalSqRt; i++){
				rowSum += a[value];
				//This adds the square root + 1 to the next index
				//For a magic square with 9 values this would traverse the array at indexes
				//[0], [4], and [8] giving the user one diagonal
				value += (totalSqRt + ONE);
			}
			if (sum(getSize(), squareRoot(total)) == rowSum){
				boolLoop = false;
			}
			else
				boolLoop = false;
		}
		value = ZERO;
		return rowSum;
	}
	
	/*
	 * Computes the value of the second diagonal
	 * @param int[] a
	 * @return rowSum
	 */
	public double secondDiagonal(int[]a){
		rowSum = ZERO;
		value = ZERO;
		boolLoop = true;
		while (boolLoop){
			value = (int) (totalSqRt - ONE);
			for (int i = ZERO; i < totalSqRt; i++){
				rowSum += a[value];
				//This adds the square root - 1 to the next index
				//For a magic square with 9 values this would traverse the array at indexes
				//[2], [4], and [6] giving the user the second diagonal
				value += (int) (totalSqRt - ONE);
			}
			if (sum(getSize(), squareRoot(total)) == rowSum){
				boolLoop = false;
			}
			else 
				boolLoop = false;
		}
		value = ZERO;
		return rowSum;
	}
	
	/*
	 * Computes the value of the rows
	 * @param int[] a
	 * @return rowSum
	 */
	public double rows(int[] a){
		rowSum = ZERO;
		value = ZERO;
		boolLoop = true;
		while (boolLoop){
			
			for (int i = ZERO; i < totalSqRt; i++){
				rowSum += a[value];
				//This increase the value by one starting from zero
				//For a magic square with 9 values this would traverse the array at indexes
				//[0], [1], and [2] (and so on) giving the user each row's sum.
				//If the rowSum is == to sum the next row is checked.
				value ++;
			}
			if (sum(getSize(), squareRoot(total)) == rowSum){
				//System.out.println("first row is good"); //used during testing
				if (value >= total){
					boolLoop = false;
				}
				else {
					boolLoop = true;
					rowSum = 0;
				}
			}
			else
				boolLoop = false;
		}
		value = ZERO;
		return rowSum;
	}
	
	/*
	 * Computes the value of the columns
	 * @param int[] a
	 * @return rowSum
	 */
	public double columns(int[] a){
		rowSum = ZERO;
		value = ZERO;
		valueCounter = ZERO;
		boolLoop = true;
		while (boolLoop){
			
			for (int i = ZERO; i < totalSqRt; i++){
				rowSum += a[value];
				//This increase the value of the square root.
				//For a magic square with 9 values this would traverse the array at indexes
				//[0], [3], and [6] (and so on) giving the user each column's sum.
				//If the rowSum is == to sum the next column is checked.
				value += totalSqRt;
			}
			if (sum(getSize(), squareRoot(total)) == rowSum){
				//System.out.println("first column is good"); //used during testing
				valueCounter++;
				value = valueCounter;
				if (valueCounter < totalSqRt){
					boolLoop = true;
					rowSum = ZERO;
				}
				else {
					boolLoop = false;
				}
			}
			else{
				boolLoop = false;
			}
		}
		value = ZERO;
		return rowSum;
	}
}
