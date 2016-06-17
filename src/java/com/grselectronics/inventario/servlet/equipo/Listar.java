/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grselectronics.inventario.servlet.equipo;

import com.grselectronics.inventario.controller.HibernateUtil;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import org.hibernate.Hibernate;

/**
 *
 * @author retana
 */
@WebServlet("/equipo.do")
public class Listar extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher despachador=null;
        req.setAttribute("listaEquipo", HibernateUtil.getInstancia().sendQuery("From Equipo"));
        req.setAttribute("listaEstado", HibernateUtil.getInstancia().sendQuery("From Estado"));
        req.setAttribute("listaTipo", HibernateUtil.getInstancia().sendQuery("From Tipo"));
        req.setAttribute("listaEmpresa", HibernateUtil.getInstancia().sendQuery("From Empresa"));
        despachador=req.getRequestDispatcher("equipo.jsp");
        despachador.forward(req, resp);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
