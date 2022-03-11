/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepcionentre0;

/**
 *
 * @author alumne
 */
public class ExcepcionEntre0 {
    
      public static void main(String[] args) {
        int x, y, z;
        
        x=10;
        y=0;
        try{
        	z = funcion(x,y);  //aqui es produeix una divisió per zero
        }
        catch (ArithmeticException ae) {
        	System.err.println("Error en dividir entre 0");
                ae.printStackTrace();
        }
    }
    public static int funcion(int a, int b) throws ArithmeticException {
    	return a/b;
    }

}
