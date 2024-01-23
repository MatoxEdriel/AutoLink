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
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import modelo.Repositorio.Cambios;
import modelo.Repositorio.TipoMoto;
import modelo.Repositorio.numeroAsiento;
import modelo.Repositorio.numeroPuertas;
public class IFrmRegistroVehiculo extends JInternalFrame{
      private JPanel contentPane;
      private JPanel pnlTop;
      private Color paleta; 
      private Color paleta2;
      private JPanel pnlSur;
      private JPanel pnlCentro;
      private JPanel pnlCarro;
      private JPanel pnlMoto;
      private JPanel pnllblMoto;
      private JPanel pnllblCarro;
      private JPanel pnlNumeroAsiento;
      private JPanel pnlNumeroPuertas;
      private JPanel pnlCambios;
      private JPanel pnllblVehiculo;
      private JPanel pnlChasis;
      private JPanel pnlMatricula;
      private JPanel pnlCilindraje;
      private JPanel pnlTipoMoto;
      private JPanel pnlMarca;
      private JPanel pnlModelo;
      private JLabel lblVehiculo;
      private JLabel lblCarro;
      private JLabel lblNumeroChasis;
      private JTextField txtNumeroChasis;
      private JLabel lblMatricula;
      private JTextField txtMatricula;
      private JLabel lblMarca;
      private JLabel lblModelo;
      private JTextField txtMarca;
      private JTextField txtModelo;
      private JLabel lblNumeroAsiento;
      private JLabel lblNumeroPuertas;
      private JLabel lblCambios;
      private JComboBox<Cambios> cmbCambios;
      private JComboBox<numeroAsiento> cmbNumeroAsiento;
      private JComboBox<numeroPuertas> cmbNumeroPuertas;
      private JLabel lblMoto;
      private JLabel lblCilindraje;
      private JTextField txtCilindraje;
      private JLabel lblTipo;
      private JComboBox<TipoMoto> cmbTipoMoto;
      private JLabel lblSpace;
      private JLabel lblSpace2;
      private JLabel lblSpace3;
      private JLabel lblIconCarro;
      private JLabel lblIconMoto;
      private ImageIcon iconoCarro;
      private ImageIcon iconoMoto;
      private JPanel pnlIconoCarro;
      private JPanel pnlIconoMoto;
      private JButton btnRegistrarCarro;
      private JButton btnRegistrarMoto;
      private JButton btnNoRegistrar;
      public IFrmRegistroVehiculo(){
           initComponents();
           addListeners();
      }
      public IFrmRegistroVehiculo(String titulo){
        super(titulo);
        initComponents();
        addListeners();      
      }
      private void addListeners(){
      IFrmRegistroVehiculoListener listener = new IFrmRegistroVehiculoListener(this);
      btnRegistrarCarro.addActionListener(listener);
      btnNoRegistrar.addActionListener(listener);
      btnRegistrarMoto.addActionListener(listener);      
      }
     public void initComponents(){
        setBounds(160, 30,270, 600);
        contentPane = new JPanel(new BorderLayout());
        paleta = new Color(0xFFFBEF);
        paleta2 = new Color(0x4F5FF4);
        setContentPane(contentPane);
        setResizable(true);  
        setIconifiable(true);
        setClosable(true);
        setMaximizable(true);
        iconoCarro = new ImageIcon("src/IO/carro2.jpg");
        iconoMoto = new ImageIcon("src/IO/moto2.jpg");
        lblIconCarro = new JLabel(iconoCarro);
        lblIconMoto = new JLabel(iconoMoto);
             pnlIconoCarro = new JPanel();
             pnlIconoCarro.setBackground(paleta);
             pnlIconoCarro.add(lblIconCarro);
             pnlIconoMoto = new JPanel();
             pnlIconoMoto.setBackground(paleta);
             pnlIconoMoto.add(lblIconMoto);
        pnlTop = new JPanel(new GridLayout(5,1));
            pnlTop.setBackground(paleta);
        pnlSur = new JPanel();
            pnlSur.setBackground(paleta2);
        pnlCentro = new JPanel(new GridLayout(1,2));
            pnlCarro = new JPanel(new GridLayout(6,1));
            pnlMoto = new JPanel(new GridLayout(6,1));
            pnlCentro.setBackground(paleta);
        lblCarro = new JLabel("Carro");
        lblNumeroChasis = new JLabel(" Numero de chasis "); 
        lblMatricula = new JLabel(" Matricula ");
        lblMarca = new JLabel(" Marca ");
        lblModelo = new JLabel(" Modelo ");
        lblMoto = new JLabel("Moto");
        lblCilindraje = new JLabel(" Cilindraje ");
        lblTipo = new JLabel(" Tipo de moto ");
        btnRegistrarCarro = new JButton("Registrar carro");
        btnRegistrarMoto = new JButton("Registrar moto");
        btnNoRegistrar = new JButton("No registrar vehiculos");
        contentPane.add(pnlTop, BorderLayout.NORTH);
        contentPane.add(pnlSur, BorderLayout.SOUTH);
        contentPane.add(pnlCentro,BorderLayout.CENTER);
         pnlChasis = new JPanel(new GridLayout(1,2));
         pnlChasis.setBackground(paleta);
         pnllblVehiculo = new JPanel();
         pnllblVehiculo.setBackground(paleta);
         pnlTop.add(pnllblVehiculo);
         lblVehiculo = new JLabel("Datos de vehiculo");
         pnllblVehiculo.add(lblVehiculo);
         pnllblVehiculo.setBackground(paleta);
        pnlTop.add(pnlChasis);
                 txtNumeroChasis = new JTextField(10);
            pnlChasis.add(lblNumeroChasis);
            pnlChasis.add(txtNumeroChasis);
        pnlMatricula = new JPanel(new GridLayout(1,2));
        pnlMatricula.setBackground(paleta);
        pnlTop.add(pnlMatricula);
            pnlMatricula.add(lblMatricula);
                txtMatricula = new JTextField(10);
                pnlMatricula.add(txtMatricula);
                pnlMarca = new JPanel(new GridLayout(1,2));
                pnlMarca.setBackground(paleta);
        pnlTop.add(pnlMarca);
                txtMarca = new JTextField(10);
                pnlMarca.add(lblMarca);
                pnlMarca.add(txtMarca);
                pnlModelo = new JPanel(new GridLayout(1,2));
                pnlModelo.setBackground(paleta);
        pnlTop.add(pnlModelo);
                txtModelo = new JTextField(10);
                pnlModelo.add(lblModelo);
                pnlModelo.add(txtModelo);
            pnlCentro.add(pnlCarro);
                 pnlNumeroAsiento= new JPanel();
                 pnlCarro.add(pnlIconoCarro);
                 pnlCarro.add(pnlNumeroAsiento);
                 pnlCarro.setBackground(paleta);
                 lblNumeroAsiento = new JLabel("Numero de asiento");
                 pnlNumeroAsiento.add(lblNumeroAsiento);
                 pnlNumeroAsiento.setBackground(paleta);
                         cmbNumeroAsiento = new JComboBox<>(numeroAsiento.values());
                                  pnlNumeroAsiento.add(cmbNumeroAsiento);
                 pnlNumeroPuertas = new JPanel();
                 pnlNumeroPuertas.setBackground(paleta);
                 pnlCarro.add(pnlNumeroPuertas);
                 lblNumeroPuertas = new JLabel("Numero de puertas");
                 pnlNumeroPuertas.add(lblNumeroPuertas);
                         cmbNumeroPuertas = new JComboBox<>(numeroPuertas.values());
                 pnlNumeroPuertas.add(cmbNumeroPuertas);
                 pnlCambios = new JPanel();
                 pnlCambios.setBackground(paleta);
                 pnlCarro.add(pnlCambios);
                 lblCambios = new JLabel("Cambios");
                 pnlCambios.add(lblCambios);
                         cmbCambios = new JComboBox<>(Cambios.values());
                 pnlCambios.add(cmbCambios);
                 lblSpace3 = new JLabel("");
                 pnlCarro.add(lblSpace3);
                 lblSpace3.setBackground(paleta);
                 pnlCarro.add(btnRegistrarCarro);
            pnlCentro.add(pnlMoto);
                 pnlMoto.add(pnlIconoMoto);
                 pnlMoto.setBackground(paleta);
                 pnlCilindraje = new JPanel();
                 pnlMoto.add(pnlCilindraje);
                 pnlCilindraje.add(lblCilindraje);
                 pnlCilindraje.setBackground(paleta);
                 txtCilindraje = new JTextField(10);
                 pnlCilindraje.add(txtCilindraje);
                   pnlTipoMoto = new JPanel();
                   pnlTipoMoto.setBackground(paleta);
                 pnlMoto.add(pnlTipoMoto);
                 pnlTipoMoto.add(lblTipo);
                       cmbTipoMoto = new JComboBox<>(TipoMoto.values());
                  pnlTipoMoto.add(cmbTipoMoto);
                 lblSpace = new JLabel("");
                 lblSpace2 = new JLabel("");
                 pnlMoto.add(lblSpace);
                 lblSpace.setBackground(paleta);
                 pnlMoto.add(lblSpace2);
                 lblSpace2.setBackground(paleta);
                 pnlMoto.add(btnRegistrarMoto);
        pnlSur.add(btnNoRegistrar);
     }
    public JTextField getTxtNumeroChasis() {
        return txtNumeroChasis;
    }
    public JTextField getTxtMatricula() {
        return txtMatricula;
    }
    public JTextField getTxtMarca() {
        return txtMarca;
    }

    public JTextField getTxtModelo() {
        return txtModelo;
    }

    public JComboBox<Cambios> getCmbCambios() {
        return cmbCambios;
    }

    public JComboBox<numeroAsiento> getCmbNumeroAsiento() {
        return cmbNumeroAsiento;
    }

    public JComboBox<numeroPuertas> getCmbNumeroPuertas() {
        return cmbNumeroPuertas;
    }

    public JTextField getTxtCilindraje() {
        return txtCilindraje;
    }

    public JComboBox<TipoMoto> getCmbTipoMoto() {
        return cmbTipoMoto;
    }

    public JButton getBtnRegistrarCarro() {
        return btnRegistrarCarro;
    }

    public JButton getBtnRegistrarMoto() {
        return btnRegistrarMoto;
    }

    public JButton getBtnNoRegistrar() {
        return btnNoRegistrar;
    }
    
   
    
    
    
    
    
    
}
