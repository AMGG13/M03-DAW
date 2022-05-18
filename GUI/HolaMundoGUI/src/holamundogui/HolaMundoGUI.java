/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundogui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author alumne
 */
public class HolaMundoGUI extends JFrame{

    public HolaMundoGUI(){
        JLabel mensaje = new JLabel("Hola Mundo :)");
        mensaje.setBounds(500, 1000, 1000, 1000);
        //Configuro algunos parametros de la ventana JFrame
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.getContentPane().add(mensaje,"Center");
        //Darle tamaño a la ventana
        this.setSize(300,200);
        this.setVisible(true);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new HolaMundoGUI();
    }
    
}
