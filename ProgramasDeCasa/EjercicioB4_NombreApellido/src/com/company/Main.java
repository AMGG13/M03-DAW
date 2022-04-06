package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    /**
     * Implementa un programa que genere aleatoriamente nombres de persona (combinando nombres
     * y apellidos de ‘usa_nombres.txt’ y ‘usa_apellidos.txt’). Se le pedirá al usuario cuántos nombres de
     * persona desea generar y a qué archivo añadirlos (por ejemplo ‘usa_personas.txt’).
     * @param args
     */
    public static void main(String[] args) throws IOException {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> surnames = new ArrayList<>();
        recogerNombre_Apellido(names,surnames);
        FileWriter personas = new FileWriter("personas.txt");
        int cantidad=pedirCuantasPersonas("Personas a genererar:",names.size());
        insertarNombres(names,surnames,personas,cantidad);

    }

    private static void insertarNombres(ArrayList<String> names, ArrayList<String> surnames, FileWriter personas, int cantidad) throws IOException {
        Random r = new Random();
        for (int i = 0; i < cantidad; i++) {
            String name=names.get(r.nextInt(names.size()));
            String surname=surnames.get(r.nextInt(surnames.size()));
            personas.write(name+" "+surname+System.lineSeparator());
        }personas.close();

    }

    private static int pedirCuantasPersonas(String s, int size) {
        System.out.print(s);
        Scanner ent = new Scanner(System.in);
        int i=ent.nextInt();
//        if (i>size){
//            System.err.println("Numero muy grande");
//            i=size;
//        }
        return i;
    }

    private static void recogerNombre_Apellido(ArrayList<String> names, ArrayList<String> surnames) throws FileNotFoundException {
        File name= new File("usa_nombres.txt");
        File surname= new File("usa_apellidos.txt");
        Scanner n = new Scanner(name);
        Scanner s = new Scanner(name);
        while(n.hasNext()){
            String nombre = n.next();
            names.add(nombre);
        }n.close();

        while(s.hasNext()){
            String apellido = s.next();
            surnames.add(apellido);
        }s.close();
    }
    }

