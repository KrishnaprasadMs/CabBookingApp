package adminsevlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.Admin;
import admin.AdminDAO;

/**
 * Servlet implementation class RetrieveSpecificRow
 */
public class AdminRet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminRet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cabId =Integer.parseInt(request.getParameter("CabId"));
	   
		ArrayList<Admin> admins = AdminDAO.readCab(cabId);
		request.setAttribute("admins", admins);
		request.getRequestDispatcher("list-admin.jsp").forward(request,response);
	}
	}