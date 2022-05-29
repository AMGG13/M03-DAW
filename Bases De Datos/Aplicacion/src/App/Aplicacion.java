/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package App;

import Controlador.ControladorBotones;
import Modelo.DAOCuenta;
import Vista.PanelPrincipal;

/**
 *
 * @author Usuario
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PanelPrincipal panel = new PanelPrincipal();
        DAOCuenta dao= new DAOCuenta();
        ControladorBotones ventana = new ControladorBotones(panel,dao);
        
    }
    
}
