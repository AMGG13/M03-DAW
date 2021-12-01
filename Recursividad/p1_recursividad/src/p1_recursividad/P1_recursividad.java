/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p1_recursividad;

/**
 *
 * @author alumne
 */
public class P1_recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arañas=3;
        System.out.println("tienen un total de "+potes(arañas)+" patas");
    }
    public static int potes(int arañas){
        int pates;
        if(arañas==1){
            return 6;
        }
        else{
            if(arañas%2==0){
              pates=8;
              return pates+potes(arañas-1);  
            }
            
            else if(arañas%2!=0){
                pates=6;
            return pates+potes(arañas-1);
            }
        }
        return -1;
    }
    
}
