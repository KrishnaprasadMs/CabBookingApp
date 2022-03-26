<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,admin.* "%>
    
    <%
ArrayList<Admin> admins = (ArrayList<Admin>) request.getAttribute("admin");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin All Cab Data</title>
</head>
<body>
	<h1>Details about the cab</h1>
	<table width="100%" cellspacing="2" cellpadding="10" border="2"
		bordercolor="blue">

		<tr>
			<th>Cab Id</th>
			<th>Cab Name</th>
			<th>SeatCapacity</th>
			<th>Ac/NonAc</th>
			<th>FuelType</th>
			<th>VehicleNumber</th>
			<th>DriverName</th>
			<th>Mileage</th>
			<th>Charge/km</th>
			<th>Rating</th>
			<th>Available</th>
		</tr>
		<%
		for (int I = 0; I < admins.size(); I++) {
		%>
		<tr>
			<td><%=admins.get(I).getCabid()%></td>
			<td><%=admins.get(I).getCabname()%></td>
			<td><%=admins.get(I).getSeatcapacity()%></td>
			<td><%=admins.get(I).getAc()%></td>
			<td><%=admins.get(I).getFueltype()%></td>
			<td><%=admins.get(I).getVehiclenumber()%></td>
			<td><%=admins.get(I).getDrivername()%></td>
			<td><%=admins.get(I).getMileage()%></td>
			<td><%=admins.get(I).getChargeperkm()%></td>
			<td><%=admins.get(I).getRating()%></td>
			<td><%=admins.get(I).getAvailable()%></td>
		</tr>
		<%
		}
		%>
	</table>
	<br>
	<br>
	<a class="nav-link active" aria-current="page" href="index.html"><button>Home</button></a> &nbsp; &nbsp; &nbsp; &nbsp;<a class="nav-link active" aria-current="page" href="adminmanage.html"><button>Back</button></a>
</body>
</html>