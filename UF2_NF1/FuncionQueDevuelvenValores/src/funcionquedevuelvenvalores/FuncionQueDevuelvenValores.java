/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionquedevuelvenvalores;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class FuncionQueDevuelvenValores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ent=new Scanner(System.in);
        System.out.println("Pon un valor y lo doblare por 2 y luego el resultado lo multiplicare por 3");
        int numero=ent.nextInt();
        int ValorDoble = DoblarNumero(numero);
        //Variable ValorDoble recoge el resultado
        System.out.println("El resultado doble es "+ValorDoble);
        
        int ValorTriple = PorTres(ValorDoble);
        System.out.println("El resultado triple es "+ValorTriple);
    }
    /**
     * 
     * @param valor
     * @return 
     */
    public static int DoblarNumero(int valor)
    {
        int doble=valor*2;
        return doble;
        
    }
    /**
     * Esta funcion multiplica por 3 el doble
     * @param valor
     * @return doble devolvera el resultado
     */
    public static int PorTres(int valor)
    {
        int triple=valor*3;
        return triple;
        
    }
    
}
