<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    session.removeAttribute("isLoggedIn");
    session.removeAttribute("userFullName");
    Boolean isLoggedInObj = (Boolean) session.getAttribute("isLoggedIn");
    boolean isLoggedIn = isLoggedInObj != null && isLoggedInObj;
    if(!isLoggedIn) {
        response.sendRedirect("index.html");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CAB DETAILS</title>

<script type="text/javascript" src="flightValidation.js">
	
</script>
<link type="text/css" rel="stylesheet" href="cab.css">
</head>
<h2 align="center">ADMIN  VIEW</h2>

<body>
	<form action="#"method="post" onsubmit="return doValidate()">
		<div>
			<label for="idCabName"> Cab Name: </label> <input type="text"
				id="idcabName" name="cabName">
		</div>
		<div>
			<label for="idSeatCapacity"> Seat Capacity: </label> <input
				type="text" id="idSeatapacity" name="seatCapacity">
		</div>
		<div>
			<label for="idAC"> AC: </label> <input type="text"
				id="idAC" name="AC">
		</div>

		<div>
			<label for="idFuelType"> Fuel Type: </label> <input type="text"
				id="idFuelType" name="fueltype">
		</div>
		<div>
			<label for="idVehicleNumber">vehicle no</label> <input type="text"
				id="idVehicleNumber" name="VehicleNumber">
		</div>
		<div>
			<label for="idDriverName"> Driver Name </label> <input
				type="text" id="idDriverName" name="DriverName">
		</div>
		<div>
			<label for="idMileage">Mileage</label> <input
				type="text" id="idMileage" name="mileage">
		</div>
		<div>
			<label for="idChargeperkm"> Charger/km: </label> <input
				type="text" id="idChargeperkm" name=" Charger/km">
		</div>
		<div>
			<label for="idRating">Rating: </label> <input
				type="text" id="idRating" name="Rating">
		</div>
		<div>
			<label for="idAvailale"> Available: </label> <input
				type="text" id="idAvailale" name="Available">
		</div>
		<div class="btns">
			<input type="submit" value="Add cab details"> 
			<input type="reset"
				value="Clear Data">
		</div>
	</form>
	
	<div>
	<h2>Delete Cab From Database Using Id</h2>
	<form action="#" method="post" name="flight_form" onsubmit="return doValidate()">
		<label for="idCabId"> Enter Cab Id: </label> <input
			type="text" name="CabId"> <input type="submit"
			value="Delete Cab">
	</form>
	</div>
	
	<div>
	<h2>Update  cab fare From Database Using Id</h2>
	<form action="#" method="post" name="#" onsubmit="return doValidate()">
		<div><label for="idCabId"> Enter cab Id: </label> <input
			type="text" name="idcabId"> </div>
			<div>
			<label for="idchargeperkm"> Enter cab Fare: </label>
			<input type="text" name="cabUpdateFare"> 
			</div>
			<input type="submit" value="Update CabFare">
	</form>
	</div>
	
	<div>
	<h2>Retrive  specific row with cab Id</h2>
	<form action="#" method="post" name="#" onsubmit="return doValidate()">
		<label for="idCabId"> Enter cab Id: </label> <input
			type="text" name="CabId"> <input type="submit"
			value="Select cab">
	</form>
	</div>
	
	


</body>
</html>