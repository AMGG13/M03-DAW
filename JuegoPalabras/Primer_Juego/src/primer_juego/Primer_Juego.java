/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer_juego;

import Objetos.Iniciales;
import Objetos.Jugador;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Primer_Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre1=(JOptionPane.showInputDialog("Cual es su nombre jugador 1?"));
        Jugador user1= new Jugador(nombre1);
        String nombre2=(JOptionPane.showInputDialog("Cual es su nombre jugador 2?"));
        Jugador user2= new Jugador(nombre2);
        
        System.out.println("Empieza El juego");
        Iniciales iniciale = new Iniciales();
        do{
        String save;
        String palabra1=(JOptionPane.showInputDialog(user1.getNombre()+"-->"+(save=iniciale.getRandomIniciales())));
        if(palabra1.startsWith(save.toLowerCase())){
            user1.setPuntos(user1.getPuntos()+100);
            JOptionPane.showInputDialog("Correcto!  +100 Puntos");
        }
        else{
            user1.setVidas(user1.getVidas()-1);
            JOptionPane.showInputDialog("Error... VIDAS:"+user1.getVidas());
        }
        
        String palabra2=(JOptionPane.showInputDialog(user2.getNombre()+"-->"+(save=iniciale.getRandomIniciales())));
        if(palabra2.startsWith(save.toLowerCase())){
            user2.setPuntos(user1.getPuntos()+100);
            JOptionPane.showInputDialog("Correcto!  +100Puntos");
        }
        else{
            user2.setVidas(user1.getVidas()-1);
            JOptionPane.showInputDialog("Error... VIDAS:"+user2.getVidas());
        }
        }while(user1.getVidas()!=0 || user2.getVidas()!=0);
        
        JOptionPane.showInputDialog(user1.getNombre()+" Puntos finales:"+user1.getPuntos());
        JOptionPane.showInputDialog(user2.getNombre()+" Puntos finales:"+user2.getPuntos());
    }
    
}
