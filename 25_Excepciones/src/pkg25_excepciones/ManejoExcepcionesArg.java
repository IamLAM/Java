/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg25_excepciones;
import domain.*;
/**
 *
 * @author Luis Monge
 */
public class ManejoExcepcionesArg {
    
    public static void main(String args[]) throws OperationException{
    
    try{
     int op1=Integer.parseInt(args[0]);
    int op2=Integer.parseInt(args[2]);
     Division d=new Division(op1,op2);
     d.visualizarOperacion();
    }
    catch(ArrayIndexOutOfBoundsException aie){
    System.out.println("Ocurrio una excepción");
    System.out.println("Hubo un error al acceder a un espacio fuera de rango");
    aie.printStackTrace();
    }
    catch(NumberFormatException nfe){
     System.out.println("Hubo un error uno de los argumentos no es entero");
     nfe.printStackTrace();
    }
    catch(OperationException oe){
     System.out.println("Hubo una excepción u operación erronea");
     oe.printStackTrace();
    }finally{
     System.out.println("Se ejecutaron las excepciones");
   ;
    }
    
    }
    
}
