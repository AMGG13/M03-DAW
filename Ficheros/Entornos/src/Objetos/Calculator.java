/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public class Calculator {
    
    
    public int suma(int n1, int n2){
        int suma=n1+n2;
        if(suma%2!=0){
           
           return suma;
        }else
         return 0;
    }
    
    public int resta(int n1, int n2){
        return n1-n2;
    }
    
    public int multi(int n1, int n2){
        return n1*n2;
    }
    public double divide(int n1, int n2){
       try{
        return n1/n2;
        }catch(Exception e){
            System.err.println("Dividir por zero...");
            System.out.println(e.getMessage());
        }
       return 0;
    }
    
}
