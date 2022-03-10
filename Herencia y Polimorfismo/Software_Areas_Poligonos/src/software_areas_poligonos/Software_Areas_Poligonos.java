/**
 * Ejercicio 9: Hacer un programa para calcular el área de Polígonos
 * (Triángulos y Rectángulos) el programa debe ser capaz de almacenar en un arreglo N triángulos y rectángulos, y al final mostrar
 * el área y los datos de cada uno. Para ello se tendrá lo siguiente:
 * 
 * - Una super clase llamada Polígono.
 * - Una sub clase llamada Rectángulo.
 * - Una sub clase llamada Triángulo.
 */
package software_areas_poligonos;

import Objetos.Poligono;
import Objetos.Rectangulo;
import Objetos.Triangulo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Software_Areas_Poligonos {

    static ArrayList<Poligono> poligonos = new ArrayList<>();
    static Scanner ent = new Scanner (System.in);
    
    public static void main(String[] args) {
        llenarPoligonos();//pedir Poligonos
        
        mostrarAreaPoligonos();
    }

    private static void llenarPoligonos() {
        char respuesta;
        int opcion;
        do{
            do{
                System.out.println("Que poligono quiere crear?");
                System.out.println("1-Triangulo");
                System.out.println("2-Rectangulo");
                System.out.print("Opcion:");
                opcion= ent.nextInt();
            }while(opcion<1 || opcion>2);
            switch(opcion){
                case 1: llenarTrieangulo();
                    break;
                case 2: llenarRectangulo();
                    break;
            }
            
            System.out.print("Quiere introducir mas poligonos? (s/n)");
            respuesta=ent.next().charAt(0);
            System.out.println("");
        }while(respuesta == 'S' || respuesta == 's');
    }

    private static void llenarTrieangulo() {
        ent.nextLine();
        double lado1,lado2,lado3;
        System.out.print("Digite el lado 1:");
        lado1=ent.nextDouble();
        System.out.print("Digite el lado 2:");
        lado2=ent.nextDouble();
        System.out.print("Digite el lado 3:");
        lado3=ent.nextDouble();
        
        Triangulo t1 = new Triangulo(lado1, lado2, lado3);
        poligonos.add(t1);
    }

    private static void llenarRectangulo() {
        ent.nextLine();
        double lado1,lado2;
        System.out.print("Digite el lado 1:");
        lado1=ent.nextDouble();
        System.out.print("Digite el lado 2:");
        lado2=ent.nextDouble();
        
        Rectangulo r1 = new Rectangulo(lado1, lado2);
        poligonos.add(r1);
    }

    private static void mostrarAreaPoligonos() {
        for (Poligono poli : poligonos) {
            System.out.println(poli.toString()+" Area:"+poli.area());
            System.out.println("");
        }
    }
    
}
