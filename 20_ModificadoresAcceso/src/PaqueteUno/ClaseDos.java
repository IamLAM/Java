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
public class ClaseDos {

    public ClaseDos() {
        System.out.println("Acceso ClaseDos");

        new ClaseUno(100);
        new ClaseUno(100, 200);
        //new ClaseUno(100,200,300);
        new ClaseUno(100, 200, 300, 400);
        System.out.println("Acceso restringido al constructor private");
    }

    public void desplegarClaseDos() {

        ClaseUno c = new ClaseUno();

        System.out.println("Acceso a variables ClaseUno");
        System.out.println("Variable publica " + c.vPublica);
        System.out.println("Variable paquete " + c.vPaquete);
        System.out.println("Variable protegida" + c.vProtegida);

        System.out.println("No se tiene acceso a variable privada desde el propio paquete");

        System.out.println("Acceso a metodos ClaseUno");
        System.out.println("Metodo publico " + c.desplegarPublico());
        System.out.println("Metodo protegido " + c.desplegarProtegido());
        System.out.println("Metodo paquete " + c.desplegarPaquete());
        
          System.out.println("Metodo privado no es accesible desde el propio paquete");
    }

}
