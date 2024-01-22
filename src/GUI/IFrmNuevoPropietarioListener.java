/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import IO.serializacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.DireccionDomicilio;
import modelo.DireccionLaboral;
import modelo.Repositorio.Ciudades;
import modelo.vehiculos;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;

/**
 *
 * @author Matox
 */
public class IFrmNuevoPropietarioListener implements ActionListener {
    IFrmNuevoPropietario Ifrm;
    IFrmRegistroVehiculoListener frm;
    
    
    //Esto provoca el error de addlistener, investigar, entender y corregir
    private List<Cliente> lstClientes;
    private List<vehiculos> lstVehiculos;
    
    public IFrmNuevoPropietarioListener(IFrmNuevoPropietario Ifrm){
        this.Ifrm = Ifrm;
       
    }
      


    @Override
    public void actionPerformed(ActionEvent e) {
        //PRUEBA 5 
    
     //
       Object obj = e.getSource();
       //Prueba 
//       if(obj == Ifrm.getBtnCarro()){
//           IFrmRegistroVehiculo carro = new IFrmRegistroVehiculo("Carrito uwu ");
//           carro.setVisible(true);
//           Ifrm.getDesktopPane().add(carro);
//           Ifrm.setVisible(false);
//       }
       if(obj == Ifrm.getBtnSalir()){
           System.exit(0);
       }
       if(obj == Ifrm.getBtnNuevoRegistro()){
       
       
       
       }
    try{
       if(obj == Ifrm.getBtnGuardar()){
           
           
           String cedula = Ifrm.getTxtCedula().getText();
           String nombre = Ifrm.getTxtNombre().getText();
           String apellido = Ifrm.getTxtApellido().getText();
           //Aqui tendria que enviarle datos de vehiculos directamente 
           List<vehiculos> listaDeVehiculos = new ArrayList<>(); 
           //Aqui hago un casting
           //Debido que es un combo box o sea tipo enum ese dato se debe castear a String 
           Ciudades domicilioCiudad = (Ciudades) Ifrm.getCmbCiudad().getSelectedItem();
           String domicilioCalle = Ifrm.getTxtCalle().getText();
           String domicilioNumero = Ifrm.getTxtNumeroCasa().getText();
           
           Ciudades CiudadTrabajo = (Ciudades)Ifrm.getCmbCiudadTrabajo().getSelectedItem();
           String CalleTrabajo = Ifrm.getTxtCalleTrabajo().getText();
           String numeroTrabajo = Ifrm.getTxtNumeroManzana().getText();
           //TENEMOS QUE HACER QUE ESTAS LISTA SE DESPLIEGUE SI ES POSIBLE APLICAR UN FOR 
           //necesito que se ampliee
           
           DireccionDomicilio direccionCasa = new DireccionDomicilio(domicilioCiudad,domicilioCalle,domicilioNumero);
           DireccionLaboral direccionTrabajo = new DireccionLaboral(CiudadTrabajo, CalleTrabajo, numeroTrabajo);
           //Recuerda que estos datos no deben ser guardados aun solo el cliente
           
            //Prototipo CON CARRO 
           Cliente clientesinVehiculo = new Cliente(nombre,apellido,cedula, direccionCasa, direccionTrabajo);
           //Creando informacion de vehiculo
           //--Quitar lista si no funciona 
         
           serializacion.guardarLista(lstClientes);
           addClientes(clientesinVehiculo);
           //funcion de nuevo() focus request  
           System.out.println(" Cliente sin vehiculo asignado " + clientesinVehiculo);
           
           
           IFrmRegistroVehiculo carro = new IFrmRegistroVehiculo("Registro de Vehiculo");
           
           carro.setVisible(true);
           Ifrm.getDesktopPane().add(carro);
           Ifrm.setVisible(false);
           
      
           
           /*
               protected String numeroChasis;
    protected String matricula;
    protected String marca;
    protected String modelo;
           */   
        //Agregar codigo, DIRECCIONES 
        //Datos HIPOTETICO

       }
       
        }catch(ArrayIndexOutOfBoundsException w){
        nuevo();
        
        
         SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            IFrmNuevoPropietarioError errorDialog = new IFrmNuevoPropietarioError("¡Hubo un error! Por favor, verifica los datos ingresados.");
            errorDialog.setVisible(true);
        }
    });
        }
       
    
    
    
    }
    
    
    
      public void addClientes(Cliente cliente1){
        if(lstClientes == null){
            lstClientes = new ArrayList<>();
        }
        lstClientes.add(cliente1);
       }
      public void nuevo(){
      Ifrm.getTxtCedula().setText("");
      Ifrm.getTxtNombre().setText("");
      Ifrm.getTxtApellido().setText("");
      Ifrm.getTxtCalle().setText("");
      Ifrm.getTxtNumeroCasa().setText("");
      Ifrm.getTxtCalleTrabajo().setText("");
      Ifrm.getTxtNumeroManzana().setText("");
      Ifrm.getTxtCedula().requestFocus();}
      
      
       
    
    
    
    
    
}
