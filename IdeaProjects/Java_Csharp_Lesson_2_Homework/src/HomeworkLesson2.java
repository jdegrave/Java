import javafx.util.converter.BigDecimalStringConverter;

import java.util.Scanner;
import java.math.*;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.lang.String;


public class HomeworkLesson2 {
    /** This program accepts user input and then determines if it can be coverted to a numeric value.
     *  If it can convert the input, it converts the string to the following values and displays them:
     *  -- int
     *  -- long
     *  -- float
     *  -- double
     *  -- decimal
     *  If it can't, it checks it against a constant to see if it's a match and displays a message to inform
     *  the user of the results.
     * @author Jodi A. DeGrave
     * @version 1.0
     * @returns Nothing -- since void is specificed
     * @param args - is a string array from the command line arguments
     */
    public static void main(String[] args) {
	// Declare a local constant for comparison.
        final String MYSTRINGTOCOMPARE = "salacious";

    // Declare variable for Console input. Console input is always treated as a string
        Scanner myEntry = new Scanner(System.in);

    //  Declare variables for conversion values
        String myStringInput = "";
        int myInt1 = 0;
        int myStringLength = 0;
        double myDouble = 0;
        boolean isANumber = false;
        boolean myBooleanCheck = false;



        System.out.println("My Lesson 2 Homework in C#");
        System.out.println("This program checks what is entered, and if possible, converts");
        System.out.println("whatever you enter to each of the following datatypes:");
        System.out.println();
        System.out.println("--int");
        System.out.println("--long");
        System.out.println("--float");
        System.out.println("--double");
        System.out.println("--decimal");
        System.out.println();
        System.out.println("If the value can't be converted to a number, a message displays; otherwise, it's converted.");
        System.out.println("And then the string is compared to a Mystery Word and indicates if it's a match or not.");
        System.out.println();

        System.out.print("Enter a string of at least one character:  ");
        myStringInput = myEntry.nextLine();
        System.out.println();

        //Convert entered values to char
        System.out.println("The char value is: " + myStringInput.charAt(0));

        //Convert entered value to boolean
        System.out.println("The boolean value is: " + Boolean.parseBoolean(myStringInput));
        System.out.println();

        // Check to see if the string is only numeric characters; if it is, put the value in myDouble variable,
        // and set isANumber (a boolean variable) to true
        // Otherwise, print out the message that conversion isn't possible and check for Mystery Word match.
        try {
                myDouble = Double.valueOf(myStringInput);
                isANumber = true;
        } catch(Exception e){
                System.out.println("This string isn't 100% numeric. Numeric conversion isn't possible.");
                System.out.println();
                System.out.println("Instead, I will check it against the Mystery Word.");
                System.out.println();
        }

        //  Perform the conversions
        if (isANumber) {
            System.out.println("Your value of " + myStringInput + " converted to: ");
            System.out.println();

            //convert to input to an int using casting and parse methods
            System.out.println("int using casting method '(int)<number not a string value>':  " + (int)myDouble);
            try {
                System.out.println("int using 'Integer.parseInt(string)' method: " + Integer.parseInt(myStringInput));
            }
            catch (Exception e){
                System.out.println("Not an integer value. Couldn't convert using 'Integer.parseInt(string)' method.");
            }
            System.out.println();

            //convert to long integer using casting and parse methods
            System.out.println("long using casting method '(long)'<number not a string value>: " + (long)myDouble);
            try {
                System.out.println("long using 'Long.parseLong(string)' method: " + Long.parseLong(myStringInput));
            }
            catch (Exception e){
                System.out.println("Not a long integer value. Can't convert using 'Long.parseLong(string)' method.");
            }
            System.out.println();

            //oconvert to float using casting and parse method
            System.out.println("float using cast method '(float)<number not a string value>: " + (float)myDouble);
            System.out.println("float using 'Float.parseFloat(string)' method: " + Float.parseFloat(myStringInput));
            System.out.println();

            //convert to double using casting and parse method
            System.out.println("double value using cast method: " + myDouble);
            System.out.println("double value using 'Double.parseDouble(string)' method: " + Double.parseDouble(myStringInput));
            System.out.println();

            //Convert to currency (aka "BigDecimal") via creating two BigDecimal objects: one from a double and one from a string a value
            BigDecimal myBigDecimal = new BigDecimal(myDouble);
            System.out.println("Big Decimal via a double: " + myBigDecimal);
            BigDecimal myBigDecimal2 = new BigDecimal(myStringInput);
            System.out.println("Bid Decimal via a string: " + myBigDecimal2);
            System.out.println();
        }

        // Check entry for a match to the string constant (a.k.a "Mystery Word).
        if (myStringInput.equals(MYSTRINGTOCOMPARE)) {
            System.out.println("Congratulations! '" + myStringInput + "' is a match to '" + MYSTRINGTOCOMPARE + "'.");
        }
        else {
            System.out.println("'" + myStringInput + "' isn't a match to the Mystery Word.");
        }
        System.out.println("Press Enter to continue...");
        myEntry.next();
    }
}
