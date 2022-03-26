package customerbooking;

public class CustBook {
public String custName;
public double custPhone;
public String tripDate;
public String bookDate;
public String source;
public String destination;
public String cabName;
public float vehicleCharge;
public int noofPerson;
public String transactionmode;
public String pickuptime;
public String watinghours;
public int numberofkilometers;
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public double getCustPhone() {
	return custPhone;
}
public void setCustPhone(double custPhone) {
	this.custPhone = custPhone;
}
public String getTripDate() {
	return tripDate;
}
public void setTripDate(String tripDate) {
	this.tripDate = tripDate;
}
public String getBookDate() {
	return bookDate;
}
public void setBookDate(String bookDate) {
	this.bookDate = bookDate;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public String getCabName() {
	return cabName;
}
public void setCabName(String cabName) {
	this.cabName = cabName;
}
public float getVehicleCharge() {
	return vehicleCharge;
}
public void setVehicleCharge(float vehicleCharge) {
	this.vehicleCharge = vehicleCharge;
}
public int getNoofPerson() {
	return noofPerson;
}
public void setNoofPerson(int noofPerson) {
	this.noofPerson = noofPerson;
}
public String getTransactionmode() {
	return transactionmode;
}
public void setTransactionmode(String transactionmode) {
	this.transactionmode = transactionmode;
}
public String getPickuptime() {
	return pickuptime;
}
public void setPickuptime(String string) {
	this.pickuptime = string;
}
public String getWatinghours() {
	return watinghours;
}
public void setWatinghours(String watinghours) {
	this.watinghours = watinghours;
}
public int getNumberofkilometers() {
	return numberofkilometers;
}
public void setNumberofkilometers(int numberofkilometers) {
	this.numberofkilometers = numberofkilometers;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((bookDate == null) ? 0 : bookDate.hashCode());
	result = prime * result + ((cabName == null) ? 0 : cabName.hashCode());
	result = prime * result + ((custName == null) ? 0 : custName.hashCode());
	long temp;
	temp = Double.doubleToLongBits(custPhone);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((destination == null) ? 0 : destination.hashCode());
	result = prime * result + noofPerson;
	result = prime * result + numberofkilometers;
	result = prime * result + ((pickuptime == null) ? 0 : pickuptime.hashCode());
	result = prime * result + ((source == null) ? 0 : source.hashCode());
	result = prime * result + ((transactionmode == null) ? 0 : transactionmode.hashCode());
	result = prime * result + ((tripDate == null) ? 0 : tripDate.hashCode());
	result = prime * result + Float.floatToIntBits(vehicleCharge);
	result = prime * result + ((watinghours == null) ? 0 : watinghours.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	CustBook other = (CustBook) obj;
	if (bookDate == null) {
		if (other.bookDate != null)
			return false;
	} else if (!bookDate.equals(other.bookDate))
		return false;
	if (cabName == null) {
		if (other.cabName != null)
			return false;
	} else if (!cabName.equals(other.cabName))
		return false;
	if (custName == null) {
		if (other.custName != null)
			return false;
	} else if (!custName.equals(other.custName))
		return false;
	if (Double.doubleToLongBits(custPhone) != Double.doubleToLongBits(other.custPhone))
		return false;
	if (destination == null) {
		if (other.destination != null)
			return false;
	} else if (!destination.equals(other.destination))
		return false;
	if (noofPerson != other.noofPerson)
		return false;
	if (numberofkilometers != other.numberofkilometers)
		return false;
	if (pickuptime == null) {
		if (other.pickuptime != null)
			return false;
	} else if (!pickuptime.equals(other.pickuptime))
		return false;
	if (source == null) {
		if (other.source != null)
			return false;
	} else if (!source.equals(other.source))
		return false;
	if (transactionmode == null) {
		if (other.transactionmode != null)
			return false;
	} else if (!transactionmode.equals(other.transactionmode))
		return false;
	if (tripDate == null) {
		if (other.tripDate != null)
			return false;
	} else if (!tripDate.equals(other.tripDate))
		return false;
	if (Float.floatToIntBits(vehicleCharge) != Float.floatToIntBits(other.vehicleCharge))
		return false;
	if (watinghours == null) {
		if (other.watinghours != null)
			return false;
	} else if (!watinghours.equals(other.watinghours))
		return false;
	return true;
}
public CustBook(String custName, double custPhone, String tripDate, String bookDate, String source, String destination,
		String cabName, float vehicleCharge, int noofPerson, String transactionmode, String pickuptime,
		String watinghours, int numberofkilometers) {
	super();
	this.custName = custName;
	this.custPhone = custPhone;
	this.tripDate = tripDate;
	this.bookDate = bookDate;
	this.source = source;
	this.destination = destination;
	this.cabName = cabName;
	this.vehicleCharge = vehicleCharge;
	this.noofPerson = noofPerson;
	this.transactionmode = transactionmode;
	this.pickuptime = pickuptime;
	this.watinghours = watinghours;
	this.numberofkilometers = numberofkilometers;
}
public CustBook() {
	super();
}



}
