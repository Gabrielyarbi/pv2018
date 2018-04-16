/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto11.app;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Gabriel
 */
public class GestorZapatillas {
    private ArrayList<Zapatilla>Zapatillas=new ArrayList<>();

    public ArrayList<Zapatilla> getZapatillas() {
        return Zapatillas;
    }
    
   
    public void setZapatillas(ArrayList<Zapatilla> Zapatillas) {
        this.Zapatillas = Zapatillas;
    }
   public void AgregarZapatillas(Zapatilla z){
   this.Zapatillas.add(z);
   
   } 
    public void MostrarZapatillas(){

for (Zapatilla z : this.getZapatillas()){
        System.out.println("-------------------------");
        System.out.println("Zapatilla n°"+(this.Zapatillas.indexOf(z)+1));
        System.out.println("Marca :"+z.getMarca());
        System.out.println("Calidad :"+z.getCalidad());
        System.out.println("-------------------------");
}
}
    public void DefinirNuevaZapatilla(){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingrese Marca ");
        String M =sc.next();
        System.out.println("Ingrese calidad (Original o Copia)");
        String C=sc.next();
    Zapatilla a=new Zapatilla(M, C);
        AgregarZapatillas(a);
    }
}
