/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_11_has_a;

/**
 *
 * @author invitado
 */
public class EVA2_11_HAS_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Direccion direccion = new Direccion("juan perez", "35a", "San Lazaro", "35000", "Chihuahua", "Chihuahua");
        Persona perso = new Persona("Juan", "Perez", 50, direccion);
        System.out.println(perso);
        
    }
    
}
