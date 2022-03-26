package loginservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import login.LoginDAO;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password      = request.getParameter("password");
		System.out.println("Email :"+email);
		System.out.println("Password   : "+password);
		if(LoginDAO.checkLoginCredentials(email,password)) {
		  HttpSession session = request.getSession();
		  session.setAttribute("email", email);
		  
			request.setAttribute("email", email);
			request.getRequestDispatcher("news.html").forward(request, response);
		  
			//response.sendRedirect("welcome)
			
		}else {
		
			request.setAttribute("wronglogin", "Incorrect Login Credentials");
			
			request.getRequestDispatcher("login.html").forward(request, response);
			
			//response.sendRedirect("login.jsp");
		}
		
		
		
	}




	}


