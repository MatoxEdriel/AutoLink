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
import IO.serializacion;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import modelo.Cliente;
import modelo.GenericDomainTableModel;
import modelo.TblCliente;
public class IFrmListadoCliente extends JInternalFrame{
    private JPanel contentPane;
    private JScrollPane spnlTabla;
    private JTable tblDatosClientes;
    private GenericDomainTableModel modeloTabla;
    final Object vCabeceras [] = {"CLIENTE", "CODIGO","DATOS PESONALES","DATOS VEHICULAR"};
 
    private List<Cliente> lstCliente;
    public IFrmListadoCliente(String titulo){
        super(titulo);
        initComponents();
    }
    private void initComponents(){
        setBounds(90,10,300,300);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setClosable(true);
        contentPane = new JPanel(new BorderLayout());
        setContentPane(contentPane);
        spnlTabla = new JScrollPane();
        contentPane.add(spnlTabla, BorderLayout.CENTER);
        spnlTabla.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        
        lstCliente = serializacion.leerListaCliente();
        modeloTabla = new TblCliente(vCabeceras);
        modeloTabla.addRows(lstCliente);
        tblDatosClientes = new JTable(modeloTabla);
        spnlTabla.setViewportView(tblDatosClientes);
    }
}
