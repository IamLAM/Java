/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import domain.Trabajador;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Luis Monge
 */
public class TrabajadorJDBC {

    //? valores a sustituir
    private final String SQL_INSERT = "INSERT INTO cliente (nombre, direccion,ciudad) VALUES (?,?,?)";
    private final String SQL_UPDATE = "UPDATE cliente SET nombre=?,direccion=? WHERE nombre=?";
    private final String SQL_DELETE = "DELETE cliente WHERE nombre=?";
    private final String SQL_SELECT = "SELECT nombre,direccion,ciudad FROM cliente ORDER BY nombre";

    public int insert(String n, String d, String c) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int rows = 0, index;
        try {
            index = 1;
            con = Conexion.getConnection();
            ps = con.prepareStatement(SQL_INSERT);
            ps.setString(index++, n);
            ps.setString(index++, d);
            ps.setString(index++, c);
            System.out.println("Query Execution!!" + SQL_INSERT);
            rows = ps.executeUpdate();
            System.out.println("Registers!!" + rows);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {

            Conexion.close(ps);
            Conexion.close(con);
        }
        return rows;
    }
    
    public int update(String n,String d,String c){
     Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int rows = 0, index;
        try {
            index = 1;
            con = Conexion.getConnection();
            ps = con.prepareStatement(SQL_UPDATE);
            ps.setString(index++, n);
            ps.setString(index++, d);
            ps.setString(index++, c);
            System.out.println("Query Execution!!" + SQL_UPDATE);
            rows = ps.executeUpdate();
            System.out.println("Registers actualizados!!" + rows);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {

            Conexion.close(ps);
            Conexion.close(con);
        }
        return rows;
    
    }

}
