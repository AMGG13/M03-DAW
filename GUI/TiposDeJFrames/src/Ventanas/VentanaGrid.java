/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventanas;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author alumne
 */
public class VentanaGrid extends JFrame{

    public VentanaGrid(String title){
        super(title);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container dock = getContentPane();
        GridLayout gr = new GridLayout(4, 3);
        gr.setHgap(15);//Distancia en pixeles entre los componentes
        gr.setVgap(15);
        dock.setLayout(gr);//al panel del jframe va a ser Grid Layout
        for (int i = 0; i < 10; i++) {
            dock.add(new JButton(String.valueOf(i)));
        }
        dock.add(new JButton("*"));
        dock.add(new JButton("+"));
        dock.add(new JButton("="));
    }
    
}
