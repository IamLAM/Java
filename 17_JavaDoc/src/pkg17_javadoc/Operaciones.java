/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17_javadoc;

/**
 *Ejercicio basico para comprobar el funcionamiento de javadoc
 * @author IamLAM
 * @version 1.0
 */
public class Operaciones {
    
    /**
     * 
     * Variables para  base para realizar operaciones
     */
    int a;
    int b;
    
    
    Operaciones(){}
    
    /**
     * 
     * @param a
     * @param b 
     */
    Operaciones(int a,int b){
    
    this.a=a;
    this.b=b;
    }
    
    /**
     * Este metodo ayudara a realizar una sumatoria de dos valores
     * @param a
     * @param b
     * @return regresa un valor tipo entero de suma
     */
    public int sumar(int a , int b){
    
        return a+b;
    
    }
    /**
     * Este metodo ayudara a realizar una resta de dos valores
     * @param a
     * @param b
     * @return regresa la resta de un valor
     */
    
        public int restar(int a , int b){
    
        return a-b;
    
    }
}
