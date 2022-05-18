/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventanas;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author alumne
 */
public class VentanaDatosPersona extends JFrame{

    public VentanaDatosPersona(String title) {
        super(title);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panelFecha = new JPanel();
        panelFecha.setLayout(new FlowLayout());
        panelFecha.add(new JTextField(2));
        panelFecha.add(new JLabel("/"));
        panelFecha.add(new JTextField(2));
        panelFecha.add(new JLabel("/"));
        panelFecha.add(new JTextField(2));
        
        JPanel panelDatos = new JPanel();
        panelDatos.setLayout(new GridLayout(3,2));
        panelDatos.add(new JLabel("NOMBRE:"));
        panelDatos.add(new JTextField(8));
        panelDatos.add(new JLabel("DNI:"));
        panelDatos.add(new JTextField(10));
        panelDatos.add(new JLabel("FECHA:"));
        panelDatos.add(panelFecha);
        
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());
        panelBotones.add(new JButton("Aceptar"));
        panelBotones.add(new JButton("Borrar"));
        
        Container dock = getContentPane();
        dock.add(panelDatos,BorderLayout.CENTER);
        dock.add(panelBotones,BorderLayout.SOUTH);
        
    }
    
    
}
