/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Matox
 */

// EN TEORIA SERIA SOLO ESTO
public class VehiculoDetailsDialog extends JDialog {

    private JPanel contentPane;
    private vehiculos Vehiculo;

    public VehiculoDetailsDialog(vehiculos Vehiculo) {
        this.Vehiculo = Vehiculo;

        // Configura el diseño del diálogo y agrega componentes
        // Puedes personalizar esto según tus necesidades
        contentPane = new JPanel();

        // Muestra el nombre del cliente en una etiqueta
        JLabel numeroChasis = new JLabel("Numero de chasis: " + Vehiculo.getNumeroChasis());
        JLabel matricula = new JLabel("Matricula: " + Vehiculo.getMatricula());
        JLabel marca = new JLabel("Marca: " + Vehiculo.getMarca());
        JLabel modelo = new JLabel("Modelo: " + Vehiculo.getModelo());

        // Etiqueta para el tipo de vehículo
        JLabel tipoVehiculoLabel;
        if (Vehiculo instanceof Moto) {
            tipoVehiculoLabel = new JLabel("Tipo: Moto");
        } else if (Vehiculo instanceof Automovil) {
            tipoVehiculoLabel = new JLabel("Tipo: Automovil");
        } else {
            tipoVehiculoLabel = new JLabel("Tipo: Desconocido");
        }

        // Añade las etiquetas al panel
        contentPane.add(tipoVehiculoLabel);
        contentPane.add(numeroChasis);
        contentPane.add(matricula);
        contentPane.add(marca);
        contentPane.add(modelo);

        // Muestra detalles adicionales según el tipo de vehículo
        if (Vehiculo instanceof Automovil) {
            Automovil carro = (Automovil) Vehiculo;
            JLabel numeroAsiento = new JLabel("Numero de asiento: " + carro.getNumeroAsientos());
            JLabel numeroPuertas = new JLabel("Numero de puertas: " + carro.getNunmeroPuertas());
            JLabel cambios = new JLabel("Modalidad de cambio: " + carro.getTipoCambio());
            contentPane.add(numeroAsiento);
            contentPane.add(numeroPuertas);
            contentPane.add(cambios);
        } else if (Vehiculo instanceof Moto) {
            Moto moto = (Moto) Vehiculo;
            JLabel cilindraje = new JLabel("Cilindraje: " + moto.getCilindraje());
            JLabel tipoMoto = new JLabel("Tipo: " + moto.getTipo());
            contentPane.add(cilindraje);
            contentPane.add(tipoMoto);
        }

        // Establece el contenido del panel en el diálogo
        setContentPane(contentPane);

        // Ajusta la ubicación del diálogo
        setLocationRelativeTo(null);

        // Agrega más etiquetas u otros componentes para mostrar otros detalles del vehículo
    }
}
