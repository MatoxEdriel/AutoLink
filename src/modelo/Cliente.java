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
    
    
    
    //Puedo guardar directamente al atributo
    private void codigo(){
                //Convierto el string en un array 
                //recordar usar el this.codigo para no devolver nada xd 
                //
                Random numeroRandom = new Random();
               //revisar los limites y el funcionamiento
                int numero= numeroRandom.nextInt(901) + 100;

                
                char[] cedulaVector = this.cedula.toCharArray();
                char[] nombreVector = this.nombre.toCharArray();
                char[] apellidoVector = this.apellido.toCharArray();
                
                //Aqui seria un for each pero se requiere los ultimos digitos 
                //mmm como es un array podria usar directamente los ultimos digitos 
                //aprovechando que son 10 digitos
                // 0  1  2  3  4  5  6  7  8  9 
                //necesitaria la posicion [8] [9]
                char primerDigito = cedulaVector[8];
                char segundoDigito = cedulaVector[9];
                
                char primerLetra = nombreVector[0];
                char segundaLetra = nombreVector[1];
                //como si fuera vector [-1]
                char ultimaLetra = apellidoVector[apellidoVector.length -1 ];
                char penultimaLetra = apellidoVector[apellidoVector.length -2];
                
                String codepart1 = " "+ primerDigito + segundoDigito + primerLetra+segundaLetra + penultimaLetra + ultimaLetra+numero;   
                 this.codigo = codepart1;
    }
    /*
    El c´odigo de un cliente ser´a generado en base a los siguientes requisitos:
a) Tomar los 2 ´ultimos de la c´edula de identidad.
b) Tomar las dos primeras letras del nombre.
c) Tomar las dos ´ultimas letras de su segundo apellido, o del primero, si es que s´olo
tiene uno
    d) Generar un n´umero aleatorio que empieza desde el n´umero 100 l 1000
    Code into
    0943676155
    Gabriel.
    Campoverde Jumbo
    random number
    Code output
    55gabo129
    en teoria crear una funcion que devuelva eso y de ahi hacer llamar esa funcion guardar lo que devuelve
    en una variable que sera atributo-
    
    -Lo correcto seria llamar aqui la funcion ?
    -Pero primero cargar los datos, seria mas limpio 
    */

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
