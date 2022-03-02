/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public class CartaComun extends Carta{

    public CartaComun() {
        puntos_vida=1000;
        nivel=1;
        fuerza_ataque=70;
        num_cartas=0;
    }
    
    @Override
    public void mejorarCarta() {
        if (num_cartas>300){
            nivel++;
            System.out.println("Comun Ha subido al nivel "+nivel);
            num_cartas=0;
        }
    }
    
}
