import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class CreateTextFile
{

    /**This program creates a file and adds records to it. It also contains some error checking. Users can
     * exit the program by pressing CTRL-d.
     *
     * @author Jodi A. DeGrave
     * @version 1.0.0
     * @returns nothing since void is specified
     * @param args - is a string array from the command line argurments
     */

    private static Formatter output;        //inputs text to a file


    public static void main(String[] args)
    {
        openFile();
        addRecords();
        closeFile();

    }

    //open file clients.txt
    public static void openFile()
    {
        try
        {
            output = new Formatter("clients.txt");      //open the file
        }
        catch (SecurityException securityException)
        {
            System.err.println("Write permissions denied. Terminating.");
            System.exit(1);  // terminate the program
        }
        catch (FileNotFoundException fileNotFoundException)
        {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);     //terminate the program
        }
    }


    //add records to a file
    public static void addRecords() {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n? ",
                "Enter account number, first name, last name, and balance.",
                "Enter end-of-file indicator (CTRL-D) to end input.");

        while (input.hasNext())         //loop until end of file indicator
        while (input.hasNext())         //loop until end of file indicator
        {
            try {
                //output new record to file; assumes valid input
                output.format("%d %s %s %.2f%n", input.nextInt(),
                        input.next(), input.next(), input.nextDouble());
            } catch (NoSuchElementException elementException) {
                System.err.println("Invalid input. Please try again.");
                input.nextLine();   //discard input so user can try again

            }
            System.out.printf("? ");
        }   //end while
    }
    //close file
    public static void closeFile()
    {
        if (output != null)
            output.close();
    }
}   //end class CreatTetFile
