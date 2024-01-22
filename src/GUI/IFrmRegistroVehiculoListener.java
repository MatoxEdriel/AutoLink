/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import modelo.vehiculos;

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
          vehiculos vehiculo1 = new vehiculos(numeroChasis,matricula,marca,modelo);
          lstVehiculos.add(vehiculo1);
        
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
    
    
    
}
