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
public class Automovil extends vehiculo{
    private int noPuertas;

    public Automovil() {
        this.noPuertas = 0;
    }

    public Automovil(int noPuertas, int velocidad) {
        super(velocidad);
        this.noPuertas = noPuertas;
    }

    
 public int getNoPuertas() {
        return noPuertas;
    }

    public void setNoPuertas(int noPuertas) {
        this.noPuertas = noPuertas;
    }

    public Automovil(int noPuertas) {
        this.noPuertas = noPuertas;
    }
    
    
}
