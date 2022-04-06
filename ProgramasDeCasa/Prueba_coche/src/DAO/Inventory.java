package DAO;

import Objetos.Coche;

import java.util.ArrayList;

public class Inventory implements MyCollections{
    private ArrayList<Coche> lista;

    public Inventory() {
        lista = new ArrayList<Coche>();
    }

    @Override
    public boolean addCoche(Coche add) {
        int i []=foundByIndexComparable(add);
        if(i[1]!=0){
            lista.add(add);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeCoche(Coche delete) {
        int i []=foundByIndexComparable(delete);
        if(i[1]==0){
            lista.remove(i[0]);
            return true;
        }
        return false;
    }

    private int [] foundByIndexComparable(Coche car) {
        int [] indexComparable = new int [2];
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).compareTo(car)==0){
                return indexComparable= new int[]{i,0};
            }
        }
        return indexComparable= new int[]{-1,-1};
    }

    @Override
    public boolean update(Coche update) {
        int i []=foundByIndexComparable(update);
        if(i[1]!=0){
            lista.get(i[0]).setCategoria(update.getCategoria());
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<Coche> giveCollection() {
        return lista;
    }

    public boolean existCar(String matricula){
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getMatricula().equalsIgnoreCase(matricula)){
                return true;
            }
        }
        return false;
    }
}
