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
public  class Computo extends Electronica{
    private int ram;
    private String hd;
    private String Procesador;

    public Computo() {
        this.ram = 0;
        this.hd = "Sin disco duro";
        this.Procesador= "Sin Ram";
    

    public Computo(int ram, String hd, String Procesador) {
        this.ram = ram;
        this.hd = hd;
        this.Procesador = Procesador;
    }

    public Computo(int ram, String hd, String Procesador, String marca, boolean garantia) {
        super(marca, garantia);
        this.ram = ram;
        this.hd = hd;
        this.Procesador = Procesador;
    }

    public Computo(int ram, String hd, String Procesador, String marca, boolean garantia, double precio, String nombre) {
        super(marca, garantia, precio, nombre);
        this.ram = ram;
        this.hd = hd;
        this.Procesador = Procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String Procesador) {
        this.Procesador = Procesador;
    }
     String cade = super.toString() +  "\n";
             cade += "Ram: "  + ram + "\n" + "Hd: " + hd + "\n" + "Procesador: " + procesador;
             return cade;     
}
