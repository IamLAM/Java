/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg32_manejoarchivos;
import static utileria.Archivos.*;
import java.io.*;
/**
 *
 * @author Luis Monge
 */
public class ManejoArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //creamos directorio 
        Boolean crear;
        String PATH="C:\\Users\\Usuario\\Desktop\\prueba";
        String NARCHIVO=PATH+"\\demo.txt";
        crear = new File(PATH).mkdirs();
        
        crearArchivo(NARCHIVO);
        escribirArchivo(NARCHIVO);
        leerArchivo(NARCHIVO);
        adjuntarArchivo(NARCHIVO);
        leerArchivo(NARCHIVO);
    }
    
}
