/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public class CartaEpica extends Carta{
    
        public CartaEpica() {
        puntos_vida=900;
        nivel=1;
        fuerza_ataque=330;
        num_cartas=0;
    }
    
    @Override
    public void mejorarCarta() {
        if(num_cartas>=20){
            nivel++;
            System.out.println("Epica Ha subido al nivel "+nivel);
            num_cartas=0;
        }
    }
    
}
