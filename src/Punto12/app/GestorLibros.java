/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto12.app;
import java.util.ArrayList;
/**
 *
 * @author Gabriel
 */
public class GestorLibros {
    private ArrayList<Libro> Libros=new ArrayList<>();
    private String Categoria []=new String[5];
    
    public ArrayList<Libro> getLibros() {
        return Libros;
    }

    

    public void setLibros(ArrayList<Libro> Libros) {
        this.Libros = Libros;
    }

    public String[] getCategoria() {
        return Categoria;
    }

    public void setCategoria(String[] Categoria) {
        this.Categoria = Categoria;
    }
    

public void AgregarLibro (Libro l){

this.Libros.add(l);

} 

   
public void AgregarCategoria(){
for (Libro a : this.getLibros()){
     this.Categoria[this.Libros.indexOf(a)]=a.getCategoria();
   }

}
}
