import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.*;                     //Java 8 already loads this


public class Program {
    /** This Main() method shows how to use different data types.
     * These comments (forward slash with two asterisks are Javadoc commments for auto-documentation.
     * This special type of comment precedes the item to be documented
     * <p>
     * Here are some remarks.
     * @author Jodi A. DeGrave
     * @version 1.0.0
     * @param args is a string array from the command line arguments.
     * @returns Nothing -- since void is specified </p>
     */
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);     // Creates variable "input" as Scanner object

    //Declare some local constants
    final double MY_PI = 3.14159;
    final String SCHOOL_NAME = "Northwest Technical Institute";

    //Declare some variables of varying data types below.
    String myString1 = "Class Period";
    String myString2 = " #2";
    String myString3;
    String myString4 = "salacious";

    char myChar1 = 'a';
    char myChar2 = 'b';

    int myInt1 = 5;
    int myInt2 = 10;

    long myLong1 = (long)555555555555555L;           //use the appended "L" suffix with long integer literals
    long myLong2 = (long)666666666666666L;

    float myFloat2 = (float)23.001;                 //use paranetheses to cast the floating number to float
    float myFloat1 = 42.002f;                       //use the "f" appended suffix to cast to float

    double myDouble1 = 123.456;
    double myDouble2 = 654.321;

    BigDecimal myDecimal1 = new BigDecimal("500.00");
    BigDecimal myDecimal2 = new BigDecimal("1000.50");

    boolean myBool1 = true;
    boolean myBool2 = false;

    double myRadius = 10.00;
    Double myArea;                                  // use the Double class here insted of the double primitive for built in methods

   //Start input and conversion section
    String tempInput = "";                           //set up a temporary variable for input from console

    System.out.println("Please enter a char value: ");
    tempInput = input.nextLine();
    myChar1 = tempInput.trim().charAt(0);             //Convert the first character of the string to a char;
                                                      // this is also an example of method chaining
    System.out.println("The char value is: " + myChar1);

    System.out.println();

    System.out.println("Please enter an integer value: ");
    tempInput = input.nextLine();
    myInt1 = Integer.parseInt(tempInput);
    System.out.println("The integer value is: " + myInt1);

    System.out.println("Please enter a long value: ");
    tempInput = input.nextLine();
    myLong1 = Long.parseLong(tempInput);
    System.out.println("The long value is: " + myLong1);

    System.out.println("Please enter a float or single precision floating point value: ");
    tempInput = input.nextLine();
    myFloat1 = Float.parseFloat(tempInput);
    System.out.println("The float/single precisio value is: " + myFloat1);

    System.out.println("Please enter a double or double precision value: ");
    tempInput = input.nextLine();
    myDouble1 = Double.parseDouble(tempInput);
    System.out.println("The double value is: " + myDouble1);

    System.out.println("Please enter a a Big Decimal, also known as 'currency' value: ");
    tempInput = input.nextLine();
    myDecimal1 = new BigDecimal(tempInput);
    System.out.println("The Big Decimal/currency value is: " + tempInput);

    System.out.println("Please enter a Boolean value: ");
    tempInput = input.nextLine();
    myBool1 = Boolean.parseBoolean(tempInput);
    System.out.println("The boolean value is: " + tempInput);

    System.out.println("Please enter a string value to comapre with 'salacious': ");
    tempInput = input.nextLine();
    if (tempInput.trim().toUpperCase().equals(myString4.trim().toUpperCase())){
        System.out.println("Your string equals 'salacious'!");
    }else{
        System.out.println("Your string does not equal 'salacious'!");
    }






    System.out.println("My Lesson 2 Examples in Java");
    myArea = MY_PI * Math.pow(myRadius, 2.0);
    System.out.println ("My area is: " + myArea.toString());
    myArea = Math.PI * Math.pow(myRadius, 2.0);
    System.out.println("My area is: " + myArea.toString());
    System.out.println("My chars are: " + myChar1 + myChar2);

    myString3 = myString1 + myString2;
    System.out.println("My strings are: " + myString3);

    System.out.println("The sum of my integers are: " + (myInt1 + myInt2));

    System.out.println("The sum of my longs are: " + (myLong1 + myLong2));

    System.out.println("The sum of my floats / single precision are: " + (myFloat1 + myFloat2));

    System.out.println("The sum of my doubles / double precision floating points are: " + (myDouble1 + myDouble2));

    System.out.println("The sum of my decimal / currency amounts are: " + (myDecimal1.add(myDecimal2)));

    System.out.println("The result of mmBool1 AND myBool2 is: "+(myBool1 && myBool2) + "\n");

    System.out.println("Press Enter to continue...");

    input.nextLine();
    }
}
