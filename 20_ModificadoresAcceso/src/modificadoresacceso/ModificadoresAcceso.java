/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificadoresacceso;

/**
 *
 * @author Luis Monge
 */

import PaqueteDos.ClaseCuatro;
import PaqueteDos.ClaseTres;
import PaqueteUno.ClaseDos;

public class ModificadoresAcceso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        System.out.println("Acceso de clase 2 a clase 1 (mismo paquete)");
       ClaseDos d=new ClaseDos();
       d.desplegarClaseDos();
        System.out.println("___________________________________________________________");
        System.out.println("Acceso de clase 3 a clase 1(diferente paquete y herencia)");
        ClaseTres d2=new ClaseTres();
        d2.desplegarClaseTres();
        System.out.println("___________________________________________________________");
        System.out.println("Acceso de clase 4 a clase 1(diferente paquete, no herencia)");
        
        ClaseCuatro d3=new ClaseCuatro();
        d3.desplegarClaseCuatro();
        System.out.println("___________________________________________________________");
    }
    
}
