/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public class PuntoCordenada {
    private int x;
    private int y;

    public PuntoCordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public String todasCoordenadas(){
        return ("X: "+this.x+" Y: "+this.y);
    }
    
    
}
