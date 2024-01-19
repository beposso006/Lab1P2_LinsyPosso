/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p1_linsyposso;

import java.util.Date;

/**
 *
 * @author 29164
 */
public class Registro {
    String nombre;
    String apellido;
    Date fNacimiento;
    String correo;
    String contraseña;

    public Registro(String nombre, String apellido, Date fNacimiento, String correo, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Date fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Registro{" + "nombre=" + nombre + ", apellido=" + apellido + ", fNacimiento=" + fNacimiento + ", correo=" + correo + ", contrase\u00f1a=" + contraseña + '}';
    }

   

    
    
    
    
}
