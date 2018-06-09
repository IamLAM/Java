/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg27_manejogenericos;

/**
 *
 * @author Luis Monge
 */
public class ManejoGenericos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Generica<Integer> ob=new Generica<Integer>(10);
    ob.obtenerTipo();
    
    Generica<String> obs=new Generica<>("Buenos dias");
    obs.obtenerTipo();
    //marcara error si utilizamos int, double
    
    }
    
}
