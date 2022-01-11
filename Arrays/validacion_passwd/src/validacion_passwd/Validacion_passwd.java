/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacion_passwd;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Validacion_passwd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ent=new Scanner(System.in);
        String correo,passwd;
        correo=validadorCorreo(ent);
        passwd=validadorPasswd(ent);
        System.out.println("REGISTRADO CORRECTAMENTE");
    }

    public static String validadorCorreo(Scanner ent) {
        String correo;
        boolean arroba,espacio;
        do{
        espacio=true;
        System.out.println("Correo electronico");
        correo=ent.nextLine();
        arroba = correo.endsWith("@proven.cat");
            for (int i = 0; i < correo.length(); i++) {
                if(correo.charAt(i)== ' '){
                    espacio = false;
                }
            }
        if(espacio==false){
            System.out.println("Tu correo tiene algun espacio...");
        }
        if(!arroba){
            System.out.println("Tu correo tiene relacion con nuestro dominio...");
        }
        }while(!(arroba && espacio));
        System.out.println("Correo CORRECTO");
        return correo;
    }

    public static String validadorPasswd(Scanner ent) {
        String passwd;
        boolean caracteres=true,espacio=true;
        do{
            espacio=true;
            System.out.println("Introduzca una contraseña");
            passwd=ent.nextLine();
            if(passwd.length()<8){
                caracteres=false;
            }
            else{
                caracteres=true;
            }
            for (int i = 0; i < passwd.length(); i++) {
                if(passwd.charAt(i) == ' '){
                    espacio = false;
                }
            }
            if(!espacio){
            System.out.println("Tu contraseña contiene un espacio...");
            }
            if(!caracteres){
            System.out.println("Tu contraseña debe tener minimo 8 caracteres...");
            }
        }while(!(caracteres && espacio));
        System.out.println("Contraseña CORRECTA");
            
       return passwd;
    }
    
}
