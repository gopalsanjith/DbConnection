package application;
import java.sql.*;


public class jdbc {
	 // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/sample";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "root";
	   
	   public static void main (String[] args) {
	        try {
	     
	            Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
	            Statement stmt = conn.createStatement();
	            ResultSet rs;
	 
	            rs = stmt.executeQuery("SELECT * from Persons");
	            while ( rs.next() ) {
	                String firstName = rs.getString("FirstName");
	                String lastName = rs.getString("LastName");
	                String address = rs.getString("Address");
	                String city = rs.getString("City");
	                int person_id = rs.getInt("PersonID");
	                System.out.println("USER ID: "+person_id);
	                System.out.println(firstName);
	                System.out.println(lastName);
	                System.out.println(address);
	                System.out.println(city);
	                
	            }
	            conn.close();
	        } catch (Exception e) {
	            System.err.println("Got an exception! ");
	            System.err.println(e.getMessage());
	        }
	    }
	   
	   

}
