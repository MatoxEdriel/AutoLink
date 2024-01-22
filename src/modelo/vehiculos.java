/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Matox
 */
public class vehiculos implements Serializable {
   
    protected transient String numeroChasis;
    protected transient String matricula;
    protected transient String marca;
    protected transient String modelo;
    public vehiculos(){
    
    }

    public vehiculos(String numeroChasis, String matricula, String marca, String modelo) {
        this.numeroChasis = numeroChasis;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    
    
    
    @Override
    public String toString() {
        return "vehiculos{" + "numeroChasis=" + numeroChasis + ", matricula=" + matricula +
                ", marca=" + marca + ", modelo=" + modelo + '}';
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

