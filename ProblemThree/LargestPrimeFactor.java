/**
* @author Joshua Lewis Eaton
* @date August 8, 2014
* @file LargestPrimeFactor.java
* @brief Class LargestPrimeFactor is used to compuate the largest prime factor of any 
given number. This is an iterative solution prone to longer computational times as the 
size of the input grows. This class was created to solve problem 3 on Project Euler.
*/



import java.util.Scanner;
public class LargestPrimeFactor
{

	static long number;	//holds the number after initial division by 2
	static long originNum;	//holds the original number entered by user
	
	public static void main(String[] args)
	{
		System.out.println( "Enter number to find its largest prime factor");
		Scanner input = new Scanner(System.in);
		originNum = input.nextLong();	//gets user input for number whose largest prime factor is to be found
		number = originNum/2;	//divide by 2 to reduce computation time
		
		
		boolean prime = false;	//once true will allow the printing of the correct output
		long counter = 0;	//used to ensure the loop goes beyond the number provided
		if( number % 2 == 0)	//ensures that the number is odd to allow count down by 2
		{
			number--;	//decrements by one to ensure odd
		
		}
		
			


		
		while( counter < number && prime == false)	//will loop until the number limit is reached or the correct prime is found
		{
		
			if(originNum % number == 0)	//ensures that the current number is a factor of the original number
			{	
				prime = isPrime(number);	//sends as an argument number which isPrime evaluates for prime factor status
			}
			if( prime == true)	//if the number is prime print it out as the correct output
			{
				System.out.println("The largest prime of " + originNum + " is " + number);
			}
			else
			{
				i
				number = number - 2;	//decrements by 2 to retain oddness of number

			}			
		}
	}
	/**
	* @brief isPrime evaluates a number to check if it is a prime
	* @param long n which excepts a long that is the number to be evaluated
	*/ 
	private static boolean isPrime(long n)	
	{
		
		boolean prime = true;
		int sqrt = (int) Math.sqrt(n);
		
		for(int counter = 3; counter <= sqrt; counter += 2)
		{	
			if( number % counter == 0)
			{	System.out.println( number + " in false");
				return false;
					
			} 
		}
		
		return prime;			
		

	}




}
