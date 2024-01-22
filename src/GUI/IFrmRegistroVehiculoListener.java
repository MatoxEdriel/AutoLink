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
import modelo.Repositorio.Cambios;
import modelo.Repositorio.numeroAsiento;
import modelo.Repositorio.numeroPuertas;
import modelo.Automovil;
import modelo.vehiculos;
import modelo.Moto;







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
            System.exit(0);
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
          
            System.out.println("SE CREO ");
           
          
          
          
        }
        if(obj == IFrameRegistro.getBtnRegistrarMoto()){
          String numeroChasis = IFrameRegistro.getTxtNumeroChasis().getText();
          String matricula = IFrameRegistro.getTxtMatricula().getText();
          String marca = IFrameRegistro.getTxtMarca().getText();
          String modelo = IFrameRegistro.getTxtModelo().getText();
          vehiculos vehiculo1 = new vehiculos(numeroChasis,matricula,marca,modelo);
          lstVehiculos.add(vehiculo1);
        
        
        }
        
     
        
        //
        
        
        
        
    }
       private void addVehiculos(vehiculos v){
            if(lstVehiculos == null){
            
                lstVehiculos = new ArrayList<>();
            }
            
            lstVehiculos.add(v);
        
        
        }
       
        public List<vehiculos> getListaDeVehiculos() {
        return lstVehiculos;
    }
       
       //PROTOTIPO 3
    
      
    
    
    
    
}
