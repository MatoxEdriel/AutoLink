/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Matox
 */
public class IFrmCarroListener implements ActionListener {
    IFrmNuevoPropietario Ifrm;
    
    public IFrmCarroListener(IFrmNuevoPropietario Ifrm){
        this.Ifrm = Ifrm;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       Object obj = e.getSource();
       if(obj == Ifrm.getBtnCarro()){
           IFrmCarro carro = new IFrmCarro("Carrito uwu ");
           carro.setVisible(true);
           Ifrm.getDesktopPane().add(carro);
           Ifrm.setVisible(false);
       }
       
       
       
      
       
       
    
    
    
    }
       
    
    
    
    
    
}
