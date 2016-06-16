/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grselectronics.inventario.servlet.usuario;

import com.grselectronics.inventario.controller.HibernateUtil;
import com.grselectronics.inventario.funcion.TransactionStatus;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

/**
 *
 * @author retana
 */
@WebServlet("/login.do")
public class Login  extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher despachador=null;
        resp.setContentType("application/json");
        resp.setCharacterEncoding("utf-8");
        TransactionStatus status =new TransactionStatus();
        List<Object> users=HibernateUtil.getInstancia().autenticarUsuario(req.getParameter("txtEmail"), req.getParameter("txtPassword"));
        if(users!=null && !users.isEmpty()){
            HttpSession sesion=req.getSession();
            sesion.setAttribute("usuario", users.get(0));
            despachador=req.getRequestDispatcher("/dashboard.jsp");
            status.setBool(true);
            status.setDescripcion("!!Bienvenido al sistema!!");
            status.setEstado("Ok");
        }else{
            despachador=req.getRequestDispatcher("/login.jsp");
            status.setBool(false);
            status.setDescripcion("!!Verifique sus credenciales!!");
            status.setEstado("Failure: ");
        }
        resp.getWriter().write(status.getJSONFormat());
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp); 
    }
    
}
