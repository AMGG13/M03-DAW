/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public class Botella {
    private String material;
    private int capacidad_total;
    private int capacidad_actual;
    private boolean tapada;
    //lleno no lo ponemos porque te puede calcular a partir de los otros atributos
    
    //Constructor
    public Botella(){
        this.setMaterial("Vidre");
        //capacidad total=1000;
        this.setCapacidad_total(1000);
        this.capacidad_actual = 0;
        this.tapada = true;
    }
    
        public Botella(String material){
        this.setMaterial(material);
        //capacidad total=1000;
        this.setCapacidad_total(1000);
        this.capacidad_actual = 0;
        this.tapada = true;
    }
    
        public Botella(String material,int capacidad_total){
        this.setMaterial(material);
        //capacidad total=1000;
        this.setCapacidad_total(capacidad_total);
        this.capacidad_actual = 0;
        this.tapada = true;
    }
    
    


//METODOS
    public void setMaterial(String nouMaterial){
        if (nouMaterial.equalsIgnoreCase("vidrio")||nouMaterial.equalsIgnoreCase("Carton")){
        this.material = nouMaterial.toUpperCase();
        }
        else{
            System.out.println("[-] Material no permitido");
        }
    }
    
    public String getMaterial(){
        return material;
    }
    
    
    //Capacidad total
    public int getCapacidad_total() {
        return capacidad_total;
    }

    public void setCapacidad_total(int capacidad_total) {
        this.capacidad_total = capacidad_total;
    }
    
    
    //Capacidad actual
    public int getCapacidad_actual() {
        return capacidad_actual;
    }

    //public void setCapacidad_actual(int capacidad_actual) {
    //      this.capacidad_actual = capacidad_actual;
    //}
    public void rellenarCapacidadActual(int capacidad_actual){ //setter
        if(this.capacidad_actual+capacidad_actual<this.capacidad_total){
            this.capacidad_actual+=capacidad_actual;
        }
        else{
            this.capacidad_actual = this.capacidad_total;
        }
    }
    public void obrirBotella(){
        this.tapada=false;
    }
    
    public void taparBotella(){
        this.tapada=true;
    }
    
    public int vessarBotella(){
        final int cantidad_vessada=25;
        if(!this.tapada){
            if(this.capacidad_actual<cantidad_vessada){
                int mlqueda=this.capacidad_actual;
                this.capacidad_actual=0;
                return mlqueda;
            }
            else{
                this.capacidad_actual-=cantidad_vessada;
                System.out.println("vesada" + cantidad_vessada);
                return cantidad_vessada;  
            }
          
        }
        else{
             System.out.println("tapada");
            return 0;
        }
    }
    
    public boolean isPlena(){
        return this.capacidad_actual == this.capacidad_total;
    }
    
    
}
