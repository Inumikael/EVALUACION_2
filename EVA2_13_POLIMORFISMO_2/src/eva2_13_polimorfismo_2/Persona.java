/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_13_polimorfismo_2;

/**
 *
 * @author invitado
 */
public class Persona implements MostrarDatos {
    private String nombre;
    private String apellido;

    public Persona() {
    }

    public Persona(String nombre, String Apellido) {
        this.nombre = nombre;
        this.apellido = Apellido;
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

    public void setApellido(String Apellido) {
        this.apellido = Apellido;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre + "\n" + "Apellidos: " + apellido);
    }
    
}
