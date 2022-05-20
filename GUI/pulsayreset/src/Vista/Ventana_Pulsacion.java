/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author alumne
 */
public class Ventana_Pulsacion extends JFrame{
    private JButton botonAumentar,botonReset;
    private JLabel LabelMensaje,LabelNum;
    private JCheckBox check_mas_menos;

    public Ventana_Pulsacion() {
        super("Pulsa para más");
        //configuracion de ventana
        this.setSize(300,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //definir elementos
        defineElements();
        this.setVisible(true);
        
    }

    private void defineElements() {
        Container dock = getContentPane();//Contenedor ventana
        dock.setLayout(new FlowLayout());
        botonAumentar = new JButton("Pulsaciones");
        botonReset = new JButton("Clear");
        LabelMensaje = new JLabel("Pulsaciones:");
        LabelNum = new JLabel("0");
        check_mas_menos = new JCheckBox("Restar");
        dock.add(LabelMensaje);
        dock.add(LabelNum);
        dock.add(botonAumentar);
        dock.add(botonReset);
        dock.add(check_mas_menos);
        
        
        
    }

    public JButton getBotonAumentar() {
        return botonAumentar;
    }

    public void setBotonAumentar(JButton botonAumentar) {
        this.botonAumentar = botonAumentar;
    }

    public JButton getBotonReset() {
        return botonReset;
    }

    public void setBotonReset(JButton botonReset) {
        this.botonReset = botonReset;
    }

    public JLabel getLabelMensaje() {
        return LabelMensaje;
    }

    public void setLabelMensaje(JLabel LabelMensaje) {
        this.LabelMensaje = LabelMensaje;
    }

    public JLabel getLabelNum() {
        return LabelNum;
    }

    public JCheckBox getCheck_mas_menos() {
        return check_mas_menos;
    }

    public void setCheck_mas_menos(JCheckBox check_mas_menos) {
        this.check_mas_menos = check_mas_menos;
    }

    public void setLabelNum(JLabel LabelNum) {
        this.LabelNum = LabelNum;
    }


    
    
    
}
