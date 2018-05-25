/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_herencia;

/**
 *
 * @author Luis Monge
 */
public class Terrestre extends Animal {

    private int extremidades;
    private String alimento;

   public Terrestre(String n,int ex, String al) {
        super(n);
        this.extremidades = ex;
        this.alimento = al;
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

        return super.toString()+ "[Terrestre]"+" extremidades: "+ extremidades+" alimento: "+alimento;
    }
    
    
}
