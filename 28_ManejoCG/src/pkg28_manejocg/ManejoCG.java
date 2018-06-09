/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg28_manejocg;

import java.util.*;

/**
 *
 * @author Luis Monge
 */
public class ManejoCG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<String> LM = new ArrayList<>();
        LM.add("1");
        LM.add("1");
        LM.add("1");
        LM.add("2");
        LM.add("3");

        desplegar(LM);

        Set<String> MS = new HashSet<>();
        MS.add("1");
        MS.add("10");
        MS.add("10");
        MS.add("100");
        MS.add("1000");

        desplegar(MS);

        Map<String, String> MM = new HashMap<>();

        MM.put("1", "P");
        MM.put("2", "Pi");
        MM.put("3", "Pil");
        MM.put("4", "Pila");
        desplegar(MM.keySet());
        desplegar(MM.values());

    }

    public static void desplegar(Collection<String> c) {

        for (String elemento : c) {

            System.out.println("Elemento" + elemento);
        }

        System.out.println("-----------------------------");
    }
}
