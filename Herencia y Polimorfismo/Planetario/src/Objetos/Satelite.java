/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public class Satelite extends Astros {
    private double distancia_planeta;
    private double orbita_planetaria;
    private String pertenece_planeta;

    public Satelite(double distancia_planeta, double orbita_planetaria, String pertenece_planeta, String nombre, double rotacion, double masa) {
        super(nombre, rotacion, masa);
        this.distancia_planeta = distancia_planeta;
        this.orbita_planetaria = orbita_planetaria;
        this.pertenece_planeta = pertenece_planeta;
    }

    public double getDistancia_planeta() {
        return distancia_planeta;
    }

    public void setDistancia_planeta(double distancia_planeta) {
        this.distancia_planeta = distancia_planeta;
    }

    public double getOrbita_planetaria() {
        return orbita_planetaria;
    }

    public void setOrbita_planetaria(double orbita_planetaria) {
        this.orbita_planetaria = orbita_planetaria;
    }

    public String getPertenece_planeta() {
        return pertenece_planeta;
    }

    public void setPertenece_planeta(String pertenece_planeta) {
        this.pertenece_planeta = pertenece_planeta;
    }

    @Override
    public String toString() {
        String astro = super.toString();
        return "Satelite{" + "distancia_planeta=" + distancia_planeta + ", orbita_planetaria=" + orbita_planetaria + ", pertenece_planeta=" + pertenece_planeta +"-"+astro;
    }
    
    
}
