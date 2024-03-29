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
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
* (Aviso de try catch )
*
* @param parametro1 (descripci´on del parametro1 - sin par´entesis)
* @param parametro2 (descripci´on del parametro2 - sin par´entesis)
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
