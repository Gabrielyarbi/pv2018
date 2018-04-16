/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto12.dominio;

import Punto12.app.BuscadorLibros;
import Punto12.app.GestorLibros;
import Punto12.app.Libro;

/**
 *
 * @author Gabriel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro l1=new Libro("Fedon", "Platon", "Educativo");
        Libro l2=new Libro("Novela de ajedrez", "Zweig.S", "Drama");        
        Libro l3=new Libro("El busto del emperador", "Roth.J", "Comedia");        
        Libro l4=new Libro("Divas reveldes", "Morato.c", "Suspenso");       
        Libro l5=new Libro("El cuaderno rojo", "Auster.p", "Accion");
        GestorLibros gl =new GestorLibros();
        gl.AgregarLibro(l1);
        gl.AgregarLibro(l2);
        gl.AgregarLibro(l3);
        gl.AgregarLibro(l4);
        gl.AgregarLibro(l5);
        gl.AgregarCategoria();
        BuscadorLibros bl=new BuscadorLibros();
        bl.BuscarPorCategoriaOTitulo(gl);
        
        
    }
    }
