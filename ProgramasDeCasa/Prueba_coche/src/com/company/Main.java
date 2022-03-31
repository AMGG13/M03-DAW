package com.company;

import Objetos.Coche;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    private static Main app = new Main();
    private LinkedList<Coche> inventario= new LinkedList<>();
    public static void main(String[] args) {
	    app.run();
    }

    private void run() {
        loadInventory();
        Coche newCar=new Coche("Ferrari","F1","1122WWW");
        if(inventario.contains(newCar)){
            System.out.println("Existe");
        }else{
            System.out.println("No existe");
            System.out.println("Añadiendo");
            inventario.add(newCar);
        }
        Iterator<Coche> it= inventario.iterator();
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }

    }

    private void loadInventory() {
        inventario.add(new Coche("Toyota","Prius","0000QQQ"));
        inventario.add(new Coche("Mercedes","Benz","1111WWW"));
        inventario.add(new Coche("Seat","Leon","2222EEE"));
    }
}
