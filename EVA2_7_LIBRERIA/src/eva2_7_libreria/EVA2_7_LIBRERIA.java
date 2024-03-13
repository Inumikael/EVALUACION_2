/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_7_libreria;

/**
 *
 * @author invitado
 */
public class EVA2_7_LIBRERIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libros libro = new Libros("Juan Rulfo", "el Llano en llamas", 500.00 , 10);
        libro.imprimirDatos();
        libro.venderCopias(5);
        libro.imprimirDatos();
        libro.ordenarCopias(100);
        libro.imprimirDatos();
        libro.venderCopias(200);
        libro.imprimirDatos();
    }
    
}
