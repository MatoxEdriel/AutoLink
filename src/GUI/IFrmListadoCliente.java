/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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

/**
 *
 * @author Mau
 */
public class IFrmListadoCliente extends JInternalFrame{
    private JPanel contentPane;
    private JScrollPane spnlTabla;
    private JTable tblDatosClientes;
    private GenericDomainTableModel modeloTabla;
    final Object vCabeceras [] = {"CEDULA", "NOMBRE","APELLIDOS","CODIGO","VEHICULOS"};
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
    
        //ahora crearemos la tabla de Clientes
        lstCliente = serializacion.leerListaCliente();
        modeloTabla = new TblCliente(vCabeceras);
        modeloTabla.addRows(lstCliente);
        tblDatosClientes = new JTable(modeloTabla);
        spnlTabla.setViewportView(tblDatosClientes);
        
        
    }
    
}
