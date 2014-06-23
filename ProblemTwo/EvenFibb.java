import java.util.ArrayList;
public class EvenFibb
{

	public static void main(String[] args)
	{
		int result = 0;	//holds the current generated fibb number
		int i = 1;	//counter used in the process to generate fibb numbers
		int total = 0;	//holds the sum of even fibb numbers
		ArrayList<Integer> list = new ArrayList<Integer>();	//used to hold even fibb numbers
		ArrayList<Integer> fibList = new ArrayList<Integer>();	//used to hold every fibb number up to 4 mil
		list.add(2);	//adds 2 to list 
		fibList.add(1);	//adds 1 to the fibList to give a starting point for fibb generation
		fibList.add(2);	//adds 2 to the fibList

		while( result < 4000000)	//loops until the result is equal to or exceeds 4 mil
		{
			result = fibList.get(i) + fibList.get( i - 1);	//adds the current index and previous index to generate next fibb number
			
			if( result % 2 == 0)	//mod of 2 to assure the number generated is even
			{
				list.add(result);	//added to the list of even fibb numbers
				fibList.add(result);	//added to the general fibList for further number generation
				
			}
			else
			{
				fibList.add(result);	//adds to the general fibList to keep track of all numbers in sequence
				
			}	
			i++;		//moves up by one to be in line with the fibb number just generated
		}
		
		
		for( int counter = 0; counter < list.size(); counter++)	//adds all the even fibb numbers 
		{	
			total = total + list.get(counter); 	//adds the fibb number at the current index to the total
		}

		System.out.println(" The Sum Of Even Fibbonaci numbers is " + total);		
	}
}
