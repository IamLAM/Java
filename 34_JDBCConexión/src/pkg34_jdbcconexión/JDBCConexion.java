/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg34_jdbcconexión;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Monge
 */
public class JDBCConexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //realizamos conexion mediante el controlador
        String ruta = "jdbc:mysql://localhost:3306/bancos?useSSL=false";
        try {
            Class.forName("com.mysql.jdbc.Driver"); // validamos si existe en cache (solo versiones anteriores:opcional)
            Connection conexion = (Connection) DriverManager.getConnection(ruta, "root", "");

            Statement instruccion = conexion.createStatement();

            String sql = "SELECT * FROM cliente";
            ResultSet result = instruccion.executeQuery(sql);
            while (result.next()) {
                System.out.print("Nombre:" + result.getString(1));
                System.out.print(" Direccion:" + result.getString(2));
                System.out.println(" Ciudad:" + result.getString(3));
            }

            result.close();
            instruccion.close();
            conexion.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }

}
