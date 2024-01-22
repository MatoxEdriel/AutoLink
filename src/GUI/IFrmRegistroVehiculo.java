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
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import modelo.Repositorio.Cambios;
import modelo.Repositorio.TipoMoto;
import modelo.Repositorio.numeroAsiento;
import modelo.Repositorio.numeroPuertas;

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
      private JPanel pnlNumeroAsiento;
      private JPanel pnlNumeroPuertas;
      private JPanel pnlCambios;
      
      private JPanel pnllblVehiculo;
      
      private JPanel pnlChasis;
      private JPanel pnlMatricula;
      private JPanel pnlCilindraje;
      private JPanel pnlTipoMoto;
      private JPanel pnlMarca;
      private JPanel pnlModelo;
    
      private JLabel lblVehiculo;
      //Label Vehiculo
      private JLabel lblCarro;
      private JLabel lblNumeroChasis;
      private JTextField txtNumeroChasis;
      private JLabel lblMatricula;
      private JTextField txtMatricula;
      private JLabel lblMarca;
      private JLabel lblModelo;
      private JTextField txtMarca;
      private JTextField txtModelo;
      //Label carro
      private JLabel lblNumeroAsiento;
      private JLabel lblNumeroPuertas;
      private JLabel lblCambios;
      
      private JComboBox<Cambios> cmbCambios;
      
      private JComboBox<numeroAsiento> cmbNumeroAsiento;
      private JComboBox<numeroPuertas> cmbNumeroPuertas;
  
      
      
      //Label moto
      private JLabel lblMoto;
      private JLabel lblCilindraje;
      private JTextField txtCilindraje;
      
      private JLabel lblTipo;
      private JComboBox<TipoMoto> cmbTipoMoto;
      
      //prueba
      private JLabel lblSpace;
      private JLabel lblSpace2;
      private JLabel lblSpace3;
      
      
      
 
      
      
      private JButton btnRegistrarCarro;
      private JButton btnRegistrarMoto;
      
      private JButton btnNoRegistrar;
      
      
      
      public IFrmRegistroVehiculo(){
           initComponents();
           addListeners();
      }
      public IFrmRegistroVehiculo(String titulo){
        super(titulo);
        initComponents();
        addListeners();
      
      }
