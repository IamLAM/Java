/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg22_polimorfismo;

/**
 *
 * @author Luis Monge
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empleado em=new Empleado("Luigi",3000);
        
       System.out.println("Resultado"+em.obtenerDetalles());
       
       Gerente g=new Gerente("Mario",5000,"Tuberias");
        
        System.out.println("Resultado"+g.obtenerDetalles());
    }
    
}
