package Objetos;

import java.util.Objects;

public class Coche implements Comparable{
    private String marca;
    private String modelo;
    private String matricula;

    public Coche(String marca, String modelo, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
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

    @Override
    public boolean equals(Object obj) {
        boolean isEqual = false;
        if(obj != null && obj instanceof Coche){
            Coche car=(Coche)obj;
            isEqual=this.matricula.equalsIgnoreCase(car.matricula);
        }
        return isEqual;
    }

    @Override
    public int hashCode() {
        return getMatricula().hashCode();
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }

    @Override
    public int compareTo(Coche car) {
        if(this.matricula == car.matricula){
            return = -1);
        }else{
            return = 1);
        return 0;
    }
}
