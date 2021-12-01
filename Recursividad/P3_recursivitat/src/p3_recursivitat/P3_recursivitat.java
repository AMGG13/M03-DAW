/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p3_recursivitat;

/**
 *
 * @author alumne
 */
public class P3_recursivitat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int filas=4;
        System.out.println("tienes un total de "+boliche(filas)+" bolos");
    }
    public static int boliche(int filas){
        if( filas==1){
            return 1;
        }
        else{
            int bolos=1;
            return bolos*filas+boliche(filas-1);
        }
    }
}
