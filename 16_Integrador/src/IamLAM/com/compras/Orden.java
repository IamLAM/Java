/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IamLAM.com.compras;

/**
 *
 * @author Luis Monge
 */
public class Orden {

    private final int idOrden;
    private final Computadora computadoras[];
    private static int co;
    private int com;
    private static final int MAXCOM = 5;

    public Orden() {

        this.idOrden = ++co;
        computadoras = new Computadora[MAXCOM];
    }

    public void agregarComputadora(Computadora c) {

        if (co < MAXCOM) {
            computadoras[com++] = c;
        } else {

            System.out.println("No se pueden realizar mas compras limite " + MAXCOM);
        }

    }

    public void mostrarOrden() {
        System.out.println("Orden #:" + idOrden);
        System.out.println("Computadoras de la orden #" + idOrden + ":");
        for (int i = 0; i < com; i++) {
            System.out.println(computadoras[i]);
        }
    }

}
