/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_operadores;

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
        System.out.println("Operadores\n");
          System.out.println("========================================\n");
        int a = 1 + 2;
        int b = a * 4;
        int c = b / 2;
        int d = c - a;
        int e = -d;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("x mod 10 = " + a % 2);

        a += 2;
        b -= 4;
        c *= a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        a++;
        System.out.println("a = " + a);
        c = ++a;
        d = b++;
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        boolean res = a < b;
        System.out.println("res = " + res);
        int min = (a < b) ? a : b;
        System.out.println("min = " + min);
        int i, j, k;
        i = j = k = 100; 
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("========================================\n");
        
        
    }
    
}
