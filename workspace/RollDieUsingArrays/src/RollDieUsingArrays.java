// Fig 7.7: RollDieUsingArrays.java
// Die-rolling program using arrays instead of the switch statement
// Later on, when we learn lambdas and streams we can condense much of this 
// into 1 line of code! (Lambdas and streams use internal iteration)

import java.security.SecureRandom;

public class RollDieUsingArrays
{
	public static void main (String [] args)
	{
		SecureRandom randomNumbers = new SecureRandom();
		int[] frequency	= new int[7]; // declaring 7 element array, but only using indices 1-6 to match the faces of the die
									  // all array elements are by default initialized to zero (0)

		//roll die 6 million times; use die value as the frequency index
		for (int roll = 1; roll <= 6000000; roll++)
		  ++frequency[1 + randomNumbers.nextInt(6)]; // randomNumbers.nextInt(6) means 6 is the upper bound, generates numbers 0-5
													 // so we have to shift it by adding 1 to it. prefix on frequency means we increment the
													 // value of the element at that index

		System.out.printf("%s%10s%n", "Face", "Frequency");
		
		//output each array element's value - this is the count of 
		//of the occurrences of each face of the die in the 6 million rolls
		
		for (int face = 1; face < frequency.length; face++)
		{
			System.out.printf("%4d%10d%n", face, frequency[face]); //remember, it's really a 7 element array, but we're only using 1-6
		}




	} // end main	


} // end class