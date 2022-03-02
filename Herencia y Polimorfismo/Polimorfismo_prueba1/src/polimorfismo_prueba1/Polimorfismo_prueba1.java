/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo_prueba1;

import Objetos.Hija1;
import Objetos.Hija2;
import Objetos.Madre;

/**
 *
 * @author alumne
 */
public class Polimorfismo_prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Madre m1 = new Madre();
        Hija1 h1 = new Hija1();
        Hija2 h2 = new Hija2();
        
        Madre polimadre;
        
        polimadre=m1;
        polimadre.llamamde();
        
        polimadre=h1;
        polimadre.llamamde();
        
        polimadre=h2;
        polimadre.llamamde();
        
    }
    
}
