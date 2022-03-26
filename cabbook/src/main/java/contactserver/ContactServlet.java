package contactserver;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import contact.Contact;
import contact.ContactDAO;


/**
 * Servlet implementation class ContactServlet
 */
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Contact  Contact= new Contact();
		Contact.setName(request.getParameter("name"));
		Contact.setPhone(request.getParameter("phone"));
		Contact.setMessage(request.getParameter("message"));
		request.getRequestDispatcher("getintouch.jsp").forward(request, response);
		
        
        ContactDAO.addcontact(Contact);
	}


}
