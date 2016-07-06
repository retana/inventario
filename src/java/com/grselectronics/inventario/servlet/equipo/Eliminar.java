/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grselectronics.inventario.servlet.equipo;

import com.grselectronics.inventario.bean.Equipo;
import com.grselectronics.inventario.controller.HibernateUtil;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author retana
 */
@WebServlet("/eliminarEquipo.do")
public class Eliminar extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher despachador=null;
        HibernateUtil.getInstancia().remove(
                HibernateUtil.getInstancia().find(Integer.parseInt(req.getParameter("idEquipo")), Equipo.class)
        );
        despachador=req.getRequestDispatcher("equipo.do");
        despachador.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
    }
    
}
