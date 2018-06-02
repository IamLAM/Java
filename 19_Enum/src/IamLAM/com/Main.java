/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IamLAM.com;

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

        System.out.println(Estados.BC);

        desplegar(Estados.SON);

    }

    public static void desplegar(Estados edo) {

        switch (edo) {

            case BC:
                System.out.println("Es Baja California");
                break;

            case BCS:
                System.out.println("Es Baja California Sur");
                break;

            default:
                System.out.println("No se encuentra registrado el Estado");
                break;

        }

    }

}
