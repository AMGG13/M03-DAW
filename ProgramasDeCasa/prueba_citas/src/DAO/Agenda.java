package DAO;

import Exceptions.FullNoteException;
import Exceptions.LimitTurnPassedException;
import Objetos.Turno;

import java.util.Iterator;
import java.util.LinkedList;

public class Agenda implements myCollections {
    private LinkedList<Turno> lista = new LinkedList<>();
    private int pacientes;

    public Agenda(LinkedList<Turno> lista, int pacientes) {
        this.lista = lista;
        this.pacientes = pacientes;
    }

    public LinkedList<Turno> getLista() {
        return lista;
    }

    public void setLista(LinkedList<Turno> lista) {
        this.lista = lista;
    }

    public int getPacientes() {
        return pacientes;
    }

    public void setPacientes(int pacientes) {
        this.pacientes = pacientes;
    }

    @Override
    public Turno addTurno(Turno añadir) throws FullNoteException {
            if (lista.size() < pacientes) {
                if (!lista.contains(añadir)) {
                    lista.add(añadir);
                    return añadir;
                } else {
                    return null;
                }
            } else {
                throw new FullNoteException();
            }

    }

    @Override
    public Turno removeTurno(Turno eliminar) {
        if(lista.contains(eliminar)){
            lista.remove(eliminar);
            return eliminar;
        }else{
            return null;
        }
    }

    @Override
    public Turno updateTurno(Turno old,Turno update) throws LimitTurnPassedException {
        if(lista.contains(old)){
            int i=indexByTurno(old.getNum_turno());
            lista.get(i).setNum_turno(update.getNum_turno());
            lista.get(i).setPuerta(update.getPuerta());
            return old;
        }else
            return null;
    }

    public int indexByTurno(int num_turno) {
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getNum_turno()==num_turno){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void showTurnos() {
        Iterator<Turno> it = lista.iterator();
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
    }

    public int numOfTurn(){
        return lista.size();
    }
}
