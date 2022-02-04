/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public class Vaso {
    private int capacidad_actual;
    private int capacidad_total;
    private String material;
    private boolean lleno = false;
    
    
    public Vaso(){
        this.setCapacidad_total(300);
        this.setMaterialVaso("Vidrio");
        this.capacidad_actual = 0;
    }
    
    public Vaso(int capacidad_total){
        this.setCapacidad_total(capacidad_total);
        this.setMaterialVaso("Vidrio");
        this.capacidad_actual = 0;
    }
    
    
    
    public void setMaterialVaso(String nouMaterialVaso){
        if(nouMaterialVaso.equalsIgnoreCase("vidrio")||nouMaterialVaso.equalsIgnoreCase("plastico")){
            this.material = nouMaterialVaso.toUpperCase();
        }
        else{
            System.out.println("[-]Material no aceptado.");
        }
    }
    public String getMaterial(){
        return material;
    }

    public int getCapacidad_actual() {
        return capacidad_actual;
    }

    public void llenarVaso(int capacidad_actual) {//setter
        if(this.capacidad_actual+capacidad_actual<this.capacidad_total){
            this.capacidad_actual+=capacidad_actual;
        }
        else{
            this.capacidad_actual = this.capacidad_total;
        }
    }

    public int getCapacidad_total() {
        return capacidad_total;
    }

    public void setCapacidad_total(int capacidad_total) {
        this.capacidad_total = capacidad_total;
    }
    
    public boolean isLleno(){
        return this.capacidad_actual==this.capacidad_total;
    }
    
    public int beberLiquido(int sorbo){
        //final int sorbo = 50;
        if(this.capacidad_actual>=sorbo){
           this.capacidad_actual-=sorbo;
        }
        else{
            sorbo=this.capacidad_actual;
            this.capacidad_actual=0;
        }
        
        return sorbo;
    }
}

