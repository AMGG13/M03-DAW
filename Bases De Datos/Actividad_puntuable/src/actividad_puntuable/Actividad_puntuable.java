/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad_puntuable;

import DAO.DAOBotellas;
import Objeto.Botella;
import Objeto.Menu;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad_puntuable {

    /**
     * @param args the command line arguments
     */
    private DAOBotellas DAO;
    Menu menu = new Menu("MENU");
    public static void main(String[] args) {
        Actividad_puntuable app = new Actividad_puntuable();
        app.run();
    }

    private void run() {
        DAO = new DAOBotellas();
        añadirOpciones();
        loadItems();
        int opcion;
      do{
         menu.showMenu();
         opcion= menu.giveOption();
         switch(opcion)
         {
             case 1:
                 insertarBotella();
                 break;
             case 2:
                 eliminarBotella();
                 break;
             case 3:
                 verBotellas();
                 break;
             case 4:
                 buscarBotella();
                 break;
             case 5:
                 modificarBotella();
                 break;
             case 0:
                 break;
             default:
                 System.out.println("opcion no implementada");
                 break;
         }
     } while(opcion!=0);
        
    }

    private void añadirOpciones() {
        menu.addOption("Salir");
        menu.addOption("Añadir botella");
        menu.addOption("Eliminar botella");
        menu.addOption("Listar botellas");
        menu.addOption("Buscar botella");
        menu.addOption("Modificar botella");
    }

    private void loadItems() {
        DAO.añadirBotella(new Botella(2,"Bezoya",2,1.5));
        DAO.añadirBotella(new Botella(3,"Fontbella",1.5,1));
        DAO.añadirBotella(new Botella(4,"Bezoya",6,2));
        DAO.añadirBotella(new Botella(5,"Bezoya",2,1.5));
    }

    private void insertarBotella() {
        Scanner ent= new Scanner(System.in);
        System.out.print("ID:");
        int id= ent.nextInt();
        System.out.print("MARCA:");
        String marca= ent.nextLine();
        ent.nextLine();
        System.out.print("LITROS:");
        double litros = ent.nextDouble();
        System.out.print("PRECIO:");
        double precio = ent.nextDouble();
        Botella añadir = new Botella(id,marca,litros,precio);
        if(DAO.añadirBotella(añadir)){
            System.out.println("Añadido correctamente");
        }else{
            System.err.println("Ya existe");
        }
    }

    private void eliminarBotella() {
        Scanner ent= new Scanner(System.in);
        System.out.print("ID:");
        int id= ent.nextInt();
        Botella eliminar = new Botella(id,"none",0,0);
        if(DAO.eliminarBotella(eliminar)){
            System.out.println("Eliminado correctamente");
        }else{
                
            System.err.println("No existe");
        }
    }

    private void verBotellas() {
        int mostrados = DAO.mostrarBotellas();
        System.out.println("resultados mostrados:"+mostrados);
    }

    private void modificarBotella() {
        Scanner ent= new Scanner(System.in);
        System.out.print("Precio a cambiar:");
        double precio = ent.nextDouble();
        System.out.print("A botellas con litros:");
        double litros = ent.nextDouble();
        System.out.println("Se han modificado "+DAO.modificarBotella(litros, precio)+" botellas");
    }

    private void buscarBotella() {
        Scanner ent= new Scanner(System.in);
        System.out.println("ID de botella a buscar:");
        int id = ent.nextInt();
        if(DAO.buscarBotellaPorID(id)){
            System.out.println("Botella buscada correctamente");
        }else{
            System.err.println("No existe la botella que has buscado");
        }
    }
    
}
