/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utileria;

import java.io.*;

/**
 *
 * @author Luis Monge
 */
public class Archivos {

    public static void crearArchivo(String na) {

        File archivo = new File(na);

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("El archivo se ha creado correctamente");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

    public static void escribirArchivo(String na) {

        File archivo = new File(na);

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            String insertar = "Esta informacion se almacenra en el archivo";
            salida.println(insertar);
            salida.println("--------");
            salida.close();
        } catch (IOException ioe) {

            ioe.printStackTrace();

        }
    }

    public static void leerArchivo(String na) {
        String lee;
        File archivo = new File(na);
        try {
            BufferedReader leer = new BufferedReader(new FileReader(archivo));
            lee = leer.readLine();

            while (lee != null) {
                System.out.println("contenido: " + lee);
                lee = leer.readLine();
            }
            leer.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();

        }

    }

    public static void adjuntarArchivo(String na) {
        File archivo = new File(na);
        String insertar;
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            insertar = "Esta informacion se almacenra en el archivo";
            salida.println(insertar);
            salida.println("--------");
            salida.close();

        } catch (IOException ioe) {

            ioe.printStackTrace();
        }

    }

}
