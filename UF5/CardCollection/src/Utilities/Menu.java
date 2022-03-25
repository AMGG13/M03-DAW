/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Menu {

    private String title;
    private ArrayList<Option> options;

    public Menu(String title) {
        this.title = title;
       this.options = new ArrayList<Option>();//inicializa el ArrayList de Option
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Option> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<Option> options) {
        this.options = options;
    }

    /**
     * Añade las opciones al menú
     *
     * @param nueva
     */
    public void add(Option nueva) {
        options.add(nueva);
    }

    /**
     * Borra una opción del menú
     *
     * @param opcion objeto del array a eliminar
     * @return te devuelve el objeto borrado por si necesitas imprimirlo
     */
    public boolean remove(Option opcion) {
        return options.remove(opcion);
    }

    /**
     * Borra una opcion por el ínidce pasado
     *
     * @param index
     * @return el objeto borrado
     */
    public Option removeByIndex(int index) {
        return options.remove(index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("------" + this.getTitle() + "------");
        sb.append("\n");
        for (Option option : options) {
            sb.append(options.toString());
        }
        return sb.toString();
    }
/**
 * Muestra el menu con formato 
 */
    public void displayMenu() {
        System.out.println("---- " + this.title + " ----");
        for (int i = 0; i < options.size(); i++) {
            System.out.format("%d - %s \n", i, options.get(i).toString());//formatea el texto        }
        }

    }
    /**
     * Función donde eligues la opción deseada y se evcalua que sea en los rangos correctos
     * @return 
     */
    public int choose(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Select option");
        int option;
        do {
            option = sc.nextInt();
        } while (option < 0 || option > options.size());
        return option;
    }
}
