import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class ReadTextFile
{
    /**This program reads a file and prints out the file contents to the console. It also contains some error checking. Users can
     * exit the program by pressing CTRL-d.
     *
     * @author Jodi A. DeGrave
     * @version 1.0.0
     * @returns nothing since void is specified
     * @param args - is a string array from the command line argurments
     */

    private static Scanner input;

    public static void main(String[] args)
    {
	    openFile();
        readRecords();
        closeFile();
    }

    //open file clients.txt
    public static void openFile()
    {
        try
        {
            input = new Scanner(Paths.get("clients.txt"));
        }
        catch (IOException ioException)
        {
            System.err.println("Error opening file. Terminating program.");
            System.exit(1);
        }
    }

    //read record from file
    public static void readRecords()
    {
        System.out.printf("%-10s%-12s%-12s%10s%n" , "Account",
                "First Name", "Last Name", "Balance");

        try
        {
            while(input.hasNext())  //while there is more to read
            {
                // display record contents
                System.out.printf("%-10d%-12s%-12s%10.2f%n", input.nextInt(),
                        input.next(), input.next(), input.nextDouble());
            }
        }
        catch (NoSuchElementException elementException)
        {
            System.err.println("File improperly formed. Terminating program.");
        }
        catch (IllegalStateException stateException)
        {
            System.err.println("Error reading from file. Terminating program.");
        }
    }   // end method readRecords

    //close file and terminate application
    public static void closeFile()
    {
        if (input != null)
            input.close();
    }
}   // end class ReadTextFile
