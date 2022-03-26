package customerservlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import customer.Customer;
import customer.CustomerDAO;


/**
 * Servlet implementation class CustomerServlet
 */
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Customer  Customer= new Customer();
		Customer.setCust_firstname(request.getParameter("firstname"));
		Customer.setCust_lastname(request.getParameter("lastname"));
		Customer.setCust_email(request.getParameter("email"));
		Customer.setCust_phno(request.getParameter("phonenumber"));
		Customer.setAdhar_no(request.getParameter("adhar"));
		Customer.setPassword(request.getParameter("password"));
		
		request.getRequestDispatcher("customerview.jsp").forward(request, response);
        
        CustomerDAO.addcustomer(Customer);
       
	}

}
