/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg30_entradadatos;

import java.io.IOException;
import java.util.*;

/**
 *
 * @author Luis Monge
 */
public class EntradaDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String c;
        Scanner v = new Scanner(System.in);
        //Scanner no hereda de ninguna clase, funciona igual a InputStreamReader y BufferedStream
        System.out.println("Introduce un dato: ");
        c = v.nextLine();
        while (c != null) {
            System.out.println("Dato introducido: " + c);
            c = v.nextLine();
        }

    }

}
