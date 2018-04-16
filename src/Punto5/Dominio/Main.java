/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto5.Dominio;

import Punto5.app.Circulo;
import Punto5.app.GestorCirculos;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circulo c1=new Circulo(3, "azul");
        Circulo c2=new Circulo(4, "Amarillo");
        
        GestorCirculos Gestor=new GestorCirculos();
        
        Gestor.AgregarCirculos(c1);
        Gestor.AgregarCirculos(c2);
        
        
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Agregue un circulo a la lista");
        System.out.println("Ingrese radio");
        int ra=sc.nextInt();
        System.out.println("Ingrese Color");
        String c=sc.next();
        Circulo c3=new Circulo(ra, c);
        Gestor.AgregarCirculos(c3);
        
        for(Circulo a :Gestor.getCirculos()){
            System.out.println("Radio Circulo : "+a.getRadio() );
            System.out.println("Color Circulo : "+a.getColor());
            System.out.println("Superficie : "+a.CalcularSup(a.getRadio()));
            System.out.println("Perimetro : "+a.CalcularPer(a.getRadio()));
            System.out.println("");
            
            
    }
    
}

}