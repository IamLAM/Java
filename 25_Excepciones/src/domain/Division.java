/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Luis Monge
 */
public class Division {
    
    private int numerador;
    private int denominador;
    
    public Division(int n,int d) throws OperationException{
    
        //creando una excepcion personalizada
        if(d==0){
        throw new OperationException("Denominador igual a cero");
        }
        
        this.numerador=n;
        this.denominador=d;
    
    }
    
    public void visualizarOperacion(){
    
    System.out.println("Resultado de la división "+numerador/denominador);
    
    }
    
    
    
}
