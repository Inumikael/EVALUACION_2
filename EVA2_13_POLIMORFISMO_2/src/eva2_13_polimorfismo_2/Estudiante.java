/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_13_polimorfismo_2;

/**
 *
 * @author alex_
 */
public class Estudiante extends Persona {
    private String noControl;

    public Estudiante() {
        super();
         this.noControl = " ";
    }

    public Estudiante(String noControl, String nombre, String apellido) {
        super(nombre, apellido);
        this.noControl = noControl;
    }

    public Estudiante(String noControl) {
        this.noControl = noControl;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
@Override
public String toString(){
return super.toString() + " " + noControl;
}
   @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("NoControl: " + noControl);
    }
}
