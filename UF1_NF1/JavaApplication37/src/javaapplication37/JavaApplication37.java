/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication37;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class JavaApplication37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        int golpetorre=0,golpeleñador=0,niveltorre,nivelleñador,dañoleñador=0,vidatorre=0,dañotorre=0,vidaleñador=0;
        Scanner ent=new Scanner(System.in);
        System.out.println("Que nivel es tu leñador?");
        nivelleñador=ent.nextInt();
        
        if(nivelleñador==9)
        {
           dañoleñador=200;
           vidaleñador=1060;
        }
        else if(nivelleñador==10)
        {
           dañoleñador=220; 
           vidaleñador=1166;
        }
        else if(nivelleñador==11)
        {
           dañoleñador=242;
           vidaleñador=1282;
        }
        else if(nivelleñador==12)
        {
           dañoleñador=266;
           vidaleñador=1409;
        }
        else if(nivelleñador==13)
        {
           dañoleñador=292;
           vidaleñador=1547;
        }
        
        System.out.println("Que nivel es la torre?");
        niveltorre=ent.nextInt();
        if(niveltorre==5)
        {
          vidatorre=1903;
          dañotorre=38*2;
        }
        if(niveltorre==6)
        {
          vidatorre=2033;
          dañotorre=49*2;
        }
        if(niveltorre==7)
        {
          vidatorre=2156;
          dañotorre=65*2;
        }
        if(niveltorre==8)
        {
          vidatorre=2343;
          dañotorre=70*2;
        }
        
        if(niveltorre==9)
        {
          vidatorre=2534;
          dañotorre=90*2;
        }
        else if(niveltorre==10)
        {
          vidatorre=2786;
          dañotorre=99*2;
        }
        else if(niveltorre==11)
        {
          vidatorre=3052;
          dañotorre=109*2;
        }
        else if(niveltorre==12)
        {
          vidatorre=3346; 
          dañotorre=119*2;
        }
        else if(niveltorre==13)
        {
          vidatorre=3668; 
          dañotorre=131*2;
        }
        
        while(vidatorre>0 && vidaleñador>0)
        {

           vidaleñador=vidaleñador-dañotorre;
           golpetorre++;
           vidatorre=vidatorre-dañoleñador;
           golpeleñador++;
           if(vidatorre<0)
            {
                vidatorre=0;
            }
           
           
           if(vidaleñador<0)
            {
                vidaleñador=0;
            }
           
            System.out.println("El leñador le ha quitado "+dañoleñador+" a la torre");
            System.out.println("a la torre le queda "+vidatorre+" de vida");
            System.out.println("La torre le ha quitado "+dañotorre);
            System.out.println("Al leñador le queda "+vidaleñador+" de vida");
            Thread.sleep(1000);
        }
        System.out.println("El leñador ha dado "+golpeleñador+" golpes y la torre "+golpetorre+" golpes");
        if(vidatorre==0 && vidaleñador==0)
        {
            System.out.println("Han quedado empate");
        }
        else if(vidaleñador>0)
        {
            System.out.println("El leñador ha ganado");
            
        }
        else
        {
            System.out.println("La torre ha ganado");
        }
        
        
        
    }
    
}
