/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public final class Veri extends Pokemon{
    private boolean defensa;
    
    public Veri(String nom_pokemon) {
        super(nom_pokemon);
        CP=40;
        defensa=false;
    }
    
    @Override
    public void recivirImpacto(Pokemon p) {
        int atac=p.Atac();
        if(CP<15){
            defensa=true;
        }
        if(p instanceof Electric){
            if(defensa){
                atac=(atac*=0.75)/2;
                System.out.println("ineficaz y ha usado defensa");
                this.CP-=atac;
            }
            else{
                atac*=0.75;
                System.out.println("ineficaz");
                this.CP-=atac;
            }
        }
        else{
            if(defensa){
                atac=atac/2;
                System.out.println("Ha usado defensa");
                this.CP-=atac;
            }
            else{
                this.CP-=atac;
            }
        }
        mostrarEstadoPokemon();
        
    }
    
    
}
