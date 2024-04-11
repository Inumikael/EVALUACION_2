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
public class Estudiante extends Persona {
    private String noControl;

    public Estudiante() {
    }

    public Estudiante(String noControl) {
        this.noControl = noControl;
    }

    public Estudiante(String noControl, String nombre, String apellido) {
        super(nombre, apellido);
        this.noControl = noControl;
    }
    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("No Control: " + noControl );
    }
    
}
