<%-- 
    Document   : sessionController
    Created on : 15/06/2016, 07:19:14 AM
    Author     : retana
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page  session="true" %>
<%
    Object user=request.getSession().getAttribute("usuario");
    if(user==null){
        request.setAttribute("error","Por favor, primero inicie sesión." );
        response.sendRedirect("login.jsp");
    }
%>