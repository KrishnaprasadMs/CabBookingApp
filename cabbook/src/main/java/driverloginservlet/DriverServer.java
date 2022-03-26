package driverloginservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import driverlogin.DriverLoginDAO;

/**
 * Servlet implementation class LoginServlet
 */
public class DriverServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DriverServer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		System.out.println("Email :"+email);
		System.out.println("Password:"+password);
		if(DriverLoginDAO.checkLoginCredentials(email,password)) {
		  HttpSession session = request.getSession();
		  session.setAttribute("email", email);
		  
			request.setAttribute("password", password);
			request.getRequestDispatcher("Driverview.jsp").forward(request, response);
		  
			//response.sendRedirect("welcome)
			
		}else {
		
			request.setAttribute("wronglogin", "Incorrect Login Credentials");
			
			request.getRequestDispatcher("driverlogin.html").forward(request, response);
			
			//response.sendRedirect("login.jsp");
		}
		
		
		
	}




	}

