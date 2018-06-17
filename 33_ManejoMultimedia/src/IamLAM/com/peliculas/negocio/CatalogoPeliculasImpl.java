/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IamLAM.com.peliculas.negocio;
import java.util.List;
import IamLAM.com.peliculas.datos.*;
import IamLAM.com.peliculas.domain.*;
import IamLAM.com.peliculas.excepciones.*;
/**
 *
 * @author Luis Monge
 */
public class CatalogoPeliculasImpl {
    private final AccesoDatos datos;

    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }

    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = datos.existe(nombreArchivo);
            datos.escribir(pelicula, nombreArchivo, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
    }

    public void listarPeliculas(String nombreArchivo) {
  try {
            List<Pelicula> peliculas = datos.listar(nombreArchivo);
            for (Pelicula pelicula : peliculas) {
                System.out.println("Pelicula:" + pelicula);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
    }

    public void buscarPelicula(String nombreArchivo, String buscar) {
        String resultado = null;
        try {
            resultado = datos.buscar(buscar, nombreArchivo);
        } catch (LecturaDatosEx ex) {
            System.out.println("Error al buscar la pelicula");
            ex.printStackTrace();
        }
        System.out.println("Resultado busqueda:" + resultado);
    }

    public void iniciarArchivo(String nombreArchivo) {
        try {
            if (datos.existe(nombreArchivo)) {
                datos.borrar(nombreArchivo);
                datos.crear(nombreArchivo);
            } else {
                //creamos archivo
                datos.crear(nombreArchivo);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
    }
}