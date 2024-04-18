/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_15_clases_anonimas;

/**
 *
 * @author invitado
 */
public class EVA2_15_CLASES_ANONIMAS {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Clases anónimas = clases sin nombre!!
        //Prueba prueba = new Prueba();---- no se puede crear
        //usando Polimorfismo 
        //Estamos creando una clase (Sin nombre) que implementa
        //Los métodos de la interfaz
        //Le asignamos a un identificador de tipo 
        //Relacion por herencia
        
        Prueba prueba = new Prueba() {

            @Override
            public void mostrarMensaje() {
                System.out.println("Hola mundo!!");
            }
        };
        prueba.mostrarMensaje();
        ClaseAbstracta prueba2 = new ClaseAbstracta() {
            
            @Override
            public void otroMensaje() {
                System.out.println("Ahora con clase abstracta");
            }
        };
        prueba2.mensaje();
        prueba2.otroMensaje();
            
    }
    
}
interface Prueba{
    public void mostrarMensaje();
}
abstract class ClaseAbstracta{
    public abstract void otroMensaje();
        public void mensaje(){
            System.out.println("Hola mundo!!");
}
          
}