/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import modelo.Cliente;
import modelo.vehiculos;



/**
 *
 * @author Matox
 */
public class serializacion{
    //guardar Lista
    public static void guardarLista(List<Cliente> lstClientes){
        try{
        ObjectOutputStream objS = new ObjectOutputStream(new FileOutputStream("./src/IO/Datos.poo"));
        objS.writeObject(lstClientes);
        objS.close();
        }catch(IOException e) {e.printStackTrace();}
       
    
    }
    
    
      public static List<Cliente> leerListaCliente(){
         List<Cliente> lstCliente = null;
         
          try{
        ObjectInputStream in= new ObjectInputStream(new FileInputStream("./src/IO/Datos.poo"));
        lstCliente = (List<Cliente>)in.readObject();
        in.close();
            
        }catch(IOException e) {e.printStackTrace();}
        catch(ClassNotFoundException e){e.printStackTrace();}
          
          
          return lstCliente;
       
     
     
     }
    
     public static void guardarListaVehiculos(List<vehiculos> lstVehiculos){
        //y si podemos guardar la lista directamente al atributo de cliente?
        //nos ahorrariamos codigo  
        //en teoria se puede? 
        //new FileOUTPUTstream lo veo como el comportamiento o el objetivo que se le quiere
        //dar al objeto transformado a byte 
        //Puedo pasarlo ?
         try{
        ObjectOutputStream objS = new ObjectOutputStream(new FileOutputStream("./src/IO/ListaVehiculo.poo"));
        objS.writeObject(lstVehiculos);
        objS.close();
        }catch(IOException e) {e.printStackTrace();}
       
    
    }
     
     public static List<vehiculos> leerLista(){
         List<vehiculos> lstVehiculos = null;
         
          try{
        ObjectInputStream in= new ObjectInputStream(new FileInputStream("./src/IO/ListaVehiculo.poo"));
        lstVehiculos = (List<vehiculos>)in.readObject();
        in.close();
            
        }catch(IOException e) {e.printStackTrace();}
        catch(ClassNotFoundException e){e.printStackTrace();}
          
          
          return lstVehiculos;
       
     
     
     }
     
     //SOLUCION 1 PROTOTIPO PRUEBA FALLIDAS: 
       public static void guardarListaAbsoluta(List<Object> lstClientesFinales){
        try{
        ObjectOutputStream objS = new ObjectOutputStream(new FileOutputStream("./src/IO/DatosAbsoluto.poo"));
        objS.writeObject(lstClientesFinales);
        objS.close();
        }catch(IOException e) {e.printStackTrace();}
    }
    
    
      public static List<Object> leerListaAbsoluta(){
         List<Object> lstClienteFinales = null;
         
          try{
        ObjectInputStream in= new ObjectInputStream(new FileInputStream("./src/IO/DatosAbsoluto.poo"));
        lstClienteFinales = (List<Object>)in.readObject();
        in.close();
            
        }catch(IOException e) {e.printStackTrace();}
        catch(ClassNotFoundException e){e.printStackTrace();}
          
          
          return lstClienteFinales;
       
     
     
     }
     
     
    
    
    
    
    
}
