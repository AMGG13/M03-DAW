/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esqueleto;

import Exceptions.LimitAnimalException;
import Exceptions.SpeciesNumberException;
import Objetos.Animales;
import Objetos.InterfaceDAO;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuari
 */
public class CollectionDAO implements InterfaceDAO{
    private LinkedList<Animales> lista= new LinkedList<>();
    private final int max_animales = 10;

    public CollectionDAO() {
        lista= new LinkedList<>();
    }

    public int getMax_animales() {
        return max_animales;
    }
    
    @Override
    public boolean AfegirObjecte(Animales add) throws LimitAnimalException{
        if(lista.size()<max_animales){
            if(!lista.contains(add)){
                lista.add(add);
                return true;
            }else{
                return false;
            }
        }else{
                throw new LimitAnimalException();
            }
        }    

    @Override
    public boolean EsborrarObjecte(Animales add) {
        if(lista.contains(add)){
                int i = getIndexBy(add);
                lista.remove(i);
                return true;
            }else{
                return false;
            }
    }

    @Override
    public LinkedList<Animales> getCollectionInventada() {
        return lista;
    }

    @Override
    public int numeroObjectesGuardats() {
        return lista.size();
    }


    @Override
    public boolean modificarNum(Animales update)throws SpeciesNumberException{
        if(lista.contains(update)){
            int i = getIndexBy(update);
            lista.get(i).setNumIndividuals(update.getNumIndividuals());
            return true;
        }
            return false;
        
    }

    private int getIndexBy(Animales update) {
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).equals(update)){
                return i;
            }
            
        }
        return -1;
    }
    

    
    
}
