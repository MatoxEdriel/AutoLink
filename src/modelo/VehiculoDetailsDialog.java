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

//EN TEORIA SERIA SOLO ESTO  
public class VehiculoDetailsDialog extends JDialog{
   
     private JPanel contentPane;
     private vehiculos Vehiculo;
     private Automovil automovil;
     private Moto moto;
     

    public VehiculoDetailsDialog(vehiculos Vehiculo) {
        this.Vehiculo = Vehiculo;

        // Configura el diseño del diálogo y agrega componentes
        // Puedes personalizar esto según tus necesidades
        contentPane = new JPanel();
        // Ejemplo: Muestra el nombre del cliente en una etiqueta
           JLabel numeroChasis= new JLabel("Numero de chasis: " + Vehiculo.getNumeroChasis());
           JLabel matricula = new JLabel("Matricula: "+ Vehiculo.getMatricula());
           JLabel marca = new JLabel("Marca: "+ Vehiculo.getMarca());
           JLabel modelo = new JLabel("Modelo: " + Vehiculo.getModelo());
           
           //AQUI FALTARIA EL CARRO 
         
             JLabel tipoVehiculoLabel;
             
               if (Vehiculo instanceof Moto) {
                   tipoVehiculoLabel = new JLabel("Tipo: Moto");
                } else if (Vehiculo instanceof Automovil) {
                       tipoVehiculoLabel = new JLabel("Tipo: Automovil");
                    } else {
               tipoVehiculoLabel = new JLabel("Tipo: que es esa hvd xd?");
            }
           
           
//           JLabel DireccionDomicilio = new JLabel("Direccion Domicilio: " + c.getoDireccionDomicilio());
//           JLabel DireccionLaboral = new JLabel("Direccion laboral: " + cliente.getoDireccionLaboral());
//           
                    contentPane.add(tipoVehiculoLabel);
        contentPane.add(numeroChasis);
           contentPane.add(matricula);
              contentPane.add(marca );
                 contentPane.add(modelo);
                 
                 
                   
         setContentPane(contentPane);
         
         
         
          if (Vehiculo instanceof Automovil) {
            Automovil carro = (Automovil) Vehiculo;
            //
            
            JLabel numeroAsiento = new JLabel("Numero de asiento: " + carro.getNumeroAsientos());
            JLabel numeroPuertas = new JLabel("Numero de puertas: " + carro.getNunmeroPuertas());
            JLabel cambios = new JLabel("modalidad de cambio: " + carro.getTipoCambio());
            //POSIBLEMENTE ME TOQUE PONES DATOS DE VEHICULO AQUI TAMBIEN PRUEBA 1 :  
            contentPane.add(numeroAsiento);
            contentPane.add(numeroPuertas);
            contentPane.add(cambios);
        }
              if (Vehiculo instanceof Moto) {
            Moto moto = (Moto) Vehiculo;
            //
            //Arreglar tostring
            JLabel Cilindraje = new JLabel("Numero de asiento: " + moto.getCilindraje());
            JLabel tipoMoto = new JLabel("Numero de puertas: " + moto.getTipo());
         
            //POSIBLEMENTE ME TOQUE PONES DATOS DE VEHICULO AQUI TAMBIEN PRUEBA 1 :  
            contentPane.add(Cilindraje);
            contentPane.add(tipoMoto);
       
        }
          
          
          
          
          
          
         setLocationRelativeTo(null);
         

        // Agrega más etiquetas u otros componentes para mostrar otros detalles del cliente
    }
}
