/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package App;

import Controlador.ControladoMenu;
import Controlador.ControladorBotones;
import Modelo.CConect;
import Modelo.DAOCuenta;
import Vista.PanelPrincipal;
import Vista.VentanaApp;

/**
 *
 * @author Usuario
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        CConect mongo = new CConect();
//        mongo.Conect();
        VentanaApp panel = new VentanaApp();
        DAOCuenta dao= new DAOCuenta();
        ControladoMenu ventana = new ControladoMenu(panel,dao);
        
    }
    
}
