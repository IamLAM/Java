/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IamLAM.com;

/**
 *
 * @author Luis Monge
 */
public class Orden {

    private final int idOrden;
    private final Producto productos[];
    private static int co;
    private int cp;
    private static final int mp = 5;

    public Orden() {
        this.idOrden = ++co;
        productos = new Producto[mp];

    }

    public void agregarProducto(Producto p) {

        if (cp < mp) {
            productos[cp++] = p;
        } else {

            System.out.println("Ha superado el limite de compra " + mp);
        }
    }

    public double calcularTotal() {

        double t = 0;
        for (int i = 0; i < cp; i++) {
            t += productos[i].getPrecio();
        }

        return t;

    }

    public void mostrarOrden() {

        System.out.println("#orden: " + idOrden);
        System.out.println("Costo total: " + calcularTotal());
        System.out.println("Productos consumidos: ");
        for (int i = 0; i < cp; i++) {

            System.out.println(productos[i]);
        }
    }

}
