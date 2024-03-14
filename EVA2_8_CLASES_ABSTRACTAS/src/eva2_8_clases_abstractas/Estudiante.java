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
public class Estudiante extends Persona{
    private String noControl;

  

    public Estudiante() {
       super();
       this.noControl = "Sin Número de control";
    }

    public Estudiante(String noControl, String nombre, String Apellido, int edad) {
        super(nombre, Apellido, edad);
        this.noControl = noControl;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    // al ser protected, podemos  ver los atribuutos
    // de persona por estar vinculados por herencia
    //tambien hay visibilidad de paquete: clase el 
    //mismo paquete pueden ver atributos y métodos protegidos
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + Apellido);
        System.out.println("Edad: " + edad);
        System.out.println("No de control" + noControl);
    }
    
}
