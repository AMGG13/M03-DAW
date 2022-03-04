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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inventario tienda = new Inventario();
        Scanner ent = new Scanner(System.in);
        int opcion;
        loadPet(tienda);
        do{
            opcion=menu();
            switch(opcion){
                case 1:
                    mostrarMascotas(tienda);
                    break;
                case 2:
                    insertarMascota(tienda);
                    break;
                case 3:
                    borrarInventario(tienda);
                    break;
                case 0:
                    
                    break;
                default:
                    System.err.println("Error");
                    break;
            }
            
        }while(opcion!=0);
    }

    private static void loadPet(Inventario tienda) {
        tienda.insertarMascota(new Perro("Bulldog", false, "Jose", 5, "Vivo", 2020));
        tienda.insertarMascota(new Perro("American", false, "Drako", 5, "Vivo", 2020));
        tienda.insertarMascota(new Gato("Blanco", "Pelo Largo", "Missu", 5, 2020));
        tienda.insertarMascota(new Gato("Blanco", "Pelo Corto", "suKo", 5, 2020));
        tienda.insertarMascota(new Loro("Slovenia", true, "Largo", 2000, "Pito", 5, 2020));
        tienda.insertarMascota(new Perro("Brit", false, "Brit", 5, "Vivo", 2020));
    }

    private static int menu() {
        System.out.println("1- Mostrar lista 2-Instertar 3-Delete 0-Salir");
        System.out.print("Escoge opcion ");
        Scanner ent = new Scanner(System.in);
        return ent.nextInt();
    }

    private static void mostrarMascotas(Inventario tienda) {
        tienda.mostrarLista();
    }

    private static void borrarInventario(Inventario tienda) {
        tienda.vaciarInventario();
    }

    private static void insertarMascota(Inventario tienda) {
        boolean canta = true;
        Scanner ent = new Scanner(System.in);
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
        switch(tipo){
            case "PERRO":
                System.out.println("Que raza de perro es?");
                String raza = ent.nextLine();
                dog = new Perro(raza, true, nombre, edad, tipo, año);
                System.out.println("Añadido");
                break;
            case "GATO":
                
                break;
            case "LORO":
                
                break;
            case "CANARIO":
                System.out.println("Que color es el canario");
                String color =ent.nextLine();
                System.out.println("Tu loro canta? S/N");
                String cantaono = ent.nextLine();
                if(cantaono.equalsIgnoreCase("S")){
                    canta = true;
                }
                else if (cantaono.equalsIgnoreCase("N")){
                    canta = false;
                }
                
                canary= new Canario(color, canta, tipo, edad, nombre, edad, año);
                break;
            default:
                System.err.println("No existe ese tipo");
                break;
        }
        
    }
    
}
