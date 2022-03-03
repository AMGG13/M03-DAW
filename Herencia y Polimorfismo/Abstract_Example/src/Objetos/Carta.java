/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public abstract class Carta {
    protected int puntos_vida;
    protected int fuerza_ataque;
    protected int nivel;
    protected int num_cartas;

    public int getPuntos_vida() {
        return puntos_vida;
    }

    public void setPuntos_vida(int puntos_vida) {
        this.puntos_vida = puntos_vida;
    }

    public int getFuerza_ataque() {
        return fuerza_ataque;
    }

    public void setFuerza_ataque(int fuerza_ataque) {
        this.fuerza_ataque = fuerza_ataque;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getNum_cartas() {
        return num_cartas;
    }

    public void setNum_cartas(int num_cartas) {
        this.num_cartas += num_cartas;
    }
    
    
    public void recibirAtaque(int impacto){
        this.puntos_vida-=impacto;
    }
    
    //Metodo abstracto que fija que todos los hijos deberan de codificarlo, el padre(este) no tiene codigo.
    public abstract void mejorarCarta();
    
}
