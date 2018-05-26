/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14_matrices;

import IamLAM.com.Animal;

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

        
        /*matrices de numeros*/
        int[][] numeros;
        int numeros2[][] = {{2, 2}, {5, 6}};
        numeros = new int[2][2];
        numeros[0][0] = 6;
        numeros[0][1] = 5;
        numeros[1][0] = 3;
        numeros[1][1] = 8;

        System.out.println(" numeros[0][0]=" + numeros[0][0]);
        System.out.println(" numeros[0][1]=" + numeros[0][1]);
        System.out.println(" numeros[1][0]=" + numeros[1][0]);
        System.out.println(" numeros[1][1]=" + numeros[1][1]);

        System.out.println(" Tamaño matriz numeros(r)=" + numeros.length);
        System.out.println(" Tamaño matriz numeros(c)=" + numeros[0].length);

        
        
        /*Objetos*/
        Animal zoo[][];

        zoo = new Animal[3][3];

        zoo[0][0] = new Animal("Perro");
        zoo[0][1] = new Animal("Gato");
        zoo[0][2] = new Animal("Perico");

        zoo[1][0] = new Animal("Puerco");
        zoo[1][1] = new Animal("Chimpance");
        zoo[1][2] = new Animal("Caballo");

        zoo[2][0] = new Animal("Hipopotamo");
        zoo[2][1] = new Animal("Tigre");
        zoo[2][2] = new Animal("Iguana");

        for (int i = 0; i < zoo.length; i++) {

            for (int j = 0; j < zoo[i].length; j++) {
                System.out.println("[" + zoo[i][j] + "]");
            }
        }

        /*matrices de cadenas*/
             String zoo2[][]={{"perro","gato","perico"},{"puerco","chimance","caballo"},{"hipopotamo","tigre","iguana"}};

     

   

        for (int i = 0; i < zoo2.length; i++) {

            for (int j = 0; j < zoo2[i].length; j++) {
                System.out.println("[" + zoo2[i][j] + "]\r");
            }
        }

        
        
        
    }

}
