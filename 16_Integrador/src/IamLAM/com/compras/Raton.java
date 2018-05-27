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
public class Raton extends DispositivosEntrada {

    private final int idRaton;
    private static int cr;

    public Raton(String tp, String m) {
        super(tp, m);
        idRaton= ++cr;

    }
    
    
   @Override
    
    public String toString(){
    
    return "[Dispositivo Entrada:Raton]="+idRaton+" "+cr+super.toString()+"\n";
    }
    
    
}
