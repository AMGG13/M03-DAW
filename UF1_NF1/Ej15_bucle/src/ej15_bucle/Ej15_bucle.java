/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej15_bucle;

import javax.swing.JOptionPane;

/**
 *
 * @author alumne
 */
public class Ej15_bucle {

    private static Object math;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int base,exp,cont=1,resultado=1;
        
        base=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la base"));
        exp=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el exponente"));
        while(cont<=exp)
        {
            JOptionPane.showMessageDialog(null, "El resultado es "+resultado+" y la base es "+base);
            resultado=resultado*base;
            
            JOptionPane.showMessageDialog(null, "El total es "+resultado);
        cont++;
        }
        JOptionPane.showMessageDialog(null, "El resultado "+resultado);
    }
    
}
