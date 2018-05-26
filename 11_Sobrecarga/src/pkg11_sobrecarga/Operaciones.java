/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_sobrecarga;

/**
 *
 * @author Luis Monge
 */
public class Operaciones {
    
    
   
    public static int resta(int a,int b){
        System.out.println("int resta(int a,int b)=");
        return a-b;
    
    }
    
    public static double resta(double a,double b){
       System.out.println("float resta(float a,float b)=");
    return a-b;
    }
    
    
}
