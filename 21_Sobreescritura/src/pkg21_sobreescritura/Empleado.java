/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21_sobreescritura;

/**
 *
 * @author Luis Monge
 */
public class Empleado {

    protected String nombre;

    protected double sueldo;

    protected Empleado(String n, double s) {

        this.nombre = n;
        this.sueldo = s;

    }

    public String obtenerDetalles() {

        return "Nombre: " + nombre + "sueldo: " + sueldo;

    }

    public String getNombre() {

        return nombre;
    }

    public double getSueldo() {

        return sueldo;

    }

    public void setNombre(String n) {

        this.nombre = n;
    }

    public void setSueldo(double s) {

        this.sueldo = s;
    }

}
