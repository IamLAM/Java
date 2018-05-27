/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IamLAM.com.compras;

/**
 *
 * @author Luis Monge
 */
public class Teclado extends DispositivosEntrada {
    private final int idTeclado;
    private static int ct;
    
    public Teclado(String tp,String n)
    {
    super(tp,n);
    idTeclado=++ct;
    
    }
            
              public String toString(){
    
    return "[Dispositivo Entrada:Teclado]="+idTeclado+" "+ct+super.toString()+"\n";
    }
}
