/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21_sobreescritura;

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
        
        Empleado e1=new Empleado("Pilar",15000);
        Medico m1= new Medico("Lizbeth",16000,"Cuidados intensivos");
        /*Obtener detalles es un metodo que se sobreescribe, mismo nombre, mismo modificador o mas abierto y mismo tipo de retorno*/
        System.out.println(e1.obtenerDetalles());
        
        System.out.println(m1.obtenerDetalles());
    }
    
}
