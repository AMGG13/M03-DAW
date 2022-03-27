package DAO;

import Objetos.MinimumNumberOfCharactersException;
import Objetos.Pokemon;

import java.util.LinkedList;

public interface MyCollection {
    LinkedList<Pokemon> getData();
    int getNumPokemon();
    boolean addPokemon(Pokemon p);
    Pokemon removePokemon(Pokemon deleted);
    boolean updatePokemon(int option, Pokemon p) throws MinimumNumberOfCharactersException;
}
