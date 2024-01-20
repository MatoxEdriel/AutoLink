/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author Matox
 */

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class FrmPrincipalListener implements ActionListener{
    private FrmPrincipal frm;
    
    
    public FrmPrincipalListener(FrmPrincipal frm){       
        this.frm = frm; 
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
         Object obj = e.getSource();
         if(obj == frm.getMniRegistrar()){
         //Funcion activar 
            IFrmNuevoPropietario IFnuevoPropietario = new IFrmNuevoPropietario("Informacion de nuevo propietario");
            IFnuevoPropietario.setVisible(true);
            frm.getDesktopPane().add(IFnuevoPropietario);
            //Aqui 
              
         }
         if(obj == frm.getMniSalir()){
             System.exit(0);
         }
         
         
         
         
         
         
         
         
         
        
        
    
    
    }
    
    
    
    
    
    
    
    
}