//      private void SetImageLabel(JLabel labelName, String root){
//          ImageIcon image = new ImageIcon("");
//          Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getHeight(), Image.SCALE_DEFAULT));
//          
//      
//     
//      }
      
      private void addListeners(){
      IFrmRegistroVehiculoListener listener = new IFrmRegistroVehiculoListener(this);
      btnRegistrarCarro.addActionListener(listener);
      btnNoRegistrar.addActionListener(listener);
      btnRegistrarMoto.addActionListener(listener);
      
      
      }
      
     public void initComponents(){
        setBounds(160, 50,270, 500);
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
        pnlTop = new JPanel(new GridLayout(5,1));
              //   pnllblMoto = new JPanel(new BorderLayout());
                // pnllblCarro = new JPanel(new BorderLayout());
        pnlSur = new JPanel();
        pnlCentro = new JPanel(new GridLayout(1,2));
            pnlCarro = new JPanel(new GridLayout(6,1));
            pnlMoto = new JPanel(new GridLayout(6,1));
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
         pnlChasis = new JPanel(new GridLayout(1,2));
         pnllblVehiculo = new JPanel();
         pnlTop.add(pnllblVehiculo);
         lblVehiculo = new JLabel("Datos de vehiculo");
         pnllblVehiculo.add(lblVehiculo);
         
        pnlTop.add(pnlChasis);
                 txtNumeroChasis = new JTextField(10);
           
            pnlChasis.add(lblNumeroChasis);
            pnlChasis.add(txtNumeroChasis);
//        pnlTop.add(pnllblCarro);
//        pnlTop.add(pnllblMoto);
//           
//                    pnllblCarro.add(lblCarro);
//                    pnllblMoto.add(lblMoto);
        pnlMatricula = new JPanel(new GridLayout(1,2));
        pnlTop.add(pnlMatricula);
            pnlMatricula.add(lblMatricula);
                txtMatricula = new JTextField(10);
                pnlMatricula.add(txtMatricula);
           
//           
                pnlMarca = new JPanel(new GridLayout(1,2));
        pnlTop.add(pnlMarca);
                txtMarca = new JTextField(10);
                pnlMarca.add(lblMarca);
                pnlMarca.add(txtMarca);
                
                pnlModelo = new JPanel(new GridLayout(1,2));
        pnlTop.add(pnlModelo);
                txtModelo = new JTextField(10);
                pnlModelo.add(lblModelo);
                pnlModelo.add(txtModelo);

                
                
                
                
            pnlCentro.add(pnlCarro);
                 pnlNumeroAsiento= new JPanel();
                 pnlCarro.add(lblCarro);
                 pnlCarro.add(pnlNumeroAsiento);
                 lblNumeroAsiento = new JLabel("Numero de asiento");
                 pnlNumeroAsiento.add(lblNumeroAsiento);
                 
                         cmbNumeroAsiento = new JComboBox<>(numeroAsiento.values());
                                  pnlNumeroAsiento.add(cmbNumeroAsiento);
                 
                 pnlNumeroPuertas = new JPanel();
                 pnlCarro.add(pnlNumeroPuertas);
                 lblNumeroPuertas = new JLabel("Numero de puertas");
                 pnlNumeroPuertas.add(lblNumeroPuertas);
                         cmbNumeroPuertas = new JComboBox<>(numeroPuertas.values());
                 pnlNumeroPuertas.add(cmbNumeroPuertas);
                 //finish 
                 pnlCambios = new JPanel();
                 pnlCarro.add(pnlCambios);
                 lblCambios = new JLabel("Cambios");
                 pnlCambios.add(lblCambios);
                         cmbCambios = new JComboBox<>(Cambios.values());
                 //Aqui ir comboBOX
                 pnlCambios.add(cmbCambios);
                 lblSpace3 = new JLabel("");
                 
                 pnlCarro.add(lblSpace3);
                 
                 
                 
                 
                 pnlCarro.add(btnRegistrarCarro);
                 
                 
                 
            pnlCentro.add(pnlMoto);
                
            
                 pnlMoto.add(lblMoto);
                 pnlCilindraje = new JPanel();
                 pnlMoto.add(pnlCilindraje);
                 pnlCilindraje.add(lblCilindraje);
                 txtCilindraje = new JTextField(10);
                 pnlCilindraje.add(txtCilindraje);
                 
                 //Tipo
                   pnlTipoMoto = new JPanel();
                 pnlMoto.add(pnlTipoMoto);
                 pnlTipoMoto.add(lblTipo);
                       cmbTipoMoto = new JComboBox<>(TipoMoto.values());
                  pnlTipoMoto.add(cmbTipoMoto);
                 
                 lblSpace = new JLabel("");
                 lblSpace2 = new JLabel("");
                 pnlMoto.add(lblSpace);
                 pnlMoto.add(lblSpace2);
                 pnlMoto.add(btnRegistrarMoto);
            
        pnlSur.add(btnNoRegistrar);
        
        
        
        
     
     
     
     }

    public JTextField getTxtNumeroChasis() {
        return txtNumeroChasis;
    }

    public JTextField getTxtMatricula() {
        return txtMatricula;
    }

    public JTextField getTxtMarca() {
        return txtMarca;
    }

    public JTextField getTxtModelo() {
        return txtModelo;
    }

    public JComboBox<Cambios> getCmbCambios() {
        return cmbCambios;
    }

    public JComboBox<numeroAsiento> getCmbNumeroAsiento() {
        return cmbNumeroAsiento;
    }

    public JComboBox<numeroPuertas> getCmbNumeroPuertas() {
        return cmbNumeroPuertas;
    }

    public JTextField getTxtCilindraje() {
        return txtCilindraje;
    }

    public JComboBox<TipoMoto> getCmbTipoMoto() {
        return cmbTipoMoto;
    }

    public JButton getBtnRegistrarCarro() {
        return btnRegistrarCarro;
    }

    public JButton getBtnRegistrarMoto() {
        return btnRegistrarMoto;
    }

    public JButton getBtnNoRegistrar() {
        return btnNoRegistrar;
    }
    
   
    
    
    
    
    
    
}
