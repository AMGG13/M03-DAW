/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object;

/**
 *
 * @author alumne
 */
public class CuentaBancaria {
    private final String IBAN;
    private final String titular;
    private double saldo;
    private double [] movimientos;
    private int num_movimientis;
    
    
    //Constructor
    public CuentaBancaria(String IBAN, String titular){
        if(IBAN.length()==24 && IBAN.startsWith("ES")){
            this.IBAN=IBAN;
            this.titular=titular;
            movimientos = new double [100];
            saldo=0; 
        }
        else{
            this.IBAN="";
            this.titular="";
            System.out.println("IBAN incorrecto..."); 
        }
        this.num_movimientis=0;
    }
    //getters

    public String getIBAN() {
        return IBAN;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    public void ingreso(double dinero){
        if(dinero>0){
            this.saldo+=dinero;
            this.movimientos[num_movimientis]=dinero;
            this.num_movimientis++;
        }
        else{
            System.out.println("[-]Solo se puede ingresar mas de 0 euros");
        }
        if(dinero>3000){
            System.out.println("[+]AVISO: Se notificará a HACIENDA");
        }
    }
    public void retirada(double dinero){
        if(dinero>0){
            this.saldo-=dinero;
            this.movimientos[num_movimientis]=(-1)*dinero;
            this.num_movimientis++;
        }
        else{
            System.out.println("[-]Solo se puede retirar mas de 0 euros");
        }
        if(this.saldo<-50){
            System.out.println("[-]AVISO: Estas en numeros rojos...");
        }
    }
    
}
