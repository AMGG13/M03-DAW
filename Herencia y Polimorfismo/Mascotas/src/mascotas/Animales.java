/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mascotas;

import Objetos.Canario;
import Objetos.Perro;
import Objetos.Gato;
import Objetos.Loro;
import Objetos.Mascotas;
import Objetos.Aves;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Animales {
    private Inventario tienda;
    private Menu menu_principal;
    
    /**
     * @param args the command line arguments
     */
    static Scanner ent = new Scanner(System.in);
    public static void main(String[] args) {
        Animales app = new Animales();
        app.runApp();
        
    }

    private void loadPet() {
        tienda.insertarMascota(new Perro("Bulldog", false, "Jose", 5, "Vivo", 2020));
        tienda.insertarMascota(new Perro("American", false, "Drako", 5, "Vivo", 2020));
        tienda.insertarMascota(new Gato("Blanco", true, "Missu", 5, 2020));
        tienda.insertarMascota(new Gato("Blanco", false, "Miko", 5, 2020));
        tienda.insertarMascota(new Loro("Slovenia", true, "Largo", 2000, "Pito", 5, 2020));
        tienda.insertarMascota(new Perro("Brit", false, "Brit", 5, "Vivo", 2020));
        tienda.insertarMascota(new Canario("Verde", true, "corto", 2, "Skrico", 3, 2020));
    }

    private void mostrarMascotas() {
        tienda.mostrarLista();
    }

    private void borrarInventario() {
        tienda.vaciarInventario();
    }

    private void insertarMascota() {
        boolean canta = true;
        System.out.print("Nombre mascota: ");
        String nombre = ent.nextLine();
        System.out.print("Edad mascota: ");
        int edad = ent.nextInt();
        System.out.print("Año nacimiento: ");
        int año = ent.nextInt();
        String vivo = "Vivo";
        ent.nextLine();
        System.out.println("Que mascota es?");
        String tipo = ent.nextLine();
        tipo.toUpperCase();
        Perro dog;
        Canario canary;
        Gato cat;
        Loro bird;
        switch(tipo){
            case "PERRO":
                System.out.println("Que raza de perro es?");
                String raza = ent.nextLine();
                dog = new Perro(raza, true, nombre, edad, tipo, año);
                System.out.println("Añadido");
                break;
            case "GATO":
                System.out.println("De que color es el gato");
                String color = ent.nextLine();
                System.out.println("Tiene el pelo largo? (s/n)");
                char pelo = ent.nextLine().charAt(0);
                if(pelo == 's'){
                    cat = new Gato(color, true, nombre, edad, año);
                }else{
                    cat = new Gato(color, false, nombre, edad, año);
                }
                
                System.out.println("Añadido");
                break;
            case "LORO":
                System.out.println("Cual es el origen?");
                String origen = ent.nextLine();
                System.out.println("El loro habla? (s/n)");
                char siono = ent.nextLine().charAt(0);
                if(siono == 's'){
                    bird = new Loro(origen, true, tipo, edad, nombre, edad, año);
                }
                else{
                    bird = new Loro(origen, false, tipo, edad, nombre, edad, año);
                }
                System.out.println("Añadido");
                break;
            case "CANARIO":
                System.out.println("Que color es el canario");
                String colors =ent.nextLine();
                System.out.println("Tu loro canta? S/N");
                String cantaono = ent.nextLine();
                if(cantaono.equalsIgnoreCase("S")){
                    canta = true;
                }
                else if (cantaono.equalsIgnoreCase("N")){
                    canta = false;
                }
                
                canary= new Canario(colors, canta, tipo, edad, nombre, edad, año);
                break;
            default:
                System.err.println("No existe ese tipo");
                break;
        }
        
    }

    private void runApp() {
        tienda = new Inventario();
        int opcion;
        menu_principal = new Menu("Tienda de animales VeterClinic");
        
        addOptionsMenu();
        loadPet();
        do{
            menu_principal.showMenu();
            opcion=menu_principal.choose();
            switch(opcion){
                case 1:
                    mostrarDatosCortos();
                    break;
                case 2:
                    mostrarDatosAnimalConcreto();
                    break;
                case 3:
                    mostrarMascotas();
                    break;
                case 4:
                    insertarMascota();
                    break;
                case 5:
                    eliminarAnimales();
                    break;
                case 6:
                    borrarInventario();
                    break;
                case 0:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.err.println("Opcion no implementada");
                    break;
            }
            
        }while(opcion!=0);
    }

    private void addOptionsMenu() {
        menu_principal.add(new Option("Salir"));
        menu_principal.add(new Option("Mostrar la lista de animales (solo tipo y nombre, 1 línea por animal)."));
        menu_principal.add(new Option("Mostrar todos los datos de un animal concreto."));
        menu_principal.add(new Option("Mostrar todos los datos de todos los animales."));
        menu_principal.add(new Option("Insertar animales en el inventario."));
        menu_principal.add(new Option("Eliminar animales del inventario."));
        menu_principal.add(new Option("Vaciar el inventario."));
    }

    private void mostrarDatosCortos() {
        tienda.mostrarDatosCortos();
    }

    private void mostrarDatosAnimalConcreto() {
        System.out.println("Cual es el nombre de la mascota que buscas?");
        String nombre=ent.nextLine();
        String datos=tienda.mostrarAnimalConcreto(nombre);
        System.out.println(datos);
    }

    private void eliminarAnimales() {
        System.out.println("Cual es el nombre de la mascota que desea eliminar?");
        String nombre=ent.nextLine();
        String deleted=tienda.borrarAnimal(nombre);
        System.out.println(deleted);
    }
    
}
