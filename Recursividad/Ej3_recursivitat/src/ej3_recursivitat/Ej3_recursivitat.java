/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3_recursivitat;

/**
 *
 * @author alumne
 */
public class Ej3_recursivitat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num=10;
        System.out.println("suma de los pares del numero "+num+" es "+sumaPares(num));
        
    }
   
    public static int sumaPares(int num){
        if(num==0){
            return 0;
        }
        if(num==2){
            return num;
        }
        if(num%2!=0){
            return -1;
        }
        else{
          return  num+sumaPares(num-2);
        }
    }
}
