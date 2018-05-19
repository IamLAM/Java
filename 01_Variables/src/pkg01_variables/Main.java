/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_variables;

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
        
        boolean boo1;
        boolean boo2 = false;
        
        boo1 = true;
        //Declaración e inicialización

        System.out.println("Valor bool1:" + boo1);
        System.out.println("Valor bool2:" + boo2);
        System.out.println("");
    
        //Variables byte
        byte b1 = 10;
        //Literal en hexadecimal
        byte b2 = 0xa;
        System.out.println("Valor byte1:" + b1);
        System.out.println("Valor byte2:" + b2);
        System.out.println("");
        
        //Variables short
        short s1 = 2;
        System.out.println("Valor char1:" + s1);
        System.out.println("");
        

        char ch1 = 65, ch2 = 'A';
        System.out.println("Valor char1:" + ch1);
        System.out.println("Valor char2:" + ch2);
        System.out.println("");
        
        //Variable enteras
        int decimal = 100;
        int octal = 0144;
        int hexa=0xFAA;
        System.out.println("Valor int decimal:" + decimal);
        System.out.println("Valor int octal:" + octal);
        System.out.println("Valor int hexadecimal:" + hexa);
        System.out.println();
        
        //Variables long
        long long1 = 10, long2 = 20L;
        System.out.println("Valor long1:" + long1);
        System.out.println("Valor long2:" + long2);
        System.out.println();
        
        //Variables float
        float f1 = 15, f2 = 22.3F;
        System.out.println("Valor float1:" + f1);
        System.out.println("Valor float2:" + f2);
        System.out.println();

        //Variables double
        double d1 = 11.0, d2 = 30.15D;
        System.out.println("Valor double1:" + d1);
        System.out.println("Valor double2:" + d2);
        System.out.println();
        
        //Variables string
        
        String h="Hola, bienvenidos al curso";
        System.out.println(h);
        String a=" mis entusiastas alumnos";
        
        System.out.println("Concatenar variables:" + h + a);
    
    }
    
}
