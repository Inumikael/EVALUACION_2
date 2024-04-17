/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_14_vehiculos;

/**
 *
 * @author invitado
 */
public class EVA2_14_VEHICULOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // se pueden almacenar todos los objetos de nuestras
        //clases como objetos de la clase base
         vehiculo flota[] = new vehiculo[10];
         flota[0] = new Automovil(4,0);
         flota[1] = new Automovil(2,0);
         flota[2] = new Automovil(6,0);
         flota[3] = new Automovil(4,0);
         flota[4] = new Automovil(4,0);
         flota[5] = new Motocicleta(150,0);
         flota[6] = new Motocicleta(125,0);
         flota[7] = new Motocicleta(80,0);
         flota[8] = new Motocicleta(999999,0);
         flota[9] = new Motocicleta(1000,0);
         //----------------
         Automovil auto = (Automovil) flota[0];
         System.out.println("Numero de puertas: " + auto.getNoPuertas());
         Motocicleta moto = (Motocicleta) flota[0];
         System.out.println("Capacidad (CC: " + moto.getCapacidad());
         
         //si no sabemos que tipo de objeto esta almacenado usamos
         //instanceof
         if(flota[1] instanceof Automovil){
        }
           acelerar(auto, 50);
            acelerar(auto, 50);
            System.out.println("Velocidad: " + auto.getVelocidad());
            acelerar(moto,50);
            System.out.println("Velocidad: " + auto.getVelocidad());
            acelerar(moto,-30);
            System.out.println("Velocidad: " + moto.getVelocidad());
            acelerar(flota[2],70);
            System.out.println("Velocidad: " + flota[2].getVelocidad()); 
    }
    //vamos a modificar la velocidad de los vehiculos
    
    public static void acelerar(vehiculo Vehiculo, int ajuste){
        Vehiculo.acelerar(ajuste);
        
    }
}
