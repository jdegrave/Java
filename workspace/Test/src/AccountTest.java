// Fig. 3.9: AccountTest.java
// Inputting and outputting floating-point numbers with Account objects.
import java.util.Scanner;

public class AccountTest
{
   public static void main(String[] args) 
   {
      Account account1 = new Account("Jane Green", 50.00);
      Account account2 = new Account("John Blue", -7.53); 
      

      // display initial balance of each object
      System.out.printf("%s balance: $%.2f%n",
         account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance()); 

      // create a Scanner to obtain input from the command window
      Scanner input = new Scanner(System.in);

      System.out.print("Enter deposit amount for account1: "); // prompt
      double depositAmount = input.nextDouble(); // obtain user input
      System.out.printf("%nadding %.2f to account1 balance%n%n", 
         depositAmount);
      account1.deposit(depositAmount); // add to account1's balance
      
      
      // display balances
      System.out.printf("%s balance: $%.2f%n",
         account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance()); 

      System.out.print("Enter deposit amount for account2: "); // prompt
      depositAmount = input.nextDouble(); // obtain user input
      System.out.printf("%nadding %.2f to account2 balance%n%n", 
         depositAmount);
      account2.deposit(depositAmount); // add to account2 balance

      // display balances
      System.out.printf("%s balance: $%.2f%n", 
         account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance()); 
      
      //Enter withdrawal amount for account1
      System.out.print("Enter the withdrawal amount for account1: "); //prompt to withdraw
      double withdrawalAmount = input.nextDouble();						// read in withdrawal amount
      String answer = account1.checkBalance(withdrawalAmount);		//check if account1's balance is less than the withdrawal amount
      String continueProcess = "Yes"; 
      if (answer == "Yes") 
      {
    	  System.out.println("WARNING: Withdrawal amount is greater than the current balance.");
    	  System.out.print("Proceed with withdrawal? ");
    	  
    	  continueProcess = input.next();		// read the response
    	  
    	  //check the answer and then withdraw the amount
    	  if ( (continueProcess.equals("No")) || (continueProcess.equals("N")) || (continueProcess.equals("n")) )
    	  {
    		  System.out.println("Withdrawal canceled.");
    	  } 	  
      }
      if ( (answer == "No") || (continueProcess.equals("Y")) || (continueProcess.equals("Yes")) || (continueProcess.equals("y")) )
	  {	
    	  System.out.printf("withdrawing $%.2f from account1 balance %n%n", withdrawalAmount);
	      account1.withdrawal(withdrawalAmount);	//withdraw from account1
	  }  
    	  
       	
      
    //Enter withdrawal amount for account2
      System.out.print("Enter the withdrawal amount for account2: "); //prompt to withdraw
      withdrawalAmount = input.nextDouble();						// read in withdrawal amount
      answer = account2.checkBalance(withdrawalAmount);		//check if account1's balance is less than the withdrawal amount
     
      if (answer == "Yes") 
      {
    	  System.out.println("WARNING: Withdrawal amount is greater than the current balance.");
    	  System.out.println(); 
    	  System.out.print("Proceed with withdrawal? ");
    	  
    	  continueProcess = input.next();		// read the response
    	  
    	  //check the answer and then withdraw the amount
    	  if ( (continueProcess.equals("No")) || (continueProcess.equals("N")) || (continueProcess.equals("n")) )
    	  {
    		  System.out.println("Withdrawal canceled.");
    	  } 	  
      }
      if ( (answer == "No") || (continueProcess.equals("Y")) || (continueProcess.equals("Yes")) || (continueProcess.equals("y")) )
	  {	
    	  System.out.printf("withdrawing $%.2f from account2 balance %n%n", withdrawalAmount);
	      account2.withdrawal(withdrawalAmount);	//withdraw from account1
	  }  
     
      // display balances
      System.out.printf("%s balance: $%.2f%n", 
         account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance());   
      
      
      
   } // end main
} // end class AccountTest

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
