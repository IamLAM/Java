/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *
 * @author Luis Monge
 */
public class Cubo {
    
    int l,a,p;
    
    Cubo(){}
    
    Cubo(int largo,int ancho,int profundidad){
        this.l=largo;
        this.a=ancho;
        this.p=profundidad;
    
    }
    
    int calcularVolumen(){
    
    int resultado=this.l*this.a*this.p;
    return resultado;
    }
    
    
}
