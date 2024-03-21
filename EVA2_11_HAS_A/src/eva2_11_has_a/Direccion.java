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
public class Direccion {
    private String calle;
    private String numero;
    private String colonia;
    private String codigoPostal;
    private String ciudad;
    private String estado;

    public Direccion() {
        
        this.calle = "Sin calle";
        this.numero = "Sin numero";
        this.colonia = "Sin colnia";
        this.codigoPostal = "Sin codigo postal";
        this.ciudad = "Sin ciudad";  
        this.estado = "Sin estado";
    }
    

    public Direccion(String calle, String numero, String colonia, String codigoPostal, String ciudad, String estado) {
       this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    @Override
    public String toString() {
    String cade = "Calle: " + calle + " # " + numero + "\n" +
                  "colonia: " + colonia + "\n" + // corrected line break
                  "codigo postal: " +  codigoPostal + "\n" +
                  "ciudad: " + ciudad + " estado: " + estado;
    return cade;
}
}