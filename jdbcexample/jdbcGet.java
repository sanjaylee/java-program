package jdbcexample;

import java.sql.*;

public class jdbcGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
 			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/sys","root","sanjaylee");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from lee1");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			}
			con.close();
		}catch(Exception e) {
			System.out.println("error"+e.getMessage());
		}

	}

}
