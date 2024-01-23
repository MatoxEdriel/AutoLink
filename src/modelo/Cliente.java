/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.Random;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Matox
 */
public class Cliente implements Serializable{
   //private codigo
    //codigo no pero datos si
   
    //Esto seria un funcion, ya que necesito que devuelva el valor del codigo 
    
    private String nombre;
    private String apellido;
    private String cedula;
    private String codigo;
    private List<vehiculos> ListaVehiculos;
    
    
    
    private DireccionDomicilio oDireccionDomicilio;
    private DireccionLaboral oDireccionLaboral;
    
    
    
    //private DireccionDomicilio
    //private DireccionTrabajo
    
  
   
    public Cliente( String nombre, String apellido,String cedula
                    ,DireccionDomicilio oDireccionDomicilio,DireccionLaboral oDireccionLaboral) {
        this.cedula = cedula;
    
       // lo hace el procedimiento  this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        
       
        this.oDireccionDomicilio = oDireccionDomicilio;
        this.oDireccionLaboral = oDireccionLaboral;
        codigo();
    }
    //SOBRECARGA DE CONSTRUCTORES 
       public Cliente( String nombre, String apellido,String cedula, List<vehiculos> ListaVehiculos
                    ,DireccionDomicilio oDireccionDomicilio,DireccionLaboral oDireccionLaboral) {
        this.cedula = cedula;
    
       // lo hace el procedimiento  this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        
        this.ListaVehiculos = new ArrayList<>(ListaVehiculos);
        this.oDireccionDomicilio = oDireccionDomicilio;
        this.oDireccionLaboral = oDireccionLaboral;
        codigo();
    }

    public Cliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
   
    private void codigo(){
                Random numeroRandom = new Random();
                int numero= numeroRandom.nextInt(901) + 100;
                char[] cedulaVector = this.cedula.toCharArray();
                char[] nombreVector = this.nombre.toCharArray();
                char[] apellidoVector = this.apellido.toCharArray();
                char primerDigito = cedulaVector[8];
                char segundoDigito = cedulaVector[9];
                char primerLetra = nombreVector[0];
                char segundaLetra = nombreVector[1];
                char ultimaLetra = apellidoVector[apellidoVector.length -1 ];
                char penultimaLetra = apellidoVector[apellidoVector.length -2];
                String codepart1 = " "+ primerDigito + segundoDigito + primerLetra+segundaLetra + penultimaLetra + ultimaLetra+numero;   
                 this.codigo = codepart1;
    }
    public List<vehiculos> getListaVehiculos() {
        return ListaVehiculos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public DireccionDomicilio getoDireccionDomicilio() {
        return oDireccionDomicilio;
    }

    public void setoDireccionDomicilio(DireccionDomicilio oDireccionDomicilio) {
        this.oDireccionDomicilio = oDireccionDomicilio;
    }

    public DireccionLaboral getoDireccionLaboral() {
        return oDireccionLaboral;
    }

    public void setoDireccionLaboral(DireccionLaboral oDireccionLaboral) {
        this.oDireccionLaboral = oDireccionLaboral;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", ListaVehiculos=" + ListaVehiculos + ", oDireccionDomicilio=" + oDireccionDomicilio + ", oDireccionLaboral=" + oDireccionLaboral + ", codigo=" + codigo + '}';
    }

    public void setListaVehiculos(List<vehiculos> ListaVehiculos) {
        this.ListaVehiculos = ListaVehiculos;
    }

 
   
    
    
    
    
    
    
}
