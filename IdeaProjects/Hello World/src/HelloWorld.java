//package com.company;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
	    /*
	    *  Multi-line comment
	    */

        Scanner input = new Scanner(System.in);  //Creates variable "input" as Scanner object?

        String myName = "";         //Initialize string variable to store name value
        String myDOB = "";          //Initialize string variable to store date value (as a string)
        String myColor = "";        //Intiailize string variable to store colore value

        System.out.println("My Hello World Program in Java...\n");
        System.out.println();

        System.out.print("Enter your name: ");
        myName = input.nextLine();
        System.out.println("Hello, world! Hello, " + myName + "!");
        System.out.println();

        System.out.print("What is your data of birth?  Enter as MM/DD/YYYY:   ");
        myDOB = input.next();
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
