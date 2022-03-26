package customerbooking;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustBookDAO {
	public static final String url = "jdbc:sqlite:E:\\db.db";
	public static CustBook addCustBook(CustBook custbook) {
		String query ="insert into booking(cust_name, cust_phno, trip_date, bk_date, source,destination, cab_name, vehicle_charge,  no_of_persons,  transaction_mode, pickup_time, waiting_hrs, no_of_kms) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, custbook.getCustName());
			st.setDouble(2, custbook.getCustPhone());
			st.setString(3, custbook.getTripDate());
			st.setString(4, custbook.getBookDate());
			st.setString(5, custbook.getSource());
			st.setString(6, custbook.getDestination());
			st.setString(7, custbook.getCabName());
			st.setFloat(8, custbook.getVehicleCharge());
			st.setInt(9, custbook.getNoofPerson());
			st.setString(10, custbook.getTransactionmode());
			st.setString(11, custbook.getPickuptime());	
			st.setString(12, custbook.getWatinghours());
			st.setInt(13,	 custbook.getNumberofkilometers());
					
					
					
			st.executeUpdate();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return custbook;
		
	}
	public static String getDriveremialid(String cabname) {	
		String email = "";	
		
			String query = "SELECT driver_email FROM driver WHERE cab_name = ?";
			try {
				Class.forName("org.sqlite.JDBC");
				Connection conn = DriverManager.getConnection(url);
				PreparedStatement st = conn.prepareStatement(query);
				st.setString(1, cabname);
				ResultSet rs = st.executeQuery();
				email = rs.getString(1);
				conn.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			return email;
			
		}
				 
	}
	


