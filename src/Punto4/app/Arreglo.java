/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4.app;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Arreglo {
    public void MostrarNum(){
    Scanner sc = new Scanner(System.in);
    int arreglo[] = new int [10];
       for(int j=0 ; j<arreglo.length ; j++){
       
           System.out.println("Ingrese numero "+(j+1));
       arreglo[j]=sc.nextInt();
       }
    for (int i = 0; i <= arreglo.length-1; i++){
    
        System.out.println(arreglo[i]);
    }
        int r =DeterminarMayor(arreglo);
        System.out.println("El mayor de este arreglo es :"+r);
    
    int m=DeterminarMenor(arreglo);
        System.out.println("El menor de este arreglo es :"+m);
        
        double p =CalcularPromedio(arreglo);
        System.out.println(""+p);
    }
    
    private int DeterminarMayor (int [] a){
        int num;
        int mayor=0;
        for (int i = 0; i<= a.length-2 ;i++){
        
            num=a[i];
            if((num>a[i+1])&&(num>mayor)){
            mayor=num;
            } else{
                   if( mayor>a[i+1]){
                     mayor = mayor ;
                     }else{  mayor=a[i+1];  }
            
            }
        }
        
    return mayor;
    }
    private int DeterminarMenor( int [] a){
    
    int num;
        int menor=9999;
        for (int i = 0; i<=a.length -2 ;i++){
        
            num=a[i];
            if((num<a[i+1])&&(num<menor)){
            menor=num;
            } else{
                   if( menor<a[i+1]){
                     menor = menor ;
                     }else{  menor=a[i+1];  }
            
            }
        }
        
    return menor;
    }
    private double CalcularPromedio(int [] a ){
    int acum=0;
    for(int i =0;i<=a.length-1;i++ ){
    
    acum=acum+a[i];
    
    }
        System.out.println(""+acum);
    double prom= acum/a.length;
    return prom;
    }
    
    }

