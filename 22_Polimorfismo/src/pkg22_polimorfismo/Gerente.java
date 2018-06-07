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
public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {

        super(nombre, sueldo);

        this.departamento = departamento;
    }
 //Aplicamos polimorfismo
    public String obtenerDetalles() {

        return super.obtenerDetalles() + "departamento :" + departamento;
    }

    public String getDepartamento() {

        return departamento;
    }

    public void setDepartamento(String departamento) {

        this.departamento = departamento;

    }
}
