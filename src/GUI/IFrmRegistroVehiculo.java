/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Matox
 */


public class IFrmRegistroVehiculo extends JInternalFrame{
      private JPanel contentPane;
      private JPanel pnlTop;
      private JPanel pnlContenedorVehiculos;
      
      
      private JPanel pnlSur;
      private JPanel pnlCentro;
      private JPanel pnlCarro;
      private JPanel pnlMoto;
      private JPanel pnllblMoto;
      private JPanel pnllblCarro;
      //Label carro
      private JLabel lblCarro;
      private JLabel lblNumeroChasis;
      private JLabel lblMatricula;
      private JLabel lblMarca;
      private JLabel lblModelo;
      
      //Label moto
      private JLabel lblMoto;
      private JLabel lblCilindraje;
      private JLabel lblTipo;
      
      
      
      
      
      private JButton btnRegistrarCarro;
      private JButton btnRegistrarMoto;
      
      private JButton btnNoRegistrar;
      
      
      
      public IFrmRegistroVehiculo(){
           initComponents();
      }
      public IFrmRegistroVehiculo(String titulo){
        super(titulo);
        initComponents();
      
      }
      
     public void initComponents(){
        setBounds(10, 10,500, 500);
        contentPane = new JPanel(new BorderLayout());
        setContentPane(contentPane);
          //Activar capacidad de modificar tama;o con mouse
        setResizable(true);
        //Capacidad de minimizar ventana
        setIconifiable(true);
        //Opcion para cerrar ventana (x)
        setClosable(true);
        //capacidad de ventana para maximizar
        setMaximizable(true); 
        //Revisar gestion de desing 
        pnlTop = new JPanel();
            pnlContenedorVehiculos = new JPanel(new GridLayout(1,2));
                 pnllblMoto = new JPanel(new BorderLayout());
                 pnllblCarro = new JPanel(new BorderLayout());
        pnlSur = new JPanel();
        pnlCentro = new JPanel(new GridLayout(1,2));
            pnlCarro = new JPanel(new GridLayout(4,1));
            pnlMoto = new JPanel(new GridLayout(4,1));
        //Carro 
        lblCarro = new JLabel("Carro");
        lblNumeroChasis = new JLabel(" Numero de chasis "); 
        lblMatricula = new JLabel(" Matricula ");
        lblMarca = new JLabel(" Marca ");
        lblModelo = new JLabel(" Modelo ");
        //Moto
        lblMoto = new JLabel("Moto");
        lblCilindraje = new JLabel(" Cilindraje ");
        lblTipo = new JLabel(" Tipo de moto ");
        //Botones
        btnRegistrarCarro = new JButton("Registrar carro");
        btnRegistrarMoto = new JButton("Registrar moto");
        btnNoRegistrar = new JButton("No registrar vehiculos");
        contentPane.add(pnlTop, BorderLayout.NORTH);
        contentPane.add(pnlSur, BorderLayout.SOUTH);
        contentPane.add(pnlCentro,BorderLayout.CENTER);
        
        pnlTop.add(pnlContenedorVehiculos);
            pnlContenedorVehiculos.add(pnllblCarro);
            pnlContenedorVehiculos.add(pnllblMoto);
                    pnllblCarro.add(lblCarro);
                    pnllblMoto.add(lblMoto);
           
            pnlCentro.add(pnlCarro);
                 pnlCarro.add(lblNumeroChasis);
                 pnlCarro.add(lblMatricula);
                 pnlCarro.add(lblMarca);
                 pnlCarro.add(lblModelo);   
            pnlCentro.add(pnlMoto);
                 pnlMoto.add(lblCilindraje);
                 pnlMoto.add(lblTipo);
            
        pnlSur.add(btnNoRegistrar);
        
        
        
        
     
     
     
     }
    
   
    
    
    
    
    
    
}
