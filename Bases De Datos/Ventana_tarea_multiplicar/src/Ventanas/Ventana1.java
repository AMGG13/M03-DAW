/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventanas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class Ventana1 extends JFrame{

    public Ventana1(String title) {
        super(title);
        setParameters();
    }

    private void setParameters() {
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container dock = getContentPane();
        dock.setLayout(new FlowLayout());
        JTextField cuadro_numero = new JTextField(5);
        JButton boton = new JButton("X5");
        JLabel etiqueta_res = new JLabel("Resultado");
        JTextField cuadro_resultado = new JTextField(10);
        cuadro_resultado.enable(false);
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer a = Integer.parseInt(cuadro_numero.getText());
                final byte POR5 = 5;
                int res=POR5*a;
                String resultado = String.valueOf(res);
                cuadro_resultado.setText(resultado);
            }
        };
        boton.addActionListener(action);
        dock.add(cuadro_numero);
        dock.add(boton);
        dock.add(etiqueta_res);
        dock.add(cuadro_resultado);
    }
    
}
