/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Luis Monge
 */
public class ImplementacionOracle implements AccesoDatos {
    
    @Override
    public void insertar(){
    
    System.out.println("Insertando valores desde Oracle");
    }
    
    @Override
        public void listar(){
     System.out.println("Mostrando valores desde Oracle");
    }
    
}
