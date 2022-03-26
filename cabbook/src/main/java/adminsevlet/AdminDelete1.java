package adminsevlet;

import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.AdminDAO;

/**
 * Servlet implementation class AdminDelete
 */
public class AdminDelete1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminDelete1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cabId = Integer.parseInt(request.getParameter("CabId"));
		int i = AdminDAO.deleteCab(cabId);
		request.getRequestDispatcher("sucess.jsp").forward(request, response);// 
		
		// if(i==0) {
		//	 request.getRequestDispatcher("list-no-column.jsp").forward(request, response);
		//}
		// else {
			// ArrayList<Admin> flights = AdminDAO.deleteCab();
			//request.setAttribute("flights", flights);
			//request.getRequestDispatcher("list-all-updated-flight.jsp").forward(request, response);
		// }
	//}
	}

}
