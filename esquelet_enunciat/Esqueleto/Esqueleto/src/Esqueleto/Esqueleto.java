/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esqueleto;


import Exceptions.LimitAnimalException;
import Exceptions.SpeciesNumberException;
import Objetos.Animales;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Esqueleto {
     /*pots afegir atributs falta codigo SEGURO*/
     private Menu menu_principal = new Menu("MENU ANIMALES");
     private CollectionDAO lista;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SpeciesNumberException, LimitAnimalException {
       /*falta codigo SEGURO*/
       Esqueleto app = new Esqueleto();
        app.run();
        //metodo no static, que permite llamar a 
        //otros metodos no static   
    }

    private void run() throws SpeciesNumberException, LimitAnimalException {
        /* falta codigo SEGURO para definir el objeto dao correctamente*/      
        lista = new CollectionDAO();
        int opcion;
        loadObjects();
        addOptions();
        do{
            menu_principal.showMenu();
            opcion=menu_principal.giveOption();
            exacuteOptions(opcion);
        } while(opcion!=0);
    }    
    
    
    /* Cargar objetos de muestra*/
    private void loadObjects() throws SpeciesNumberException, LimitAnimalException {
        lista.AfegirObjecte(new Animales("Elefante","Elefantino",3));
        lista.AfegirObjecte(new Animales("Leon","Leonius",4));
        lista.AfegirObjecte(new Animales("Tigre","Tigris",3));
        lista.AfegirObjecte(new Animales("Oso polar","Ositus polarius",3));
        lista.AfegirObjecte(new Animales("Nutria","Nutrius",6));
    }



    private void listarAnimales(/*podria faltar codigo SEGURO*/) {
        //TODO
        
        Iterator<Animales> it = lista.getCollectionInventada().iterator();
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
    }

    private void añadirAnimal(/*podria faltar codigo SEGURO*/) throws SpeciesNumberException, LimitAnimalException {
       //TODO
       Scanner ent = new Scanner (System.in);
        System.out.print("Nombre:");
        String nombre = ent.nextLine();
        System.out.print("Nombre cientifico:");
        String nombre_cientifico = ent.nextLine();
        System.out.print("Cantidad:");
        int cantidad = ent.nextInt();
        try{
            if(lista.AfegirObjecte(new Animales(nombre,nombre_cientifico,cantidad))){
                System.out.println("Añadido correctamente");
                cantidadAnimales();
            }else{
                System.err.println("Ya existe");
                cantidadAnimales();
            }
        }catch(LimitAnimalException e){
            System.err.println(e.getMessage());
        }catch(SpeciesNumberException e){
            System.err.println(e.getMessage());
        } 
    }

    private  void eliminarAnimal(/*podria faltar codigo SEGURO*/) {
        //TODO 
         Scanner ent = new Scanner (System.in);
         System.out.print("Nombre:");
         String nombre = ent.nextLine();
         if(lista.EsborrarObjecte(new Animales(nombre))){
             System.out.println("Eliminado correctamente");
             cantidadAnimales();
         }else{
             System.err.println("No existe");
             cantidadAnimales();
         }

    }

    private  void modificarAnimal(/*podria faltar codigo SEGURO*/) throws SpeciesNumberException {
        Scanner ent = new Scanner (System.in);
        System.out.print("Nombre:");
        String nombre = ent.nextLine();
        System.out.print("Cantidad:");
        int cantidad = ent.nextInt();
        try{
            if(lista.modificarNum(new Animales(nombre,cantidad))){
                System.out.println("Modificado correctamente");
            }
            else{
                System.err.println("No existe");
            }
        }catch(SpeciesNumberException e){
            System.err.println(e.getMessage());
        }    
    }
    
    private  void cantidadAnimales(/*podria faltar codigo SEGURO*/) {
        //TODO 
        System.out.println("Hay "+lista.numeroObjectesGuardats()+" animales");
    }

    private void exacuteOptions(int opcion) throws SpeciesNumberException, LimitAnimalException {
        switch(opcion)
        {
            case 1:
                listarAnimales(/*podria faltar variables o no*/);
                break;
            case 2:
                añadirAnimal();
                break;    
            case 3:
                eliminarAnimal();
                break;
            case 4:
                modificarAnimal();
                break;
            case 5:
                cantidadAnimales();
                break;
            case 0:
                System.out.println("saliendo");
                break;
            default:
                System.out.println("opcion no implementada");
                break;
        }
    }

    private void addOptions() {
        menu_principal.addOption("Salir");
        menu_principal.addOption("Llistar totes les espècies");
        menu_principal.addOption("Inserir una nova espècie");
        menu_principal.addOption("Eliminar una espècie: demanaras el name a eliminar ");
        menu_principal.addOption("Modificar el numIndividus, per una espècie donant el seu scientificname");
        menu_principal.addOption("Retornar el llistat d’animals que tinguem menys de 5 individus.");
        
    }


    
        
    
}

