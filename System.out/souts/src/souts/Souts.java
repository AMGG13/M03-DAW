package souts;

public class Souts {

    public static void main(String[] args) {
        //System.out convencional
        System.out.println("Hello world.");
        EspacioEnBlanco();
        
        // -->\n Nueva línea. Coloca el cursor de la pantalla al inicio de la siguiente línea.
        System.out.println("Hello world.\nHow are you?");
        EspacioEnBlanco();
        
        // --> \t Tabulador horizontal. Desplaza el cursor de la pantalla hasta la siguiente posición de tabulación.
        System.out.println("Hello world.\tIm fine, and you?");
        EspacioEnBlanco();
        
        // --> \\  para imprimir un carácter de barra diagonal inversa.
        System.out.println("I use \\n and \\t");
        EspacioEnBlanco();
        
        // --> \\ \" Se usa para imprimir un carácter de doble comilla. 
        System.out.println("\"Hola mundo en español\"");
        EspacioEnBlanco();
        
        //da error System.out.println("Hola", "que pasa");
        System.out.printf("%s%n%s%n%s%n", "1-Jugar", "2-Mostrar Puntuacion", "3-Salir");//%s--> formato String %n--> salto de linea parecido al \n
        EspacioEnBlanco();
        
        //System.err.println(""); Muestra el texto en rojo como si fuese un error
        System.err.println("[-]ERROR");
        EspacioEnBlanco();
        
        //Para poner una variable int en un printf %d
        int e=2;
        System.out.printf("la variable int es %d%n", e);
        
        /**
         * --> \r Retorno de carro. Coloca el cursor de la pantalla al inicio de la línea actua; l l no avanza a la
                siguiente línea. Cualquier carácter que se imprima después del retorno de carro sobrescribe
                los caracteres previamente impresos en esa línea.
                *         System.out.println("Oh nice to hear that,\rIm fine too");
         */
    }

    private static void EspacioEnBlanco() {
        System.out.println("");
    }
    
}
