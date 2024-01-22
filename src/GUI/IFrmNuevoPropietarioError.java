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
    
    public IFrmNuevoPropietarioError(String errorMessage){
        setTitle("OJITO ");
        setSize(100,100);
        setResizable(false);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel(new BorderLayout());
        JLabel label = new JLabel(errorMessage);
        panel.add(label, BorderLayout.CENTER);

        JButton closeButton = new JButton("Cerrar");
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cierra el diálogo al hacer clic en el botón "Cerrar"
            }
        });
        panel.add(closeButton, BorderLayout.SOUTH);

        getContentPane().add(panel);
        
        
    
    
    }
    
    
    
    
    
}
