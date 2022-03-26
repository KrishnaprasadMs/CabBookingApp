package adminsevlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.Admin;
import admin.AdminDAO;

/**
 * Servlet implementation class AdminInsert
 */
public class AdminInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminInsert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Admin admin = new Admin();
		
        admin.setCabname(request.getParameter("cabName"));
        admin.setSeatcapacity(Integer.parseInt(request.getParameter("seatCapacity")));
        admin.setAc(request.getParameter("AC"));
        admin.setFueltype(request.getParameter("fueltype"));
        admin.setVehiclenumber(Integer.parseInt(request.getParameter("VehicleNumber")));
        admin.setDrivername(request.getParameter("DriverName"));
        admin.setMileage(Integer.parseInt(request.getParameter("mileage")));
        admin.setChargeperkm(Integer.parseInt(request.getParameter("Chargerkm")));
        admin.setRating(request.getParameter("Rating"));
        admin.setAvailable(request.getParameter("Available"));
        AdminDAO.insertCab(admin);
        request.setAttribute("admin", admin);
        request.getRequestDispatcher("sucess.jsp").forward(request, response);
        
	}

}
