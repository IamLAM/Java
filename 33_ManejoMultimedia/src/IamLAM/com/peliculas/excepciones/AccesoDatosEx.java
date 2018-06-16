/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IamLAM.com.peliculas.excepciones;

/**
 *
 * @author Luis Monge
 */
public class AccesoDatosEx extends Exception {
    
    String mensaje;
    
    public AccesoDatosEx(String mensaje){
    
    this.mensaje=mensaje;
    }
    
    
    
}
