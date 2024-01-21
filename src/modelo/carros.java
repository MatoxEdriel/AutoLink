
import modelo.vehiculos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Mau
 */


/*
De los carros se registrar´a el n´umero de asientos, n´umero de puertas y si es manual o
autom´atico.
De las motocicletas se registrar´a el cilindraje y el tipo (cruiser, deportiva, est´andar,
chopper).
*/
public class carros extends vehiculos {
    private int numeroAsientos;
    private int nunmeroPuertas;
    private String tipoCambio;

    public carros() {
   
    }

    public carros(int numeroAsientos, int nunmeroPuertas, String tipoCambio, String numeroChasis, String matricula, String marca, String modelo) {
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
