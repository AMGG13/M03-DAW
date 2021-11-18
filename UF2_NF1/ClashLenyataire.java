/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashlenyataire;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ClashLenyataire {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        int fuerzaLenyador,fuerzaTorre,vidaTorre,vidaLenyador,niveltorre,nivelleniador,ganador;
        niveltorre = Nivel();
        nivelleniador = Nivel();
        fuerzaLenyador = fuerzaDeLenyador(nivelleniador);
        vidaLenyador = vidaDeLenyador(nivelleniador);
        fuerzaTorre = fuerzaDeTorre(niveltorre);
        vidaTorre = vidaDeTorre(niveltorre);
        mostrarDetalles(vidaTorre,fuerzaTorre,vidaLenyador,fuerzaLenyador);
        mostrarAccion(vidaTorre,vidaLenyador,fuerzaTorre,fuerzaLenyador);
        ganador=Resultados(vidaTorre,fuerzaTorre,vidaLenyador,fuerzaLenyador);
        switch (ganador) {
            case -1:
                System.out.println("Ha ganado el leñador");
                break;
            case 1:
                System.out.println("ha ganado la torre");
                break;
            case 0:
                System.out.println("empate");
                break;
            default:
                break;
        }
        mostrarGolpes(vidaTorre,vidaLenyador,fuerzaTorre,fuerzaLenyador);
    }
    public static int Nivel(){
        int nivel;
        Scanner sc=new Scanner(System.in);
        System.out.println("Que nivel es");
        nivel=sc.nextInt();
        return nivel;   
    }
    public static int fuerzaDeLenyador(int nivelleniador){
        int fuerzaLenyador=0;
        switch (nivelleniador) {
            case 9:
                fuerzaLenyador=200;
                return fuerzaLenyador;
            case 10:
                fuerzaLenyador=220;
                return fuerzaLenyador;
            case 11:
                fuerzaLenyador=242;
                return fuerzaLenyador;
            case 12:
                fuerzaLenyador=266;
                return fuerzaLenyador;
            case 13:
                fuerzaLenyador=292;
                return fuerzaLenyador;
            default:
                break;
        }
        return fuerzaLenyador;
    }
    public static int vidaDeLenyador(int nivelleniador){
        int vidaLenyador=0;
        switch (nivelleniador) {
            case 9:
                vidaLenyador = 1060;
                return vidaLenyador;
            case 10:
                vidaLenyador = 1166;
                return vidaLenyador;
            case 11:
                vidaLenyador = 1282;
                return vidaLenyador;
            case 12:
                vidaLenyador = 1409;
                return vidaLenyador;
            case 13:
                vidaLenyador = 1547;
                return vidaLenyador;
            default:
                break;
        }
        return vidaLenyador;
    }
    public static int fuerzaDeTorre(int niveltorre){
        int fuerzaTorre=0;
        
        switch (niveltorre) {
            case 9:
                fuerzaTorre=90*2;
                return fuerzaTorre;
            case 10:
                fuerzaTorre=99*2;
                return fuerzaTorre;
            case 11:
                fuerzaTorre=109*2;
                return fuerzaTorre;
            case 12:
                fuerzaTorre=119*2;
                return fuerzaTorre;
            case 13:
                fuerzaTorre=131*2;
                return fuerzaTorre;
            default:
                break;
        }
        return fuerzaTorre;
    }
    public static int vidaDeTorre(int niveltorre){
        int vidaTorre=0;
        switch (niveltorre) {
            case 9:
                vidaTorre=2534;
                return vidaTorre;
            case 10:
                vidaTorre=2786;
                return vidaTorre;
            case 11:
                vidaTorre=3052;
                return vidaTorre;
            case 12:
                vidaTorre=3346;
                return vidaTorre;
            case 13:
                vidaTorre=3668;
                return vidaTorre;
            default:
                break;
        }
        return vidaTorre;
    }
    public static void mostrarDetalles(int vidaTorre,int fuerzaTorre,int vidaLenyador,int fuerzaLenyador){
        System.out.println("vidaTorre " + vidaTorre);
        System.out.println("fuerzaTorre " + fuerzaTorre);
        System.out.println("vidaLenyador " + vidaLenyador);
        System.out.println("fuerzaLenyador " + fuerzaLenyador);
    }
    public static void mostrarAccion(int vidaTorre,int fuerzaTorre,int vidaLenyador,int fuerzaLenyador) throws InterruptedException{
        int golpe=0;
        while (vidaTorre> 0 && vidaLenyador>0){
            golpe++;  
            vidaTorre=vidaTorre-fuerzaLenyador;
            vidaLenyador = vidaLenyador -fuerzaTorre;
            /* para arreglar si alguna vez es negativo*/
            if (vidaTorre<0)
            {
                vidaTorre=0;
            }
            if (vidaLenyador<0)
            {
                vidaLenyador=0;
            }
            Thread.sleep(500); /*pausa la ejecucion 0,5 seguns*/
            System.out.println("La torre le queda "+vidaTorre);
            System.out.println("El leñador le queda " + vidaLenyador);
        }
    }
    public static int Resultados(int vidaTorre,int fuerzaTorre,int vidaLenyador,int fuerzaLenyador) throws InterruptedException{
                int golpe=0;
        while (vidaTorre> 0 && vidaLenyador>0){
            golpe++;  
            vidaTorre=vidaTorre-fuerzaLenyador;
            vidaLenyador = vidaLenyador -fuerzaTorre;
            /* para arreglar si alguna vez es negativo*/
            if (vidaTorre<0)
            {
                vidaTorre=0;
            }
            if (vidaLenyador<0)
            {
                vidaLenyador=0;
            }
            Thread.sleep(500); /*pausa la ejecucion 0,5 seguns*/
            System.out.println("La torre le queda "+vidaTorre);
            System.out.println("El leñador le queda " + vidaLenyador);
        }
        if(vidaTorre==vidaLenyador)
        {
            return 0;
        }
        else if(vidaTorre>vidaLenyador)
        {
            return 1;
        }
        else if(vidaTorre<vidaLenyador)
        {
            return -1;
        }
        else
        {
            return 2;
        }
    }
    public static void mostrarGolpes(int vidaTorre,int vidaLenyador,int fuerzaTorre,int fuerzaLenyador) throws InterruptedException{
        int golpe=0;
        while (vidaTorre> 0 && vidaLenyador>0){
            golpe++;  
            vidaTorre=vidaTorre-fuerzaLenyador;
            vidaLenyador = vidaLenyador -fuerzaTorre;
            /* para arreglar si alguna vez es negativo*/
            if (vidaTorre<0)
            {
                vidaTorre=0;
            }
            if (vidaLenyador<0)
            {
                vidaLenyador=0;
            }
            Thread.sleep(500); /*pausa la ejecucion 0,5 seguns*/
            System.out.println("La torre le queda "+vidaTorre);
            System.out.println("El leñador le queda " + vidaLenyador);
        }
        System.out.println("has hecho tantos golpes "+golpe);
    }
    
}
