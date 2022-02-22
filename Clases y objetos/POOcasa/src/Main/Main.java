package Main;

import ClasesYObjetos.Operacion;
import javax.swing.JOptionPane;

public class Main {
    public static void main (String [] args){
        Operacion op = new Operacion();
       int num1= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
       int num2= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
       op.sumar(num1, num2);
    }
}
