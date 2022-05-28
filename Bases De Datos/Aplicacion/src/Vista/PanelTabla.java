/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Cuenta;
import Modelo.DAOCuenta;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.*;
//import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author alumne
 */
public class PanelTabla extends JFrame{
	private String [] dataTitle = {"Usuario", "Descripcion","Seguidores","Tipo"};
	private JTable tabla;
	private JScrollPane jscrollpane = new JScrollPane(tabla);
        
        public PanelTabla(String [][] data){
            tabla = new JTable(data,dataTitle);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            add(jscrollpane,BorderLayout.CENTER);
            add(tabla);
            setVisible(true);
        }
}
