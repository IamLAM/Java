/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg35_manejopersonal;
import datos.TrabajadorJDBC;
import domain.Trabajador;
import java.util.List;

/**
 *
 * @author Luis Monge
 */
public class ManejoPersonal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TrabajadorJDBC trabajador=new TrabajadorJDBC();
        trabajador.insert("Pilar","Sanchez","Tabasco");
        
        
    }
    
}
