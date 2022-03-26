package cabdetails;

import java.util.Objects;

public class Details {

public Details(int cabId, String cabName, int seatCapacity, String ac, String fuelType, String vehicleNo,
		String driverName, String mileage, String chargePerKm, String rating, String available) {
	super();
	this.cabId = cabId;
	this.cabName = cabName;
	this.seatCapacity = seatCapacity;
	this.ac = ac;
	this.fuelType = fuelType;
	this.vehicleNo = vehicleNo;
	this.driverName = driverName;
	this.mileage = mileage;
	this.chargePerKm = chargePerKm;
	this.rating = rating;
	this.available = available;
}
public int getCabId() {
	return cabId;
}
public void setCabId(int cabId) {
	this.cabId = cabId;
}
private int cabId;
public Details(int cabId, String cabName, int seatCapacity, String ac, String fuelType, String vehicleNo,
		String driverName, String mileage, String chargePerKm, String rating) {
	super();
	this.cabId = cabId;
	this.cabName = cabName;
	this.seatCapacity = seatCapacity;
	this.ac = ac;
	this.fuelType = fuelType;
	this.vehicleNo = vehicleNo;
	this.driverName = driverName;
	this.mileage = mileage;
	this.chargePerKm = chargePerKm;
	this.rating = rating;
}
private String cabName;
private int seatCapacity;
private String ac;
private String fuelType;
private String vehicleNo;
private String driverName;
private String mileage;
private String chargePerKm;
private String rating;
private String available;
public String getCabName() {
	return cabName;
}
public void setCabName(String cabName) {
	this.cabName = cabName;
}
public int getSeatCapacity() {
	return seatCapacity;
}
public void setSeatCapacity(int seatCapacity) {
	this.seatCapacity = seatCapacity;
}
public String getAc() {
	return ac;
}
public void setAc(String ac) {
	this.ac = ac;
}
public String getFuelType() {
	return fuelType;
}
public void setFuelType(String fuelType) {
	this.fuelType = fuelType;
}
public String getVehicleNo() {
	return vehicleNo;
}
public void setVehicleNo(String vehicleNo) {
	this.vehicleNo = vehicleNo;
}
public String getDriverName() {
	return driverName;
}
public void setDriverName(String driverName) {
	this.driverName = driverName;
}
public String getMileage() {
	return mileage;
}
public void setMileage(String mileage) {
	this.mileage = mileage;
}
public String getChargePerKm() {
	return chargePerKm;
}
public void setChargePerKm(String chargePerKm) {
	this.chargePerKm = chargePerKm;
}
public String getRating() {
	return rating;
}
public void setRating(String rating) {
	this.rating = rating;
}
public String getAvailable() {
	return available;
}
public void setAvailable(String available) {
	this.available = available;
}
public Details() {
	super();
}

@Override
public int hashCode() {
	return Objects.hash(ac, available, cabName, chargePerKm, driverName, fuelType, mileage, rating, seatCapacity,
			vehicleNo);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Details other = (Details) obj;
	return Objects.equals(ac, other.ac) && Objects.equals(available, other.available)
			&& Objects.equals(cabName, other.cabName) && Objects.equals(chargePerKm, other.chargePerKm)
			&& Objects.equals(driverName, other.driverName) && Objects.equals(fuelType, other.fuelType)
			&& Objects.equals(mileage, other.mileage) && Objects.equals(rating, other.rating)
			&& seatCapacity == other.seatCapacity && Objects.equals(vehicleNo, other.vehicleNo);
}
@Override
public String toString() {
	return "Details [cabName=" + cabName + ", seatCapacity=" + seatCapacity + ", ac=" + ac + ", fuelType=" + fuelType
			+ ", vehicleNo=" + vehicleNo + ", driverName=" + driverName + ", mileage=" + mileage + ", chargePerKm="
			+ chargePerKm + ", rating=" + rating + ", available=" + available + "]";
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
