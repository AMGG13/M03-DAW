/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Usuario
 */
public abstract class Poligono {
    protected int numero_lados;

    public Poligono(int numero_lados) {
        this.numero_lados = numero_lados;
    }

    public int getNumero_lados() {
        return numero_lados;
    }

    @Override
    public String toString() {
        return " Numero de lados:" + numero_lados;
    }
    
    public abstract double area();

}
