package driverlogin;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



	public class DriverLoginDAO {

		public static final String url = "jdbc:sqlite:E:\\db.db";

		
			

		public static boolean checkLoginCredentials(String email, String password) {
			boolean isvalid = false;
			String query = "SELECT password FROM driver WHERE driver_email = ?";
			try {
				Class.forName("org.sqlite.JDBC");
				Connection con = DriverManager.getConnection(url);
				
				PreparedStatement st = con.prepareStatement(query);
				st.setString(1, email);
				ResultSet r1 = st.executeQuery();
				System.out.println("value of rs : "+r1.getString(1));
				
				
				if(password.equals(r1.getString(1))) {
					isvalid = true;
				}
				con.close();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			
			
			
			return isvalid;
		}
		}
	
		
		