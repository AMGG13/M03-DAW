/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Foca {
    private int peso;
    private final int edad;
    private int resistencia;
    private int distancia_recorrida;

    public Foca(int peso, int edad) {
        if(peso<=140 && peso>0){
            this.peso = peso;
        }
        else{
            System.err.println("[-]Peso no admitido MAX 140, valor por defecto se colocara 140");
            this.peso = 140;
        }
        if(edad<=35 && edad>0){
            this.edad = edad;
        }
        else{
            System.err.println("[-]Valor de edad no permitido MAX 35, valor por defecto se colocara en 35");
            this.edad=35;
        }
        this.resistencia = 3;
        this.distancia_recorrida = 0;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }

    public int getResistencia() {
        return resistencia;
    }

    public int getDistancia_recorrida() {
        return distancia_recorrida;
    }
    public int AugmentarResistencia(int mejora){
        return this.resistencia+=mejora;
    }
    public void Sprint(){
        int speed;
        if(getResistencia()>0){
            speed = (edad*(200-getPeso())*2);
            this.resistencia-=1;
            this.distancia_recorrida+=speed;
            System.out.println("[+]Foca ha recorrido "+getDistancia_recorrida());
        }
        else{
            speed = edad*(200-getPeso());
            this.distancia_recorrida+=speed;
            System.out.println("[+]Foca ha recorrido "+getDistancia_recorrida());
        }
        
    }
    
            
    
}
