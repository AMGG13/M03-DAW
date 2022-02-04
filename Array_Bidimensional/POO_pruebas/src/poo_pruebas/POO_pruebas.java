/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_pruebas;

import Objetos.Botella;
import Objetos.Vaso;
/**
 *
 * @author alumne
 */
public class POO_pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Botella botella1 = new Botella();
        Botella botella2 = new Botella("Carton");
        Botella botella3 = new Botella("Vidrio", 2000);
        Vaso vaso0 = new Vaso(500);
        Vaso vaso1 = new Vaso();
        Vaso vaso2 = new Vaso();
        Vaso vaso3 = new Vaso();
        Vaso vaso4 = new Vaso();
        Vaso vaso5 = new Vaso();
        
        //String material="vidrio";
        //vaso1.setMaterialVaso(material);
        //vaso2.setMaterialVaso(material);
        //vaso3.setMaterialVaso(material);
        //vaso4.setMaterialVaso(material);
        //vaso5.setMaterialVaso(material);

        botella1.rellenarCapacidadActual(950);
        //vaso1.setCapacidad_total(300);
        //vaso2.setCapacidad_total(300);
        //vaso3.setCapacidad_total(300);
        //vaso4.setCapacidad_total(300);
        //vaso5.setCapacidad_total(300);
        
        while(botella1.getCapacidad_actual()!=0){
            botella1.obrirBotella();
            if(!vaso1.isLleno()){
                vaso1.llenarVaso(botella1.vessarBotella());  
                if(vaso1.isLleno()){
                    System.out.println("[+] Vaso 1 lleno");
                }
            }
            else if(!vaso1.isLleno()){
                vaso2.llenarVaso(botella1.vessarBotella());
                if(vaso2.isLleno()){
                    System.out.println("[+] Vaso 2 lleno");
                }
            }
            else if(!vaso3.isLleno()){
                vaso3.llenarVaso(botella1.vessarBotella());
                if(vaso3.isLleno()){
                    System.out.println("[+] Vaso 3 lleno");
                }
            }
            else if(!vaso4.isLleno()){
                vaso4.llenarVaso(botella1.vessarBotella());
                if(vaso4.isLleno()){
                    System.out.println("[+] Vaso 4 lleno");
                }
            }
            else if(!vaso5.isLleno()){
                vaso5.llenarVaso(botella1.vessarBotella());
                if(vaso5.isLleno()){
                    System.out.println("[+] Vaso 5 lleno");
                }
            }
        }
        
        System.out.println("Vaso 4 tiene "+vaso4.getCapacidad_actual());
        System.out.println("Vaso 5 tiene "+vaso5.getCapacidad_actual());
    }
    
}
