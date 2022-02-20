package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Operacion {
    //Atributos
    private int suma;
    private int resta;
    private int division;
    private int multiplicacion;
    
    //Métodos
    
    
    public void LeerNumeros(int num1,int num2){
        num1= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        num2= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
    }
    
    public void sumar(int num1,int num2){
        suma = num1+num2;
    }
    public void restar(int num1,int num2){
        resta = num1-num2;
    }
    public void dividir(int num1,int num2){
        division = num1/num2;
    }
    public void multiplicar(int num1,int num2){
        multiplicacion = num1*num2;
    }
    
    public void mostrarResultados(){
        System.out.println("La suma es "+suma);
        System.out.println("La resta es "+resta);
        System.out.println("La division es "+division);
        System.out.println("La multiplicacion es "+multiplicacion);
    }
}
