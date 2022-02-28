/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package planetario;

import Objetos.Astros;
import Objetos.Planeta;
import Objetos.Satelite;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Planetario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Astros> misAstros = new ArrayList<>();
        anyadirAlAstro(misAstros);
        int opcion;
        
        do{
            opcion=mostrarMenu();
            switch (opcion) {
                case 1:
                    mostrarAstroPorIndice(misAstros);
                    break;
                case 2:
                    mostrarNombreAstro(misAstros);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    break;
            }
        }while(opcion!=0);
        
    }

    private static void anyadirAlAstro(ArrayList<Astros> misAstros) {
        Planeta Earth = new Planeta(200, 1000, true, "Tierra", 10, 10000);
        Planeta Mars = new Planeta(100, 2000, true, "Marte", 20, 20000);
        
        Satelite Moon = new Satelite(3000, 200, "Tierra", "Luna", 10, 5000);
        Satelite Moon1 = new Satelite(5000, 200, "Jupiter", "Juranio", 10, 20000);
        Satelite Moon2 = new Satelite(3000, 200, "Marte", "Sanuari", 10, 15000);
        
        misAstros.add(Earth);
        misAstros.add(Mars);
        
        misAstros.add(Moon);
        misAstros.add(Moon1);
        misAstros.add(Moon2);
    }

    private static int mostrarMenu() {
        System.out.println("1.- Mostrar el astro por indice (pondras un indice y te mostrara el astro que esté en esa posición)\n" +
        "2.- Mostrar el astro por nombre(informaras un nombre y si esta , te mostrará todos sus atributos)\n" +
        "0.- Salir");
        System.out.print("Elija: ");
        Scanner ent = new Scanner (System.in);
        int opcion = ent.nextInt();
        return opcion;
        
    }

    private static void mostrarAstroPorIndice(ArrayList<Astros> misAstros) {
        Scanner ent = new Scanner (System.in);
        System.out.println("En que posicion esta e planeta?");
        int indice = ent.nextInt();
        if (indice<0){
            System.err.println("Error");
        }
        else if(indice >=0 && indice <=misAstros.size() ){
            System.out.println(misAstros.get(indice).toString());
        }
    }

    private static void mostrarNombreAstro(ArrayList<Astros> misAstros) {
        Scanner ent = new Scanner (System.in);
        System.out.println("Cual es el nombre del planeta?");
        String planeta = ent.nextLine();
        for (int i = 0; i < misAstros.size(); i++) {
            if (planeta.contains(misAstros.get(i).getNombre())){
                System.out.println(misAstros.get(i).toString());
            }
        }
        
    }
    
}
