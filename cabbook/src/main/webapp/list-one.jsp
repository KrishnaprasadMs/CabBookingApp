<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,cabdetails.*"%>
    
    <%
ArrayList<Details> detail = (ArrayList<Details>) request.getAttribute("detail");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ALTO</title>
</head>
<body>
            <img src="images/swift.jpeg" alt="">


	<h1 align ="center">Details About the cab</h1>
	<table width="100%" cellspacing="2" cellpadding="10" border="2"
		bordercolor="grey">

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
		</tr>
		<%
		for (int I = 0; I < detail.size(); I++) {
		%>
		<tr>
			<td><%=detail.get(I).getCabId()%></td>
			<td><%=detail.get(I).getCabName()%></td>
			<td><%=detail.get(I).getSeatCapacity()%></td>
			<td><%=detail.get(I).getAc()%></td>
			<td><%=detail.get(I).getFuelType()%></td>
			<td><%=detail.get(I).getVehicleNo()%></td>
			<td><%=detail.get(I).getDriverName()%></td>
			<td><%=detail.get(I).getMileage()%></td>
			<td><%=detail.get(I).getChargePerKm()%></td>
			<td><%=detail.get(I).getRating()%></td>
		</tr>
		<%
		}
		%>
	</table>
	<br>
	<br>
	<a class="nav-link active" aria-current="page" href="index.html"><button>Home</button></a> &nbsp; &nbsp; &nbsp; &nbsp;<a class="nav-link active" aria-current="page" href="news.html"><button>Back</button></a>
</body>
</html>