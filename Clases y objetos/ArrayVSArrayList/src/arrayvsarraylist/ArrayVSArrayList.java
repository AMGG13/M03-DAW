/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayvsarraylist;

import Objetos.PuntoCordenada;
import java.util.ArrayList;

/**
 *
 * @author alumne
 */
public class ArrayVSArrayList {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PuntoCordenada [] llista_cordenadas = new PuntoCordenada[10];
        
        inicializarArray(llista_cordenadas);
        
        for (int i = 0; i < llista_cordenadas.length; i++) {
            System.out.println(llista_cordenadas[i].getX()+"-"+llista_cordenadas[i].getY());
        }
    }

    private static void inicializarArray(PuntoCordenada[] llista_cordenadas) {
        int valor_x=5;
        for (int i = 0; i< llista_cordenadas.length; i++) {
            llista_cordenadas[i] = new PuntoCordenada(valor_x,i);
        }
    }
    
     /**
     * 
     * @param args 
     */
    public static void mainArrayList(String [] args){
        ArrayList <PuntoCordenada> lista_coor_arrayList = new ArrayList<>();
        PuntoCordenada a = new PuntoCordenada(3, 2);
        PuntoCordenada b = new PuntoCordenada(5, 6);
        PuntoCordenada c = new PuntoCordenada(4, 8);
        System.out.println("Añado el punto a");
        lista_coor_arrayList.add(a);
        System.out.println("Añado el punto b");
        lista_coor_arrayList.add(b);
        
        System.out.println("El array list tiene estos objetos: "+lista_coor_arrayList.size());
        System.out.println("Todas las coordenadas "+lista_coor_arrayList.get(0).todasCoordenadas());
        //para mostrar todas las posiciones
        for (int i = 0; i < lista_coor_arrayList.size(); i++) {
            System.out.println("FOR coordenadas "+lista_coor_arrayList.get(i).todasCoordenadas());
        }
    }
    
}
