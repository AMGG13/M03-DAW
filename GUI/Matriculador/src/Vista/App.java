/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.*;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author alumne
 */
public class App extends JFrame{
    private JButton botonGuardar,botonReset,botonListar,botonBorrar;
    private JLabel LabelNombre,LabelApellido,LabelEdad,LabelCiclos,LabelLista;
    private JTextField TextNombre,TextApellido,TextEdad,TextCiclos;
    private JTextArea TextListar;
    //private JList<>; combobox
    private JComboBox lista;

    public App() {
        super("Matricula");
        this.setSize(800,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setProperties();
        this.setVisible(true);
    }

    public JTextArea getTextListar() {
        return TextListar;
    }

    public void setTextListar(String TextListar) {
        this.TextListar.setText(TextListar+"\n");
    }

    
    public JLabel getLabelLista() {
        return LabelLista;
    }

    public void setLabelLista(String LabelLista) {
        this.LabelLista.setText("<html>"+LabelLista+"</html>");
    }

    
    public JButton getBotonGuardar() {
        return botonGuardar;
    }

    public void setBotonGuardar(JButton botonGuardar) {
        this.botonGuardar = botonGuardar;
    }

    public JButton getBotonReset() {
        return botonReset;
    }

    public void setBotonReset(JButton botonReset) {
        this.botonReset = botonReset;
    }

    public JButton getBotonListar() {
        return botonListar;
    }

    public void setBotonListar(JButton botonListar) {
        this.botonListar = botonListar;
    }

    public JButton getBotonBorrar() {
        return botonBorrar;
    }

    public void setBotonBorrar(JButton botonBorrar) {
        this.botonBorrar = botonBorrar;
    }

    public JLabel getLabelNombre() {
        return LabelNombre;
    }

    public void setLabelNombre(JLabel LabelNombre) {
        this.LabelNombre = LabelNombre;
    }

    public JLabel getLabelApellido() {
        return LabelApellido;
    }

    public void setLabelApellido(JLabel LabelApellido) {
        this.LabelApellido = LabelApellido;
    }

    public JLabel getLabelEdad() {
        return LabelEdad;
    }

    public void setLabelEdad(JLabel LabelEdad) {
        this.LabelEdad = LabelEdad;
    }

    public JLabel getLabelCiclos() {
        return LabelCiclos;
    }

    public void setLabelCiclos(JLabel LabelCiclos) {
        this.LabelCiclos = LabelCiclos;
    }

    public JTextField getTextNombre() {
        return TextNombre;
    }

    public void setTextNombre(String TextNombre) {
        this.TextNombre.setText(TextNombre);
    }

    public JTextField getTextApellido() {
        return TextApellido;
    }

    public void setTextApellido(String TextApellido) {
        this.TextApellido.setText(TextApellido);
    }

    public JTextField getTextEdad() {
        return TextEdad;
    }

    public void setTextEdad(String TextEdad) {
        this.TextEdad.setText(TextEdad);
    }
    

    public JTextField getTextCiclos() {
        return TextCiclos;
    }

    public void setTextCiclos(JTextField TextCiclos) {
        this.TextCiclos = TextCiclos;
    }

    public JComboBox getLista() {
        return lista;
    }

    public void setLista(Ciclos lista) {
        this.lista.setSelectedItem(lista);
    }
    

    private void setProperties() {
        Container dock = getContentPane();
        //Panel Datos
        JPanel panelDatos = new JPanel();
        GridLayout gl =new GridLayout(2,6);
        panelDatos.setLayout(gl);
        LabelNombre = new JLabel("Nombre:");
        LabelApellido = new JLabel("Apellido::");
        LabelEdad = new JLabel("Edad:");
        LabelCiclos = new JLabel("Ciclos:");
        TextNombre = new JTextField();
        TextApellido = new JTextField();
        TextEdad = new JTextField();
        lista = new JComboBox(Ciclos.values());
        LabelLista = new JLabel();
        LabelLista.setBackground(Color.red);
        LabelLista.setOpaque(true);
        panelDatos.add(LabelNombre);
        panelDatos.add(TextNombre);
        panelDatos.add(LabelApellido);
        panelDatos.add(TextApellido);
        panelDatos.add(LabelEdad);
        panelDatos.add(TextEdad);
        panelDatos.add(LabelCiclos);
        panelDatos.add(lista);
        //panel Lista
        JPanel panelLista = new JPanel();
        GridLayout gl2 =new GridLayout(2,1);
        panelLista.setLayout(gl2);
        LabelLista.setText("<html>Primera linea<br>Segunda Linea</html>");
        TextListar = new JTextArea("");
        TextListar.enable(false);
        panelLista.add(LabelLista);
        panelLista.add(TextListar);
        //Panel botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());
        botonGuardar = new JButton("Guardar");
        botonReset = new JButton("Reset");
        botonListar = new JButton("Listar");
        botonBorrar = new JButton("Borrar");
        panelBotones.add(botonGuardar);
        panelBotones.add(botonReset);
        panelBotones.add(botonListar);
        panelBotones.add(botonBorrar);
        //Añadimos al container
        JLabel tittle = new JLabel("INTRODUCE DATOS",SwingConstants.CENTER);
        dock.add(tittle,BorderLayout.NORTH);
        dock.add(panelDatos,BorderLayout.CENTER);
        dock.add(panelBotones,BorderLayout.SOUTH);
        dock.add(panelLista,BorderLayout.EAST);

    }
    
}
