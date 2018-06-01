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
        
        
        desplegar(33,5,6,8,9,7,9);
       
        
        
    }
    
    
    public static void desplegar(int ... n){
    //usando un foreach
     for(int num : n){
     System.out.println(num);
    
     }
       System.out.println("Classica mode");
     //forma clasica
     for(int i=0;i<n.length;i++)
         System.out.println(n[i]);
     
  
    
    }
    
}
