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
public class Medico extends Empleado {

    private String area;

    public Medico(String n, double s, String a) {
        super(n, s);
        this.area = a;
    }

    public String obtenerDetalles() {

        return "Nombre: " + nombre + "sueldo: " + sueldo + "Area: " + area;

    }

    public String getArea() {

        return area;
    }

    public void setArea(String a) {
        this.area = a;
    }
}
