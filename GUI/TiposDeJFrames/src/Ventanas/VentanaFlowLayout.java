/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventanas;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author alumne
 */
public class VentanaFlowLayout extends JFrame{

    public VentanaFlowLayout(String title){
        super(title); //llamar al codigo del constructor padre(JFrame)
        setParameters();
    }

    private void setParameters() {
        //tamaño
        setSize(500, 400);
        //cerrar Ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Contenedor del JFrame (panel)
        Container dock = getContentPane();
        dock.setLayout(new FlowLayout());
        JLabel etiqueta_nombre = new JLabel("Nombre");
        //20 son los caracteres que quiero que quepan
        JTextField cuadro_nombre = new JTextField(20);
        JButton boton = new JButton("Saludar");
        JLabel etiqueta_nombre2 = new JLabel("Edad");
        JTextField cuadro_nombre2 = new JTextField(3);
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String nom = cuadro_nombre.getText();//recupero texto y lo vuelvo string
                String saludo = "Hola "+nom+"!";
                cuadro_nombre.setText(saludo);
            }
        };
        boton.addActionListener(al);
        JButton boton2 = new JButton("Saludar");
        dock.add(boton2);
        dock.add(etiqueta_nombre);
        dock.add(cuadro_nombre);
        dock.add(etiqueta_nombre2);
        dock.add(cuadro_nombre2);
        dock.add(boton);
        
    }
    
}
