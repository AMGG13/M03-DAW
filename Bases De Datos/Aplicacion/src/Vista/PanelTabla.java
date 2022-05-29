/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Cuenta;
import Modelo.DAOCuenta;
import java.awt.BorderLayout;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
//import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author alumne
 */
public class PanelTabla extends JFrame{
	private JTable tabla;
        private DefaultTableModel mod;
	private JScrollPane scroll;
        
        public PanelTabla(String [][] data){// SE LES PASAN LOS DATOS COMO PARAMETRO PARA INSERTARLOS
            super("DATOS DE USUARIOS");
            String [] dataTitle ={"Usuario","Descripcion","Seguidores","Tipo"};//CABECERA
            mod = new DefaultTableModel(data,dataTitle);
            tabla = new JTable(mod);
            tabla.enable(false);
            scroll = new JScrollPane(tabla);
            scroll.setBounds(40,40,400,100);
            setLayout(null);
            setSize(500,200);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            add(scroll,BorderLayout.CENTER);
            setVisible(true);
        }
}
