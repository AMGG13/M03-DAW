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
        if(vista.BAñadir == e.getSource()){
            añadirCuenta();
        }
        else if(vista.BBorrar == e.getSource()){
            borrarCuenta();
        }
        else if(vista.BEncontrar == e.getSource()){
            encontrar();
        }
        else if (vista.BListar == e.getSource()){
            listar();
        }
    }

    public void iniciarListener() {
        vista.BAñadir.addActionListener(this);
        vista.BBorrar.addActionListener(this);
        vista.BEncontrar.addActionListener(this);
        vista.BListar.addActionListener(this);
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
            vista.getTResultado().setText("AÑADIDO");
        }else{
            vista.getTResultado().setBackground(Color.red);
            vista.getTResultado().setText("YA EXISTE");
        }
    }
    public void borrarCuenta(){
        Cuenta acc;
        String usuario = vista.getTUsuario().getText();
        String descripcion = vista.getTDescripcion().getText();
        int seguidores = Integer.valueOf(vista.getTSeguidores().getText());
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
            vista.getTResultado().setText("ELIMINADO");
        }else{
            vista.getTResultado().setBackground(Color.red);
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
        if(aux!= null){
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
            vista.getTResultado().setText("ENCONTRADO"); 
        }else{
            vista.getTResultado().setBackground(Color.red);
            vista.getTResultado().setText("NO ENCONTRADO"); 
        }
    }

    public void listar() {
        PanelTabla tabla = new PanelTabla(modelo.listarCuentas());
    }
}