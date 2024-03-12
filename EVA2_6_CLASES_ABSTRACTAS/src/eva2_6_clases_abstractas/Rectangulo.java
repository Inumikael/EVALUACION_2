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
public class  Rectangulo extends Figura{
    private double base;
    private double altura;
    public Rectangulo() {
        this.base=0;
        this.altura=0;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    

    @Override
    public double calculaArea() {
        return base* altura;
    }

    @Override
    public double calculaPeri() {
        return (base + altura)*2;
 }
    
}
