/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grselectronics.inventario.servlet.equipo;

import com.grselectronics.inventario.bean.Usuario;
import com.grselectronics.inventario.controller.HibernateUtil;
import com.grselectronics.inventario.funcion.JQueryDataTableParamModel;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author retana
 */
@WebServlet("/equipo.do")
public class Listar extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json");
        JQueryDataTableParamModel params=new JQueryDataTableParamModel();
        List lista=HibernateUtil.getInstancia().sendQuery("From Equipo");
        params.sEcho="2";
        params.aaData=lista;   
        params.sColumns="id,marca";
        params.iDisplayLength=lista.size();
        params.iDisplayStart=0;
        resp.getWriter().write(params.getJSONFormat());
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
