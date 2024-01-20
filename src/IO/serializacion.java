/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import modelo.Cliente;



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
    
    
    
    
    
}
