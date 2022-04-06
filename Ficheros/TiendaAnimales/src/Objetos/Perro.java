/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public final class Perro extends Mascotas{
    private String Raza;
    private boolean pulgas;

    public Perro( String nombre, int edat, boolean estado, int anyo_nacimiento, String Raza, boolean pulgas) {
        super(nombre, edat, estado, anyo_nacimiento);
        this.Raza = Raza;
        this.pulgas = pulgas;
    }

    
    
    
    public String getRaza() {
        return Raza;
    }

    public boolean isPulgas() {
        return pulgas;
    }

    @Override
    public void habla() {
        System.out.println("guau guau");        
    }

    @Override
    public String toString() {
        String Mascota = super.toString();
        return "Perro{" + Mascota+  "Raza=" + Raza + ", pulgas=" + pulgas + '}';
    }
    
    
    
}
