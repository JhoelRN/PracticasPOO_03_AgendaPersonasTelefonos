/*
   CLASE CPERSONA
        MAIN 03
 */
package edu.utp.poo.libreria;

/**
 * @author Jhoel RN MH
 * jhoelrn@hotmail.com
 */
public class CPersona {
    
    //ATRIBUTOS
    private String nombre;
    private String direccion;
    private long telefono;
    
    //CONSTRUCTORES
    public CPersona(){
    }

    public CPersona(String nombre, String direccion, long telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    //METODOS
    public void asignarNombre(String nom){
        nombre = nom;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public void asignarDireccion(String dir){
        direccion = dir;
    }
    public String obtenerDireccion(){
        return direccion;
    }
    public void asignarTelefono(long tel){
        telefono = tel;
    }
    public long obtenerTelefono(){
        return telefono;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
