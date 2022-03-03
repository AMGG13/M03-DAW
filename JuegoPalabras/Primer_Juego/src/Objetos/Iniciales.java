/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Iniciales {
    private String tres_letras;
    private int longitud;

    public String getTres_letras() {
        return tres_letras;
    }

    public int getLongitud() {
        return longitud;
    }
    
    public String getRandomIniciales(){
        String[] listaIniciales = new String[20];
        listaIniciales=generadorIniciales(listaIniciales);
        Random r = new Random ();
        int random = r.nextInt(20);
        return listaIniciales[random];
    }

    private String[] generadorIniciales(String[] listaIniciales) {
        listaIniciales[0]="HOR";
        listaIniciales[1]="HAC";
        listaIniciales[2]="COM";
        listaIniciales[3]="SIT";
        listaIniciales[4]="LOS";
        listaIniciales[5]="CAZ";
        listaIniciales[6]="CAB";
        listaIniciales[7]="ATO";
        listaIniciales[8]="SOP";
        listaIniciales[9]="COC";
        listaIniciales[10]="CHO";
        listaIniciales[11]="POL";
        listaIniciales[12]="ABE";
        listaIniciales[13]="ESC";
        listaIniciales[14]="SAL";
        listaIniciales[15]="LIT";
        listaIniciales[16]="CUE";
        listaIniciales[17]="ALT";
        listaIniciales[18]="ORG";
        listaIniciales[19]="SAC";
        return listaIniciales;
    }
}
