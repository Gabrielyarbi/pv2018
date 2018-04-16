/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto10.app;
import java.util.ArrayList;
/**
 *
 * @author Gabriel
 */
public class GestorProductos {
    private ArrayList<Producto>Productos=new ArrayList<>();

    
    
    
    public ArrayList<Producto> getProdusctos() {
        return Productos;
    }

    public void setProdusctos(ArrayList<Producto> Produsctos) {
        this.Productos = Produsctos;
    }
    
    
    public void AgregarProductos(Producto p){
    
    this.Productos.add(p);
    
    }
    public void MostrarProductos(){
    
    for (Producto a:this.getProdusctos()){
        System.out.println("------------------------------");
        System.out.println("Producto n°"+(this.Productos.indexOf(a)+1));
        System.out.println("Codigo :"+a.getCodigo());
        System.out.println("Nombre :"+a.getNombre());
        System.out.println("Precio :$"+a.getPrecioU());
        System.out.println("-------------------------------");
    }
        
    }
    public void CalcularCuotas(int Prod,int c){
   if (c<=12){
        Producto a= this.Productos.get(Prod-1);
   double precio=a.getPrecioU();
   double pc,pf;
   double tasa=1.5/100*(c-1);
   
   pc=precio/c+precio/c*tasa;
    pf=pc*c;
        
    
        System.out.println("----------------------------");
        System.out.println("Codigo Prod :"+ a.getCodigo());
        System.out.println("Producto :"+a.getNombre());
        System.out.println("PrecioUnitario :"+a.getPrecioU());
        System.out.println(c+" Cuotas de :"+pc);
        System.out.println("Precio final :"+pf);
        System.out.println("----------------------------");
  }else{System.out.println("Su tarjeta no permite mas de 12 cuotas ");}
    }
    
}
