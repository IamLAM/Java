/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09_encapsular;

/**
 *
 * @author Luis Monge
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Animal perro = new Animal("Ruffles", 5, "El profesor Jirafales", true);

        System.out.println("El resultado del primer objeto es:" + perro.getNombre());
        System.out.println("El resultado del primer objeto es:" + perro.toString());

        Animal perico = new Animal("Doritos", 2, "Juan Camaney", false);

        System.out.println("El resultado del segundo objeto es:" + perico.getNombre());
        System.out.println("El resultado del segundo objeto es:" + perico.toString());

        Animal perro2 = new Animal();

        perro2 = perro;

        perro.setAdoptado(false);

        //perro=null;
        //como perro2 y perro apuntan al mismo objeto ambos tienen el mismo valor 
        System.out.println("El resultado del primer objeto es:" + perro2.getNombre());
        System.out.println("El resultado del primer objeto es:" + perro2);

        System.out.println("El resultado del primer objeto es:" + perro.getNombre());
        System.out.println("El resultado del primer objeto es:" + perro);

    }

}
