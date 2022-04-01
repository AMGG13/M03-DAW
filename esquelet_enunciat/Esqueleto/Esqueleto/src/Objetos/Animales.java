/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import Exceptions.SpeciesNumberException;
import java.util.Objects;

/**
 *
 * @author usuari
 */
public class Animales {
    private String name;
    private String ScientificName;
    private int numIndividuals;

    public Animales(String name, String ScientificName, int numIndividuals) throws SpeciesNumberException {
        setName(name);
        setScientificName(ScientificName);
        setNumIndividuals(numIndividuals);
    }

    public Animales(String name) {
        setName(name);
        this.ScientificName= "";
        this.numIndividuals =1;
    }

    public Animales(String name, int numIndividuals) throws SpeciesNumberException {
        setName(name);
        setNumIndividuals(numIndividuals);
        this.ScientificName= "";
    }
    
    

    public String getName() {
        return name;
    }

    public String getScientificName() {
        return ScientificName;
    }

    public int getNumIndividuals() {
        return numIndividuals;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScientificName(String ScientificName) {
        this.ScientificName = ScientificName;
    }

    public void setNumIndividuals(int numIndividuals) throws SpeciesNumberException {
        if(numIndividuals<=10 && numIndividuals>0){
            this.numIndividuals=numIndividuals;
        }else{
            throw new SpeciesNumberException();
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEqual=false;
        if(obj != null && obj instanceof Animales){
            Animales a=(Animales)obj;
            if(this.name.equalsIgnoreCase(a.name) || this.ScientificName.equalsIgnoreCase(a.ScientificName)){
                isEqual=true;
            }
        }
        return isEqual;
    }

    @Override
    public String toString() {
        return "Nombre:" + name + ", Nombre cientifico:" + ScientificName + ", Cantidad:" + numIndividuals;
    }
    
    
    
    
    
}

