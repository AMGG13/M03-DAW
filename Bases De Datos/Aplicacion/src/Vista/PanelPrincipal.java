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
    public JTextField TUsuario,TDescripcion,TSeguidores;
    
    public PanelPrincipal(){
        setProperties();
    }

    private void setProperties() {
        JPanel CENTRAL = setCentralPanel();//Panel central
        JPanel SUR = setSurPanel(); //Panel de botones
        addToContainer(CENTRAL,SUR);
        
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
        
        CENTRAL.add(labelUsuario);
        CENTRAL.add(TUsuario);
        CENTRAL.add(labelDescripcion);
        CENTRAL.add(TDescripcion);
        CENTRAL.add(labelSeguidores);
        CENTRAL.add(TSeguidores);
        return CENTRAL;
    }

    private JPanel setSurPanel() {
        JPanel SUR = new JPanel();
        SUR.setLayout(new FlowLayout());
        BAñadir = new JButton("Añadir");
        BBorrar = new JButton("Borrar");
        BEncontrar = new JButton("Encontrar");
        BListar = new JButton("Listar");
        SUR.add(BAñadir);
        SUR.add(BBorrar);
        SUR.add(BEncontrar);
        SUR.add(BListar);
        SUR.setAlignmentY(BOTTOM_ALIGNMENT);
        return SUR;
    }

    private void addToContainer(JPanel CENTRAL, JPanel SUR) {
        add(CENTRAL,BorderLayout.CENTER);
        add(SUR,BorderLayout.SOUTH);
    }
    
    
    
}
