/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomia;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class RandomIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int desde= Integer.parseInt(JOptionPane.showInputDialog("Desde que numero quiere hacer el random?"));
        int hasta_aux= Integer.parseInt(JOptionPane.showInputDialog("Hasta que numero quiere hacer el random?"));
        int hasta_def=(hasta_aux-desde)+1;
        System.out.println("[+]Recordatorio: El Random se declara asi --> Random rd = new Random();");
        System.out.println("RESULTADO");
        System.out.println("--Desde "+desde+" hasta "+hasta_aux);
        if(desde>0){
         System.out.println("int random=rd.nextInt("+hasta_def+")+"+desde+";");   
        }
        else
        System.out.println("int random=rd.nextInt("+hasta_def+")"+desde+";");
        
        
    }
    
}
