/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg27_manejogenericos;

/**
 *
 * @author Luis Monge
 */
public class Generica<T> {

    T obj;

    public Generica(T o) {
        this.obj = o;
    }

    public void obtenerTipo() {

        System.out.println("El tipo de T es " + obj.getClass().getName());
        System.out.println("El tipo de T es " + obj.getClass().getSimpleName());
        System.out.println("El tipo de T es " + obj.getClass().getTypeName());
        System.out.println("El tipo de T es " + obj.getClass().getCanonicalName());
    }

}
