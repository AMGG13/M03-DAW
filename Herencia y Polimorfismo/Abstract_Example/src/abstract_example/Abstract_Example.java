/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstract_example;

import Objetos.Carta;
import Objetos.CartaComun;
import Objetos.CartaEpica;

/**
 *
 * @author alumne
 */
public class Abstract_Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Carta padre;//no puedo hacer new porque esta la clase en abstracto
        CartaComun comun = new CartaComun();
        CartaEpica epica = new CartaEpica();
        while(comun.getNivel()<3 || epica.getNivel()<3){
            comun.setNum_cartas(50);
            epica.setNum_cartas(5);
            System.out.println("comun "+comun.getNum_cartas());
            System.out.println("epica "+epica.getNum_cartas());
            comun.mejorarCarta();
            epica.mejorarCarta();
            Thread.sleep(1000);
        }
    }
    
}
