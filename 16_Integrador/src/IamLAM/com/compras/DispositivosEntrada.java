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
public class DispositivosEntrada {

    private String tipoEntrada;
    private String marca;

    public DispositivosEntrada(String te, String m) {
        this.marca = m;
        this.tipoEntrada = te;

    }

    public String getTipoEntrada() {

        return tipoEntrada;
    }

    public String getMarca() {

        return marca;
    }

    public void setTipoEntrada(String te) {
        this.tipoEntrada = te;

    }

    public void setMarca(String m) {

        this.marca = m;

    }

    @Override

    public String toString() {

        return "[Dispositivo Entrada]=" + tipoEntrada + marca;
    }

}
