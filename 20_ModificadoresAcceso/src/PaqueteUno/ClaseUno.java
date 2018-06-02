/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteUno;

/**
 *
 * @author Luis Monge
 */
public class ClaseUno {

    public int vPublica = 10;
    protected int vProtegida = 20;
    int vPaquete = 40;
    private int vPrivada = 30;

    public ClaseUno() {
    }

    public ClaseUno(int i) {

        System.out.println("Constructur Publico: " + i);
    }

    protected ClaseUno(int i, int j) {

        System.out.println("Constructur Protegido: ");

    }

    private ClaseUno(int i, int j, int k) {

        System.out.println("Constructur Privado: ");

    }

    ClaseUno(int i, int j, int k, int l) {

        System.out.println("Constructur Paquete: ");

    }

    public int desplegarPublico() {

        return 1;

    }

    protected int desplegarProtegido() {

        return 2;
    }

    private int desplegarPrivado() {

        return 3;

    }

    int desplegarPaquete() {

        return 4;
    }

}
