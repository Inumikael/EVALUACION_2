/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_8_clases_abstractas;

/**
 *
 * @author invitado
 */
public abstract class Persona {
    protected String nombre;
    protected String Apellido;
    protected int edad;

    public Persona() {
        this.nombre = "Sin Nombre";
        this.Apellido = "Sin Apellido";
        this.edad = 0;
    }

    public Persona(String nombre, String Apellido, int edad) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.edad = edad;
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
    
    
}
