package Objetos;

import DAO.MyCollections;

import java.util.ArrayList;
import java.util.Objects;

public class Coche implements Comparable<Coche> {
    private String marca;
    private String modelo;
    private String matricula;
    private int categoria;

    public Coche(String marca, String modelo, String matricula,int categoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.categoria = categoria;
    }

    public Coche(String marca) {
        this.marca = marca;
        this.modelo = "";
        this.matricula = "";
        this.categoria = 3;
    }

    public Coche(String matricula,int categoria) {
        this.marca = "";
        this.modelo = "";
        this.matricula = matricula;
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCategoria() {return categoria;}

    public void setCategoria(int categoria) {this.categoria = categoria;}

    @Override
    public String toString() {
        return "Coche{" +
                "marca:'" + marca + '\'' +
                ", modelo:'" + modelo + '\'' +
                ", matricula:'" + matricula + '\'' +
                ",estrellas:"+categoria+
                '}';
    }

    @Override
    public int compareTo(Coche car) {
        int salida;
        if(this.matricula.compareToIgnoreCase(car.matricula)<0){
            salida = -1;
        }else if(this.matricula.compareToIgnoreCase(car.matricula)>1){
            salida = 1;
        }else{
            salida = 0;
        }
        return salida;
    }

}
