/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author Matox
 */
public class Moto extends vehiculos implements Serializable {
    private String cilindraje;
    //Posible num
    private String tipo;
     public Moto() {
       
    }

    public Moto(String cilindraje, String tipo, String numeroChasis, String matricula, String marca, String modelo) {
        super(numeroChasis, matricula, marca, modelo);
        this.cilindraje = cilindraje;
        this.tipo = tipo;
    }
      @Override
    public String toString() {
        return "motocicletas{" + "cilindraje=" + cilindraje + ", tipo=" + tipo + '}';
    }
    
    
    
    
    

}
