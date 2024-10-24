package jdbcexample;
import java.sql.*;
public class jdbcDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/sys","root","sanjaylee");
		    Statement st=con.createStatement();
		    String sql="delete from lee1 where id=3";
		    st.execute(sql);
		    System.out.println("delete succesfully");
		}catch(Exception e) {
			System.out.println("error "+e);
		}
		
		
		
		
		
		
	}

}
