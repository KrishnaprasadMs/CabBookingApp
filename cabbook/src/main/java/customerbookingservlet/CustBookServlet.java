package customerbookingservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import customerbooking.CustBook;
import customerbooking.CustBookDAO;
import customerbooking.MailDAO;

/**
 * Servlet implementation class CustBookServlet
 */
public class CustBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustBook custbook = new CustBook();
		custbook.setCustName(request.getParameter("custname"));
		custbook.setCustPhone(Double.parseDouble(request.getParameter("phonenumber")));
		custbook.setTripDate(request.getParameter("tripdate"));
		custbook.setBookDate((request.getParameter("bookingdate")));
		custbook. setSource((request.getParameter("source")));
		custbook.setDestination(request.getParameter("destination"));
		custbook.setCabName(request.getParameter("cabname"));
		custbook.setVehicleCharge(Integer.parseInt(request.getParameter("vehiclecharge")));
		custbook.setNoofPerson(Integer.parseInt(request.getParameter("noofpassengers")));
		custbook.setTransactionmode(request.getParameter("modeoftransaction"));
		custbook.setPickuptime(request.getParameter("pickuptime"));
		custbook.setWatinghours(request.getParameter("waitinghours"));
		custbook.setNumberofkilometers(Integer.parseInt(request.getParameter("kilometer")));
        
        CustBookDAO.addCustBook(custbook);
        
        String email = CustBookDAO.getDriveremialid(custbook.getCabName());
        String body = "<h2> Your Cab Is booked</h2>";
        MailDAO.SendMail(email, "cab booking status", body);
 		request.getRequestDispatcher("payment.jsp").forward(request,response);
		

	}

}
