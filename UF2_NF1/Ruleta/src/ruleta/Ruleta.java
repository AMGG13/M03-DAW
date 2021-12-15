/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruleta;

import java.util.Random;
import java.util.Scanner;

/**
 * int tirar_bola(),aleatorio del 0 y 36
 * int pedir_numero(),pedir un valor al usuario del 0 al 38 (37 inpar y 38 par*)
 * int pedir_dinero_apuesta(int dinero_tengo), pedir el dinero que quieres apostar,debe ser positivo y no superior a lo que tienes
 * Boolean Comprobar_resultado(int num apostado, int bola) decide si has ganado o no(calcular que si es 37 y 38, tendra que mirar si es par o no)
 * int calcular_premio(int num_apostado, int cantidad_apostado) calculara la ganancia y la retornara
 * boolean seguir_jugando(int dinero_tengo), decidir si sigues jugando o no dependerá de si tienes dinero, y si a la pregunta ¿Quieres continuar? Escribe s o S
 * int Actualizar dinero(int dinero_tienes, int dinero_ganado, boolean_ganado
 * 
 * V2.0 pedir dinero inicial()
 * @author alumne
 */
public class Ruleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bolarandom,numero_apostado,dinero_tengo=50,dinero_apostado,dinero_ganado;
        boolean resultado;
        
        bolarandom=tirar_bola();
        System.out.println(bolarandom);
        numero_apostado=pedir_numero_apuesta();
        dinero_apostado=pedir_dinero_apuesta(dinero_tengo);
        resultado=Comprobar_resultado(bolarandom,numero_apostado);
        if(resultado==true)
        {
            System.out.println("Has ganado");
        }
        else
        {
            System.out.println("Has perdido");
        }
        dinero_ganado=Calcular_premio(num_apostado,dinero_apostado);
        
        
    }
    public static int tirar_bola(){
        Random random = new Random();
        int r;
        r=random.nextInt(36);
        return r;
    } 
    public static int pedir_numero_apuesta(){
        int numapuesta;
        Scanner ent=new Scanner(System.in);
        do{
        System.out.println("Numero a apostar del 0 al 38, 37 inpar y 38 par");
        numapuesta=ent.nextInt();
        }while(numapuesta<0 || numapuesta>38);
        //termine numapuesta>=0 && numapuesta<=38
         return numapuesta;
    }
    public static int pedir_dinero_apuesta(int dinero_tengo){
        int dineroapostar;
        Scanner ent=new Scanner(System.in);
        do{
        System.out.println("Cuanto dinero quieres apostar?");
        dineroapostar=ent.nextInt();
        }while(dineroapostar>dinero_tengo || dineroapostar<0);
        //el bucle terminara dineroapostar<=dinero_tengo && dineroapostar>0
        return dineroapostar;
    }
    public static boolean Comprobar_resultado(int num_apostado, int bolarandom){
        if(num_apostado==bolarandom)
        {
            return true;
        }
        else if (num_apostado==37)
        {
            if(bolarandom%2==1)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else if(num_apostado==38)
        {
            if(bolarandom%2==0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else if(num_apostado!=bolarandom)
        {
            return false;
        }
        return false;
    }
        public static int Calcular_premio(int num_apostado,int dinero_apostado){
    int premio=0;
    if(numapostado>=0 && nuapostado<=36)
    {
        premio=dinero_apostado*36;
        return premio;
    }
    else if(numapostado==37 || numapostado==38)
    {
        premio=dinero_apostado*2;
        return premio;
    }
    else
    {
    return premio;
    }
    }
        public static int Actualizar_dinero(int dinero_tengo, int dinero_ganado, boolean resultado, int dinero_apostado){
        
            if(resultado==false)
            {
                dinero_tengo=dinero_tienes-tengo_apostado;
                return dinero_rengo;
            }
            else
            {
                dinero_tengo=dinero_tengo+dinero_ganado;
                return dinero_rengo;
            }
    
    }
    
    
}
