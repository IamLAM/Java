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
public class Producto {

    private int idProducto;
    private String nombre;
    private double precio;
    private static int cp;

    private Producto() {
        this.idProducto = ++cp;
    }

    public Producto(String n, double p) {
        this();
        this.precio = p;
        this.nombre = n;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public double getPrecio() {

        return precio;
    }

    public void getPrecio(double p) {

        this.precio = p;
    }

    @Override
    public String toString() {

        return "[Producto]:" + idProducto + " " + nombre + " " + precio;
    }

}
