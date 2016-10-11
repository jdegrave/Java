import java.util.Scanner;


public class Main {
    /** This Main method  explores "if" statements, ternary if statements, for loops, while loops (pre-test loop),
     * do-while loops (post-test loop), and the use of "break" and/or "continue" statements.
     *
     * <p>
     * Since this is an exercise in control structures, the code here is not as efficient as it could be;
     * for example, using the mod(modulus) operator) instead of a step (increment) of += 2.
     * </p>
     *
     * @author Jodi A De Grave
     * @version 1.0.0
     * @param args is a string array from the command line arguments
     * @return Nothing - since void is specified
     *
     *
     */

    public static void main(String[] args) {

	// write your code here
        //To Do:  Do the To-Do assignments below in C#, then convert the code to Java

        //To-Do:  Replace the if-else block below with a ternary statement

        int myInteger = 6;
        String myString = "";
        Scanner exitInput = new Scanner(System.in);  // for

        System.out.print("Using the if statement: ");
        if (myInteger >=5)
        {
            myString = "-ge 5";
        }
        else
        {
            myString = "-lt 5";
        }

        System.out.println(myString);
        System.out.println();

        myString = (myInteger >= 5) ? "-ge 5" : "-lt5";

        System.out.println("The answer using a ternary statetment: " + myString);
        System.out.println();

        System.out.println("Printing all odd integers 1 thru 20 using a for loop: ");
        for (int i = 1; i <= 20; i++)
        {
            // To-Do: Use one of the special loop commands below with an if statemtn
            // to only print odd numbers (this means "continue" or "break")

            if((i % 2) == 0) {
                continue;
            }
            System.out.println("int: " + i);



        }
        System.out.println();

        //To Do: Do a pretest loop with a counter to mimic the loop above
        System.out.println("With a 'while' loop (pretest): ");
        int j = 1;
        while (j <= 20)
        {
            if ((j % 2) != 0)
            {
                System.out.println("int: " + j);
            }
            j++;
        }
       System.out.println();

        // To Do: Do a post-test with a counter to mimic the loops above
        System.out.println("With a 'Do' loop (post-test): ");
        int k = 1;
        do
        {
            if ((k % 2) != 0)
            {
                System.out.println("int: " + k);
            }
            k++;
        } while (k <= 20);

        System.out.println();
        System.out.println("Press enter to continue...");
        exitInput.next();
    }
}

