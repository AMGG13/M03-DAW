/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alexa;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Alexa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        String nombre, alexa_instruccion,instruccion;
        boolean salir=false;
        //pedir nombre y guardarlo(String)
          nombre = aliexaPideNombre();
        //pedir instruccion(String)
        do{
          alexa_instruccion = alexapideInstruccion();
        //Pasar todo a mayusculas
          alexa_instruccion = alexa_instruccion.toUpperCase();
        //validar que la instruccion empiece por ALEXA (startWith)
          
          if(empiezaAlexa(alexa_instruccion)){
              instruccion = alexa_instruccion.substring(6);
              salir = instruccionMenu(instruccion,nombre);
          }
          else{
              System.out.println("No has dicho ALEXA");
              salir=false;
          }
        //En caso que no termine programa o que en bucle vuelva a preguntar
        //En caso que si recortar string para eliminar "ALEXA"(String Instrucciones)
        //Si instruccion es BUENOS DIAS llamar a funcion_buenos_dias
        //Si instruccion es BUENAS NOCHES funcion buenas_noches y activar para terminar
        //
        }while(!salir);
    }

    private static String aliexaPideNombre() {
        Scanner sc=new Scanner(System.in);
          System.out.println("Me puede dar su nombre");
          String nombre = sc.nextLine();
          return nombre;
    }

    private static String alexapideInstruccion() {
        Scanner sc=new Scanner(System.in);
          System.out.println("Dime la instruccion porfavor");
          String instruccion = sc.nextLine();
          return instruccion;
    }

    private static boolean empiezaAlexa(String alexa_instruccion) {
        return alexa_instruccion.startsWith("ALEXA ");
    }
    /**
     * aqui se haran todas las funciones
     * @param instruccion
     * @return  true si debo salir de alexa
     * false si aun no tengo que salir
     */
    private static boolean instruccionMenu(String instruccion, String nombre) throws InterruptedException {
        if(instruccion.equalsIgnoreCase("buenas noches")){
            System.out.println("Buenas noches "+nombre);
            return true;
        }
        else if(instruccion.equalsIgnoreCase("buenos dias")){//no acepta tildes
            System.out.println("Buenos días "+nombre+", espero que tenga un buen día.");
            return false;
        }
        else if(instruccion.equalsIgnoreCase("canta una cancion")){//no acepta tildes
            cancionElefante();
            return false;
        }
        else if(instruccion.equalsIgnoreCase("Tabla de multiplicar")){//no acepta tildes
            tablasMultiplicar();
            return false;
        }
        else if(instruccion.equalsIgnoreCase("Dime mi edad")){//no acepta tildes
            calcularEdad();
            return false;
        }
        else if(instruccion.startsWith("HABLA CON LA")){//no acepta tildes
            char letra = instruccion.charAt(13);
            System.out.println("la letra es "+letra);
            String frase = instruccion.substring(20);
            System.out.println("La frase es "+frase);
            frase = frase.replace('A', letra);
            frase = frase.replace('E', letra);
            frase = frase.replace('I', letra);
            frase = frase.replace('O', letra);
            frase = frase.replace('U', letra);
            System.out.println("--> "+frase);
            return false;
        }
        else{//instruccion no conocida
            System.out.println("Lo siento "+nombre+" no he entendido lo que me has dicho...");
        }
        return false;
    }

    private static void cancionElefante() throws InterruptedException {
        for (int i = 2; i <= 10; i++) {
            System.out.println(i+" elefantes se balanceaban sobre la tela de una araña\n" +
            "como veía que resistía, fueron a llamar otro elefante.");
            Thread.sleep(500);
        }
    }

    private static void calcularEdad() {
        int año_nacimiento;
        Scanner ent=new Scanner(System.in);
        System.out.println("En que año naciste?");
        año_nacimiento = ent.nextInt();
        Calendar cal= Calendar.getInstance();
        int año_actual= cal.get(Calendar.YEAR);
        System.out.println("Actualmente tienes "+(año_actual-año_nacimiento)+" años");

    }

    private static void tablasMultiplicar() {
        Scanner sc= new Scanner(System.in);
        Random rd = new Random();
        int num1,num2 = 0;
        num1=rd.nextInt(10)+1;
        num1=rd.nextInt(10)+1;
        long inicio= System.currentTimeMillis();
        int resul;
        long fin= System.currentTimeMillis();
        int segundos = (int) (fin - inicio)/1000;
        System.out.println("Cuanto es "+num1+"x"+num2);
        resul=sc.nextInt();
        if(resul==num1*num2 && segundos<=5){
            System.out.println("perfecto");
        }
        else{
            System.out.println("Vuelve a primaria???");
        }
    }
    
}
