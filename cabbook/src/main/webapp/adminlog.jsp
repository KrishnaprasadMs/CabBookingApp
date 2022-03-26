<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*"%>
    <%
        if(session.getAttribute("Adminlogin")!=null)
        {
            response.sendRedirect("adminmanage.html");
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
            String email=request.getParameter("cust_email");
          //  String user_id=request.getParameter("user_id");
            String password=request.getParameter("password");
           
            
          
                if(email=="admin123@gmail.com"&& password=="admin" )
                { 
                   
                        response.sendRedirect("adminmanage.html");
                    
                   
            }
            else
            {
                
                response.sendRedirect("adminlogin.html");
           }
           
        }
        catch(Exception e){e.printStackTrace();
        }  
    %>