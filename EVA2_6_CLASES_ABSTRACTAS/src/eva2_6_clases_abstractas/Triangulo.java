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
public class Triangulo extends Figura{
    private double base;
    private double altura;
    
    public Triangulo(){
    this.base = 0;
    this.altura = 0;
    }
        public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        }
    @Override
    public double calculaArea() {
        return (base * altura) / 2;
       
    }
    private double calcularHip(){
       //Teorema de pitagoras
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
    @Override
    public double calculaPeri() {
        return base + altura + calcularHip();
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
    

    
    
 
    
}
