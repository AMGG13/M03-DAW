/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carreradyf;

import Objetos.Delfin;
import Objetos.Foca;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class CarreraDyF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Cual es la edad de tu delfin");
        int edad_delfin=ent.nextInt();
        System.out.println("Cual es la raza de tu delfin? [fosc o austral])");
        ent.nextLine();
        String raza_delfin=ent.nextLine();
        Delfin Gustavo=new Delfin(edad_delfin, raza_delfin);
        System.out.println("Cual es el peso de tu foca");
        int peso_foca=ent.nextInt();
        System.out.println("Cual es la edad de tu foca");
        int edad_foca=ent.nextInt();
        Foca Felipe=new Foca(peso_foca, edad_foca);
        
        System.out.println("Hasta cuantos metros quieres parar la carrera?");
        int final_carrera=ent.nextInt();
        int vuelta=0;
        do {
            Gustavo.Sprint();
            if(vuelta%6==0){
                System.out.println("Cuanta resistencia le quieres aumentar a tu foca?");
                int resist=ent.nextInt();
                Felipe.AugmentarResistencia(resist);
            }
            Felipe.Sprint();
        } while (!(Gustavo.getDistancia_recorrida()>=final_carrera || Felipe.getDistancia_recorrida()>=final_carrera));
        if(Gustavo.getDistancia_recorrida()>=final_carrera){
            System.out.println("El delfin Gustavo ha ganado!!!");
        }
        if(Felipe.getDistancia_recorrida()>=final_carrera){
            System.out.println("La foca Felipe ha ganado!!!");
        }
        
    }
    
}
