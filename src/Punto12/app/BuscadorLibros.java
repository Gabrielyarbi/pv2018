/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto12.app;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class BuscadorLibros {
    private String PalabraBuscar;

    public String getPalabraBuscar() {
        return PalabraBuscar;
    }

    public void setPalabraBuscar(String PalabraBuscar) {
        this.PalabraBuscar = PalabraBuscar;
    }
    public void BuscarPorCategoriaOTitulo( GestorLibros a){
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("1-Busqueda por Categoria");
        System.out.println("2-Busqueda por Titulo");
        System.out.println("3-Ambas");
        System.out.println("4-Salir");
        n=sc.nextInt();
        switch (n){
            case 1 : {System.out.println("Las categorias Disponibles son :");
            String Categ;
            for ( String b : a.getCategoria() ){
            
                System.out.println(b);
            }
            System.out.println("----------------------");   
            System.out.println("Ingrese una categoria de la lista");
            System.out.println("----------------------");    
            String ca=sc.next();
                for ( Libro l : a.getLibros() ){
                
                Categ=l.getCategoria();
                if (Categ.toLowerCase().contains(ca.toLowerCase())){
                    System.out.println("----------------------");
                    System.out.println("Se encontro el siguiente libro :");
                    System.out.println("Titulo :"+l.getTitulo());
                    System.out.println("Categoria :"+l.getCategoria());
                    System.out.println("----------------------");
                }
                
                }
            break;
            }
            case 2 :{
                String c;    
                System.out.println("----------------------");   
            System.out.println("Ingrese un titulo a buscar");
            System.out.println("----------------------");    
            String t=sc.next();
                for ( Libro q : a.getLibros()){
                
                c=q.getTitulo();
                if (c.toLowerCase().contains(t.toLowerCase())){
                     System.out.println("----------------------");   
                    System.out.println("Se encontro el siguiente libro ");
                     System.out.println("----------------------");   
                     System.out.println("Titulo :"+q.getTitulo());
                     System.out.println("Autor :"+q.getAutor());
                }
                
                }
                
                
                break;
                        }
        
            case 3 : { System.out.println("Las categorias Disponibles son :");
            String Categ;
            String Titulo;
            
            for ( String b : a.getCategoria() ){
            
                System.out.println(b);
                
            }
                System.out.println("Ingrese una Categoria de la lista");
               String Cate=sc.next();
                System.out.println("Ingrese un titulo ");
               String Titu=sc.next();
                
                for (Libro w : a.getLibros() ){
                Categ=w.getCategoria();
                Titulo=w.getTitulo();
                if (Categ.toLowerCase().contains(Cate.toLowerCase()) && Titulo.toLowerCase().contains(Titu.toLowerCase())){
                System.out.println("----------------------");  
                    System.out.println("Se encontro el sig libro :");
                    System.out.println("----------------------");  
                    System.out.println("Autor :"+w.getAutor());
                    System.out.println("Titulo :"+w.getTitulo());
                    System.out.println("Categoria :"+w.getCategoria());
                    System.out.println("----------------------");  
                }
                
                }
                
            break;}
            default :{
                System.out.println("Fin del programa");
            break;}
        }
    
    
    
    
    }
}
