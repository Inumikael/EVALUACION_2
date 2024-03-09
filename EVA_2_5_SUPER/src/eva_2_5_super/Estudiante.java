/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_2_5_super;

/**
 *
 * @author Héctor
 */

// Hija de padre
// Subclase de Superclase
public class Estudiante extends Persona{
    private String noControl;
    private String carrera;
    
    public Estudiante(){
        super();// Llamada al construcor de la superclase
        noControl = "Sin Número de control";
        carrera = "Sin carrera";
    }
    //regla de herencia: Siempre hay que llamar al constructor de la super clase. !!Always!!.
    //Y tiene que ser la primer instruccion del constuctor.
    public Estudiante(String nombre, String apPaterno, String apMaterno, int edad, char genero, String noControl, String Carrera) {
        super(nombre, apPaterno, apMaterno, edad, genero);
        this.noControl = noControl;
        this.carrera = carrera;
    }
    

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String Carrera) {
        this.carrera = Carrera;
    }
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Numero de control: " + noControl);
        System.out.println("Carrera :" + carrera);
    }
}
