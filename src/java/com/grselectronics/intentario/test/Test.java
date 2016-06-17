/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grselectronics.intentario.test;

import com.grselectronics.inventario.bean.Equipo;
import com.grselectronics.inventario.controller.HibernateUtil;

/**
 *
 * @author retana
 */
public class Test {
    public static void main(String args[]){
        for (Object obj: HibernateUtil.getInstancia().sendQuery("From Equipo")) {
            Equipo e=(Equipo)obj;
            System.out.print(e.getModelo());
        }
    }
}
