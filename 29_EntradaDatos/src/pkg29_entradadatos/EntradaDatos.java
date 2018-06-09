/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg29_entradadatos;

import java.io.*;

/**
 *
 * @author Luis Monge
 */
public class EntradaDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String c;
        InputStreamReader i= new InputStreamReader(System.in);
        //esto me permite leer lineas completas
        BufferedReader BRI=new BufferedReader(i);
        
        try{
        System.out.println("Introduce un dato: ");
        c=BRI.readLine();
        while(c!=null)
        {
        System.out.println("Dato introducido: "+c);
        c=BRI.readLine();
        }
        }
        catch(IOException ioe){
        
        System.out.println("Ocurrio un error, favor de corregirlo");
        ioe.printStackTrace();
        }
        
        
        
        
        
        
        
    }
    
}
