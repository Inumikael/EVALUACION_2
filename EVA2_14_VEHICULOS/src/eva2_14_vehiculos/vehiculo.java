package eva2_14_vehiculos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public  class vehiculo {
    private int velocidad;

    public vehiculo() {
        this.velocidad = 0;
    }

    public vehiculo(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public void acelerar(int ajuste){
        velocidad += ajuste;
    }  
    
}
