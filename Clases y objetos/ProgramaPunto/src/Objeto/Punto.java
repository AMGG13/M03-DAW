/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto;

 import java.lang.Math;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Punto {
    //ejes
    private int x;
    private int y;
    
    //constructor
    public Punto(int x, int y){
        this.x=x;
        this.y=y;
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
    
    public void imprime(){
        System.out.println("("+this.x+","+this.y+")");
    }
    
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    public void desplaza(int dx, int dy){
        this.x+=dx;
        this.y+=dy;
    }
    
    public int distancia(Punto p){
        int distanciaxy=0;
        distanciaxy=(int)Math.sqrt((Math.pow(p.x-this.x,2))+(Math.pow(p.y-this.y,2)));
        return distanciaxy;
    }
    public static Punto creaPuntoAleatorio(){
        Punto ejemplo;
            Random pr=new Random();
            int cordx = pr.nextInt(201)-100;
            int cordy = pr.nextInt(201)-100;
            ejemplo = new Punto(cordx, cordy);
            
        return ejemplo;
    }
}
