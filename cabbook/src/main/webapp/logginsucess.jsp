<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*"%>
    <%
        if(session.getAttribute("customerlogin")!=null)
        {
            response.sendRedirect("news.html");//available cab
        } 
   
        if(request.getParameter("btn_login")!=null)
        {
            String email,password;
           email=request.getParameter("cust_email");
          //  user_id=request.getParameter("txt_user_id");
            password=request.getParameter("password");
           
        }
        
        try
        {
            String email=request.getParameter("email");
          //  String user_id=request.getParameter("user_id");
            String password=request.getParameter("password");
           
            
            Class.forName("org.sqlite.JDBC");
            Connection con=DriverManager.getConnection("jdbc:sqlite:E:\\db.db");
            PreparedStatement pstmt=null;
            
            pstmt=con.prepareStatement("select * from cust where cust_email=? and password=?");
            pstmt.setString(1,email);
          //  pstmt.setString(2,user_id);
            pstmt.setString(2,password);
           
            ResultSet rs=pstmt.executeQuery();
            if(rs.next())
            {
                String dbname=rs.getString("cust_email");
            //    String dbuser_id=rs.getString("user_id");
                String dbpassword=rs.getString("password");
              
                if(email.equals(dbname) && password.equals(dbpassword) )
                { 
                    session.setAttribute("customerlogin",dbname);
                        response.sendRedirect("news.html");
                    
                   
            }
            else
            {
                out.print("Inavlid User ");
                response.sendRedirect("login.html");
           }
            pstmt.close();
            con.close();
        }
        }
        catch(Exception e){e.printStackTrace();
        }  
    %>