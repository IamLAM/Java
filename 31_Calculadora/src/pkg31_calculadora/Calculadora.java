/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg31_calculadora;

import java.util.*;
import java.io.*;


/**
 *
 * @author Luis Monge
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v,v2;
        Operaciones op=new Operaciones();

        Scanner scan = new Scanner(System.in);

        System.out.println("Proporciona un valor");
        v = scan.nextInt();
         System.out.println("Proporciona un valor");
        v2=scan.nextInt();
        op.suma(v, v2);
        
        
        

    }

}
