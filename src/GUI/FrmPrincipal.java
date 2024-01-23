package GUI;
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

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
public class FrmPrincipal extends JFrame {
    private JPanel contentPane;
    private JMenuBar barra;
    private JMenu mnArchivo;
    private JMenuItem mniRegistrar;
    private JMenuItem mniSalir;
    private JMenuItem mniRevisar;
    private Image imagen;    
    private JDesktopPane desktopPane;
    public FrmPrincipal(){    
        initComponents();
        addListeners();
    }
    public FrmPrincipal(String titulo ){
        super(titulo);
        initComponents();
        addListeners();
    }
    public void addListeners(){
    FrmPrincipalListener listener = new FrmPrincipalListener(this);
    mniRegistrar.addActionListener(listener);
    mniSalir.addActionListener(listener);
    mniRevisar.addActionListener(listener);
    }
    public void initComponents(){
    setSize(600,700);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    contentPane = new JPanel(new BorderLayout());
    setContentPane(contentPane);
    desktopPane = new JDesktopPane();
        contentPane.add(desktopPane);
    barra = new JMenuBar();
        setJMenuBar(barra);
    mnArchivo = new JMenu("Archivo");
        barra.add(mnArchivo);
    mniRegistrar = new JMenuItem("Registrar");
    mniRevisar = new JMenuItem("Revisar informes");
    mniSalir = new JMenuItem("Salir de la aplicacion"); 
        mnArchivo.add(mniRegistrar);
        mnArchivo.add(mniRevisar);
        mnArchivo.add(mniSalir);
    }
    public JDesktopPane getDesktopPane() {
        return desktopPane;
    }

    public JMenuItem getMniRegistrar() {
        return mniRegistrar;
    }


    public JMenuItem getMniSalir() {
        return mniSalir;
    }


    public JMenuItem getMniRevisar() {
        return mniRevisar;
    }

    
    



    
}
