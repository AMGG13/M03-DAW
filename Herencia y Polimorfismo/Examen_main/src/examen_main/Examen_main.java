/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_main;

import Objetos.Aigua;
import Objetos.Electric;
import Objetos.Pokemon;
import Objetos.Veri;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Examen_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Pokemon> pokes = new ArrayList<>();
        Scanner ent = new Scanner(System.in);
        String nom1="";
        String nom2="";
        String tipo1;
        String tipo2;
        System.out.println("Cual es el nombre del pokemon?");
        nom1=ent.nextLine();
        System.out.println("Cual es el tipo?");
        tipo1=ent.nextLine();
        if(tipo1.equalsIgnoreCase("aigua")){
            Aigua pok1 = new Aigua(nom1);
            pokes.add(pok1);
        }
        else if(tipo1.equalsIgnoreCase("electric")){
            Electric pok1 = new Electric(nom1);
            pokes.add(pok1);
        }
        else if(tipo1.equalsIgnoreCase("veri")){
            Veri pok1 = new Veri(nom1);
            pokes.add(pok1);
        }
        System.out.println("Cual es el nombre del pokemon?");
        nom2=ent.nextLine();
        System.out.println("Cual es el tipo?");
        tipo2=ent.nextLine();
        if(tipo1.equalsIgnoreCase("aigua")){
            Aigua pok2 = new Aigua(nom2);
            pokes.add(pok2);
        }
        else if(tipo1.equalsIgnoreCase("electric")){
            Electric pok2 = new Electric(nom2);
            pokes.add(pok2);
        }
        else if(tipo1.equalsIgnoreCase("veri")){
            Veri pok2 = new Veri(nom2);
            pokes.add(pok2);
        }
        
        do{
            pokes.get(0).Atac();
            pokes.get(1).recivirImpacto(pokes.get(0));
            pokes.get(1).Atac();
            pokes.get(0).recivirImpacto(pokes.get(1));
        }while(pokes.get(0).getCP()>0 && pokes.get(1).getCP()>0);
        //No esta bien la verdad, el examen para mi fue dificil me ha hecho falta repasar varias cosas
    }
    
}
