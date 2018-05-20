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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /*Enviamos valores por parametro para identificar
        zonas de valor de una variable
        */
        int a=100;
        imprimirValor(a);
        modificarValor(a);
        imprimirValor(a);
        
        
        /*Modificación por referencia*/
        
        Animal gato=new Animal();
        gato.asignarNombre("Ruffles");
        imprimirNombre(gato);
        modificarNombre(gato);
        imprimirNombre(gato);
        
    }
    
    
 public static void modificarNombre(Animal n){
  n.cambiarNombre("Zeus");
  
 }   
 public static void imprimirNombre(Animal n){
 System.out.println("El valor resultante es..." +n.obtenerNombre());
 }   
    
 public static void modificarValor(int v){
       int a=v;
       System.out.println("El valor dentro de la función es.."+a);
    }
    
    public static void imprimirValor(int v){
    System.out.println("El valor enviado es..."+v);
    }
}
