/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IamLAM.com.peliculas.datos;
import java.util.List;
import IamLAM.com.peliculas.domain.*;
import IamLAM.com.peliculas.excepciones.*;
/**
 *
 * @author Luis Monge
 */
public interface AccesoDatos {
    boolean existe(String nombreArchivo) throws AccesoDatosEx;
    void escribir(Pelicula pelicula,String nombreArchivo,boolean anexar) throws EscrituraDatosEx;
    public String buscar(String nombreArchivo,String buscar) throws LecturaDatosEx;
    public void crear(String nombreArchivo) throws AccesoDatosEx;
    public void borrar(String nombreArchivo) throws AccesoDatosEx;
    
    
}
