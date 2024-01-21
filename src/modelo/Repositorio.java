/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package modelo;

/**
 *
 * @author Mau
 */
public class Repositorio{
public enum Ciudades{
    GUAYAQUIL,
    QUITO,
    AMBATO,
    ESMERALDAS,
    CUENCA;
}
public enum TipoMoto{
    TOYOTA,
    MIGAZAKI,
    daddyYankee;
}
//PUEDE OCASIONAR PROBLEMA CUANDO GUARDEMOS datos 
public enum numeroPuertas {
    DOS(2),
    CUATRO(4),
    CINCO(5);

    private final int numero;

    numeroPuertas(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}
public enum numeroAsiento {
    DOS(2),
    CUATRO(4);
  

    private final int numero;

    numeroAsiento(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}
public enum Cambios{
    Manual,
    Automatico;

}

//   String[] opciones = {"Opción 1", "Opción 2", "Opción 3", "Opción 4"};
//      private JComboBox<numeroAsiento> cmbNumeroAsiento;
 //     private JComboBox<numeroPuertas> cmbNumeroAsiento;
//


 
}
