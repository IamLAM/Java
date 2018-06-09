/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg26_manejocolecciones;

import java.util.*;

/**
 *
 * @author Luis Monge
 */
public class ManejoColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List ML = new ArrayList();
        ML.add("1");
        ML.add("2");
        ML.add("3");
        ML.add("4");
        ML.add("5");
        ML.add("5");// tomara en cuenta apesar de ser repetido
        imprimir(ML);

        Set MS = new HashSet();
        MS.add("00");
        MS.add("01");
        MS.add("02");
        MS.add("02");// este elemento no lo tomara en cuenta por ser repetido
        MS.add("03");
        MS.add("04");
        

        MS.add("00"); // este elemento no lo tomara en cuenta por ser repetido

        imprimir(MS);

        Map MM = new HashMap();
        MM.put("1", "Felipe");
        MM.put("2", "Felip");
        MM.put("3", "Jeli");
        MM.put("3", "Feli");//se queda con el ultimo valor repetido
        MM.put("4", "Fel");
        imprimir(MM.keySet());
        imprimir(MM.values());

    }

    private static void imprimir(Collection c) {

        for (Object elemento : c) {
            System.out.println(elemento + "");
        }
         System.out.println("------------------------\n");

    }

}
