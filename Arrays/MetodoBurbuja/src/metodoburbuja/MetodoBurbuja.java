/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodoburbuja;

/**
 *
 * @author alumne
 */
public class MetodoBurbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] valores={34,56,23,78,23,90,120,5,35};
        mostrarArray(valores);
        algoritmoBurbuja(valores);
        System.out.println("");
        mostrarArray(valores);
        
    }

    public static void mostrarArray(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i]+"-");
        }
    }
    /**
     * metodo que ordena el array de menor a mayor
     * @param valores 
     */
    private static void algoritmoBurbuja(int[] valores) {
        int aux_valor;
        for (int j = valores.length-1; j >=0; j--) {
            for (int i = 0; i < j; i++) {
                if(valores[i]>valores[i+1]){
                    aux_valor = valores[i+1];
                    valores[i+1] = valores[i];
                    valores[i] = aux_valor;
                }
            }
        }
    }
    
}
