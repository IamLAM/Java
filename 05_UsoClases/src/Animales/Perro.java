/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animales;

/**
 *
 * @author Luis Monge
 */
public class Perro {
    
    String tipo;
    int edad;
    String sexo;
    
    public void mostrar(){
    
    System.out.println("El tipo de perro es "+this.tipo+" tiene la edad de "+this.edad+" el sexo del perro es "+this.sexo);
    
    }
    
    
    public void ladrar(){
    System.out.println("Wofff wooofff");
    }
    
    public String cambiarSexo(){
    
        
        return this.sexo="Macho";
    }
    
}
