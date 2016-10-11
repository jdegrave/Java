/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author jdegrave
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    
     public static void main(String[] args) {
	    /*
	    *  Multi-line comment
	    */

        Scanner input = new Scanner(System.in);  //Creates variable "input" as Scanner object?

        String myName = "";
        String myDOB = "";
        String myColor = "";

        System.out.println("My Hello World Program in Java...\n");
        System.out.println();

        System.out.print("Enter your name: ");
        myName = input.next();
        System.out.println("Hello, world! Hello, " + myName + "!");
        System.out.println();

        System.out.print("What is your data of birth?  Enter as MM/DD/YYYY:   ");
        myDOB = input.next();
        //System.out.println();

        System.out.println("Your date of birth is " + myDOB + ".");
        System.out.println();
        System.out.print("What is your favorite color?   ");
        myColor = input.next();
        System.out.println("Your favorite color is " + myColor + ".");
        System.out.println();


        System.out.print("Press Enter to continue...");
        input.next();
    }
}
