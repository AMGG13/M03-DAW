/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public class Aigua extends Pokemon {
    private int corassa;
    

    public Aigua(String nom_pokemon) {
        super(nom_pokemon);
        CP=45;
        corassa=2;
    }

    @Override
    public void recivirImpacto(Pokemon p) {
        int atac=p.Atac();
        if(corassa>0){
            atac=0;
            CP-=atac;
            System.out.println(nom_pokemon+" Uso coraza");
            corassa--;
        }
        if(p instanceof Veri){
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
