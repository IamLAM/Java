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
public class MuestraPerro {
    public static void main(String args[]){
    System.out.println("Muestra los valores iniciales");
    Perro labrador=new Perro();
    System.out.println(labrador.ladrar());
    
    Perro labrador2=new Perro("Labrador",10,"Hembra");
    labrador2.mostrar();
    System.out.println(labrador2.ladrar());    
    }
}
