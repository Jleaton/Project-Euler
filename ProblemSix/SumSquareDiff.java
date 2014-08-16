
/**
* @author Joshua Lewis Eaton
* @date August 16, 2014
* @file SumSquareDiff.java
* @brief Class SumSquareDiff is used to computate the difference between the sum of the square and the square of the sum. User enters a number as the cap limit of numbers to add.This class was created to solve problem 6 on Project Euler.
*/
import java.util.Scanner;

public class SumSquareDiff
{
	private static int sumSquare = 0;	
	private static int squareSum = 0;
	private static int answer = 0;
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int counter = 0;
		int number = 0;
		
		System.out.println( "Enter number of choice");
		number = input.nextInt();	
	
		while(counter < number)	//loops until the chosen number is reached
		{
			counter++;
			sumSquare = sumSquare + counter;	//adds to sumSquare the value contained in counter
			squareSum = squareSum + counter*counter;	//adds to square sum the square of the value in counter

		}
		
		sumSquare = sumSquare * sumSquare;	//squares sumSqaure
		answer = sumSquare - squareSum;	//finds the difference of the sumSqaure and squareSum
		
		System.out.println( "The difference between the sum of the square and the square of the sum is " + answer );
	}

}
