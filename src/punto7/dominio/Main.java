/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto7.dominio;

import java.util.Scanner;
import punto7.app.Auto;
import punto7.app.GestorAutos;

/**
 *
 * @author Gabriel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
    Auto a1=new Auto("abcd123","rojo","fz2000","Premium", "Toyota");
    Auto a2=new Auto("cdef123", "Negro","Aveo", "Super", "Chevrolet");
    Auto a3=new Auto("rty123", "Azul", "Camaro", "Regular", "Chevrolet");
    Auto a4=new Auto("dfgh345", "Rojo", "California", "Premium", "Ferrari");
    
        GestorAutos ga =new GestorAutos();
    ga.AgregarAutos(a1);
    ga.AgregarAutos(a2);
    ga.AgregarAutos(a3);
    ga.AgregarAutos(a4);
    
    ga.MostrarAutos();
        System.out.println("Ingrese numero de auto a Editar");
        int a =sc.nextInt();
        
        ga.EditarAuto(a);
        System.out.println("--------------------");
        System.out.println("Lista actualizada");
        System.out.println("--------------------");
        ga.MostrarAutos();
    }
    
}
