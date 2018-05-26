/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13_arreglos;

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
        
        int edades[];
        
        edades=new int[5];
        
        edades[0]=1;
        edades[1]=10;
        edades[3]=100;
        System.out.println("edades[0]= "+edades[0]);
        System.out.println("edades[1]= "+edades[1]);
        System.out.println("edades[2]= "+edades[2]);
        System.out.println("edades[3]= "+edades[3]);
        System.out.println("edades[4]= "+edades[4]);
        
        Animal an[];
        
        an=new Animal[5];
        
        an[0]=new Animal("perro");
        an[1]=new Animal("gato");
        an[2]=new Animal("jirafa");
        
                System.out.println("Animal[0]= "+an[0]);
        System.out.println("Animal[1]= "+an[1]);
        System.out.println("Animal[2]= "+an[2]);
        System.out.println("Animal[3]= "+an[3]);
        System.out.println("Animal[4]= "+an[4]);
        
    }
    
}
