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
public class Jugador {
    private String nombre;
    private int vidas;
    private int puntos;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.vidas = 3;
        this.puntos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVidas() {
        return vidas;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    

}
