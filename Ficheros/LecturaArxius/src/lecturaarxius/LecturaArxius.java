/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaarxius;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author miki
 */
public class LecturaArxius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        //File fitxer_texte = new File("FitxerTexte.txt");
        //llegir_text(fitxer_texte);
        //leerTextoArrayList(fitxer_texte);
        File num = new File("numeric.txt");
        llegir_fitxerNumero(num);
        File dobles = new File("pruebas.txt");
        FileWriter fichero_doble = new FileWriter("pruebas.txt",true);
        escribirFichero(fichero_doble,num,dobles);
        
    }

    private static void llegir_text(File fitxer_texte) {
        try {
            Scanner sc_fitxer = new Scanner(fitxer_texte);//lee palabra por palabra
            while (sc_fitxer.hasNext()) {
                String paraula = sc_fitxer.next();
                System.out.println("-" + paraula);
            }
            sc_fitxer.close(); //important tancar perque despres si el vull tornar a utilizar
            System.out.println("");

            sc_fitxer = new Scanner(fitxer_texte);//Lee linea a linea
            while (sc_fitxer.hasNextLine()) {
                String linea = sc_fitxer.nextLine();
                System.out.println("El llegeixo amb nextLine-" + linea);
            }
            sc_fitxer.close(); //important tancar perque despres si el vull tornar a utilizar

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void llegir_fitxerNumero(File fitxer_tractar) {
        try {
            System.out.println("Llegeixo fitxer numeric: ");
            Scanner lector_fitxer = new Scanner(fitxer_tractar);
            while (lector_fitxer.hasNextInt()) {
                int num = lector_fitxer.nextInt();
                System.out.print("-" + num);
            }
            System.out.println("fi del fitxer numerics");
            lector_fitxer.close(); //important tancar perque despres si el vull tornar a utilizar
            System.out.println("");

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void leerTextoArrayList(File fitxer_texte) throws FileNotFoundException {
        //ArrayList deString
        ArrayList<String> texto = new ArrayList<>();
        try { //Leer fichero linea a line
            Scanner sc_fitxer = new Scanner(fitxer_texte);//Lee linea a linea
            while (sc_fitxer.hasNextLine()) {
                String linea = sc_fitxer.nextLine();
                texto.add(linea);//guardar linea al arraylist
                System.out.println("El llegeixo amb nextLine-" + linea);
            }
            sc_fitxer.close();//important tancar perque despres si el vull tornar a utilizar
        } catch (FileNotFoundException e) {//mostrar Excepcion si ocurre
            System.err.println("Fichero incorrecto:" + fitxer_texte.getName());
            System.out.println(e.getMessage());
        }
        mostrarArrayList(texto);//bucle que muestre por pantalla el ArrayList
        System.out.print("\n");

    }

    private static void mostrarArrayList(ArrayList<String> texto) {

        System.out.println("LEYENDO ARRAYLIST");
        System.out.println("=================");
        for (String string : texto) {
            System.out.println(string);
        }
    }

    private static void escribirFichero(FileWriter fichero_doble, File num, File dobles) throws IOException {
        try {
            Scanner lector_fitxer = new Scanner(num);
            while (lector_fitxer.hasNextInt()) {
                int numero = lector_fitxer.nextInt();
                fichero_doble.write((numero*2));
            }lector_fitxer.close(); //important tancar perque despres si el vull tornar a utilizar

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        llegir_fitxerNumero(num);
        llegir_fitxerNumero(dobles);
    }
    

}
