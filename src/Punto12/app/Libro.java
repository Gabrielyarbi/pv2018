/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto12.app;

/**
 *
 * @author Gabriel
 */
public class Libro {
    private String Titulo,Autor;
    private String Categoria;

    public Libro(String Titulo, String Autor, String Categoria) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Categoria = Categoria;
    }

    
    
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
}
