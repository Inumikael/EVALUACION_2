/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_10_interfaces;

/**
 *
 * @author invitado
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
        this.nombre = "Sin nombre";
        this.apellido = " Sin apellido";
        this.edad = 0;
    }

    public Persona(String Nombre, String Apellido, int edad) {
        this.nombre = Nombre;
        this.apellido = Apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String Apellido) {
        this.apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

  /*  @Override
    public void imprimirDatos() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Apellido: " + Apellido);
        System.out.println("Edad: " + edad);
    }

    @Override
    public String generarNombreCompleto() {
        return Nombre + " " + Apellido;
    }
    */
    
}
