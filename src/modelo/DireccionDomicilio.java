/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import modelo.Repositorio.Ciudades;

/**
 *
 * @author Matox
 */
public class DireccionDomicilio implements Serializable {
    private Ciudades ciudad;
    private String calle;
    private String numero;
    public DireccionDomicilio(){
    
    
    }
    public DireccionDomicilio(Ciudades ciudad, String calle, String numero) {
        this.ciudad = ciudad;
        this.calle = calle;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "DireccionDomicilio{" + "ciudad=" + ciudad + ", calle=" + calle + ", numero=" + numero + '}';
    }
    
    
    
    
    
}
