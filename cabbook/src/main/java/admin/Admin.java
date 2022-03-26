package admin;

import java.util.Objects;

public class Admin {
private int cabid;
private String cabname;
private int seatcapacity;
private String Ac;
private String fueltype;
private int vehiclenumber;
private String drivername;
private int mileage;
private int chargeperkm;
private String rating;
private String available;
public int getCabid() {
	return cabid;
}
public void setCabid(int cabid) {
	this.cabid = cabid;
}
public String getCabname() {
	return cabname;
}
public void setCabname(String cabname) {
	this.cabname = cabname;
}
public int getSeatcapacity() {
	return seatcapacity;
}
public void setSeatcapacity(int seatcapacity) {
	this.seatcapacity = seatcapacity;
}
public String getAc() {
	return Ac;
}
public void setAc(String ac) {
	Ac = ac;
}
public String getFueltype() {
	return fueltype;
}
public void setFueltype(String fueltype) {
	this.fueltype = fueltype;
}
public int getVehiclenumber() {
	return vehiclenumber;
}
public void setVehiclenumber(int vehiclenumber) {
	this.vehiclenumber = vehiclenumber;
}
public String getDrivername() {
	return drivername;
}
public void setDrivername(String drivername) {
	this.drivername = drivername;
}
public int getMileage() {
	return mileage;
}
public void setMileage(int mileage) {
	this.mileage = mileage;
}
public int getChargeperkm() {
	return chargeperkm;
}
public void setChargeperkm(int chargeperkm) {
	this.chargeperkm = chargeperkm;
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
public Admin() {
	super();
}
public Admin(int cabid, String cabname, int seatcapacity, String ac, String fueltype, int vehiclenumber,
		String drivername, int mileage, int chargeperkm, String rating, String available) {
	super();
	this.cabid = cabid;
	this.cabname = cabname;
	this.seatcapacity = seatcapacity;
	Ac = ac;
	this.fueltype = fueltype;
	this.vehiclenumber = vehiclenumber;
	this.drivername = drivername;
	this.mileage = mileage;
	this.chargeperkm = chargeperkm;
	this.rating = rating;
	this.available = available;
}
@Override
public String toString() {
	return "Admin [cabid=" + cabid + ", cabname=" + cabname + ", seatcapacity=" + seatcapacity + ", Ac=" + Ac
			+ ", fueltype=" + fueltype + ", vehiclenumber=" + vehiclenumber + ", drivername=" + drivername
			+ ", mileage=" + mileage + ", chargeperkm=" + chargeperkm + ", rating=" + rating + ", available="
			+ available + "]";
}
@Override
public int hashCode() {
	return Objects.hash(Ac, available, cabid, cabname, chargeperkm, drivername, fueltype, mileage, rating, seatcapacity,
			vehiclenumber);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Admin other = (Admin) obj;
	return Objects.equals(Ac, other.Ac) && Objects.equals(available, other.available) && cabid == other.cabid
			&& Objects.equals(cabname, other.cabname) && chargeperkm == other.chargeperkm
			&& Objects.equals(drivername, other.drivername) && Objects.equals(fueltype, other.fueltype)
			&& mileage == other.mileage && Objects.equals(rating, other.rating) && seatcapacity == other.seatcapacity
			&& vehiclenumber == other.vehiclenumber;
}

}




/*
 * cab_id"	INTEGER NOT NULL,
	"cab_name"	TEXT NOT NULL,
	"seat_capacity"	INTEGER,
	"AC"	TEXT,
	"fuel_type"	TEXT,
	"vehicle_no"	TEXT,
	"driver_name"	TEXT,
	"mileage"	TEXT,
	"charge_per_km"	TEXT,
	"ratings"	TEXT,
	"available"	TEXT,
	PRIMARY KEY("cab_id" AUTOINCREMENT)
);
 */
