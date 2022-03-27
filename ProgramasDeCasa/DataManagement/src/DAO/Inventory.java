package DAO;

import Objetos.MinimumNumberOfCharactersException;
import Objetos.Pokemon;

import java.util.HashMap;
import java.util.LinkedList;

public class Inventory implements MyCollection {
    LinkedList<Pokemon> inventory = new LinkedList<>();
    @Override
    public LinkedList<Pokemon> getData() {
        return inventory;
    }

    @Override
    public int getNumPokemon() {
        return inventory.size();
    }

    @Override
    public boolean addPokemon(Pokemon p) {
        for (int i = 0; i < inventory.size(); i++) {
            if(inventory.get(i).equals(p)){
                return false;
            }
        }
        inventory.add(p);
        return true;
    }

    @Override
    public Pokemon removePokemon(Pokemon deleted) {
        int i=existIndexByName(deleted.getName());
        if(i>=0){
            inventory.remove(i);
            return deleted;
        }else
            return null;
    }

    @Override
    public boolean updatePokemon(int option,Pokemon update) throws MinimumNumberOfCharactersException {
        int i = existIndexByName(update.getName());
        if(option==0){
            inventory.get(i).setHp(update.getHp());
            return true;
        }
        else if(option==1){
            inventory.get(i).setType(update.getType());
            return true;
        }
        else if (option==2){
            inventory.get(i).setAlive(update.isAlive());
            return true;
        } else if (option == 3) {
            inventory.get(i).setType(update.getType());
            inventory.get(i).setAlive(update.isAlive());
            inventory.get(i).setHp(update.getHp());
            return true;

        }else
            return false;
    }

    public void showAllData(){
        for (Pokemon data: inventory) {
            System.out.println(data.toString());
        }
    }
    public void showNameData(String name){
        int i =existIndexByName(name);
        System.out.println(inventory.get(i).toString());
    }

    public boolean exist(String name){
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getName().equals(name)){
                return true;
            }
        }
        return false;
    }
    private int existIndexByName(String name){
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }




}
