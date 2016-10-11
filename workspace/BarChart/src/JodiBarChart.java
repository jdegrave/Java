// Fig 7.6: Barchart.java
// Bar chart printing program

public class JodiBarChart
{
	public static void main (String[] args)
	{
		// array elements are quantity of test scores within a grade range
		int [] array = {0,0,0,0,0,0,1,2,4,2,1};	

		System.out.println("Grade Distribution:");

		//Nested for loop; For each array element, output a bar of the 
		//chart using asterisks


		for (int counter = 0; counter < array.length; counter++)
		{
			//output bar label ("00-09: ", ..., "90-99: ", 100:  ")
			if (counter == 10)
				System.out.printf("%5d: ", 100);
			else
				System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9); // %02d - provides a leading zero for 2 char field

			//print bar of asterisks
			for (int stars = 0; stars < array[counter]; stars++)
			{
				System.out.print("*");
				
			}		
		
		System.out.println();
	
		} // end outer for loop	



		
	} // end main

} // end class JodiBarChart