package DAO;

import Exceptions.FullNoteException;
import Exceptions.LimitTurnPassedException;
import Objetos.Turno;

public interface myCollections {
    Turno addTurno(Turno añadir) throws FullNoteException;
    Turno removeTurno(Turno eliminar);
    Turno updateTurno(Turno actualizar,Turno actualizado) throws LimitTurnPassedException;
    void showTurnos();
}
