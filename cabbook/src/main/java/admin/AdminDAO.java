package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AdminDAO {
	public static final String url = "jdbc:sqlite:E:\\db.db";
	public static Admin insertCab(Admin admin) {
		
		String query = "insert into admincab(cab_name, seat_capacity, AC,"
				+ "fuel_type, vehicle_no, driver_name, mileage, charge_per_km, ratings, available) values(?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
		
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement st = conn.prepareStatement(query);
			
			st.setString(1, admin.getCabname());
			st.setInt(2, admin.getSeatcapacity());
			st.setString(3, admin.getAc());
			st.setString(4, admin.getFueltype());
			st.setInt(5, admin.getVehiclenumber());
			st.setString(6, admin.getDrivername());
			st.setInt(7, admin.getMileage());
			st.setInt(8, admin.getChargeperkm());
			st.setString(9, admin.getRating());
			st.setString(10, admin.getAvailable());
			st.executeUpdate();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return admin;
		
	}
public static int deleteCab(int id) {
		
		String deleteQuery = "delete from admincab where cab_id = "+ id;
        int i = 0;
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement st = conn.prepareStatement(deleteQuery);
			System.out.println("Database connected successfully");
//			st.setInt(1, id);
			i =st.executeUpdate();
			if(i==0) {
				System.out.println("no row updated");
			}
			else {
				System.out.println("no such row found");
			}
			System.out.println("One row Deleted successfully");
			conn.close();
			System.out.println("Database disconnected successfully");
			
		} catch (SQLException e) {
			System.out.println("Error in Deleted the row");
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		System.out.println("End of program");
		return i;
	}
public static boolean updateFlightFare(int cabId, int chargeperkm) {
	
	String query = "update admincab set charge_per_km = '" + chargeperkm + "' where cab_id = " + cabId;
	try {
		System.out.println(query);
		Class.forName("org.sqlite.JDBC");
		Connection conn = DriverManager.getConnection(url);
		PreparedStatement st = conn.prepareStatement(query);
		System.out.println("Database connected successfully");
		boolean found = st.execute();
		if(found) {
			System.out.println("One row updated successfully");
		}
		else {
			System.out.println("No row found with movie id " +cabId);
		}
		conn.close();
		System.out.println("Database disconnected successfully");
		return true;
	} 
	catch (SQLException e) {
		System.out.println("Error in updated the row");
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;

}
public static ArrayList<Admin> readCab(int cabId) {
	String query = "select cab_id, cab_name, seat_capacity, AC,fuel_type, vehicle_no, driver_name, mileage, charge_per_km, ratings, available from admincab where cab_id = " + cabId;
	ArrayList<Admin> admins = new ArrayList<>();
	try {
		Class.forName("org.sqlite.JDBC"); // 1.
		Connection con = DriverManager.getConnection(url);
		PreparedStatement st = con.prepareStatement(query);
		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			Admin admin = new Admin(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4),
					rs.getString(5), rs.getInt(6), rs.getString(7), rs.getInt(8),rs.getInt(9),rs.getString(10), rs.getString(11));
			admins.add(admin);
		}

	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return admins;
}
public static ArrayList<Admin> readAllCab() {
	String query = "select cab_id, cab_name, seat_capacity, AC,fuel_type, vehicle_no, driver_name, mileage, charge_per_km, ratings, available from admincab";
	ArrayList<Admin> admin = new ArrayList<>();
	try {
		Class.forName("org.sqlite.JDBC"); // 1.
		Connection con = DriverManager.getConnection(url);
		PreparedStatement st = con.prepareStatement(query);
		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			Admin admins = new Admin(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4),
					rs.getString(5), rs.getInt(6), rs.getString(7), rs.getInt(8),rs.getInt(9),rs.getString(10), rs.getString(11));
			admin.add(admins);
		}

	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return admin;
}
}
