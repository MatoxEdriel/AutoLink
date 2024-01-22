/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import modelo.Repositorio.Cambios;
import modelo.Repositorio.numeroAsiento;
import modelo.Repositorio.numeroPuertas;

/**
 *
 * @author Matox
 */
public class Automovil extends vehiculos implements Serializable{
    private numeroAsiento numeroAsientos;
    private numeroPuertas nunmeroPuertas;
    private Cambios tipoCambio;
       public Automovil() {
   
    }

    public Automovil(numeroAsiento numeroAsientos,numeroPuertas nunmeroPuertas, Cambios  tipoCambio, String numeroChasis, String matricula, String marca, String modelo) {
        super(numeroChasis, matricula, marca, modelo);
        this.numeroAsientos = numeroAsientos;
        this.nunmeroPuertas = nunmeroPuertas;
        this.tipoCambio = tipoCambio;
    }
    
      @Override
    public String toString() {
        return "carros{" + "numeroAsientos=" + numeroAsientos + ", nunmeroPuertas=" + nunmeroPuertas + ", tipoCambio=" + tipoCambio + '}';
    }

  
    
}
