/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package la_escalera_encantada;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class La_Escalera_Encantada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tiradas=10;
        int posicion=0;
        do{
        posicion=posicion+tiradaDados();
        if(posicion<0)
        {
            posicion=0;
        }
        tiradas--;
        mostrarResultadoParcial(posicion,tiradas);
        }while(!(tiradas==0 || posicion>=50));
        boolean gana_pierde=Ganador(posicion,tiradas);
        mostrarGanador(gana_pierde);
        
    }

    public static int tiraDado() {
       int dado;
       Random random = new Random();
       dado=random.nextInt(6)+1;
       if(dado==6)
       {
           dado=-2;
       }
       else if(dado==5)
       {
           dado=-1;
       }
       
       return dado;
    }

    private static int tiradaDados() {
        int dado1,dado2;
        dado1=tiraDado();
        System.out.println("primer dado es "+dado1);
        dado2=tiraDado();
        System.out.println("segundo dado es "+dado2);
        int suma=dado1+dado2;
        return suma;
    }

    private static void mostrarResultadoParcial(int posicion, int tiradas) {
        System.out.println("Vas por la posicion "+posicion+" de 50");
        System.out.println("Te quedan "+tiradas+" tiradas");
    }

    private static boolean Ganador(int posicion, int tiradas) {
        if (posicion>=50)
        {
            return true;
        }
        else if (tiradas==0){
            return false;
        }
        else{
            return false;
        }
    }

    private static void mostrarGanador(boolean gana_pierde) {
        if(gana_pierde==true)
        {
            System.out.println("Ganaste!");
        }
        else{
           System.out.println("Perdiste"); 
        }
        
    }
    
}
