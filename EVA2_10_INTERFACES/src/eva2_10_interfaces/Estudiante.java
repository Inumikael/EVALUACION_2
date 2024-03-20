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
public class Estudiante extends Persona implements Datos, GenerarFecha{
    private String noControl;

    public Estudiante() {
        super();
        this.noControl = "Sin numero de control";
    }

    public Estudiante(String noControl) {
        this.noControl = noControl;
    }

    public Estudiante(String noControl, String Nombre, String Apellido, int edad) {
        super(Nombre, Apellido, edad);
        this.noControl = noControl;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("año de nacimiento: " + calcularAnnioNac());
    }
    @Override
    public String generarNombreCompleto() {
        return getNombre() + " " + getApellido();
    }

    @Override
    public int calcularAnnioNac() {
        return 2024 - getEdad();
    }
}
