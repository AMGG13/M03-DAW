/**
 * Ejercicio 3: Construir un programa que dada una serie de vehículos caracterizados por su marca
 * ,modelo y precio, imprima las propiedades del vehículo más barato. Para ello, se deberán leer por
 * teclado las características de cada vehículo y crear una clase que represente a cada uno de ellos.
 */
package encuentra_el_vehiculo_mas_caro;

import Objetos.Vehiculo;
import java.util.Scanner;

public class Encuentra_el_vehiculo_mas_caro {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String marca,modelo;
        float precio;
        int num_vehiculos, indice_coche_barato;
        System.out.println("Cuantos vehiculos quieres almacenar en el garaje?");
        num_vehiculos=ent.nextInt();
        ent.nextLine();
        Vehiculo [] Garaje = new Vehiculo[num_vehiculos];
        
        for (int i = 0; i < Garaje.length; i++) {
            System.out.println("Digite las caracteristicas del coche "+(i+1));
            System.out.print("Marca: ");
            marca=ent.nextLine();
            System.out.print("\nModelo: ");
            modelo=ent.nextLine();
            System.out.print("\nPrecio: ");
            precio=ent.nextFloat();
            ent.nextLine();
            Garaje[i]= new Vehiculo(marca, modelo, precio);
        }
        System.out.println("Estas son las caratcteristicas del coche mas barato");
        indice_coche_barato = indiceMasBarato(Garaje);
        System.out.println(Garaje[indice_coche_barato].mostrarVehiculos());
        
    }
    
    public static int indiceMasBarato(Vehiculo Garaje[]){
        float precio;
        int indice=0;
        precio= Garaje[0].getPrecio();
        for (int i = 1; i < Garaje.length; i++) {
            if(Garaje[i].getPrecio()<precio){
                precio=Garaje[i].getPrecio();
                indice=i;
            }
        }
        return indice;
    }
    
}
