/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.DAOCuenta;
import Vista.PanelPrincipal;
import Vista.VentanaApp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author alumne
 */
public class ControladoMenu implements ActionListener{
   VentanaApp ventana;
   DAOCuenta dao;
   PanelPrincipal panel;
   ControladorBotones controller;
    public ControladoMenu(VentanaApp ventana, DAOCuenta dao) {
        this.ventana = ventana;
        this.dao = dao;
        iniciarListener();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
                switch (action) {
            case "add":
                menuAñadir();
                break;
                
            case "remove":
                menuBorrar();
                break;

            case "find":
                menuEncontrar();
                break;
            case "list":
                menuListar();
                break;
                
        }
    }

    private void iniciarListener() {
        ventana.MItemAñadir.addActionListener(this);
        ventana.MItemBorrar.addActionListener(this);
        ventana.MItemEncontrar.addActionListener(this);
        ventana.MItemListar.addActionListener(this);
    }

    private void menuAñadir() {
        panel = new PanelPrincipal();
        controller = new ControladorBotones(panel, dao);
        controller.añadirCuenta();
        ventana.validate();
    }

    private void menuBorrar() {
        panel = new PanelPrincipal();
        controller = new ControladorBotones(panel, dao);
        controller.borrarCuenta();
        ventana.validate();
    }

    private void menuEncontrar() {
        panel = new PanelPrincipal();
        controller = new ControladorBotones(panel, dao);
        controller.añadirCuenta();   
        ventana.validate();
    }

    private void menuListar() {
        panel = new PanelPrincipal();
        controller = new ControladorBotones(panel, dao);
        controller.listar();
        ventana.validate();
    }
   
   
}
