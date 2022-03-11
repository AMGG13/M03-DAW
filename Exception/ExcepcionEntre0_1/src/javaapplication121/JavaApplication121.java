package javaapplication121;
public class JavaApplication121 {
      public static void main(String[] args) {
        int x, y, z;
        
        x=10;
        y=0;
        try{
        	z = x/y;  //aqui es produeix una divisió per zero
        }
        catch (ArithmeticException ae) {
        	System.err.println("Error en dividir entre 0");
                ae.printStackTrace();
        }
      }
    
}
