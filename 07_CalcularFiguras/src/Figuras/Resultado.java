/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

import java.util.Scanner;

/**
 *
 * @author Luis Monge
 */
public class Resultado {
    
    public static void main(String args[]){
    
       System.out.println("Proporciona el largo del cubo");
       Scanner largo=new Scanner(System.in);
       int l=largo.nextInt();
          System.out.println("Proporciona el ancho del cubo");
       Scanner ancho=new Scanner(System.in);
       int a=ancho.nextInt();
          System.out.println("Proporciona la profundidad del cubo");
       Scanner profundo=new Scanner(System.in);
       int p=profundo.nextInt();
       Cubo figura=new Cubo(l,a,p);
       
       int resultado=figura.calcularVolumen();
    
       System.out.println("El valor obtenido es: "+resultado);
    
    }
}
