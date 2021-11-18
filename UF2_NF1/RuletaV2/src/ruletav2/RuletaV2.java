/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruletav2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class RuletaV2 {

/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bolarandom,numero_apostado,dinero_tengo=50,dinero_apostado,dinero_ganado;
        boolean resultado,seguir;
    do{    
        bolarandom=tirar_bola();
        System.out.println(bolarandom);
        numero_apostado=pedir_numero_apuesta();
        dinero_apostado=pedir_dinero_apuesta(dinero_tengo);
        resultado=Comprobar_resultado(bolarandom,numero_apostado);
        if(resultado==true)
        {
            System.out.println("Has ganado");
            dinero_ganado=Calcular_premio(numero_apostado,dinero_apostado);
            System.out.println("Has recibido "+dinero_ganado);
        }
        else
        {
            System.out.println("Has perdido");
        }
        dinero_ganado=Calcular_premio(numero_apostado,dinero_apostado);
        dinero_tengo=Actualizar_dinero(dinero_tengo, dinero_ganado, resultado, dinero_apostado);
        System.out.println("Creditos: "+dinero_tengo);
        seguir=Seguir_jugando(dinero_tengo);
    }while(seguir==true);
       //termina cuando seguir==false;
        
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
        System.out.println("Numero a apostar del 0 al 36, 37 impar y 38 par");
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
    public static boolean Comprobar_resultado(int numero_apostado, int bolarandom){
        
        if(numero_apostado==bolarandom)
        {
            return true;
        }
        else if(numero_apostado == 38 && bolarandom % 2 == 0)
        {
               return true;
        }
        else if(numero_apostado == 37 && bolarandom % 2 != 0)
        {
               return true;
        }
        else {
          return false;  
        }
   
    }
        public static int Calcular_premio(int num_apostado,int dinero_apostado){
    int premio=0;
    if(num_apostado>=0 && num_apostado<=36)
    {
        premio=dinero_apostado*36;
        return premio;
    }
    else if(num_apostado==37 || num_apostado==38)
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
                dinero_tengo=dinero_tengo-dinero_apostado;
                return dinero_tengo;
            }
            else
            {
                dinero_tengo=dinero_tengo+dinero_ganado;
                return dinero_tengo;
            }
    
        }
        public static boolean Seguir_jugando(int dinero_tengo){
            char opcion;
            System.out.println("Quieres seguir jugando? S/N");
            Scanner ent=new Scanner(System.in);
            opcion=ent.nextLine().charAt(0);
            if(opcion=='S' || opcion=='s')
            {
                if(dinero_tengo<=0)
            {
                return false;
            }
            else if(dinero_tengo>0)
            {
                return true;
            }
            return false;
            }
            else if (opcion=='N' || opcion=='n')
            {
             return false;
            }
            return false;
        }
}
