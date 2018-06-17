/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg33_manejomultimedia;
import java.util.Scanner;
import IamLAM.com.peliculas.negocio.*;
/**
 *
 * @author Luis Monge
 */
public class ManejoMultimedia {

      private static final Scanner scanner = new Scanner(System.in);
    private static int opcion = -1;
    private static final String nombreArchivo = "C:\\Users\\Usuario\\Desktop\\cursoJAVA\\peliculas.txt";
    private static final CatalogoPeliculasImpl catalogoPeli =  new CatalogoPeliculasImpl();

    public static void main(String[] args) {

        //Mientras la opcion elegida sea 0, preguntamos al usuario
        while (opcion != 0) {
            try {
                System.out.println("Elige opcion:\n1.- Iniciar catalogo peliculas"
                        + "\n2.- Agregar pelicula\n"
                        + "3.- Listar Peliculas\n"
                        + "4.- Buscar Pelicula\n"
                        + "0.- Salir");
                
                opcion = Integer.parseInt(scanner.nextLine());

                //Ejemplo de switch case en Java
                switch (opcion) {
                    case 1:
                        //1. Creamos el objeto que administra el catalogo de personas
                        //La creacion del archivo es opcional, de todas maneras se creara 
                        //al escribir por primera vez en el archivo
                        catalogoPeli.iniciarArchivo(nombreArchivo);
                        break;
                    case 2:
                        //2. agregar informacion archivo
                        System.out.println("Introduce el nombre de una pelicula a agregar:");
                        String nombre = scanner.nextLine();
                        catalogoPeli.agregarPelicula(nombre, nombreArchivo);
                        break;
                    case 3:
                        //3. listar catalogo completo
                        catalogoPeli.listarPeliculas(nombreArchivo);
                        break;
                    case 4:
                        //4. Buscar pelicula
                        System.out.println("Introduce el nombre de una pelicula a buscar:");
                        String buscar = scanner.nextLine();
                        catalogoPeli.buscarPelicula(nombreArchivo, buscar);
                        break;
                    case 0:
                        System.out.println("!Hasta pronto!");
                        break;
                    default:
                        System.out.println("Opcion no reconocida");
                        break;
                }
                System.out.println("\n"); 

            } catch (Exception e) {
                System.out.println("Error!");
            }
        }
    }
    
}
