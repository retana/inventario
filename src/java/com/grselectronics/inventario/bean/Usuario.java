package com.grselectronics.inventario.bean;
// Generated 20-jun-2016 15:36:15 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer idUsuario;
     private Rol rol;
     private String nombre;
     private String correo;
     private String nick;
     private String contrasena;
     private Set asignacionEquipos = new HashSet(0);

    public Usuario() {
    }

    public Usuario(Rol rol, String nombre, String correo, String nick, String contrasena, Set asignacionEquipos) {
       this.rol = rol;
       this.nombre = nombre;
       this.correo = correo;
       this.nick = nick;
       this.contrasena = contrasena;
       this.asignacionEquipos = asignacionEquipos;
    }
   
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public Rol getRol() {
        return this.rol;
    }
    
    public void setRol(Rol rol) {
        this.rol = rol;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getNick() {
        return this.nick;
    }
    
    public void setNick(String nick) {
        this.nick = nick;
    }
    public String getContrasena() {
        return this.contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public Set getAsignacionEquipos() {
        return this.asignacionEquipos;
    }
    
    public void setAsignacionEquipos(Set asignacionEquipos) {
        this.asignacionEquipos = asignacionEquipos;
    }




}


