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
import java.lang.Object; //
import IO.serializacion;
import static IO.serializacion.leerLista;
import static IO.serializacion.leerListaAbsoluta;
import static IO.serializacion.leerListaCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.Repositorio.Cambios;
import modelo.Repositorio.numeroAsiento;
import modelo.Repositorio.numeroPuertas;
import modelo.Automovil;
import modelo.vehiculos;
import modelo.Moto;
import modelo.Repositorio.TipoMoto;
public class IFrmRegistroVehiculoListener implements ActionListener{
    IFrmRegistroVehiculo IFrameRegistro;
    private List<vehiculos> lstVehiculos;
    private List<Object> lstClienteAbsoluto;
    private List<Object> visualizarprueba1;
    public IFrmRegistroVehiculoListener(IFrmRegistroVehiculo IFrameRegistro) {
        this.IFrameRegistro = IFrameRegistro;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == IFrameRegistro.getBtnNoRegistrar()){
           IFrameRegistro.dispose();
        }
        if (obj == IFrameRegistro.getBtnRegistrarCarro()){
            
    
          String numeroChasis = IFrameRegistro.getTxtNumeroChasis().getText();
          String matricula = IFrameRegistro.getTxtMatricula().getText();
          String marca = IFrameRegistro.getTxtMarca().getText();
          String modelo = IFrameRegistro.getTxtModelo().getText();
          numeroAsiento cantidadAsiento = (numeroAsiento)IFrameRegistro.getCmbNumeroAsiento().getSelectedItem();
          numeroPuertas cantidadPuertas = (numeroPuertas)IFrameRegistro.getCmbNumeroPuertas().getSelectedItem();
          Cambios cambios = (Cambios)IFrameRegistro.getCmbCambios().getSelectedItem(); 
          Automovil carro1 = new Automovil(cantidadAsiento,cantidadPuertas,cambios, numeroChasis,matricula,marca, modelo);
          addVehiculos(carro1);
            serializacion.guardarListaVehiculos(lstVehiculos);
         List<vehiculos> lista = leerLista();
         List<Cliente> cliente = leerListaCliente();
if (lista != null) {
    lstVehiculos = lista;
} else {
    System.out.println("FALLO AQUI");
}
if (cliente != null) {

} else {
    System.out.println("FALLO AQUI cliente");
}
    Cliente primerCliente = cliente.get(0);
    
    
 //POSIBLEMENTE ELIMINAR 
    primerCliente.setListaVehiculos(lstVehiculos);
      //PROBANDO PROTOTIPO 1      
            System.out.println("primer cliente + " + primerCliente);
        addAbsolutos(primerCliente);
      serializacion.guardarListaAbsoluta(lstClienteAbsoluto);
      
      List<Object> visualizarprueba = leerListaAbsoluta();
        for (Object elemento2 : visualizarprueba) {
            System.out.println("FUNCIONA" + elemento2);
            
            
            //POSIBLEMENTE ELIMINAR
        }
      
      
      
           IFrameRegistro.getTxtNumeroChasis().setText("");
           IFrameRegistro.getTxtMatricula().setText("");
           IFrameRegistro.getTxtMarca().setText("");
           IFrameRegistro.getTxtModelo().setText("");
           IFrameRegistro.getTxtNumeroChasis().requestFocus();
        }
        if(obj == IFrameRegistro.getBtnRegistrarMoto()){
          String numeroChasisM = IFrameRegistro.getTxtNumeroChasis().getText();
          String matriculaM = IFrameRegistro.getTxtMatricula().getText();
          String marcaM = IFrameRegistro.getTxtMarca().getText();
          String modeloM = IFrameRegistro.getTxtModelo().getText();
          String cilindrajeM = IFrameRegistro.getTxtCilindraje().getText();
          TipoMoto tipoMoto = (TipoMoto)IFrameRegistro.getCmbTipoMoto().getSelectedItem();
          Moto moto1 = new Moto(cilindrajeM,tipoMoto,numeroChasisM,matriculaM,marcaM,modeloM);
          addVehiculos(moto1);
          serializacion.guardarListaVehiculos(lstVehiculos);
           List<vehiculos> lista = leerLista();
           List<Cliente> cliente = leerListaCliente();
         Cliente SegundoCliente = cliente.get(0);
          SegundoCliente.setListaVehiculos(lstVehiculos);
         System.out.println("primer cliente + " + SegundoCliente);   
        nuevo();
        }
    }
       private void addVehiculos(vehiculos v){
            if(lstVehiculos == null){   
                lstVehiculos = new ArrayList<>();
            }   
            lstVehiculos.add(v);
        }
       //PROTOTIPO 1 PRUEBA FALLIDA: 1 
       private void addAbsolutos(Object o){
     
            if(lstClienteAbsoluto == null){   
                lstClienteAbsoluto = new ArrayList<>();
            }   
            lstClienteAbsoluto.add(o);
        }
          
          
          
       public List<vehiculos> getListaVehiculos(){
           return lstVehiculos;
       }
          public void nuevo(){
      IFrameRegistro.getTxtNumeroChasis().setText("");
      IFrameRegistro.getTxtMatricula().setText("");
      IFrameRegistro.getTxtMarca().setText("");
      IFrameRegistro.getTxtModelo().setText("");
      IFrameRegistro.getTxtCilindraje().setText("");
      IFrameRegistro.getTxtNumeroChasis().requestFocus();
      } 
}
