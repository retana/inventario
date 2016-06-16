package com.grselectronics.inventario.bean;
// Generated 16/06/2016 10:19:16 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Empleado generated by hbm2java
 */
public class Empleado  implements java.io.Serializable {


     private Integer idEmpleado;
     private Puesto puesto;
     private String nombre;
     private String apellido;
     private String usuarioWindows;
     private String usuarioSap;
     private String passWindows;
     private String passSap;
     private Set asignacionEquipos = new HashSet(0);

    public Empleado() {
    }

    public Empleado(Puesto puesto, String nombre, String apellido, String usuarioWindows, String usuarioSap, String passWindows, String passSap, Set asignacionEquipos) {
       this.puesto = puesto;
       this.nombre = nombre;
       this.apellido = apellido;
       this.usuarioWindows = usuarioWindows;
       this.usuarioSap = usuarioSap;
       this.passWindows = passWindows;
       this.passSap = passSap;
       this.asignacionEquipos = asignacionEquipos;
    }
   
    public Integer getIdEmpleado() {
        return this.idEmpleado;
    }
    
    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public Puesto getPuesto() {
        return this.puesto;
    }
    
    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getUsuarioWindows() {
        return this.usuarioWindows;
    }
    
    public void setUsuarioWindows(String usuarioWindows) {
        this.usuarioWindows = usuarioWindows;
    }
    public String getUsuarioSap() {
        return this.usuarioSap;
    }
    
    public void setUsuarioSap(String usuarioSap) {
        this.usuarioSap = usuarioSap;
    }
    public String getPassWindows() {
        return this.passWindows;
    }
    
    public void setPassWindows(String passWindows) {
        this.passWindows = passWindows;
    }
    public String getPassSap() {
        return this.passSap;
    }
    
    public void setPassSap(String passSap) {
        this.passSap = passSap;
    }
    public Set getAsignacionEquipos() {
        return this.asignacionEquipos;
    }
    
    public void setAsignacionEquipos(Set asignacionEquipos) {
        this.asignacionEquipos = asignacionEquipos;
    }




}

