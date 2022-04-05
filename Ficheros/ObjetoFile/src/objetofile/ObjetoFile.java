/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetofile;

import java.io.File;

/**
 *
 * @author Miquel Angel Bardají
 */
public class ObjetoFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //apuntador a un posible fitxer
        File fitxer = new File("Pruebas.txt");
        mostrar_rutes(fitxer);
        File fitxer2 = new File("darth.webp");
        mostrar_rutes(fitxer2);
        File fitxer3 = new File("./imatges");//Directorio
        mostrar_rutes(fitxer3);
        File fitxer4 = new File("./imatges/mono.webp");
        mostrar_rutes(fitxer4);
        File primer = new File("PrimerArchivo.txt");
        mostrar_rutes(primer);
        
        
    }

    private static void mostrar_rutes(File fitxer) {
        System.out.println("Ruta relativa exceptuant el nom del fitxer:" + fitxer.getParent());
        System.out.println("Nom fitxer :" + fitxer.getName());
        System.out.println("Ruta absoluta incloient el fitxer :" + fitxer.getAbsolutePath());
        System.out.println("Existeix el fitxer? " + fitxer.exists());
        System.out.println("Es un fitxer realment? " + fitxer.isFile());
        System.out.println("Es un diretori realment? " + fitxer.isDirectory());
        System.out.println("Tamany arxiu : " + fitxer.length());
        
        
        if (fitxer.isDirectory())
        {
            System.out.println("Mostrare els arxius dins de la carpeta " + fitxer.getName() + "======= ");
            File[] ficheros = fitxer.listFiles();
            for (int i = 0; i < ficheros.length; i++) {
                System.out.format("\t %s \t %d\n" , ficheros[i].getName(), ficheros[i].length());
            }
        }
        
        System.out.println("");
    }
}
