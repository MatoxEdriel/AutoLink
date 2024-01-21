
import modelo.vehiculos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mau
 */
public class motocicletas extends vehiculos {
    private String cilindraje;
    //Posible num
    private String tipo;

    public motocicletas() {
       
    }

    public motocicletas(String cilindraje, String tipo, String numeroChasis, String matricula, String marca, String modelo) {
        super(numeroChasis, matricula, marca, modelo);
        this.cilindraje = cilindraje;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "motocicletas{" + "cilindraje=" + cilindraje + ", tipo=" + tipo + '}';
    }
    
    
    
    
    
}
