/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_6_clases_abstractas;

/**
 *
 * @author invitado
 */
public class Circulo extends Figura{
    private double radio;
    public Circulo() {
        this.radio=0;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculaArea() {
        return 3.1416 * (Math.pow(radio, 2));
    }

    @Override
    public double calculaPeri() {
        return (radio*2)*3.1416;
    }
    
}
