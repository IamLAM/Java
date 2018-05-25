/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_herencia;

import java.util.Date;

/**
 *
 * @author Luis Monge
 */
public class Marino extends Animal {

    private int extremidades;
    private String alimento;
    private java.util.Date nacimiento;

    public Marino(Date nac) {
        this.nacimiento = nac;
        this.extremidades = extremidades;
        this.alimento = alimento;
    }

    public Date nacimiento() {

        return nacimiento;
    }

    public int getExtremidades() {

        return this.extremidades;
    }

    public String getTipoAlimento() {

        return this.alimento;
    }

    public void setExtremidades(int ex) {

        this.extremidades = ex;
    }

    public void setTipoAlimento(String al) {

        this.alimento = al;
    }
  @Override
    public String toString() {

        return super.toString()+ "[Marino]"+" extremidades: "+ extremidades+" alimento: "+alimento+" nacimiento: "+nacimiento;
    }
    
}
