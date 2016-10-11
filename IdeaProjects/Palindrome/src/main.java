/**
 * Created by jdegrave on 08/11/2016.
 */

import java.util.*;

public class main {

    public static void main(String[] args){

        Scanner newInput = new Scanner(System.in);
        String myString = "";
        int wordLength = 0;
        int endPosition = 0;
        int loopStop = 0;
        boolean palindrome = true;

        System.out.println("Enter your word: ");
        myString = newInput.next();

        wordLength = myString.length();
        if (wordLength%2 == 0)
            loopStop = wordLength/2;
        else
            loopStop = wordLength/2 + 1;

        endPosition = wordLength-1;

        //for (int i = 0; i < loopStop; i++)
        int i = 0;
        while(i <= loopStop && palindrome)
        {
            if (myString.charAt(i) == myString.charAt(endPosition))
            {
                endPosition--;
                i++;
            }
            else
            {
             palindrome = false;
             System.out.println(myString + " is not a a palindrome");
            }
         } // end for

        if (palindrome)
        {
            System.out.println(myString + " is a palindrome.");
        }
    }


}




