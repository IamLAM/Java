/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15_integrador;
import IamLAM.com.Orden;
import IamLAM.com.Producto;
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
        
        Producto p=new Producto("Tostitos",15);
        Producto p2=new Producto("Cacahuates",5);
        Producto p3=new Producto("Chile en polvo",10);
    
    
    Orden or=new Orden();
    or.agregarProducto(p);
     or.agregarProducto(p2);
     or.agregarProducto(p3);
     or.mostrarOrden();
     
     
    }
    
}
