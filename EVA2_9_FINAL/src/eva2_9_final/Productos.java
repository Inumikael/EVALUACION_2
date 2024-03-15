/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_9_final;

/**
 *
 * @author invitado
 */
public abstract class Productos {
     private String nombre;
     private double precio;
   
       
    
    public Productos() {
        this.nombre = "Sin Nombre";
        this.precio = 0;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Productos(double precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }


    @Override
    public String toString(){
        String cade;
        cade = "Nombre " + nombre +"\n" + 
                "Precio: " + precio;
        return cade;
    }
}
