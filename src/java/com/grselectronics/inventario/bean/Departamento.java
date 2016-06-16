package com.grselectronics.inventario.bean;
// Generated 16/06/2016 10:19:16 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Departamento generated by hbm2java
 */
public class Departamento  implements java.io.Serializable {


     private Integer idDepartamento;
     private String nombre;
     private Set asignacionEquipos = new HashSet(0);

    public Departamento() {
    }

    public Departamento(String nombre, Set asignacionEquipos) {
       this.nombre = nombre;
       this.asignacionEquipos = asignacionEquipos;
    }
   
    public Integer getIdDepartamento() {
        return this.idDepartamento;
    }
    
    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getAsignacionEquipos() {
        return this.asignacionEquipos;
    }
    
    public void setAsignacionEquipos(Set asignacionEquipos) {
        this.asignacionEquipos = asignacionEquipos;
    }




}


