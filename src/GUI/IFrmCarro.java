/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.BorderLayout;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

/**
 *
 * @author Matox
 */


public class IFrmCarro extends JInternalFrame{
      private JPanel contentPane;
      
      public IFrmCarro(){
           initComponents();
      
      }
      public IFrmCarro(String titulo){
        super(titulo);
        initComponents();
   
      
      }
      
     
      
      
     public void initComponents(){
        setBounds(10, 10,200, 200);
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
     
     
     
     }
    
   
    
    
    
    
    
    
}
