/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg24_interfaces;

import datos.*;

/**
 *
 * @author Luis Monge
 */
public class ManejoInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        AccesoDatos datos = new ImplementacionMySQL();
        ejecutarDatos(datos, "listar");
        
        AccesoDatos datos2=new ImplementacionOracle();
        ejecutarDatos(datos2,"insertar");

    }

    private static void ejecutarDatos(AccesoDatos d, String f) {

        if ("listar".equals(f)) {
            d.listar();
        } else if ("insertar".equals(f)) {
            d.insertar();
        }

    }

}
