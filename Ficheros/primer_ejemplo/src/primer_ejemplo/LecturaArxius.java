/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaarxius;

import java.io.File;
import java.io.FileNotFoundException;
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
    public static void main(String[] args) {
        // TODO code application logic here
                File fitxer_texte = new File("FitxerTexte.txt"); 
                llegir_text(fitxer_texte);
        
                
                File num = new File("numeric.txt");
                llegir_fitxerNumero(num);
                
                
                

    }

    private static void llegir_text(File fitxer_texte) {
        try {
            Scanner sc_fitxer = new Scanner(fitxer_texte);
            while (sc_fitxer.hasNext()) {
                String paraula = sc_fitxer.next();
                 System.out.println("-" + paraula );
            }
            sc_fitxer.close(); //important tancar perque despres si el vull tornar a utilizar
            System.out.println("");

            sc_fitxer = new Scanner(fitxer_texte);
            while (sc_fitxer.hasNextLine()) {
                String paraula = sc_fitxer.nextLine();
                 System.out.println("El llegeixo amb nextLine-" + paraula);
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
                 System.out.print("-" + num );
            }
            System.out.println("fi del fitxer numerics");
            lector_fitxer.close(); //important tancar perque despres si el vull tornar a utilizar
            System.out.println("");

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
