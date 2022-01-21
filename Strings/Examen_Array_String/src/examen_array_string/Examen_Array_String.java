/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_array_string;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Examen_Array_String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String codi_cliente = null;
        int cuantos_productos;
        double suma_total,diferencia_precio,precio_descontado;
        double descuento=3,desc6=66;
        boolean haymayor66;
        
        codi_cliente=pedirDatos(codi_cliente,ent);
        System.out.println("Cuantos productos has comprado?");
        cuantos_productos=ent.nextInt();
        double[] pedido=new double[cuantos_productos];
        preciosProductos(pedido,ent);
        System.out.println("Tu codigo cliente es: "+codi_cliente);
        mostrarPrecios(pedido);
        suma_total=precioTotalProductos(pedido);
        System.out.println("Precio total: "+suma_total);
        haymayor66=hayMayorQue(pedido,desc6);
        diferencia_precio=difMinMax(pedido);
        descuento=aplicacionDescuento(suma_total,haymayor66,diferencia_precio);
        System.out.println("Descuento aplicado --> "+descuento+"%");
        precio_descontado=aplicarDescuento(suma_total,descuento);
        System.out.println("Precio con descuento --> "+precio_descontado);
        
        
    }

    /**
     *
     * @param codi_cliente
     * @param ent
     * @return
     */
    public static String pedirDatos(String codi_cliente, Scanner ent) {
                System.out.println("Nombre");
        String nombre = ent.nextLine();
        System.out.println("Apellido");
        String apellido = ent.nextLine();
        System.out.println("DNI");
        String dni = ent.nextLine();
        
        codi_cliente= nombre.substring(0, 2)+apellido.substring(0, 2)+dni.substring(3,7);
        codi_cliente=codi_cliente.toUpperCase();
        return codi_cliente;
    }

    private static void preciosProductos(double[] pedido, Scanner ent) {
        for (int i = 0; i < pedido.length; i++) {
            System.out.print("Precio producto "+(i+1)+": ");
            pedido[i]=ent.nextDouble();
        }
    }

    private static double precioTotalProductos(double[] pedido) {
        double suma = 0;
        for (int i = 0; i < pedido.length; i++) {
            suma=suma+pedido[i];
        }
        return suma;
    }

    private static void mostrarPrecios(double[] pedido) {
        System.out.println("PRECIOS");
        for (int i = 0; i < pedido.length; i++) {
            System.out.println(pedido[i]);
        }
    }

    private static boolean hayMayorQue(double[] pedido, double desc6) {
        for (int i = 0; i < pedido.length; i++) {
            if(pedido[i]>desc6){
                return true;
            }
        }
        return false;
    }

    private static double difMinMax(double[] pedido) {
        double maximo,minimo, diferencia;
        maximo=minimo=pedido[0];
        for (int i = 0; i < pedido.length; i++) {
            if(pedido[i]>maximo){
                maximo=pedido[i];
            }
            else if(pedido[i]<minimo){
                minimo=pedido[i];
            }
        }
        diferencia= maximo-minimo;
        return diferencia;
    }

    private static double aplicacionDescuento(double suma_total, boolean haymayor66, double diferencia_precio) {
        int descuento = 3;
        if(suma_total>100){
            descuento=descuento+5;
        }
        if(haymayor66){
            descuento=descuento+6;
        }
        if(diferencia_precio>50){
            descuento=descuento+10;
        }
        return descuento;
    }

    private static double aplicarDescuento(double suma_total, double descuento) {
        return suma_total-((suma_total*descuento)/100);
    }
    
}
