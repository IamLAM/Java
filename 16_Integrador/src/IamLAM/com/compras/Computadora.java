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
public class Computadora {

    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int cc;

    private Computadora() {

        idComputadora = ++cc;

    }

    public Computadora(String n, Monitor m, Teclado t, Raton r) {
        this();
        this.nombre = n;
        this.teclado = t;
        this.raton = r;
        this.monitor = m;

    }

    public String getNombre() {

        return nombre;
    }

    public Teclado getTeclado() {

        return teclado;
    }

    public Raton getRaton() {

        return raton;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor m) {

        this.monitor = m;

    }

    public void setRaton(Raton r) {

        this.raton = r;

    }

    public void setTeclado(Teclado t) {

        this.teclado = t;
    }

    public void setNombre(String n) {

        this.nombre = n;
    }
    
    
    @Override
    
    public String toString(){
    
    return "[Computadora]="+"idComputadora:"+idComputadora+" "+nombre+" "+monitor+" "+teclado+" "+raton;
    
    }
    
    
}
