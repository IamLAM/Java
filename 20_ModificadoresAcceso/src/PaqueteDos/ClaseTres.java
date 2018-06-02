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
public class ClaseTres extends ClaseUno{
    
    public ClaseTres(){
    
    //Acceso al constructor protegido
    super(100,200);
    //Acceso al constructor package
    //super(100,200,300,400);
    //Acceso publico
   // super(100);
    //Acceso privado
    //super(100,200,300);
    }
    
    public void desplegarClaseTres(){
    
      ClaseUno c = new ClaseUno();

        System.out.println("Acceso a variables ClaseUno");
        System.out.println("Variable publica " + c.vPublica);
        System.out.println("Variable protegida " + vProtegida);
        System.out.println("Variable default no tiene acceso en herencias");
         System.out.println("Variable private no tiene acceso en herencias");

     
        System.out.println("Acceso a metodos ClaseUno en Clase Heredada (Tres)");
        System.out.println("Metodo publico " + c.desplegarPublico());
        System.out.println("Metodo protegido " + desplegarProtegido());
         System.out.println("Metodo privado y package no es accesible en herencias");
    
    
    }
    
}
