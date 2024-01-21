/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
//import java.awt.Image;
//import javax.swing.Icon;
//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Matox
 */


public class IFrmRegistroVehiculo extends JInternalFrame{
      private JPanel contentPane;
      private JPanel pnlTop;
  
      
      private JPanel pnlSur;
      private JPanel pnlCentro;
      private JPanel pnlCarro;
      private JPanel pnlMoto;
      private JPanel pnllblMoto;
      private JPanel pnllblCarro;
      private JPanel pnlChasis;
      private JPanel pnlMatricula;
      private JPanel pnlCilindraje;
      //Label carro
      private JLabel lblCarro;
      private JLabel lblNumeroChasis;
      private JTextField txtNumeroChasis;
      private JLabel lblMatricula;
      private JTextField txtMatricula;
      private JLabel lblMarca;
      private JLabel lblModelo;
      
      //Label moto
      private JLabel lblMoto;
      private JLabel lblCilindraje;
      private JTextField txtCilindraje;
      private JLabel lblTipo;
      
      //prueba
      private JLabel lblSpace;
      private JLabel lblSpace2;
      
      
      
      
      
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
//      private void SetImageLabel(JLabel labelName, String root){
//          ImageIcon image = new ImageIcon("");
//          Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getHeight(), Image.SCALE_DEFAULT));
//          
//      
//     
//      }
      
     public void initComponents(){
        setBounds(160, 50,270, 500);
        contentPane = new JPanel(new BorderLayout());
        setContentPane(contentPane);
          //Activar capacidad de modificar tama;o con mouse
        setResizable(false);
        //Capacidad de minimizar ventana
        setIconifiable(true);
        //Opcion para cerrar ventana (x)
        setClosable(true);
        //capacidad de ventana para maximizar
        setMaximizable(false); 
        //Revisar gestion de desing 
        pnlTop = new JPanel(new GridLayout(1,2));
                 pnllblMoto = new JPanel(new BorderLayout());
                 pnllblCarro = new JPanel(new BorderLayout());
        pnlSur = new JPanel();
        pnlCentro = new JPanel(new GridLayout(1,2));
            pnlCarro = new JPanel(new GridLayout(5,1));
            pnlMoto = new JPanel(new GridLayout(5,1));
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
        
        pnlTop.add(pnllblCarro);
        pnlTop.add(pnllblMoto);
           
                    pnllblCarro.add(lblCarro);
                    pnllblMoto.add(lblMoto);
           
            pnlCentro.add(pnlCarro);
                 pnlChasis = new JPanel();
                 pnlCarro.add(pnlChasis);
                 txtNumeroChasis = new JTextField(10);
                 pnlChasis.add(lblNumeroChasis);
                 pnlChasis.add(txtNumeroChasis);
                 
                 pnlMatricula = new JPanel();
                 
                 
                 pnlCarro.add(pnlMatricula);
                 pnlMatricula.add(lblMatricula);
                 txtMatricula = new JTextField(10);
                 pnlMatricula.add(txtMatricula);
                 
                 pnlCarro.add(lblMarca);
                 pnlCarro.add(lblModelo);   
                 pnlCarro.add(btnRegistrarCarro);
            pnlCentro.add(pnlMoto);
                 pnlCilindraje = new JPanel();
                 pnlMoto.add(pnlCilindraje);
                 pnlCilindraje.add(lblCilindraje);
                 txtCilindraje = new JTextField(10);
                 pnlCilindraje.add(txtCilindraje);
                 pnlMoto.add(lblTipo);
                 lblSpace = new JLabel("");
                 lblSpace2 = new JLabel("");
                 pnlMoto.add(lblSpace);
                 pnlMoto.add(lblSpace2);
                 pnlMoto.add(btnRegistrarMoto);
            
        pnlSur.add(btnNoRegistrar);
        
        
        
        
     
     
     
     }
    
   
    
    
    
    
    
    
}
