// Fig 7.2, 7.3, 7.4, 7.5:  InitArray.java
// Initializing the elements of an array with default values,  with an array initializer, calculating values
// Also totals the elements in an array
public class JodiArray
{

	public static void main(String [] args)
	{
		//declare variable array and initialize it with an array object
		int[] array = new int[10]; //creates new array object "array"
		
		//format string  %8s is an 8-character field, right justified
		System.out.printf("%s%8s%n", "Index", "Value"); // column headings
	
		//output each array element's value
		for (int counter = 0; counter < array.length; counter++)
		{
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}

		//7.3 an array with an initializer list specifying the initial value of 
		//each element

		int[] initializedArray = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};

		System.out.println();
		System.out.printf("%s%n", "An Array with Array Initializer");
		System.out.printf("%s%8s%n", "Index", "Value");

		//output each array element's value
		for (int counter = 0; counter < initializedArray.length; counter++)
		{
			System.out.printf("%5d%8d%n", counter, initializedArray[counter]);
		}

		//7.4 Calculating values to be placed into an array. 
		
		final int ARRAY_LENGTH = 100;   // Normally, by convention, this would be declared at the top. Java compiler doesn't care much about sequence for variable 
									   // declarations. This is a constant. Not modifiable after you create it
		int[] calcArray = new int[ARRAY_LENGTH];
		
		//calculate the value for each array element
		for (int counter = 0; counter < calcArray.length; counter++)
		{
			calcArray[counter] = 2 + 2 * counter;
		}
		
		System.out.println();
		System.out.printf("%s", "Calculating the values of an integer array called calcArray");
		System.out.printf("%n%s%8s%n", "Index", "Value");
		
		// output each array element's value
		for (int counter = 0; counter < calcArray.length; counter++)
			System.out.printf("%5d%8d%n", counter, calcArray[counter]);  // remember, if it's just 1 statement, don't curly braces for for loop
		
		int[] totalArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		int total = 0;
		
		for (int counter = 0; counter < totalArray.length; counter++)
			total += totalArray[counter];
		
		System.out.println();
		System.out.printf("Total of array elements in totalArray: %d%n", total);
		
	} // end main
	


} // end class