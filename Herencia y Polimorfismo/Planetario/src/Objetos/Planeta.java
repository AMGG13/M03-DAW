/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public class Planeta extends Astros {
    private double ditancia_sol ;
    private double orbita_sol ;
    private boolean satelites ;

    public Planeta(double ditancia_sol, double orbita_sol, boolean satelites, String nombre, double rotacion, double masa) {
        super(nombre, rotacion, masa);
        this.ditancia_sol = ditancia_sol;
        this.orbita_sol = orbita_sol;
        this.satelites = satelites;
    }

    public double getDitancia_sol() {
        return ditancia_sol;
    }

    public void setDitancia_sol(double ditancia_sol) {
        this.ditancia_sol = ditancia_sol;
    }

    public double getOrbita_sol() {
        return orbita_sol;
    }

    public void setOrbita_sol(double orbita_sol) {
        this.orbita_sol = orbita_sol;
    }

    public boolean isSatelites() {
        return satelites;
    }

    public void setSatelites(boolean satelites) {
        this.satelites = satelites;
    }

    @Override
    public String toString() {
        String astro = super.toString();
        return "Planeta{" + "ditancia_sol=" + ditancia_sol + ", orbita_sol=" + orbita_sol + ", satelites=" + satelites + "- "+astro;
    }
    
    
    
}
