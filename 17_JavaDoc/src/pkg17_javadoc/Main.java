/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17_javadoc;

/**
 * Ejercicio basico para comprobar el funcionamiento de javadoc
 *
 * @author IamLAM
 * @version 1.0
 */
public class Main {

    /**
     * Función principal para ejecutar la clase de operaciones
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Operaciones ops = new Operaciones();
        Operaciones opr = new Operaciones();

        System.out.println(ops.sumar(5, 4));
        System.out.println(ops.restar(5, 4));
    }

}
