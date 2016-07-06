/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grselectronics.inventario.servlet.equipo;

import com.grselectronics.inventario.bean.Empresa;
import com.grselectronics.inventario.bean.Equipo;
import com.grselectronics.inventario.bean.Estado;
import com.grselectronics.inventario.bean.Tipo;
import com.grselectronics.inventario.controller.HibernateUtil;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author retana
 */
public class Agregar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp); 
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher despachador=null;
        String estadoDeGarantia="";
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
            Date fechaActual=new Date();
            String rs=sdf.format(fechaActual);
            Date fechaVencimiento;
        try {
            fechaVencimiento = sdf.parse(req.getParameter("txtFinGarantia"));  
            String estado=""+fechaVencimiento.compareTo(fechaActual);
            
            if(estado.equals("1")==true){
                estadoDeGarantia="Vencida";
            }else{
                estadoDeGarantia="Vigente";
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        HibernateUtil.getInstancia().add(new Equipo(
                (Empresa) HibernateUtil.getInstancia().find(Integer.parseInt(req.getParameter("txtEmpresa")), Empresa.class),        
                (Estado) HibernateUtil.getInstancia().find(Integer.parseInt(req.getParameter("txtEstado")), Estado.class),
                (Tipo) HibernateUtil.getInstancia().find(Integer.parseInt(req.getParameter("txtTipo")), Tipo.class),
                req.getParameter("txtMarca"),
                req.getParameter("txtModelo"),
                req.getParameter("txtSerie"),
                req.getParameter("txtUbicacion"),
                req.getParameter("txtFechaCompra"),
                req.getParameter("txtFinGarantia"),
                req.getParameter("txtTiempoDeVida"),
                estadoDeGarantia,
                req.getParameter("txtIP"),
                req.getParameter("txtMacAddress"),
                req.getParameter("txtUserActivedirectory"),
                req.getParameter("txtHostName"),
                req.getParameter("txtLicencia"),
                req.getParameter("txtOS")
        ));
        despachador=req.getRequestDispatcher("equipo.do");
        despachador.forward(req, resp);
    }
}
