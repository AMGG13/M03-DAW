package DAO;

import Objetos.Coche;

import java.util.ArrayList;

public interface MyCollections {
    boolean addCoche(Coche add);
    boolean removeCoche(Coche delete);
    boolean update(Coche update);
    ArrayList<Coche> giveCollection();
}
