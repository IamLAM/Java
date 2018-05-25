/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_herencia;

/**
 *
 * @author Luis Monge
 */
public class Animal {

    public String nombre;
    private int edad;
    private String dueno;
    private boolean adoptado;

    public Animal() {
    }

    public Animal(String n) {
        this.nombre = n;
    }

    public Animal(String n, int e, String d, boolean ad) {

        this.nombre = n;
        this.edad = e;
        this.dueno = d;
        this.adoptado = ad;

    }

    public String getNombre() {

        return this.nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int e) {

        this.edad = e;
    }

    public String getDueno() {

        return this.dueno;
    }

    public void setDueno(String d) {

        this.dueno = d;
    }

    public boolean getAdoptado() {

        return this.adoptado;
    }

    public void setAdoptado(boolean ad) {

        this.adoptado = ad;
    }

    @Override
    public String toString() {

        return "[Animal]"+"nombre: " + nombre + " edad: " + edad + " dueno: " + dueno + " adoptado: " + adoptado;
    }
}
