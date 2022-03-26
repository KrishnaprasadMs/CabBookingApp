package driverregistrationservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import driverregistration.DriverReg;
import driverregistration.DriverRegDAO;

/**
 * Servlet implementation class DriverNewRegServer
 */
public class DriverNewRegServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DriverNewRegServer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DriverReg DriverReg = new DriverReg();
		DriverReg.setDriverFname(request.getParameter("firstname"));
		DriverReg.setDriverLname(request.getParameter("lastname"));
		DriverReg.setDriverEmail(request.getParameter("email"));
		DriverReg.setDriverPhonenumber(Double.parseDouble(request.getParameter("phonenumber")));
		DriverReg.setAdharnumber(Integer.parseInt(request.getParameter("adharnumber")));
		DriverReg.setCabName(request.getParameter("cabname"));
		DriverReg.setCabNumber(Double.parseDouble(request.getParameter("cabnumber")));
		DriverReg.setExperience(Integer.parseInt(request.getParameter("experience")));
		DriverReg.setLicenceNumber(Double.parseDouble(request.getParameter("licencenumber")));
		DriverReg.setPassword(Double.parseDouble(request.getParameter("password")));
		request.getRequestDispatcher("Driverview.jsp").forward(request, response);
        DriverRegDAO.addDriverReg(DriverReg);
	}
	}


