/**
*---------------
*
* Creado el 17 de Enero, 2024, 13:00 horas
*
* @ Author Gabriel Campoverde, Roberto Mera 
*
* @version POO - 2022
*
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

import javax.swing.SwingUtilities;
public class IFrmNuevoPropietarioListener implements ActionListener {
    IFrmNuevoPropietario Ifrm;
    private List<Cliente> lstClientes;
    private List<vehiculos> lstVehiculos;
    public IFrmNuevoPropietarioListener(IFrmNuevoPropietario Ifrm ){
        this.Ifrm = Ifrm;  
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       Object obj = e.getSource();
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
           List<vehiculos> listaDeVehiculos = new ArrayList<>();
           Ciudades domicilioCiudad = (Ciudades) Ifrm.getCmbCiudad().getSelectedItem();
           String domicilioCalle = Ifrm.getTxtCalle().getText();
           String domicilioNumero = Ifrm.getTxtNumeroCasa().getText();
           Ciudades CiudadTrabajo = (Ciudades)Ifrm.getCmbCiudadTrabajo().getSelectedItem();
           String CalleTrabajo = Ifrm.getTxtCalleTrabajo().getText();
           String numeroTrabajo = Ifrm.getTxtNumeroManzana().getText();
           DireccionDomicilio direccionCasa = new DireccionDomicilio(domicilioCiudad,domicilioCalle,domicilioNumero);
           DireccionLaboral direccionTrabajo = new DireccionLaboral(CiudadTrabajo, CalleTrabajo, numeroTrabajo);      
           IFrmRegistroVehiculo carro = new IFrmRegistroVehiculo("Registro de Vehiculo");
           carro.setVisible(true);
           Ifrm.getDesktopPane().add(carro);
           Ifrm.setVisible(false);
           Cliente clientesinVehiculo = new Cliente(nombre,apellido,cedula, direccionCasa, direccionTrabajo);
           System.out.println("OJITO" + clientesinVehiculo);
           addClientes(clientesinVehiculo);      
           serializacion.guardarLista(lstClientes);
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
    /**
* (Descripci´on de lo que hace el m´etodo - sin par´entesis)
*
* @param parametro1 (descripci´on del parametro1 - sin par´entesis)
* @param parametro2 (descripci´on del parametro2 - sin par´entesis)
*/
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
