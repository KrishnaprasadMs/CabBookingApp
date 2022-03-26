<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*"%>
    <%
        if(session.getAttribute("admin_login")!=null)
        {
            response.sendRedirect("adminmanage.html");
        } 
    
      
        if(request.getParameter("btn_login")!=null)
        {
            String email,password;
            email=request.getParameter("txt_name");
          //  user_id=request.getParameter("txt_user_id");
            password=request.getParameter("txt_password");
            //position=request.getParameter("txt_position");
        }
        
        try
        {
            String email=request.getParameter("email");
          //  String user_id=request.getParameter("user_id");
            String password=request.getParameter("password");
           // String position=request.getParameter("position");
            
            Class.forName("org.sqlite.JDBC");
            Connection con=DriverManager.getConnection("jdbc:sqlite:E:\\db.db");
            PreparedStatement pstmt=null;
            
            pstmt=con.prepareStatement("select * from admin where email=? and password=?");
            pstmt.setString(1,email);
          //  pstmt.setString(2,user_id);
            pstmt.setString(2,password);
           // pstmt.setString(3,position);
            ResultSet rs=pstmt.executeQuery();
            if(rs.next())
            {
                String dbname=rs.getString("email");
            //    String dbuser_id=rs.getString("user_id");
                String dbpassword=rs.getString("password");
                //String dbposition=rs.getString("position");
                if(email.equals(dbname) && password.equals(dbpassword) )
                { 
                    
                        session.setAttribute("admin_login",dbname);
                        response.sendRedirect("adminmanage.html");
                    }
                    
                
            }
            else
            {
                out.print("Inavlid User ");
                response.sendRedirect("admin.html");
           }
            pstmt.close();
            con.close();
        }
        catch(Exception e){e.printStackTrace();
        }  
    %>