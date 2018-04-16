/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3.app;

/**
 *
 * @author Gabriel
 */
public class Triangulo {
    private int ladoA ;
    private int ladoB ;
    private int ladoC ;

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }
    public void determinarSiEs ( Triangulo a ){
    
if ((a.getLadoA()+a.getLadoB()> a.getLadoC()) && (a.getLadoB()+a.getLadoC()>a.getLadoA())&&(a.getLadoC()+a.getLadoA()>a.getLadoB())){

    System.out.println("Si Se formo un triangulo ");
    double r = CalcularPerimetro(a);
    System.out.println("Su perimetro es : "+r);
    
}else{
    System.out.println("Error , NO se formo el triangulo ");
}
    
    
    }
    public double CalcularPerimetro (Triangulo a){
    
    return a.getLadoA()+a.getLadoB()+a.getLadoC();
    
    }
    
}
