import Objetos.Password;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Cuenta:");
        Scanner ent = new Scanner(System.in);
        String acc= ent.nextLine();
        System.out.print("Caracteres:");
        int characters = ent.nextInt();
        Password pass = new Password();
        System.out.println(pass.generatePassword(characters));
    }
}
