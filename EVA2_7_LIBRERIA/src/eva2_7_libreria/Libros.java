/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_7_libreria;

/**
 *
 * @author invitado
 */
public class Libros extends Publicaciones{
    private String autor;
    //constuctores
    //regl; siempre se llama al constructor de la super clase
    public Libros() {
        super();
        this.autor = "Sin autor";
    }

    public Libros(String autor, String titulo, double precio, int copias) {
        super(titulo, precio, copias);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void ordenarCopias(int cant){
        
        
        //las copias se deben agregar a la variable
        //copias de la clase Publicaciones
        int existencias = getCopias();
        setCopias(existencias + cant);
        
   }
   
    @Override
    public void imprimirDatos(){
    super.imprimirDatos();
        System.out.println("Autor: " + autor);
    
    }
}
