package modelo;
import modelo.Repositorio;
import modelo.Repositorio.Ciudades;

/**
 *
 * @author Mau
 */
public class TblDireccionDomicilio extends GenericDomainTableModel{

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch(columnIndex){
            case 0 : return Ciudades.class;
            case 1 : return String.class;
            case 2 : return String.class; 
        
        }
        return null;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        DireccionDomicilio dido = (DireccionDomicilio)getDomainObject(rowIndex);
        switch(columnIndex){
            case 0: return dido.getCiudad();
            case 1: return dido.getCalle();
            case 2: return dido.getNumero();
        
        }
        return null;

    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        DireccionDomicilio dido = (DireccionDomicilio)getDomainObject(rowIndex);
        switch(columnIndex){
            case 0: dido.setCiudad((Repositorio.Ciudades)aValue);break;
            case 1: dido.setCalle((String)aValue);break;
            case 2: dido.setNumero((String)aValue);break;
        
        }
        
        notifyTableCellUpdated(rowIndex, columnIndex);
        
    }
    
    
    
}
