package jdbcexample;

import java.sql.*;
public class jdbcUpdate {

	 public static void main(String[] args) {
		
		 
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/sys","root","sanjaylee");
			Statement st=con.createStatement();
			String sql="update lee1 set l_city ='karapattu' where id=3";
	    	st.execute(sql);
	    	System.out.println("update succesfully");
	    	
		} catch (Exception e) {
			System.out.println("error"+e.getMessage());
		}
		 
		 
		 
		 
		 
		 
		 
	}
}
