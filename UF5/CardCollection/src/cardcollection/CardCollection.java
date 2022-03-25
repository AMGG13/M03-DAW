/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardcollection;

import DAO.Album;
import Objects.Cromos;
import Objects.DescriptionException;
import Objects.NumberOutofAlbumEx;
import Utilities.Menu;
import Utilities.Option;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Raul
 */
public class CardCollection {

    private Album dragon_ball;
    private Menu main_menu;

    public static void main(String[] args) {
        CardCollection app = new CardCollection();
        app.runApp();
    }

    private void runApp() {
        //MAB pongo la colección
        int num_cromos;
        try{
            num_cromos = askIntData("Cuantos cromos hay en la colección");            
        }catch(InputMismatchException ex)
        {
            System.out.println("EL numero no es valido, creare album de 100");
            num_cromos = 100;
        }

        dragon_ball = new Album(num_cromos);
        main_menu = new Menu("Coleccion de cromos Dragon Ball");
        addOptions();
        testCards();
        int option;
        do {
            main_menu.displayMenu();
            option = main_menu.choose();

            switch (option) {
                case 1:
                    addCardToCollection();
                    break;
                case 2:
                    deleteCardToCollection();
                    break;
                case 3:
                    changeCards();
                    break;
                case 4:
                    displayCards();
                    break;
                case 5:
                    displayRepeatCards();
                    break;
                case 0:
                    System.out.println("Cerrando app");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (option != 0);

    }

    //MAB
    //los pinto aqui, por que la app nuestra va por consola.
    private void displayCards() {
        ArrayList<Cromos> lista = dragon_ball.getCromos_tengo();
        System.out.println("Lista de cromos album");
        for (Cromos cards : lista) {
            System.out.println(cards.toString());
        }
        System.out.println("Cromos colocados: " + lista.size());
    }

    private void addOptions() {
        main_menu.add(new Option("Salir"));
        main_menu.add(new Option("◦ Añadir cromo."));
        main_menu.add(new Option("◦ Borrar cromo."));
        main_menu.add(new Option("◦ Cambiar cromo."));
        main_menu.add(new Option("◦ Mostrar cromos que tengo."));
        main_menu.add(new Option("◦ Mostrar cromos repetidos."));
    }

    /**
     * Carga algunos cromos de prueba
     */
    private void testCards() {
        try {
            dragon_ball.AddCard(new Cromos(27, "Goku"));
            dragon_ball.AddCard(new Cromos(50, "Satanas Cor Petit"));
            dragon_ball.AddCard(new Cromos(38, "Krilin"));
            dragon_ball.AddCard(new Cromos(52, "Follet Tortuga"));
            dragon_ball.AddCard(new Cromos(100, "Bulma"));
        } catch (DescriptionException ex) {
            System.out.println("Error testCards " + ex.getMessage());
        } catch (NumberOutofAlbumEx ex) {
                System.out.println("Number error testCards " + ex.getMessage());
        }
    }   

    private void addCardToCollection() {
        boolean okCard=false;
        
        //MAB aqui si pongo el bucle, si quiero para que me pongan
        //un cromo correcto numero y la descripción sea correcta y no corta.
        do{
        try {
            int num_card = askIntData("Introduce el numero de la carta a añadir");
            //MAB
            String description = askStringData("Introduce nombre personaje");
            Cromos new_card = new Cromos(num_card,description);
            int opcion = dragon_ball.AddCard(new_card);
            if (opcion == 0) {
                okCard = true;
                System.out.println("Cromo " + new_card.toString() + " añadido correctamente album");    
            } 
            else if (opcion == -1) {
                okCard = true;
                System.out.println("Cromo " + new_card.toString() + " añadido correctamente repes");    
            } 
            else {
                System.out.println("Cromo invalido" + new_card.toString());
            }
        } catch (NumberOutofAlbumEx | DescriptionException ex) 
            {
            System.out.println("Error añadiendo ->" + ex.getMessage());
            //Logger.getLogger(CardCollection.class.getName()).log(Level.SEVERE, null, ex);
            } 
          catch(InputMismatchException ex)
          {
              System.out.println("Numero cromo no correcto ->" + ex.getMessage());
          }
        }while(!okCard);
        
        }

    

    private int askIntData(String phrase) throws InputMismatchException{
        Scanner sc = new Scanner(System.in);
        System.out.println(phrase);
        int option = sc.nextInt();
        return option;
    }
    
    //MAB
    private String askStringData(String phrase) {
        Scanner sc = new Scanner(System.in);
        System.out.println(phrase);
        String desc = sc.nextLine();
        return desc;
    }

    private void deleteCardToCollection() {
        int num_card = askIntData("Introduce el numero de la carta a eliminar de la colección");
        Cromos cardToDelete = new Cromos(num_card);
        //MAB no hace falta hacer dos deletes, uno es suficiente
//        dragon_ball.deleteCard(cardToDelete);
       
        if (dragon_ball.deleteCard(cardToDelete)) {
            System.out.println("Carta " + cardToDelete.getNumCard() + "  eliminada con éxito");
        } else {
            System.out.println("El número de carta no existre en la colección");
        }
    }

    //MAB
    private void displayRepeatCards() {
        ArrayList<Cromos> lista = dragon_ball.getCromos_repes();
        System.out.println("Lista de cromos repetidos");
        for (Cromos cards : lista) {
            System.out.println(cards.toString());
        }
        System.out.println("Cromos repes: " + lista.size());
    }

    private void changeCards() {
        try {
            //MAB aqui al nuevo le pongo la descripción para que este bien
            int numNewcard = askIntData("Introduce el numero de la carta a conseguir");
            String new_description = askStringData("Introduce la descripción");
            Cromos new_card = new Cromos(numNewcard, new_description);
            int numOldCard = askIntData("Introduce el numero de la carta a cambiar");
            Cromos swap_card = new Cromos(numOldCard);
            
            if(dragon_ball.changeCard(new_card, swap_card))
            {
                System.out.println("Cromo cambiado");
            }
            else
            {
                System.out.println("No cambio cromo, o no tengo el que me pides o el que me das ya lo tengo");
            }
        } catch (DescriptionException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
