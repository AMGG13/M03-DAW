/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.Random;

/**
 *
 * @author alumne
 */
public final class Electric extends Pokemon{
    private int potenciador;

    public Electric(String nom_pokemon) {
        super(nom_pokemon);
        CP=50;
        potenciador=2;
    }

    @Override
    public int Atac() {
        Random r = new Random();
        int atac;
        atac=r.nextInt(10)+1;
        if(atac<=4){
            atac+=5;
            potenciador--;
            System.out.println(nom_pokemon+" Uso potenciador");
            System.out.println(nom_pokemon+" a atacado con "+atac+" de ataque!");
            return atac;
        }
        else{
            System.out.println(nom_pokemon+" a atacado con "+atac+" de ataque!");
            return atac;
        }
    }
    @Override
    public void recivirImpacto(Pokemon p) {
        int atac=p.Atac();
        if(p instanceof Aigua){
            System.out.println("ineficaz");
            atac*=0.75;
            this.CP-=atac;
        }
        else{
            this.CP-=atac;
        }
        mostrarEstadoPokemon();
        
    }
    
    
    
    
    
}
