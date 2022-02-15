/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto;

/**
 *
 * @author Usuario
 */
public final class Nevera {
    private boolean puerta_cerrada_nevera;
    private boolean puerta_cerrada_congelador;
    private String material;
    private boolean inteligente;
    private int temperatura_maxima_nevera;
    private int temperatura_minuma_nevera;
    private int temperatura_actual_nevera;
    private int temperatura_maxima_congelador;
    private int temperatura_minuma_congelador;
    private int temperatura_actual_congelador;
    private int capacidad_total;
    private int capacidad_actual;

    //Constructor;
    public Nevera(String material,int capacidad_total, boolean inteligente){
    this.setMaterial(material);
    this.setCapacidad_total(capacidad_total);
    this.setInteligente(inteligente);
    this.setTemperatura_minuma_nevera(0);
    this.setTemperatura_maxima_nevera(5);
    this.setTemperatura_actual_nevera(2);
    this.setTemperatura_minuma_congelador(-24);
    this.setTemperatura_maxima_congelador(-15);
    this.setTemperatura_actual_congelador(-19);
    this.puerta_cerrada_congelador=true;
    this.puerta_cerrada_nevera=true;
    }
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        if (material.equalsIgnoreCase("Acero")||material.equalsIgnoreCase("Aluminio")){
        this.material = material.toUpperCase();
        }
        else{
            System.out.println("[-] Material no permitido");
        }
    }

    public boolean isInteligente() {
        return inteligente;
    }

    public void setInteligente(boolean inteligente) {
        this.inteligente = inteligente;
    }

    public int getTemperatura_maxima_nevera() {
        return temperatura_maxima_nevera;
    }

    public void setTemperatura_maxima_nevera(int temperatura_maxima_nevera) {
        if (temperatura_maxima_nevera<=5 && temperatura_maxima_nevera>=3){
            this.temperatura_maxima_nevera = temperatura_maxima_nevera;
        }
        else{
            System.out.println("[-] La temperatura que quieres poner no es viable, se colocara en 5 por defecto");
            this.temperatura_maxima_nevera = 5;
        }
        
    }

    public int getTemperatura_minuma_nevera() {
        return temperatura_minuma_nevera;
    }

    public void setTemperatura_minuma_nevera(int temperatura_minuma_nevera) {
        if(temperatura_minuma_nevera<=1 && temperatura_minuma_nevera>=-1 ){
        this.temperatura_minuma_nevera = temperatura_minuma_nevera;
        }
        else{
            System.out.println("[-] Temperatura minima de la nevera no viable, por defecto se colocara a 0");
            this.temperatura_minuma_nevera=0;
        }
    }

    public int getTemperatura_actual_nevera() {
        return temperatura_actual_nevera;
    }

    public void setTemperatura_actual_nevera(int temperatura_actual_nevera) {
        if(this.temperatura_maxima_nevera>=temperatura_actual_nevera && this.temperatura_minuma_nevera<=temperatura_actual_nevera){
            this.temperatura_actual_nevera = temperatura_actual_nevera;
        }
        else{
            System.out.println("[-] No se ha podido cambiar la temperatura de la nevera se pondra por defecto a 2");
            this.temperatura_actual_nevera=2;
        }
        
    }

    public int getTemperatura_maxima_congelador() {
        return temperatura_maxima_congelador;
    }

    public void setTemperatura_maxima_congelador(int temperatura_maxima_congelador) {
        if (temperatura_maxima_congelador<=5 && temperatura_maxima_congelador>=3){
            this.temperatura_maxima_congelador = temperatura_maxima_congelador;
        }
        else{
            System.out.println("[-] La temperatura que quieres poner no es viable, se colocara en -15 por defecto");
            this.temperatura_maxima_nevera = -15;
        }
    }

    public int getTemperatura_minuma_congelador() {
        return temperatura_minuma_congelador;
    }

    public void setTemperatura_minuma_congelador(int temperatura_minuma_congelador) {
        if(temperatura_minuma_congelador<=1 && temperatura_minuma_congelador>=-1 ){
        this.temperatura_minuma_congelador = temperatura_minuma_congelador;
        }
        else{
            System.out.println("[-] Temperatura minima del congelador no es viable, por defecto se colocara a -24");
            this.temperatura_minuma_nevera=-24;
        }
    }

    public int getTemperatura_actual_congelador() {
        return temperatura_actual_congelador;
    }

    public void setTemperatura_actual_congelador(int temperatura_actual_congelador) {
        if(this.temperatura_maxima_congelador>=temperatura_actual_congelador && this.temperatura_minuma_congelador<=temperatura_actual_congelador){
            this.temperatura_actual_congelador = temperatura_actual_congelador;
        }
        else{
            System.out.println("[-] No se ha podido cambiar la temperatura de la nevera se pondra por defecto a 2");
            this.temperatura_actual_congelador=-19;
        }
    }

    public int getCapacidad_total() {
        return capacidad_total;
    }

    public void setCapacidad_total(int capacidad_total) {
        this.capacidad_total = capacidad_total;
    }

    public int getCapacidad_actual() {
        return capacidad_actual;
    }

    public void setCapacidad_actual(int capacidad_actual) {
        this.capacidad_actual = capacidad_actual;
    }
     public void abrirNevera(){
         this.puerta_cerrada_nevera=false;
     }
     public void cerrarNevera(){
         this.puerta_cerrada_nevera=true;
     }
     public void abrirCongelador(){
         this.puerta_cerrada_congelador=false;
     }
     public void cerrarCongelador(){
         this.puerta_cerrada_congelador=true;
     }

    public boolean isPuerta_cerrada_nevera() {
        return puerta_cerrada_nevera;
    }

    public boolean isPuerta_cerrada_congelador() {
        return puerta_cerrada_congelador;
    }
     
    
}
