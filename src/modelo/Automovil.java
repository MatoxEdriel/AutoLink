/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import modelo.Repositorio.Cambios;
import modelo.Repositorio.numeroAsiento;
import modelo.Repositorio.numeroPuertas;

/**
 *
 * @author Matox
 */
public class Automovil extends vehiculos implements Serializable{
    private transient String transientField; 
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
        return "carros{" + "numeroAsientos=" + numeroAsientos + ", nunmeroPuertas=" + nunmeroPuertas + ", tipoCambio=" + tipoCambio + '}' + super.toString();
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
