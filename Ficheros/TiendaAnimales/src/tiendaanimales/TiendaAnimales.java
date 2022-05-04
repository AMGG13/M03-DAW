/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendaanimales;

import Utilidades.Menu; //
import Objetos.Canario;
import Objetos.Loro;
import Objetos.Mascotas;
import Objetos.Perro;
import Utilidades.Option;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumne
 */
public class TiendaAnimales {
    private Inventario tienda; //es un atributo de esta clase
    //y como todos los atributos, pueden acceder todos los metodos
    //sin tener que pasarselo como parametro
    private Menu menu_principal;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TiendaAnimales app = new TiendaAnimales();
        
        app.lanzarApp(); //su unica función es lanzar el metodo run
        //que ya no es estatico y que no tendra la obligación de 
        //llamar a otros metodos estáticos.
        

    }

    private void loadAnimales() {
        System.out.println("Cargando animales de muestra....");
        tienda.InsertarAnimal(new Perro("Carlos", 10, true, 2000, "Bulldog", true));
        tienda.InsertarAnimal(new Perro("Paco", 20, true, 2020, "Bichon Maltes", false));
        tienda.InsertarAnimal(new Loro("Nicolas", 20, true, 2010, 5, true,  true));
        tienda.InsertarAnimal(new Canario("Juan Carlos III", 80, true, 1942, 100, false,  false));
    }



    private void mostrarDatosAnimales() {
        tienda.MostrarListaAnimales();
    }

    private void EliminarAnimales() {
        tienda.VaciarInventario();
    }

    private void InsertarAnimal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre animal");
        String nombre = sc.nextLine();
        System.out.println("edad animal");
        int edad = sc.nextInt();
        System.out.println("anyo nacimiento animal");
        int anyo = sc.nextInt();
        boolean vivo = true;
        sc.nextLine(); //limpio buffer porque vengo de un nextint()
        System.out.println("Que tipo de animal es");
        String tipo = sc.nextLine();
        tipo = tipo.toUpperCase();//paso a maysucula
        Perro dog;
        Canario canary;
        switch(tipo)
        {
            case "PERRO":
                 System.out.println("Que raza de perro  es");
                String raza = sc.nextLine();
                boolean pulgas = false;
                dog = new Perro(nombre, edad, vivo, anyo, raza, pulgas);
                tienda.InsertarAnimal(dog);
                break;
            case "CANARIO":
               
                boolean canta = true;
                boolean vuela = true;
                int pico = 5;
                canary = new Canario(nombre, edad, canta, anyo, pico, vuela,  canta);
                tienda.InsertarAnimal(canary);
                break;
        }
        
        
        
    }

    private void lanzarApp() {
        tienda = new Inventario(); //arraylist de animales
        menu_principal = new Menu("Tienda de Animales VeterClinic");
       
        addOptionsMenu();
        
        loadAnimales(); //carga algunos animales de muestra
        int opcion;
        do{
        menu_principal.showMenu();
        opcion = menu_principal.choose();
        switch(opcion)
        {
            case 1:
                mostrarDatosAnimalesCortos();
                break;
            case 2:
                getAnimalPosicion();
                break;   
            case 3:
                getAnimalNombre();
                break;              
            case 4:
                mostrarDatosAnimales();
                break;
            case 5:
                InsertarAnimal();
                break;
            case 6:
                EliminarAnimalPorPosicion();
                break;
            case 7:
                EliminarAnimalPorNombre();
                break;
            case 8:
                EliminarAnimales();
                break;
            case 9:
                cambiarEdadAnimal();
                break;
            case 10:
                saveInDisk();
                break;
            case 11:
                readDisk();
            case 0:
                System.out.println("saliendo de la aplicacion...");
                break;
            default:
                System.out.println("opcion no implementada");
                break;
        }
        } while(opcion!=0);
        
    }

    /**
     * añade todas las opciones de nuestro menú 
     * al objeto menú
     */
    private void addOptionsMenu() {
        menu_principal.add(new Option("Salir"));
        menu_principal.add(new Option("Mostrar la lista de animales (solo tipo y nombre, 1 línea por animal)."));
        menu_principal.add(new Option("Mostrar todos los datos de un animal concreto por su posición."));
        menu_principal.add(new Option("Mostrar todos los datos de un animal concreto por nombre."));
        menu_principal.add(new Option("Mostrar todos los datos de todos los animales."));
        menu_principal.add(new Option("Insertar animales en el inventario."));
        menu_principal.add(new Option("Eliminar animales del inventario por posicion."));
        menu_principal.add(new Option("Eliminar animales del inventario por nombre."));
        menu_principal.add(new Option("Cambiar edad del animal buscado por nombre"));
        menu_principal.add(new Option("Vaciar el inventario"));
        menu_principal.add(new Option("Grabar"));
        menu_principal.add(new Option("Leer"));
        
    }

    private void mostrarDatosAnimalesCortos() {
        tienda.MostrarListaAnimalesCortos();
    }

    private void getAnimalPosicion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que animal quieres ver del 1-" + tienda.getNumMascotas());
        int posicion = sc.nextInt()-1;
        Mascotas mostrar = tienda.MostrarAnimalPorPosicion(posicion); //get ArrayList
        if (mostrar==null) //no ha encontrado nada
        {
            System.out.println("La posición no es valida ->" + (posicion+1));
        }
        else //ha encontrado algo
        {
            System.out.println("mascota encontrada;" + mostrar.datos_cortos());
        }
    }

    private void getAnimalNombre() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon nombre animal bsucasdo");
        String nombre = sc.nextLine();
        Mascotas mostrar = tienda.getAnimalNombre(nombre);
        
        
        if (mostrar==null) //no ha encontrado nada
        {
            System.out.println("No hay animal con nombre " + nombre);
        }
        else //ha encontrado algo
        {
            System.out.println("mascota encontrada;" + mostrar.datos_cortos());
        }
    }

    private void EliminarAnimalPorPosicion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que animal quieres ver del 1-" + tienda.getNumMascotas());
        int posicion = sc.nextInt()-1;
        Mascotas borrada = tienda.EliminarAnimalPosicion(posicion);
        if (borrada==null)
                {
                    System.out.println("Posicion incorrecta");
                }
        else
        {
            System.out.println("has borrado -> " + borrada.datos_cortos());
        }
    }

    private void EliminarAnimalPorNombre() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon nombre animal bsucasdo");
        String nombre = sc.nextLine();
        //si con los datos introducidos pudiera crear un
        //objeto lo crearia aquí para pasarlo
        //Mascotas del = new Mascotas(nombre);
        Mascotas borrado = tienda.BorrarAnimalPorNombre(nombre);
        if (borrado==null)
        {
            System.out.println("no hay animal coon nombre" + nombre);
        }
        else
        {
            System.out.println("Borrado" + borrado.toString());
        }
        
        
    }


    private void cambiarEdadAnimal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon nombre animal bsucasdo");
        String nombre = sc.nextLine();
        System.out.println("Pon la nueva edad");
        int edad = sc.nextInt();
        
        boolean cambiado = tienda.cambiarEdadAnimalPorNombre(nombre, edad);
        
    }

    private void saveInDisk() {
        int numItems=0;
        try {
            numItems = tienda.saveItemsToFile();    
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
            numItems=0;
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Items grabados:"+numItems);
    }

    private void readDisk() {
        try {
            if(tienda.readItems()){System.out.println("Leido correctamente");}
        }catch(FileNotFoundException a) {
            a.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException i) {
            i.printStackTrace();
        }

    }

        
    
}
