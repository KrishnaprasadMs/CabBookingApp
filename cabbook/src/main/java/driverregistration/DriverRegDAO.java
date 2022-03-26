package driverregistration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class DriverRegDAO {
	public static final String url = "jdbc:sqlite:E:\\db.db";
	public static DriverReg addDriverReg(DriverReg DriverReg) {
		String query ="insert into driver(driver_fname, driver_lname, driver_email, driver_phno, driver_adhar,cab_name,cab_number,driver_experience, driver_licence,password ) values(?,?,?,?,?,?,?,?,?,?)";
		
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, DriverReg.getDriverFname());
			st.setString(2, DriverReg.getDriverLname());
			st.setString(3, DriverReg.getDriverEmail());
			st.setDouble(4, DriverReg.getDriverPhonenumber());
			st.setDouble(5, DriverReg.getAdharnumber());
			st.setString(6, DriverReg.getCabName());
			st.setDouble(7, DriverReg.getCabNumber());
			st.setDouble(8, DriverReg.getLicenceNumber());
			st.setInt(9, DriverReg.getExperience());
			st.setDouble(10, DriverReg.getPassword());
			
			st.executeUpdate();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return DriverReg;
		
	}
	
}



