/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import modelo.Repositorio.Ciudades;

/**
 *
 * @author Matox
 */
public class DireccionLaboral {
    private Ciudades ciudad;
    private String calle;
    private String numero;
    public DireccionLaboral(){
    
    
    
    }
    public DireccionLaboral(Ciudades ciudad, String calle, String numero) {
        this.ciudad = ciudad;
        this.calle = calle;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "DireccionLaboral{" + "ciudad=" + ciudad + ", calle=" + calle + ", numero=" + numero + '}';
    }
    
    
    
    
}
