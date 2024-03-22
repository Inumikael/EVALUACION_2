/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_9_final;

public class EVA2_9_FINAL {

    public static void main(String[] args) {
        // TODO code application logic here
        //Final----> Pone fin a la herencia
        Computo computo = new Computo(12, "1 TB", "Intel Core I3", "Legion", false, 20000, "Computador");
        System.out.println(computo.toString());
    }
}