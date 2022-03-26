package cabdetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class DetailsDAO1 {
	public static final String url = "jdbc:sqlite:E:\\db.db";
	public static ArrayList<Details> readOne() {
		String query = "select cab_id, cab_name, seat_capacity, AC, fuel_type, vehicle_no,driver_name, mileage,charge_per_km,ratings from  admincab where cab_id = " + 1;
		ArrayList<Details> details = new ArrayList<>();
		try {
			Class.forName("org.sqlite.JDBC"); // 1.
			Connection con = DriverManager.getConnection(url);
			PreparedStatement st = con.prepareStatement(query);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Details detail = new Details(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),rs.getString(9),rs.getString(10));
				details.add(detail);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return details;
	}
	public static ArrayList<Details> readTwo() {
		String query = "select cab_id, cab_name, seat_capacity, AC, fuel_type, vehicle_no,driver_name, mileage,charge_per_km,ratings from  admincab where cab_id = " + 2;
		ArrayList<Details> details = new ArrayList<>();
		try {
			Class.forName("org.sqlite.JDBC"); // 1.
			Connection con = DriverManager.getConnection(url);
			PreparedStatement st = con.prepareStatement(query);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Details detail = new Details(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),rs.getString(9),rs.getString(10));
				details.add(detail);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return details;
	}
	
	public static ArrayList<Details> readThree() {
		String query = "select cab_id, cab_name, seat_capacity, AC, fuel_type, vehicle_no,driver_name, mileage,charge_per_km,ratings from  admincab where cab_id = " + 3;
		ArrayList<Details> details = new ArrayList<>();
		try {
			Class.forName("org.sqlite.JDBC"); // 1.
			Connection con = DriverManager.getConnection(url);
			PreparedStatement st = con.prepareStatement(query);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Details detail = new Details(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),rs.getString(9),rs.getString(10));
				details.add(detail);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return details;
	} 
	
	public static ArrayList<Details> readFour() {
		String query = "select cab_id, cab_name, seat_capacity, AC, fuel_type, vehicle_no,driver_name, mileage,charge_per_km,ratings from  admincab where cab_id = " + 4;
		ArrayList<Details> details = new ArrayList<>();
		try {
			Class.forName("org.sqlite.JDBC"); // 1.
			Connection con = DriverManager.getConnection(url);
			PreparedStatement st = con.prepareStatement(query);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Details detail = new Details(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),rs.getString(9),rs.getString(10));
				details.add(detail);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return details;
	}
}

//CREATE TABLE "admincab" (
//		"cab_id"	INTEGER NOT NULL,
//		"cab_name"	TEXT NOT NULL,
//		"seat_capacity"	INTEGER,
//		"AC"	TEXT,
//		"fuel_type"	TEXT,
//		"vehicle_no"	TEXT,
//		"driver_name"	TEXT,
//		"mileage"	TEXT,
//		"charge_per_km"	TEXT,
//		"ratings"	TEXT,
//		"available"	TEXT,
//		PRIMARY KEY("cab_id" AUTOINCREMENT)
//	)