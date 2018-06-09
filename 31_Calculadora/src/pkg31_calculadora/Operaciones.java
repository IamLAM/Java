/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg31_calculadora;

/**
 *
 * @author Luis Monge
 */
public class Operaciones {

    private int op;
    private int op2;

    public Operaciones(){
    
    }
    
    public Operaciones(int a, int b) {

        this.op = a;
        this.op2 = b;

    }

    public void suma(int a, int b) {
        
        int res=a+b;
        System.out.println("El resultado de la suma es: " + res);

    }

}
