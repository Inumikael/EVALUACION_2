/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_polimorfismo;

/**
 *
 * @author alex_
 */
public class EVA2_12_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estudiante = new Estudiante("0011", "Juan", "Perez");
        System.out.println(estudiante);
        Persona persona = estudiante;
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Nombre: " + persona.getApellido());
        
        Persona perso = new Persona("Jose", "Paramo");
        System.out.println(perso);
        //Estudiante estu = perso; // no se puede convertir una persona en un estudiate 
    }

}
class Persona{
private String nombre;

private String apellido;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona() {
    }
    
@Override
    public String toString(){
    return nombre + " "  + apellido;
}
}

class Estudiante extends Persona{
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
}
