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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Terrestre an1 = new Terrestre("Pato", 2, "Peces");
        System.out.println("El animal es [" + an1 + "]");

        Terrestre an2 = new Terrestre("Leon", 4, "Carne");
        an2.setEdad(5);
        an2.setAdoptado(true);
        an2.setDueno("Zoo SD");
        System.out.println("El animal es [" + an2 + "]");

        Marino an3 = new Marino(new java.util.Date());
        System.out.println("El animal es [" + an3 + "]");
        
        an3.setExtremidades(0);
        an3.setEdad(2);
        an3.setNombre("Ballena");
                System.out.println("El animal es [" + an3 + "]");
        
    }

}
