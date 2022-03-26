package adminsevlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.AdminDAO;

/**
 * Servlet implementation class AdminUpdate
 */
public class AdminUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cabupdateid =Integer.parseInt( request.getParameter("idcabId"));
		int chargeperkm =Integer.parseInt(request.getParameter("cabchargeperkm"));
		boolean t = AdminDAO.updateFlightFare(cabupdateid, chargeperkm);
		if(t) {
			System.out.println("Updated");
			
		
		request.getRequestDispatcher("sucess.jsp").forward(request, response);
	}
    }

}