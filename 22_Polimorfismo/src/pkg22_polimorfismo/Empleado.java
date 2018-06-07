/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg22_polimorfismo;

/**
 *
 * @author Luis Monge
 */
public class Empleado {

    protected String nombre;
    protected double sueldo;

    protected Empleado(String nombre, double sueldo) {

        this.nombre = nombre;
        this.sueldo = sueldo;

    }

    public String obtenerDetalles() {
        return "Nombre" + nombre + "sueldo: " + sueldo;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public double getSueldo() {

        return sueldo;
    }

    public void setSueldo() {

        this.sueldo = sueldo;
    }

}
