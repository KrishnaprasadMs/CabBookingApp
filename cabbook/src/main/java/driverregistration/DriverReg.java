package driverregistration;

import java.util.Objects;

public class DriverReg {
	public DriverReg() {
		super();
	}
	private String driverFname;
	 private String driverLname;
	 private String driverEmail;
	 private double driverPhonenumber;
	 private double Adharnumber;
	 private String cabName;
	 private double cabNumber;
	 private int experience;
	 public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	private double licenceNumber;
	 private Double password;
	@Override
	public int hashCode() {
		return Objects.hash(Adharnumber, cabName, cabNumber, driverEmail, driverFname, driverLname, driverPhonenumber,
				licenceNumber, password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DriverReg other = (DriverReg) obj;
		return Adharnumber == other.Adharnumber && Objects.equals(cabName, other.cabName)
				&& Double.doubleToLongBits(cabNumber) == Double.doubleToLongBits(other.cabNumber)
				&& Objects.equals(driverEmail, other.driverEmail) && Objects.equals(driverFname, other.driverFname)
				&& Objects.equals(driverLname, other.driverLname)
				&& Double.doubleToLongBits(driverPhonenumber) == Double.doubleToLongBits(other.driverPhonenumber)
				&& Double.doubleToLongBits(licenceNumber) == Double.doubleToLongBits(other.licenceNumber)
				&& Objects.equals(password, other.password);
	}
	@Override
	public String toString() {
		return "DriverReg [driverFname=" + driverFname + ", driverLname=" + driverLname + ", driverEmail=" + driverEmail
				+ ", driverPhonenumber=" + driverPhonenumber + ", Adharnumber=" + Adharnumber + ", cabName=" + cabName
				+ ", cabNumber=" + cabNumber + ", licenceNumber=" + licenceNumber + ", password=" + password + "]";
	}
	public DriverReg(String driverFname, String driverLname, String driverEmail, double driverPhonenumber,
			double adharnumber, String cabName, double cabNumber, double licenceNumber, Double password) {
		super();
		this.driverFname = driverFname;
		this.driverLname = driverLname;
		this.driverEmail = driverEmail;
		this.driverPhonenumber = driverPhonenumber;
		Adharnumber = adharnumber;
		this.cabName = cabName;
		this.cabNumber = cabNumber;
		this.licenceNumber = licenceNumber;
		this.password = password;
	}
	public String getDriverFname() {
		return driverFname;
	}
	public void setDriverFname(String driverFname) {
		this.driverFname = driverFname;
	}
	public String getDriverLname() {
		return driverLname;
	}
	public void setDriverLname(String driverLname) {
		this.driverLname = driverLname;
	}
	public String getDriverEmail() {
		return driverEmail;
	}
	public void setDriverEmail(String driverEmail) {
		this.driverEmail = driverEmail;
	}
	public double getDriverPhonenumber() {
		return driverPhonenumber;
	}
	public void setDriverPhonenumber(double driverPhonenumber) {
		this.driverPhonenumber = driverPhonenumber;
	}
	public double getAdharnumber() {
		return Adharnumber;
	}
	public void setAdharnumber(double adharnumber) {
		Adharnumber = adharnumber;
	}
	public String getCabName() {
		return cabName;
	}
	public void setCabName(String cabName) {
		this.cabName = cabName;
	}
	public double getCabNumber() {
		return cabNumber;
	}
	public void setCabNumber(double cabNumber) {
		this.cabNumber = cabNumber;
	}
	public double getLicenceNumber() {
		return licenceNumber;
	}
	public void setLicenceNumber(double licenceNumber) {
		this.licenceNumber = licenceNumber;
	}
	public Double getPassword() {
		return password;
	}
	public void setPassword(double password) {
		this.password = password;
	}
}
	 