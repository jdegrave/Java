/**
 * Created by jdegrave on 11/17/2015.
 */
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.lang.*;



public class DatabaseSample {

    public static void main(String [] args){
        String driver = "org.apache.derby.jdbc.EmbeddedDriver";
        String dbName = "myDB";
        String connectionURL = "jdbc:derby:C:/Program Files/Java/jdk1.8.0_60/db/bin/myDB;create=true;";

        Connection connection = null;


        try {
                DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
                connection = DriverManager.getConnection(connectionURL,"","");
                Statement statement = connection.createStatement();

                // ResultSet processing goes here
                // read results from query below into a ResultSet
                ResultSet rsProducts = statement.executeQuery("SELECT * FROM Products");

                // As long there is a next row in the ResultSet, then move to it and print out the contents of the row, field by field
                while (rsProducts.next()) {
                    System.out.println(rsProducts.getString("ProductCode") + ", " + rsProducts.getString("Description") + ", " + rsProducts.getDouble("Price"));
                }

                // In accordance with best practices, and to prevent memory leaks, close our database objects when done
                rsProducts.close();
                statement.close();
                connection.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }   //end main

}   // end class












