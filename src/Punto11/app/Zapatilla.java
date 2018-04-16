/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto11.app;

/**
 *
 * @author Gabriel
 */
public class Zapatilla {
    private String marca,calidad;

    public Zapatilla(String marca, String calidad) {
        this.marca = marca;
        this.calidad = calidad;
    }
    
    
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }
    
}
