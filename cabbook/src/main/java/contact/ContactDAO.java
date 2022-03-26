package contact;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class ContactDAO {
	public static final String url = "jdbc:sqlite:E:\\db.db";
	public static Contact addcontact(Contact contact) {
		String query ="insert into contact(name,phone,message) values(?,?,?)";
		
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, contact.getName());
			st.setString(2, contact.getPhone());
			st.setString(3, contact.getMessage());
			
			
			
			st.executeUpdate();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return contact;
		
	}
	
}




