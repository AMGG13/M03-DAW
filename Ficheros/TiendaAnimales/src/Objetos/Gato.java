/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public final class Gato extends Mascotas {
    private String Color;
    private String peloLargo;

    public Gato( String nombre, int edat, boolean estado, int anyo_nacimiento, String Color, String peloLargo) {
        super(nombre, edat, estado, anyo_nacimiento);
        this.Color = Color;
        this.peloLargo = peloLargo;
    }
    
    
    

    public String getColor() {
        return Color;
    }

    public String getPeloLargo() {
        return peloLargo;
    }

    @Override
    public String toString() {
        String Mascota = super.toString();
        return "Gato{" + Mascota+  "Color=" + Color + ", peloLargo=" + peloLargo + '}';
    }

    @Override
    protected void habla() {
        System.out.println("Miau miau");
    }
    
    
    
}
