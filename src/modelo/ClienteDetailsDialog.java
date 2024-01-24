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
public class ClienteDetailsDialog extends JDialog{
     private Cliente cliente;
     private JPanel contentPane;
     

    public ClienteDetailsDialog(Cliente cliente) {
        this.cliente = cliente;

        // Configura el diseño del diálogo y agrega componentes
        // Puedes personalizar esto según tus necesidades
        contentPane = new JPanel();
        // Ejemplo: Muestra el nombre del cliente en una etiqueta
           JLabel nombreLabel = new JLabel("Nombre: " + cliente.getNombre());
           JLabel apellidoLabel = new JLabel("Apellido: "+ cliente.getApellido());
           JLabel cedulaLabel = new JLabel("Apellido: "+ cliente.getCedula());
           JLabel DireccionDomicilio = new JLabel("Direccion Domicilio: " + cliente.getoDireccionDomicilio());
           JLabel DireccionLaboral = new JLabel("Direccion laboral: " + cliente.getoDireccionLaboral());
           
        contentPane.add(nombreLabel);
           contentPane.add(apellidoLabel);
              contentPane.add(cedulaLabel);
                 contentPane.add(DireccionDomicilio);
                    contentPane.add(DireccionLaboral);
         setContentPane(contentPane);
         
         setLocationRelativeTo(null);
         

        // Agrega más etiquetas u otros componentes para mostrar otros detalles del cliente
    }
}
