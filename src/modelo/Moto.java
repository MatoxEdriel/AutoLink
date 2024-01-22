/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import modelo.Repositorio.TipoMoto;

/**
 *
 * @author Matox
 */
public class Moto extends vehiculos implements Serializable {
    private transient String transientField; 
    private String cilindraje;
    //Posible num
    private TipoMoto tipo;
     public Moto() {
       
    }

    public Moto(String cilindraje, TipoMoto tipo, String numeroChasis, String matricula, String marca, String modelo) {
        super(numeroChasis, matricula, marca, modelo);
        this.cilindraje = cilindraje;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Moto{" + "cilindraje=" + cilindraje + ", tipo=" + tipo + '}'+ super.toString();
    }
    
    
         private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();  // Serializar campos de la clase actual

        // Serializar atributos específicos de vehiculos si es necesario
        out.writeObject(numeroChasis);
        out.writeObject(matricula);
        out.writeObject(marca);
        out.writeObject(modelo);
        // Serializar otros atributos específicos de vehiculos
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();  // Deserializar campos de la clase actual

        // Deserializar atributos específicos de vehiculos si es necesario
        numeroChasis = (String) in.readObject();
        matricula = (String) in.readObject();
        marca = (String) in.readObject();
        modelo = (String) in.readObject();
        // Deserializar otros atributos específicos de vehiculos
    }
    
    
    
    
    

}
