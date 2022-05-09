/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objeto;

/**
 *
 * @author Usuario
 */
public class Botella {
    private int botella_id;
    private String marca;
    private double litros;
    private double precio;

    public Botella(int botella_id, String marca, double litros, double precio) {
        this.botella_id = botella_id;
        this.marca = marca;
        this.litros = litros;
        this.precio = precio;
    }

    public int getBotella_id() {
        return botella_id;
    }

    public void setBotella_id(int botella_id) {
        this.botella_id = botella_id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Botella other = (Botella) obj;
        return this.botella_id == other.botella_id;
    }

    @Override
    public String toString() {
        return "Botella:" + "botella_id:" + botella_id + ", marca:" + marca + ", litros:" + litros + ", precio:" + precio + '}';
    }
    
    
}
