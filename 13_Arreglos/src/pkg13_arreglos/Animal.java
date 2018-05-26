/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13_arreglos;

/**
 *
 * @author Luis Monge
 */
public class Animal {
    
    private String nombre;
    
    public Animal(String n){
    
    this.nombre=n;
    }
    
    public String getNombre(){
    
    return nombre;
    }
    
    public void setNombre(String n){
    
    this.nombre=n;
    }
    
    @Override
    public String toString(){
    
        return "[Animal]="+"nombre: "+getNombre();
    
    }
}
