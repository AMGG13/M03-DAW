/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piedra_papel_tijeras;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Piedra_Papel_Tijeras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bot=0,usuario=0,contb=0,contu=0,ganador,cont;
        boolean seguir;
        Scanner ent=new Scanner(System.in);
        Random random = new Random();
        do{
        usuario=tirada_usuario(usuario,ent);
        bot=tirada_ordenador(bot,random);
        mostrar_jugada(bot,usuario);
        ganador=comprobar_quien_gana(bot,usuario);
        if(ganador==1)
        {
            System.out.println("Has ganado");
        }
        else if(ganador==0)
        {
            System.out.println("Empate");
        }
        else if(ganador==-1)
        {
            System.out.println("Ha ganado el bot");
        }
        cont=aumentar_contador(ganador);
        if (ganador==1)
        {
            contu=contu+cont;
        }
        else if(ganador==-1)
        {
            contb=contb+cont;
        }
            System.out.println("Bot: "+contb);
            System.out.println("Tú: "+contu);
        seguir=seguir_jugando(contu,contb);
        }while(seguir==true);
        if(contb==5)
        {
            System.out.println("Has perdido");
        }
        else
        {
            System.out.println("Has ganado");
        }
        
        
        
    }

    public static int tirada_ordenador(int bot, Random random) {
        bot=random.nextInt(3)+1;
        return bot;
    }
/**
 * 
 * @param usuario
 * @param ent
 * @return amb un scanner demanes que tiri el usuari  i retorna el valor, per retornar el valor ha de comprovar abans que sigui valid (1,2,3)
 */
    public static int tirada_usuario(int usuario, Scanner ent) {
        do{
        System.out.println("Saca Piedra(1),Papel(2),Tijera(3)");
        usuario=ent.nextInt();
        }while(usuario>3 || usuario<1);
        return usuario;
    }
    /**
     * comprueba la jugada para saber quien gana
     * @param bot
     * @param usuario
     * @return ganajugador(1), ganamaquina(-1),empate(0)
     * el bot ganará cuando saque 1 si usuario saca 3 si el bot saca 2 usuario tiene que sacar 1, si bot saca 3 el usuario sacará 2
     */
    public static int comprobar_quien_gana(int bot, int usuario) {
        if(bot==usuario)
        {
            return 0;
        }
        else if(bot==1 && usuario==3)
        {
            return -1;
        }
        else if(bot==2 && usuario==1)
        {
            return -1;
        }
        else if(bot==3 && usuario==2)
        {
            return -1;
        }
        else if(usuario==1 && bot==3)
        {
            return 1;
        }
        else if (usuario==2 && bot==1)
        {
            return 1;
        }
        else //if (usuario==3 && bot==2)
        {
            return 1;
        }
        
    }

    public static int aumentar_contador(int ganador) {
        if(ganador==1 || ganador==-1)
        {   
            return 1;
        }
        else if (ganador==0)
        {
            return 0;
        }
        else{
            return 0;
        } 
    }

    private static void mostrar_jugada(int bot, int usuario) {
        System.out.print("Has sacado: ");
        if(usuario==1)
            System.out.println("Piedra");
        else if(usuario==2)
        {
            System.out.println("Papel");
        }
        else if(usuario==3)
        {
            System.out.println("Tijera");
        }
        System.out.print("El bot ha sacado: ");
        if(bot==1)
        {
            System.out.println("Piedra");
        }
        else if(bot==2)
        {
            System.out.println("Papel");
        }
        else if(bot==3)
        {
            System.out.println("Tijera");
        }
    }

    public static boolean seguir_jugando(int contu, int contb) {
        if(contu==5 || contb==5)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
}
