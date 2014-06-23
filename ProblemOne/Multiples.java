import java.util.ArrayList;
public class Multiples
{


	public static void main(String[] args)
	{
		
		int counter = 3;
		int total = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();

		while( counter < 1000 )
		{	
			if( counter % 3 == 0)
			{	System.out.println("it added" + counter);
				list.add(counter);
			}
			else if( counter % 5 ==0)
			{	System.out.println("it added" + counter);
				list.add(counter);
	
			}
			counter++;
		}

		for( int i = 0; i < list.size(); i++)
		{	
			total = total + list.get(i); 
			System.out.println("added " + list.get(i) + " to the total");

		}

		System.out.println(" The Answer Is " + total);
	}		


}
