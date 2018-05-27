/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16_integrador;

import IamLAM.com.compras.*;

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

        Monitor m = new Monitor("Dell", 15);
        Teclado t = new Teclado("PS/2", "Dell");
        Raton r = new Raton("PS/2", "Dell");

        Computadora c = new Computadora("Dell", m, t, r);
        
        Orden or=new Orden();
        or.agregarComputadora(c);
        or.mostrarOrden();
        
        
          Monitor m2 = new Monitor("HP", 15);
        Teclado t2 = new Teclado("USB", "Dell");
        Raton r2 = new Raton("USB", "Dell");

        Computadora ensamblada = new Computadora("Ensamblada", m2, t2, r2);
        Orden or2=new Orden();
        or2.agregarComputadora(ensamblada);
        or2.mostrarOrden();

    }

}
