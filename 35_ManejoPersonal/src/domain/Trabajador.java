/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Luis Monge
 */
public class Trabajador {
    
    private int id_trabajador;
    private String nombre;
    private String apellido;
    
    
    public int getIdTrabajador(){
    
    return this.id_trabajador;
    
    }
    
    public String getNombre(){
    return this.nombre;
    }
    
    public String getApellido(){
    
    return this.apellido;
    }
    
    
    public void setIdTrabajador(int id){
    
    this.id_trabajador=id;
    
    }
            
    
    public void setNombre(String n){
    this.nombre=n;
    }
    
    public void setApellido(String a){
    
    this.apellido=a;
    }
    
    
    @Override
    public String toString(){
    
    return "[Trabajador]="+id_trabajador+"/"+nombre+"/"+apellido;
    }
    
}
