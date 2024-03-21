/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_11_has_a;

/**
 *
 * @author invitado
 */
public class Persona {
    private String nombre;
    private String Apellido;
    private int edad;
    private Direccion direccion; //Personas has a Direccion, direccion es un componente de persona

    public Persona() {
        this.nombre = "Sin nombre";
        this.Apellido = "Sin Apellido";
        this.edad = 0;
        this.direccion = new Direccion();
       
    }

    public Persona(String nombre, String Apellido, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString(){
        String cade = "Nombre: " + nombre + "\n" +
                "Apellido :" + Apellido + "\n" + 
                "edad: " + edad + "\n" +
                "direccion: " + direccion;
        return cade;
    
    }
}
