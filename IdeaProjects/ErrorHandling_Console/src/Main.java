import java.util.*;



public class Main {

    public static void main(String[] args) {
    // write your code here
        try {

            //if comment this out, finally block catches the error
            //throw new Exception("My Error!");
            //throw new IllegalArgumentException("Division by Zero error!");
            int i = 5/0;

        }catch (ArithmeticException e){

            System.err.println("Catch Division by Zero.");

        }catch(Exception e){
            System.err.println("In catch block");
            //if (e instanceof IllegalArgumentException) {


            //} else (e instanceof ) {

        }finally {
            System.err.println("In finally block");

        }







    }
}
