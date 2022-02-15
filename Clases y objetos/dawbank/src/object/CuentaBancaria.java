/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author Usuario
 */
public class CuentaBancaria {
    private final String IBAN;
    private final String titular;
    private double saldo;
    private double [] movimientos;
    private int numeroMovimientos;
    
    //constructores
    public CuentaBancaria(String IBAN, String titular) {
        if(IBAN.length()==24 && 
                IBAN.startsWith("ES")){
            this.IBAN = IBAN;
            this.titular = titular;
            saldo = 0;
            movimientos = new double [100];
        }
        else{
            this.IBAN = " ";
            this.titular = " ";
            System.out.println("IBAN incorrecto");
        }
        
        this.numeroMovimientos = 0;
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
    
    
    //funciones
    public void ingreso(double dinero){
        if(dinero > 0){
            this.saldo += dinero;
            this.movimientos[numeroMovimientos]=dinero;
            this.numeroMovimientos++;
        }
        else{System.out.println("Ingreso debe ser superior a 0");}
        
        if(dinero > 3000){System.out.println("AVISO: Notificar a hacienda.");}        
    }
    public void retirada(double dinero){
        
        //int comp = this.saldo-dinero;
        
        if(dinero > 0){
            this.saldo -= dinero;
            this.movimientos[numeroMovimientos]=(-1)*dinero;//volver el dinero en negativo
            this.numeroMovimientos++;
        }
        else{System.out.println("Retirada debe ser superior a 0");}
        
        if(this.saldo < -50){System.out.println("AVISO: Saldo negativo");}
    }
    
    
    public void mostrarMovimientos()
    {
        for (int i = 0; i < this.numeroMovimientos; i++) {
            if (this.movimientos[i]<0)
            {
                System.out.println("Transferencia" + this.movimientos[i]);
            }
            else
            {
                System.out.println("Ingreso " + this.movimientos[i]);
            }
            
        }
    }

    public double[] getMovimientos() {
        return movimientos;
    }
}
