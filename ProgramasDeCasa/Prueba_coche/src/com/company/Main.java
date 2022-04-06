package com.company;

import DAO.Inventory;
import Objetos.Coche;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static Main app = new Main();
    private Inventory lista;
    public static void main(String[] args) {
	    app.run();
    }

    private void run() {
        Scanner ent = new Scanner(System.in);
        lista= new Inventory();
        loadInventory();
        int option;
        do{
            mostrarMenu();
            System.out.print("Opcion:");
            option= ent.nextInt();
            executeOption(option);
        }while(option!=5);

    }

    private void executeOption(int option) {
        switch(option){
            case 1: añadirCoche();
                break;
                case 2: borrarCoche();
                    break;
                    case 3: actualizarCoche();
                        break;
                        case 4: mostrarCoches();
                            break;
            case 5:
                System.out.println("Saliendo");
                break;
            default:
                System.err.println("No implementada");
                break;

        }
    }

    private void mostrarCoches() {
        Iterator<Coche> it = lista.giveCollection().iterator();
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }

    }
    private void actualizarCoche() {
        Scanner ent = new Scanner(System.in);
        System.out.print("Matricula:");
        String matricula = ent.nextLine();
        if(lista.existCar(matricula)){
            System.out.println("Categoria:");
            int estrellas = ent.nextInt();
            lista.update(new Coche(matricula,estrellas));
        }else{
            System.err.println("No existe ese coche");
        }

    }

    private void borrarCoche() {
        Scanner ent = new Scanner(System.in);
        String matricula = ent.nextLine();
        if(lista.existCar(matricula)){
            lista.removeCoche(new Coche(matricula));
        }else{
            System.err.println("No existe este coche");
        }
    }

    private void añadirCoche() {
        Scanner ent = new Scanner(System.in);
        System.out.print("Matricula:");
        String matricula=ent.nextLine();
        if(!lista.existCar(matricula)){
            System.out.print("Marca:");
            String marca = ent.nextLine();
            System.out.print("Modelo:");
            String modelo= ent.nextLine();
            System.out.print("Categoria:");
            int estrellas = ent.nextInt();
            if(lista.addCoche(new Coche(marca,modelo,matricula,estrellas))){
                System.out.println("añadido correctamente");
            }else{
                System.err.println("Error");
            }
        }else{
            System.err.println("Ya existe");
        }

    }

    private void mostrarMenu() {
        System.out.println("1- Añadir");
        System.out.println("2- Borrar");
        System.out.println("3- Actualiar");
        System.out.println("4- Mostrar");
        System.out.println("5- Salir");
    }

    private void loadInventory() {
        lista.addCoche(new Coche("Toyota","Prius","0000QQQ",3));
        lista.addCoche(new Coche("BMW","DEV","1111WWW",4));
        lista.addCoche(new Coche("Mercedes","Benz","2222EEE",5));
        lista.addCoche(new Coche("Citroen","C4","3333RRR",3));
    }
}
