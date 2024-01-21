/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author Matox
 */

import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;

import modelo.Repositorio.Ciudades;


public class IFrmNuevoPropietario extends JInternalFrame{
    
    private JDesktopPane desktopPane;
    
    private JPanel contentPane;
    private JPanel pnlSur;
    private JPanel pnlCentro;
    private JPanel pnlRegistroInformacion;
    private JPanel pnllblDireccion;
    private JPanel pnllblDireccionTrabajo;
    
    private JPanel pnlDireccion;
    private JPanel pnlDireccionTrabajo;
    
    private JPanel pnlCedula;
    private JPanel pnlNombre;
    private JPanel pnlApellido;
    private JPanel pnltxtCedula;
    private JPanel pnltxtNombre;
    private JPanel pnltxtApellido;
    
  
    //Botones
    private JButton btnGuardar;
    private JButton btnNuevoRegistro;
    private JButton btnSalir;
   
    //Etiquetas
    private JLabel lblCedula;
    private JLabel lblNombre;
    private JLabel lblApellido;
    //Etiqueta pnlDireccion
    private JLabel lblDireccion;
    private JLabel lblDireccionTrabajo;
    private JLabel lblCiudad;
    private JLabel lblCalle;
    private JLabel lblNumeroCasa;
    //Etiqueta pnlDireccionTrabajo
    private JLabel lblCiudadTrabajo;
    private JLabel lblCalleTrabajo;
    private JLabel lblNumeroManzana;
    
    
    
    //Txt
    private JTextField txtCedula;
    private JTextField txtNombre;
    private JTextField txtApellido;
    
    private JTextField txtCalle;
    private JTextField txtNumeroCasa;
    
    private JTextField txtCalleTrabajo;
    private JTextField txtNumeroManzana;
    //txt Direccion 
    private JComboBox<String> cmbCiudad;
    private JComboBox<String> cmbCiudadTrabajo;
    
 
    
    

    
    public IFrmNuevoPropietario(){
        
        initComponents();
        addListener();
    
    }
    public IFrmNuevoPropietario(String titulo){
        super(titulo);
        initComponents();
        addListener();
    }
    
     private void addListener(){
      IFrmNuevoPropietarioListener listener = new IFrmNuevoPropietarioListener(this);
      btnGuardar.addActionListener(listener);
     
      
      
     }
    
    
    
    public void initComponents(){
        setBounds(10, 10,500, 490);
        contentPane = new JPanel(new BorderLayout());
        setContentPane(contentPane);
        
        desktopPane = new JDesktopPane();
        contentPane.add(desktopPane);
        
        
        pnlRegistroInformacion = new JPanel(new GridLayout(5,2));
                 pnlCedula = new JPanel();
                 pnlNombre = new JPanel();
                 pnlApellido = new JPanel();
                 //
                 pnllblDireccion = new JPanel();
                 pnllblDireccionTrabajo = new JPanel();
                 pnlDireccion = new JPanel(new GridLayout(3,3));
                 pnlDireccionTrabajo = new JPanel(new GridLayout(3,3));
                 //
                 pnltxtCedula = new JPanel();
                 pnltxtNombre = new JPanel();
                 pnltxtApellido = new JPanel();
                 
        //Activar capacidad de modificar tama;o con mouse
        setResizable(true);
        //Capacidad de minimizar ventana
        setIconifiable(true);
        //Opcion para cerrar ventana (x)
        setClosable(true);
        //capacidad de ventana para maximizar
        setMaximizable(true); 
        //Revisar gestion de desing 
        pnlCentro = new JPanel();
        lblCedula = new JLabel("Cedula");
        lblNombre = new JLabel("Nombre");
        lblApellido = new JLabel("Apellido");
        lblDireccion = new JLabel("Direccion Domiciliaria");
            lblCiudad = new JLabel("Ciudad");
            lblCalle = new JLabel("Calle");
            lblNumeroCasa = new JLabel("Numero de casa");
              
        lblDireccionTrabajo = new JLabel("Direccion Laboral");
            lblCiudadTrabajo = new JLabel("Ciudad");
            lblCalleTrabajo = new JLabel("Calle");
            lblNumeroManzana = new JLabel ("Numero de manzana");
        txtCedula = new JTextField(10);
        txtNombre = new JTextField(10);
        txtApellido = new JTextField(10);
        
        txtCalle = new JTextField(10);
        txtNumeroCasa = new JTextField(10);
        
        txtCalleTrabajo = new JTextField(10);
        txtNumeroManzana = new JTextField(10);
            contentPane.add(pnlCentro, BorderLayout.CENTER);
            pnlCentro.add(pnlRegistroInformacion);
            
            pnlRegistroInformacion.add(pnlCedula);
                pnlCedula.add(lblCedula);
                    pnlRegistroInformacion.add(pnltxtCedula);
                         pnltxtCedula.add(txtCedula);    
                         
            pnlRegistroInformacion.add(pnlNombre);
                pnlNombre.add(lblNombre);
                    pnlRegistroInformacion.add(pnltxtNombre);
                         pnltxtNombre.add(txtNombre);
                         
            pnlRegistroInformacion.add(pnlApellido);
                pnlApellido.add(lblApellido);
                    pnlRegistroInformacion.add(pnltxtApellido);
                         pnltxtApellido.add(txtApellido);
                      
                         
            pnlRegistroInformacion.add(pnllblDireccion);
                pnllblDireccion.add(lblDireccion);
                    pnlRegistroInformacion.add(pnlDireccion);
                          pnlDireccion.add(lblCiudad);
                          //uso de combobox
                              JComboBox<Ciudades> cmbCiudad = new JComboBox<>(Ciudades.values());
                                  pnlDireccion.add(cmbCiudad);
                                       pnlDireccion.add(lblCalle);
                                       pnlDireccion.add(txtCalle);
                                       pnlDireccion.add(lblNumeroCasa);
                                       pnlDireccion.add(txtNumeroCasa);
                    
                
            pnlRegistroInformacion.add(pnllblDireccionTrabajo);
                pnllblDireccionTrabajo.add(lblDireccionTrabajo);
                    pnlRegistroInformacion.add(pnlDireccionTrabajo);
                          pnlDireccionTrabajo.add(lblCiudadTrabajo);
                          JComboBox<Ciudades> cmbCiudadTrabajo = new JComboBox<>(Ciudades.values());
                                pnlDireccionTrabajo.add(cmbCiudadTrabajo);
                                      pnlDireccionTrabajo.add(lblCalleTrabajo);
                                      pnlDireccionTrabajo.add(txtCalleTrabajo);
                                      pnlDireccionTrabajo.add(lblNumeroManzana);
                                      pnlDireccionTrabajo.add(txtNumeroManzana);
                                       
                                        
                                      
                                      
            
        pnlSur = new JPanel();
            contentPane.add(pnlSur, BorderLayout.SOUTH);
        btnGuardar = new JButton("Guardar");
            pnlSur.add(btnGuardar);
        btnNuevoRegistro = new JButton("Nuevo Registro");
            pnlSur.add(btnNuevoRegistro);
        btnSalir = new JButton("Salir");
            pnlSur.add(btnSalir);
            
   
            
         
         
    
        
        
        
            
        
         
         
            
        
    
    
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public JButton getBtnNuevoRegistro() {
        return btnNuevoRegistro;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

 

    public JTextField getTxtCedula() {
        return txtCedula;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public JTextField getTxtApellido() {
        return txtApellido;
    }
    
    
    
    
    
    
    
    
    
}
