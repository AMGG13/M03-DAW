/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Objetos;

import Exceptions.LimitAnimalException;
import Exceptions.SpeciesNumberException;
import java.util.LinkedList;

/**
 *
 * @author alumne
 */
public interface InterfaceDAO {
    
        public boolean AfegirObjecte(Animales add) throws LimitAnimalException, SpeciesNumberException;
        public boolean EsborrarObjecte(Animales add);
        public LinkedList<Animales> getCollectionInventada();
        public int numeroObjectesGuardats();
        public boolean modificarNum(Animales update)throws LimitAnimalException, SpeciesNumberException;
    }
        

