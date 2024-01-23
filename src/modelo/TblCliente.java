/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import modelo.vehiculos;
import java.util.List;

/**
 *
 * @author Mau
 */
public class TblCliente extends GenericDomainTableModel<Cliente>{

    public TblCliente(Object [] vCabeceras){
        super(vCabeceras);
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch(columnIndex){
            case 0 : return String.class;
            case 1 : return String.class;
            case 2 : return String.class;
            case 3 : return String.class;
            case 4 : return vehiculos.class;
        }
        return null;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = (Cliente)getDomainObject(rowIndex);
        switch(columnIndex){
            case 0: return cliente.getNombre();
            case 1: return cliente.getApellido();
            case 2: return cliente.getCedula();
            case 3: return cliente.getCodigo();
            case 4: return cliente.getListaVehiculos();
            
        }
        return null;
        
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Cliente cliente = (Cliente)getDomainObject(rowIndex);
        switch(columnIndex){
            case 0: cliente.setNombre((String)aValue);break;
            case 1: cliente.setApellido((String)aValue);break;
            case 2: cliente.setCedula((String)aValue);break;
            case 3: cliente.setCodigo((String)aValue);break;
            case 4: cliente.setListaVehiculos((List<vehiculos>)(vehiculos)aValue);
        }
        
        
        notifyTableCellUpdated(rowIndex, columnIndex);
        
    }
    
}
