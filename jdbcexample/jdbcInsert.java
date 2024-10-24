package jdbcexample;

import java.sql.*;

public class jdbcInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/sys","root","sanjaylee");
			Statement st=con.createStatement();
			String sql="insert into lee1 values(3,'lee',3433,'ooty')";
			 st.execute(sql);
			 System.out.println("insert complet");
	
		}catch(Exception e) {
			System.out.println("error"+e.getMessage());
		}
		
	}

	

}
