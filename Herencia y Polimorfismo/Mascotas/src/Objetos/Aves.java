    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public abstract class Aves extends Mascotas {
    protected String pico;
    protected int volar;

    public Aves(String pico, int volar, String nombre, int edad, int fechaNacimiento) {
        super(nombre, edad, fechaNacimiento);
        this.pico = pico;
        this.volar = volar;
    }
    
    public abstract void volar(int distancia);
    
}
