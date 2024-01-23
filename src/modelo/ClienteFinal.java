/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import modelo.Cliente;

/**
 *
 * @author Matox
 */
public class ClienteFinal 
                          extends GenericDomainTableModel<Object>{
    
    
    //Supeustamente va a aqui unaf ucnion con las cabeceras
    
    
        @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch(columnIndex){
            //Es el tipo de dato que se muestra mas el qeu se ingresa 
            //Por esa razon 
            //Aqui es una clase cliente no string 
            case 0 : return Cliente.class;
            case 1 : return String.class;
            case 2 : return String.class;
            case 3 : return String.class;
            case 4 : return vehiculos.class;
        }
        return null;
        
    }
    
    
    
    
    

 

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
