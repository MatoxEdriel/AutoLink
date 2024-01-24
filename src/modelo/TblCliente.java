package modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;

public class TblCliente extends GenericDomainTableModel<Cliente> {
    private JButton btnMostrarDatosPersonales;
    private JButton btnMostrarDatosVehiculos;

    public TblCliente(Object[] vCabeceras) {
        super(vCabeceras);
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0: return String.class;
            case 1:
                return String.class;
            case 2:
                return JButton.class; // Botón para mostrar datos personales
            case 3:
                return JButton.class; // Botón para mostrar datos vehiculares
        }
        return null;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object obj  = getDomainObject(rowIndex);
        Cliente cliente = getDomainObject(rowIndex);
        switch (columnIndex) {
            case 0:
                return cliente.getNombre();
            case 1:
                return cliente.getCodigo();
            case 2:
                return createButton("Datos Personales", cliente);
            case 3:
                return createButton("Datos Vehiculares", cliente);
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        // Puedes manejar la acción del botón aquí si es necesario
        // No necesitas modificar el valor de la celda, ya que es un botón
        Cliente cliente = (Cliente)getDomainObject(rowIndex);
        Object obj = getDomainObject(rowIndex);
        switch(columnIndex){
            case 0: 
                    setValueAt("Cliente " + (rowIndex + 1), rowIndex, columnIndex);
            break;
                  case 1: cliente.setCodigo((String)aValue);
                System.out.println("Código del cliente: " + cliente.getCodigo());
             break;
            case 2: 
                if(obj instanceof Cliente){
                       ClienteDetailsDialog detalles = new ClienteDetailsDialog(cliente);
                       detalles.setSize(500,500);
                       detalles.setLocationRelativeTo(null);
                      detalles.setVisible(true);
                }
                
              
//                cliente.setNombre((String)aValue);;
//                    cliente.setApellido((String)aValue);
//                    cliente.setCedula((String)aValue);
//                    cliente.setoDireccionDomicilio()
//                    cliente.setoDireccionLaboral(oDireccionLaboral);
//                 
                break;
            case 3:
                if(obj instanceof vehiculos){
                        VehiculoDetailsDialog detalles2 = new VehiculoDetailsDialog((vehiculos) obj);
                      detalles2.setSize(500,500);
                      detalles2.setLocationRelativeTo(null);
                      detalles2.setVisible(true);   
                
                
                
                }
                
                
                //probando
                 break;
                
        
        
        
        
        }
        
         notifyTableCellUpdated(rowIndex, columnIndex);
        
    }
    //tendria qeu cambiar esto mmmm
    //Hacer interfaz?? es que son los mismo botones  PERO
    private JButton createButton(String text, Object obj) {
        JButton button = new JButton(text);
        button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(obj instanceof Cliente){
                Cliente cliente = (Cliente) obj;
            }
            else if(obj instanceof vehiculos){
                vehiculos vehiculo = (vehiculos) obj;
            
            
            }
            // Aquí puedes manejar el evento de clic en el botón
            // Puedes acceder al objeto Cliente asociado a la fila
            // (pasado como parámetro en createButton)
          
            // Realiza las acciones que desees al hacer clic en el botón
        }
    }); 


// Personaliza el botón según tus necesidades
        return button;
    } 
    
    
    
    
}
