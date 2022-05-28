/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class PanelPrincipal extends JPanel{
    public JButton BAñadir,BListar,BEncontrar,BBorrar;
    public JTextField TUsuario,TDescripcion,TSeguidores,TResultado;
    public JRadioButton RBPrivado,RBPublica;
    public JLabel Resultado;
    public PanelPrincipal(){
        setProperties();
    }

    private void setProperties() {
        JPanel CENTRAL = setCentralPanel();//Panel central
        JPanel SUR = setSurPanel(); //Panel de botones
        addToContainer(CENTRAL,SUR);
        setVisible(true);
        
    }

    private JPanel setCentralPanel() {
        JPanel CENTRAL = new JPanel();
        GridLayout gl =new GridLayout(4,1);
        gl.setVgap(10);
        
        CENTRAL.setLayout(gl);
        JLabel labelUsuario = new JLabel("Usuario(obligatorio):");
        TUsuario = new JTextField(10);
        JLabel labelDescripcion = new JLabel("Descripcion(opcional):");
        TDescripcion = new JTextField(20);
        JLabel labelSeguidores = new JLabel("Seguidores(obligatorio):");
        TSeguidores = new JTextField(8);
        
        RBPrivado = new JRadioButton("Privada");
        RBPublica = new JRadioButton("Publica");
        ButtonGroup RBSeleccion = new ButtonGroup();
        RBSeleccion.add(RBPrivado);
        RBSeleccion.add(RBPublica);
        
        CENTRAL.add(labelUsuario);
        CENTRAL.add(TUsuario);
        CENTRAL.add(labelDescripcion);
        CENTRAL.add(TDescripcion);
        CENTRAL.add(labelSeguidores);
        CENTRAL.add(TSeguidores);
        CENTRAL.add(RBPrivado);
        CENTRAL.add(RBPublica);
        
        return CENTRAL;
    }

    private JPanel setSurPanel() {
        JPanel SUR = new JPanel();
        SUR.setLayout(new FlowLayout());
        BAñadir = new JButton("Añadir");
        BBorrar = new JButton("Borrar");
        BEncontrar = new JButton("Encontrar");
        BListar = new JButton("Listar");
        Resultado = new JLabel("Resultado:");
        TResultado = new JTextField(10);
        TResultado.disable();
        SUR.add(BAñadir);
        SUR.add(BBorrar);
        SUR.add(BEncontrar);
        SUR.add(BListar);
        SUR.add(Resultado);
        SUR.add(TResultado);
        SUR.setAlignmentY(BOTTOM_ALIGNMENT);
        return SUR;
    }

    private void addToContainer(JPanel CENTRAL, JPanel SUR) {
        add(CENTRAL,BorderLayout.CENTER);
        add(SUR,BorderLayout.SOUTH);
    }

    public JButton getBAñadir() {
        return BAñadir;
    }

    public JButton getBListar() {
        return BListar;
    }

    public JButton getBEncontrar() {
        return BEncontrar;
    }

    public JButton getBBorrar() {
        return BBorrar;
    }

    public JTextField getTUsuario() {
        return TUsuario;
    }

    public JTextField getTDescripcion() {
        return TDescripcion;
    }

    public JTextField getTSeguidores() {
        return TSeguidores;
    }

    public JRadioButton getRBPrivado() {
        return RBPrivado;
    }

    public JRadioButton getRBPublica() {
        return RBPublica;
    }

    public void setBAñadir(JButton BAñadir) {
        this.BAñadir = BAñadir;
    }

    public void setBListar(JButton BListar) {
        this.BListar = BListar;
    }

    public void setBEncontrar(JButton BEncontrar) {
        this.BEncontrar = BEncontrar;
    }

    public void setBBorrar(JButton BBorrar) {
        this.BBorrar = BBorrar;
    }

    public void setTUsuario(JTextField TUsuario) {
        this.TUsuario = TUsuario;
    }

    public void setTDescripcion(JTextField TDescripcion) {
        this.TDescripcion = TDescripcion;
    }

    public void setTSeguidores(JTextField TSeguidores) {
        this.TSeguidores = TSeguidores;
    }

    public void setRBPrivado(JRadioButton RBPrivado) {
        this.RBPrivado = RBPrivado;
    }

    public void setRBPublica(JRadioButton RBPublica) {
        this.RBPublica = RBPublica;
    }

    public JTextField getTResultado() {
        return TResultado;
    }

    public void setTResultado(JTextField TResultado) {
        this.TResultado = TResultado;
    }

    public JLabel getResultado() {
        return Resultado;
    }

    public void setResultado(JLabel Resultado) {
        this.Resultado = Resultado;
    }
    
    
    
    
    
}
