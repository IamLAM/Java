/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg23_validarinstancias;

/**
 *
 * @author Luis Monge
 */
public class Instancias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        FigurasGeometricas fg;

        fg = new Elipse();

        indicarTipo(fg);

    }

    public static void indicarTipo(FigurasGeometricas fg) {

        if (fg instanceof Triangulo) {
            System.out.println("Es un triangulo");
        }
        if (fg instanceof Rectangulo) {
            System.out.println("Es un rectangulo");
        }
        
        if(fg instanceof Circulo)
             System.out.println("Es un Circulo");
        
        
        if(fg instanceof Elipse)
             System.out.println("Es una elipse");
        
        if(fg instanceof FigurasGeometricas)
         System.out.println("Es una figura geometrica");
        
    }

}
