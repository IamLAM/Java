/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IamLAM.com.peliculas.domain;

/**
 *
 * @author Luis Monge
 */
public class Pelicula {

    String nombre;

    public Pelicula(String n) {

        this.nombre = n;

    }

    public void setNombre(String n) {

        this.nombre = n;

    }

    public String getNombre() {

        return this.nombre;

    }

    @Override
    public String toString() {
        return "Nombre Pelicula: " + this.nombre;

    }

}
