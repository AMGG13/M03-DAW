import java.util.Scanner;

public class Tabladel10 {
    static Scanner ent = new Scanner(System.in);

    public static void main(String[] args) {
        int indice = hastaQueNumero();
        mostrarTabla(indice);
    }

    public static void mostrarTabla(int indice) {
        System.out.println("Hasta la tabla del " + indice);
        for (int i = 1; i <= indice; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
        }
    }

    public static int hastaQueNumero() {
        System.out.println("Hasta que numero quiere la tabla");
        int hasta = ent.nextInt();
        return hasta;
    }
}