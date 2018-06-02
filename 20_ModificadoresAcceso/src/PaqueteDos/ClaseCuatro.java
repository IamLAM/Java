/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteDos;


import PaqueteUno.ClaseUno;
/**
 *
 * @author Luis Monge
 */
public class ClaseCuatro {
    
    
    public ClaseCuatro(){
    
    
    }
    
    
    
    public void desplegarClaseCuatro(){
    
         ClaseUno c = new ClaseUno();

        System.out.println("Acceso a variables ClaseUno");
        System.out.println("Variable publica " + c.vPublica);

        System.out.println("Variable default,private, protected no tiene acceso clases que no pertenezcan al mismo paquete o heredadas");
     

     
        System.out.println("Acceso a metodos ClaseUno en Clase Heredada (Cuatro)");
        System.out.println("Metodo publico " + c.desplegarPublico());
   
        System.out.println("Metodo protegido,privado y package no es accesible desde paquetes que no pertenezcan ni hereden");
    
    }
    
}
