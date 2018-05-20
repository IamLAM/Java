/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08_valref;

/**
 *
 * @author Luis Monge
 */
public class Animal {
    
    String nombre;
    String edad;
    
    
    public void asignarNombre(String nombre){
    
        this.nombre=nombre;
    
    }
    
        public void cambiarNombre(String nombre){
    
        this.nombre=nombre;
    
    }
        public String obtenerNombre(){
    
        return this.nombre;
    
    }
}
