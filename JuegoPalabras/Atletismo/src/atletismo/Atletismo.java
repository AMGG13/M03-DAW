/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atletismo;

import Objetos.Atleta;

/**
 *
 * @author Usuario
 */
public class Atletismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("Maraton", 45, "Paco", 20);
        
        atleta1.setDisciplina("Triatlon");
        atleta1.setDorsal(88);
        
        System.out.println(atleta1.irCalse());
        atleta1.correr();
        atleta1.saltar();
        atleta1.nadar();
        System.out.println(atleta1.toString());
    }
    
}
