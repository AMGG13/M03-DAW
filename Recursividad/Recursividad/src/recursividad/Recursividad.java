/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

/**
 *
 * @author alumne
 */
public class Recursividad {

    /** funcion que sirve para calcular la factorial de un numero
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        System.out.println(" Factorial de 1:"+factorial(1));
        System.out.println(" Factorial de 0:"+factorial(0));
        System.out.println(" Factorial de -10:"+factorial(-10));
        System.out.println(" Factorial de 5 es"+factorial(5));

    }
    /**
     * 
     * @param valor
     * @return para devolver el factorial de un valor
     */
    public static int factorial(int valor){
        int calculo;
        System.out.println("me han llamado factorial con el valor: "+valor);
        if (valor==1){
            return 1;
        }
        if (valor==0){
            return 1;
        }
        else if (valor<0)
        {
            return -1;
        }
        else{
            calculo=valor*factorial(valor-1);
            return calculo;
        }
        
    }
    
}
