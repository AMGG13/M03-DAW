/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dawbank;

import Object.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class DAWBANK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        CuentaBancaria CCC;
        CCC=pedirDatos();
        do{
        opcion=menuBanco();
        switch(opcion)
        {
            case 1:
                //Datos de la cuenta. Mostrará el IBAN, el titular y el saldo.
                mostrarDatos(CCC);
                break;
            case 2:
                //IBAN. Mostrará el IBAN.
                mostrarIBAN(CCC);
                break;
        }
        }while(opcion!=8);
    }

    private static int menuBanco() {
        System.out.println("1. Datos de la cuenta. Mostrará el IBAN, el titular y el saldo.\n" +
    "2. IBAN. Mostrará el IBAN.\n" +
    "3. Titular. Mostrará el titular.\n" +
    "4. Saldo. Mostrará el saldo disponible.\n" +
    "5. Ingreso. Pedirá la cantidad a ingresar y realizará el ingreso si es posible.\n" +
    "6. Retirada. Pedirá la cantidad a retirar y realizará la retirada si es posible.\n" +
    "7. Movimientos. Mostrará una lista con el historial de movimientos.\n" +
    "8. Salir. Termina el programa.");
        Scanner ent= new Scanner(System.in);
        int opcion;
        System.out.println("Escoge opcion :)");
        opcion= ent.nextInt();
        return opcion;
    }

    private static CuentaBancaria pedirDatos() {
        Scanner ent = new Scanner(System.in);
        System.out.println("Pon el titular");
        String titular = ent.nextLine();
        System.out.println("Pon el IBAN");
        String IBAN = ent.nextLine();
        CuentaBancaria aux = new CuentaBancaria(IBAN, titular);
        return aux;
    }

    private static void mostrarDatos(CuentaBancaria CCC) {
        System.out.println("IBAN: "+CCC.getIBAN());
        System.out.println("TITULAR :"+CCC.getTitular());
        System.out.println("SALDO: "+CCC.getSaldo());
    }

    private static void mostrarIBAN(CuentaBancaria CCC) {
        System.out.println("IBAN: "+CCC.getIBAN());
    }
    
}
