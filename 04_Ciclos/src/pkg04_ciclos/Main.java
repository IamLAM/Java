/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04_ciclos;

import java.util.Scanner;

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

        int a = 1, b = 100;
  System.out.println("Introduce valor máximo para ciclar");
  Scanner capturado=new Scanner(System.in); 
  b=capturado.nextInt();
  System.out.println("(D0)(WHILE)===============\n");
        do {

            System.out.println("El valor es" + a);
            a++;
        } while (a < b);

        System.out.println("(WHILE)===============\n");
        a = 1;
        while (a < b) {
            System.out.println("El valor es" + a);
            a++;
        }
        System.out.println("(FOR)===============\n");
        for (a = 1; a < b; a++) {

            System.out.println("El valor es" + a);

        }
    }
}
