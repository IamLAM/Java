/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg25_excepciones;

import domain.*;

/**
 *
 * @author Luis Monge
 */
public class ManejoExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            Division d = new Division(5, 0);
            d.visualizarOperacion();
        }
        catch(OperationException oe){
        
        System.out.println("Hubo un error");
        oe.printStackTrace();
        
        }

    }

}
