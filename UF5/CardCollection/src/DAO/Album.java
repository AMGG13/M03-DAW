/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Objects.Cromos;
import Objects.NumberOutofAlbumEx;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Raul
 */
public class Album {//clase DAO

    private ArrayList<Cromos> cromos_tengo = new ArrayList<>();
    private int max_num;
    private ArrayList<Cromos> cromos_repes = new ArrayList<>();

    public Album(int num) {
        this.cromos_tengo = new ArrayList<Cromos>();
        this.cromos_repes = new ArrayList<>();
        this.max_num = num;//numero de cartas 
    }

    public ArrayList<Cromos> getCromos_tengo() {
        return cromos_tengo;
    }

    public int getMax_num() {
        return max_num;
    }

    public ArrayList<Cromos> getCromos_repes() {
        return cromos_repes;
    }

    /**
     * 
     * @param c
     * @return -1 si lo he añadido en repes, 0 si lo he puesto en el album, -2 caso excepctiona
     * @throws NumberOutofAlbumEx 
     */
    public int AddCard(Cromos c) throws NumberOutofAlbumEx {//No consigo mostrar cuando se añade a las cartas repetidas

            //MAB la longitud ya no la preguntas por que 
            //en el momento de crear el cromo ya habria saltado el aviso.
            //no se captura aqui la excepción por que
            //no sabemos si la frase la debemos mostrar por consola o por otro medio
            //si la pones aqui FIJAS QUE ESTA POR CONSOLA.
            if (c.getNumCard() <= max_num ) {
                if (cromos_tengo.contains(c)) { //si cierto lo paso a repes
                    if (cromos_repes.add(c))
                            {
                                return -1; //se ha añadido en repes
                            }
                }else{
                    if (cromos_tengo.add(c))
                            {
                                return 0; //se ha añadido en repes
                            }
                }
                
            } else {
                throw new NumberOutofAlbumEx("El número debe ser inferior al máximo de cromos");
                
            }
            return -2; //nunca pasa por aqui però lo debo poner
        
    }

    public boolean deleteCard(Cromos c) {// review
        try {
                 return cromos_tengo.remove(c);
                   
        } catch (Exception e) {
            return false;
        }
    }
    public void listarIterador(){
        Cromos t;
        Iterator<Cromos> it = cromos_tengo.iterator();
        while(it.hasNext()){
            t=it.next();
            System.out.println(t.toString());
        }
    }

    public boolean changeCard(Cromos new_card, Cromos old_card) {
        //MAB bien hecha las dos condiciones
        if ((cromos_repes.contains(old_card)) && (!cromos_tengo.contains(new_card))) {
            cromos_repes.remove(old_card);
            cromos_tengo.add(new_card);
            return true;
        }
        else
        {
            return false;
        }
    }

    //MAB displayCardAlbum
    //el display como puede variar la muestra 
    //que lo mostremos por consola, o en una ventana de windows, el dao
    //no lo pinta, devuelve el array y ya en la app se "pinta"
//    public void displayCardAlbum() {
//        System.out.println("Lista de cromos");
//        for (Cromos cards : cromos_tengo) {
//            System.out.println(cards.toString());
//        }
//    }

    //Lo pinto displayRepeatedCardAlbum
    //MAB la misma razón, que el otro
    //llamaremos el get y en la app ya haremos el bucle
    public void displayRepeatedCardAlbum() {
        System.out.println("Lista de cromos repetidos");
        for (Cromos cromos : cromos_repes) {
            System.out.println(cromos.toString());
        }
    }

    private boolean CheckCard(Cromos c) {
        for (int i = 0; i < cromos_tengo.size(); i++) {
            if (cromos_tengo.get(i).equals(c)) {
                return true;
            }
        }
        return false;
    }
}
