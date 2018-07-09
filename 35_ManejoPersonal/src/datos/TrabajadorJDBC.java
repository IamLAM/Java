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
    private final String SQL_INSERT = "INSERT INTO personal (nombre, apellido,ciudad) VALUES (?,?,?)";
    private final String SQL_UPDATE = "UPDATE personal SET nombre=?,apellido=?,ciudad=? WHERE id=?";
    private final String SQL_DELETE = "DELETE personal WHERE id=?";
    private final String SQL_SELECT = "SELECT nombre,apellido,ciudad FROM personal ORDER BY nombre";

    public int insert(String n, String a, String c) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int rows = 0, index;
        try {
            index = 1;
            con = Conexion.getConnection();
            ps = con.prepareStatement(SQL_INSERT);
            ps.setString(index++, n);
            ps.setString(index++, a);
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

    public int update(int id, String n, String a, String c) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int rows = 0, index;
        try {
            index = 1;
            con = Conexion.getConnection();
            ps = con.prepareStatement(SQL_UPDATE);
            ps.setString(index++, n);
            ps.setString(index++, a);
            ps.setString(index++, c);
            ps.setInt(index, id);
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

    public int delete(int id) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int rows = 0, index;
        try {
            index = 1;
            con = Conexion.getConnection();
            ps = con.prepareStatement(SQL_DELETE);
            ps.setInt(1, id);
            System.out.println("Query Execution!!" + SQL_DELETE);
            rows = ps.executeUpdate();
            System.out.println("Registers borrados!!" + rows);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {

            Conexion.close(ps);
            Conexion.close(con);
        }
        return rows;

    }

    public List<Trabajador> select() {

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Trabajador trabajador = null;
        List<Trabajador> trabajadores = new ArrayList<Trabajador>();

        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String n = rs.getString(2);
                String d = rs.getString(3);
                String c = rs.getString(4);
                trabajador = new Trabajador();
                trabajador.setNombre(n);
                trabajador.setApellido(d);
                trabajador.setIdTrabajador(id);
                trabajadores.add(trabajador);

            }

        } catch (SQLException sqle) {
            sqle.printStackTrace();

        } finally {

            Conexion.close(ps);
            Conexion.close(con);
            Conexion.close(rs);
        }
        return trabajadores;
    }

}
