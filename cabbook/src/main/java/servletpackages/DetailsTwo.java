package servletpackages;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cabdetails.Details;
import cabdetails.DetailsDAO1;

/**
 * Servlet implementation class DetailsTwo
 */
@WebServlet("/innova.html")
public class DetailsTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetailsTwo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Details> detail = DetailsDAO1.readTwo();
		request.setAttribute("detail", detail);
		request.getRequestDispatcher("list-two.jsp").forward(request,response);
	}

}
