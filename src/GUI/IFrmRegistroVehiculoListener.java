/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import IO.serializacion;
import static IO.serializacion.leerLista;
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







/**
 *
 * @author Matox
 */
public class IFrmRegistroVehiculoListener implements ActionListener{
    IFrmRegistroVehiculo IFrameRegistro;

 
    private List<vehiculos> lstVehiculos;
    

   
    public IFrmRegistroVehiculoListener(IFrmRegistroVehiculo IFrameRegistro) {
        this.IFrameRegistro = IFrameRegistro;
      
    }
    
   
    
    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        Object obj = e.getSource();
        //Botones
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
          //Quizas llame el mismo cliente 
          //pero es necesario hacerlo? 
          Automovil carro1 = new Automovil(cantidadAsiento,cantidadPuertas,cambios, numeroChasis,matricula,marca, modelo);
          //uiso la serializacion para guardar en la lista
          //Puedo pasar esto en una lista al atributo de la clase ? 
          addVehiculos(carro1);
         // serializacion.guardarListaVehiculos(lstVehiculos);
          
          //Cliente ClientePrueba1 = new Cliente();
          
          
          //Aqui uso la lista mmmm es necesario serializarlo? de todos modos ya 
          //debe estar mmmm 
          
         
            serializacion.guardarListaVehiculos(lstVehiculos);
            
          
         //   List<vehiculos> listaVehiculo = serializacion.leerLista();
           // List<Cliente> listaCliente = serializacion.leerListaCliente();
            
       
         List<vehiculos> lista = leerLista();
List<Cliente> cliente = leerListaCliente();

if (lista != null) {
    lstVehiculos = lista;
} else {
    System.out.println("FALLO AQUI");
}

if (cliente != null) {
    // No inicialices nuevamente la lista, ya la has obtenido de leerListaCliente()
    // cliente = leerListaCliente();
} else {
    System.out.println("FALLO AQUI cliente");
}

//List<Object> clientefinal = new ArrayList<>();
//clientefinal.addAll(lista);
//clientefinal.addAll(cliente);

//for (Object elementos : clientefinal) {
//    
//    System.out.println("mostrando CLIENTE FINAL " + elementos);
//}

    Cliente primerCliente = cliente.get(0);
    
    primerCliente.setListaVehiculos(lstVehiculos);
    

            System.out.println("primer cliente + " + primerCliente);
    
    
    
         
            
          
            
            
            
            
          
          
          
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
                  
                 
        
        
        
        }
        
     
        
        //
        
        
        
        
    }
       private void addVehiculos(vehiculos v){
            if(lstVehiculos == null){
            
                lstVehiculos = new ArrayList<>();
            }
            
            lstVehiculos.add(v);
        
        
        }
       
       public List<vehiculos> getListaVehiculos(){
           return lstVehiculos;
       }
       //PROTOTIPO 3
    
          public void nuevo(){
      IFrameRegistro.getTxtNumeroChasis().setText("");
      IFrameRegistro.getTxtMatricula().setText("");
      IFrameRegistro.getTxtMarca().setText("");
      IFrameRegistro.getTxtModelo().setText("");
      
      IFrameRegistro.getTxtCilindraje().setText("");
      
      IFrameRegistro.getTxtNumeroChasis().requestFocus();
      }
       //BORRAR DATOS DEPUES DE INGRESAR 
       
       
}
