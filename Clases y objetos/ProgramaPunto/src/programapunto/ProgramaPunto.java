/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapunto;

import Objeto.Punto;

/**
 *
 * @author Usuario
 */
public class ProgramaPunto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Punto punto1 = new Punto();
        //Punto punto2 = new Punto();
        //Punto punto3 = new Punto();
        
        //punto1.x=5;
        //punto1.y=0;
        //punto2.x=10;
        //punto2.y=10;
        //punto3.x=-3;
        //punto3.y=7;
        Punto punto1 = new Punto(-4,0);
        Punto punto2 = new Punto(10,10);
        Punto punto3 = new Punto(5,0);
        
        //punto1.setX(5);
        //punto1.setY(0);
        //punto2.setX(10);
        //punto2.setY(10);
        //punto3.setX(-3);
        //punto3.setY(7);;
        
        System.out.println("punto 1 cordenada X=("+punto1.getX()+") Y=("+punto1.getY()+")");
        System.out.println("punto 2 cordenada X=("+punto2.getX()+") Y=("+punto2.getY()+")");
        System.out.println("punto 3 cordenada X=("+punto3.getX()+") Y=("+punto3.getY()+")");
        
        System.out.println(punto1.distancia(punto3));
    }
    
}
