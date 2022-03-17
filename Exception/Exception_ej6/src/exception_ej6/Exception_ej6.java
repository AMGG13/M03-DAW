/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception_ej6;

import Objetos.Gato;

/**
 *
 * @author Usuario
 */
public class Exception_ej6 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        Gato g1 = new Gato("Gaturro", 5);
        Gato g2 = new Gato("Miau", 1);
        Gato g3 = new Gato("Kayuzo", 1);
        Gato g4 = new Gato("Zorro", 1);
        
        g3.setNombre("Kayu");
        g4.setEdad(-7);
        
        g3.mostrarDatos();
        g4.mostrarDatos();
        
        
        
    }
    
}
