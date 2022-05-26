/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class VentanaApp extends JFrame{
    public JMenuBar MenuBar;
    public JMenuItem MItemAñadir,MItemBorrar,MItemEncontrar,MItemListar;
    public PanelPrincipal panel = new PanelPrincipal();
    
        public VentanaApp() {
        super("Proyecto");
        setSize(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel);
        
        añadirMenu();    
        setResizable(true);
        setVisible(true);
    }

    private void añadirMenu() {
        MenuBar = new JMenuBar();
        JMenu menu;
        
        //file menu
        menu = new JMenu("Add & Delete");
        MItemAñadir = new JMenuItem("Añadir");
        MItemAñadir.setActionCommand("add");
        menu.add(MItemAñadir);
        
        MItemBorrar = new JMenuItem("Borrar");
        MItemBorrar.setActionCommand("remove");
        menu.add(MItemBorrar);
        MenuBar.add(menu);
        
        //options menu
        menu = new JMenu("Find & List");
        MItemEncontrar = new JMenuItem("Encontrar");
        MItemEncontrar.setActionCommand("find");
        menu.add(MItemEncontrar);   
        
        MItemListar = new JMenuItem("Listar");
        MItemListar.setActionCommand("list");
        menu.add(MItemListar);
        
        MenuBar.add(menu);
        
        //añado barra del menu
        setJMenuBar(MenuBar);
    }
}
