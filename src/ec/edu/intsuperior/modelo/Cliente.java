/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Santiago Solis
 */
public class Cliente extends Persona{
    private String correo;

    public Cliente() {
    }

    public Cliente(String correo, String cedula, String nombre1, String nombre2, String apellido1, String apellido2, String direccion, String telefono) {
        super(cedula, nombre1, nombre2, apellido1, apellido2, direccion, telefono);
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
