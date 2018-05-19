/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03_sentenciascontrol;



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
        
        int a=5,b=6,c=7;
        
        if(a==b)
        { System.out.println("Las variables son iguales");
        }else
        {
        System.out.println("Las variables son diferentes");
        
    }
        
        System.out.println("================");
        
        switch(a){
        
            case 1:
                System.out.println("El valor es 1");
        
                break;
            case 3:
                System.out.println("El valor es 3");
                break;
            case 5:
                System.out.println("El valor es 5");
                break;
    }
    
}
}