/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2.Dominio;

import Punto1.app.Punto;
import Punto2.app.Rectangulo;

/**
 *
 * @author Gabriel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Rectangulo unRectangulo = new Rectangulo(4, 3);
         
        
         
        int sup = unRectangulo.CalcularArea(unRectangulo.getBase(), unRectangulo.getAltura());
        int per = unRectangulo.CalcularPerimetro(unRectangulo.getBase(), unRectangulo.getAltura());
         System.out.println("La superficie del Rectangulo es : "+sup);
         System.out.println("el perimetro del Rectangulo es : "+per);
         Punto Puntouno = new Punto();
         Puntouno.setX(1);
         Puntouno.setY(1);
         
         unRectangulo.mostrarPuntos(Puntouno, unRectangulo.getBase(), unRectangulo.getAltura());
    
    }
    
}
