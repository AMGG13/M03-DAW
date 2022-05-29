/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cuenta;
import Modelo.DAOCuenta;
import Modelo.Tipo;
import Vista.PanelPrincipal;
import Vista.PanelTabla;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author alumne
 */
public class ControladorBotones implements ActionListener{
    PanelPrincipal vista;
    DAOCuenta modelo;

    public ControladorBotones(PanelPrincipal vista, DAOCuenta modelo) {
        this.vista = vista;
        this.modelo = modelo;
        iniciarListener();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if(vista.BAñadir == e.getSource()|| vista.MItemAñadir.getActionCommand().equals(action)){
            añadirCuenta();
        }
        if(vista.BBorrar == e.getSource()||vista.MItemBorrar.getActionCommand().equals(action)){
            borrarCuenta();
        }
        if(vista.BEncontrar == e.getSource()||vista.MItemEncontrar.getActionCommand().equals(action)){
            encontrar();
        }
        if (vista.BListar == e.getSource()||vista.MItemListar.getActionCommand().equals(action)){
            listar();
        }
    }

    public void iniciarListener() {
        vista.BAñadir.addActionListener(this);
        vista.BBorrar.addActionListener(this);
        vista.BEncontrar.addActionListener(this);
        vista.BListar.addActionListener(this);
        vista.MItemAñadir.addActionListener(this);
        vista.MItemBorrar.addActionListener(this);
        vista.MItemEncontrar.addActionListener(this);
        vista.MItemListar.addActionListener(this);        
    }
    public void añadirCuenta(){
        Cuenta acc;
        String usuario = vista.getTUsuario().getText();
        String descripcion = vista.getTDescripcion().getText();
        int seguidores = Integer.parseInt(vista.getTSeguidores().getText());
        Tipo tipo;
        if(vista.getRBPrivado().isSelected()){
            tipo = Tipo.PRIVADA;
            acc = new Cuenta(usuario, descripcion, seguidores, tipo);
        }else if(vista.getRBPublica().isSelected()){
            tipo = Tipo.PUBLICA;
            acc = new Cuenta(usuario, descripcion, seguidores, tipo);
        }
        else{
            tipo = Tipo.PUBLICA;
            acc = new Cuenta(usuario, descripcion, seguidores, tipo);
        }
        if(modelo.añadirCuenta(acc)){
            vista.getTResultado().setBackground(Color.green);
            vista.getTResultado().setForeground(Color.BLACK);
            vista.getTResultado().setText("AÑADIDO");
        }else{
            vista.getTResultado().setBackground(Color.red);
            vista.getTResultado().setForeground(Color.black);            
            vista.getTResultado().setText("YA EXISTE");
        }
    }
    public void borrarCuenta(){
        Cuenta acc;
        String usuario = vista.getTUsuario().getText();
        String descripcion = vista.getTDescripcion().getText();
        int seguidores = 0;
        Tipo tipo = null;
        if(vista.getRBPrivado().isSelected()){
            tipo = Tipo.PRIVADA;
            acc = new Cuenta(usuario, descripcion, seguidores, tipo);
        }else if(vista.getRBPublica().isSelected()){
            tipo = Tipo.PUBLICA;
            acc = new Cuenta(usuario, descripcion, seguidores, tipo);
        }
        else{
            tipo = Tipo.PUBLICA;
            acc = new Cuenta(usuario, descripcion, seguidores, tipo);
        }
        if(modelo.borrarCuenta(acc)){
            vista.getTResultado().setBackground(Color.green);
            vista.getTResultado().setForeground(Color.black);
            vista.getTResultado().setText("ELIMINADO");
        }else{
            vista.getTResultado().setBackground(Color.red);
            vista.getTResultado().setForeground(Color.black);
            vista.getTResultado().setText("NO EXISTE");
        }
    }

    public void encontrar() {
        Cuenta acc;
        Cuenta aux;
        String usuario = vista.getTUsuario().getText();
        Tipo tipo = Tipo.PUBLICA;
        acc = new Cuenta(usuario, "", 0, tipo);
        aux = modelo.encontrarCuenta(acc);
        try{
            vista.TUsuario.setText(aux.getUsuario());
            vista.TDescripcion.setText(aux.getDescripcion());
            String seguidores = String.valueOf(aux.getSeguidores());
            vista.TSeguidores.setText(seguidores);
            if(aux.getTipo() == Tipo.PUBLICA){
                vista.RBPublica.setSelected(true);
                vista.RBPrivado.setSelected(false);
            }else if(aux.getTipo() == Tipo.PRIVADA){
                vista.RBPublica.setSelected(false);
                vista.RBPrivado.setSelected(true);
            }
            vista.getTResultado().setBackground(Color.green);
            vista.getTResultado().setForeground(Color.black);
            vista.getTResultado().setText("ENCONTRADO");
        }catch(NullPointerException e){
            vista.getTResultado().setBackground(Color.red);
            vista.getTResultado().setForeground(Color.black);
            vista.getTResultado().setText("NO ENCONTRADO"); 
        }

    }

    public void listar() {
        PanelTabla tabla = new PanelTabla(modelo.listarCuentas());
    }
}