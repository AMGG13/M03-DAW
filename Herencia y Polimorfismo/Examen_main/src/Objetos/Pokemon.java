/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author alumne
 */
public abstract class Pokemon implements AccionesCombate{
    protected final String nom_pokemon;
    protected int CP; //vida
    protected boolean vivo;

    public Pokemon(String nom_pokemon) {
        this.nom_pokemon = nom_pokemon;
        CP=0;
        this.vivo = true;
    }

    public String getNom_pokemon() {
        return nom_pokemon;
    }

    public int getCP() {
        return CP;
    }

    public boolean isVivo() {
        if(CP<=0){
            return !vivo;
        }
        else{
            return vivo;   
        }
    }
    
    protected void mostrarEstadoPokemon(){
        if(isVivo()){
            System.out.print(nom_pokemon+" "+CP+" CP vivo");
        }
        else{
            System.out.print(nom_pokemon+" "+CP+" CP muerto");
        }
        for (int i = 0; i < this.CP; i++) {
            System.out.print("=");
        }
        System.out.println("");
    }

    @Override
    public String toString() {
        return "nom_pokemon:" + nom_pokemon + ", CP:" + CP;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pokemon other = (Pokemon) obj;
        return Objects.equals(this.nom_pokemon, other.nom_pokemon);
    }

    @Override
    public int Atac() {
        Random r = new Random();
        int atac=r.nextInt(10)+1;
        System.out.println(nom_pokemon+" a atacado con "+atac+" de ataque!");
        return atac;
    }

    @Override
    public void recivirImpacto(Pokemon p) {
        int atac=p.Atac();
        this.CP-=atac;
    }
    
    
    
    
    
}
