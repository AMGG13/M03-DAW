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
public class PanelTabla extends JPanel{
    
	private String [][] data;
	private String [] dataTitle = {"Usuario", "Descripcion","Seguidores","Tipo"};
	private JTable tabla = new JTable(data, dataTitle);
	private JScrollPane jscrollpane = new JScrollPane(tabla);
        private ArrayList<Cuenta> cuentas;
        private DAOCuenta dao;
        
        public PanelTabla(){
            setBounds(300,300,300,300);
            setVisible(true);
            add(jscrollpane,BorderLayout.CENTER);
        }
        public void JsonToArrayList(){
            dao = new DAOCuenta();
            String json = dao.listarCuentas();
            
        }
        public void addData(){
            data = new String[10][5];
            //ObjectMapper map = new ObjectMapper();
            for (int fil = 0; fil < data.length; fil++) {
                for (int col = 0; col < data[0].length;col++) {
                    //insertar los datos -->
                }
            }
        }
        
}
