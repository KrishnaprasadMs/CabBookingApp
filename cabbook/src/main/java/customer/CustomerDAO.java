package customer;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class CustomerDAO {
	public static final String url = "jdbc:sqlite:E:\\db.db";
	public static Customer addcustomer(Customer customer) {
		String query ="insert into cust(firstname, lastname, cust_email, phonenumber, adhar, password) values(?,?,?,?,?,?)";
		
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, customer.getCust_firstname());
			st.setString(2, customer.getCust_lastname());
			st.setString(3, customer.getCust_email());
			st.setString(4, customer.getCust_phno());
			st.setString(5, customer.getAdhar_no());
			st.setString(6, customer.getPassword());
			
			
			st.executeUpdate();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return customer;
		
	}
	
}



