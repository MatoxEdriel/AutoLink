/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Matox
 */
public class IFrmNuevoPropietarioError extends JDialog {
    private JPanel panel;
    private JLabel label;
    private JButton closeButton;
    
    
    
    public IFrmNuevoPropietarioError(String errorMessage){
        setTitle("OJITO ");
        setSize(100,100);
        setResizable(false);
        setLocationRelativeTo(null);
        
        panel = new JPanel(new BorderLayout());
        label = new JLabel("Hay un error xd ");
        
        panel.add(label, BorderLayout.CENTER);

        closeButton = new JButton("Cerrar");
        
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cierra el diálogo al hacer clic en el botón "Cerrar"
            }
        });
        panel.add(closeButton, BorderLayout.SOUTH);
        //agregas el panel dentro del contentPane de atras 
        getContentPane().add(panel);
        
        
    
    
    }
    
    
    
    
    
}
