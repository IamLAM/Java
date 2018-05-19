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
    labrador.mostrar();
    labrador.edad=5;
    labrador.sexo="hembra";
    labrador.tipo="Labrador blanco";
    labrador.mostrar();
    labrador.ladrar();
    labrador.cambiarSexo();
      labrador.mostrar();
    
    
    }
}
