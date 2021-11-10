/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyale_1;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ClashRoyale_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int Copas;
        char Eleccion;

        System.out.println("Cuantas copas tienes?");
        Copas = entrada.nextInt();

        entrada.nextLine();//Limpiar baffer

        if (Copas < 2000) {
            System.out.println("Elige tu carta:  Esbirro(e) o MagoElectrico(m)");
            Eleccion = entrada.nextLine().charAt(0);

            if ((Eleccion == 'm') || (Eleccion == 'M')) {
                System.out.println("HAS CONSEGIDO EL MAGO ELECTRICO ");
            } else if ((Eleccion == 'e') || (Eleccion == 'E')) {
                System.out.println("HAS CONSEGIDO EL ESBIRRO");
            } //Copas menos de 2000

        } else if (Copas > 2000 && Copas < 3000) {

            System.out.println("Elige tu carta:  Caballero(c) o Bandida(b)");
            Eleccion = entrada.nextLine().charAt(0);

            if ((Eleccion == 'b') || (Eleccion == 'B')) {
                System.out.println("HAS CONSEGIDO LA BANDIDA!!!");
            } else if ((Eleccion == 'c') || (Eleccion == 'C')) {
                System.out.println("HAS CONSEGIDO EL CABALLERO!!!");

            }//Copas mas de 2000
        } else if (Copas >= 3000) {
            System.out.println("Elige tu carta:  Ejercito de esqueletos(e) o Gigante noble(g)");
            Eleccion = entrada.nextLine().charAt(0);

            if ((Eleccion == 'e') || (Eleccion == 'E')) {
                System.out.println("HAS CONSEGIDO EL EJERCITO DE ESQUELETOS ");
            } else if ((Eleccion == 'g') || (Eleccion == 'G')) {
                System.out.println("HAS CONSEGIDO EL GIGANTE NOBLE");
            } //Copas mayor de 3000 o igual

        }
    }

}

