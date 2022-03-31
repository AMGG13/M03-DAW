package Exceptions;

public class FullNoteException extends Exception {
    public FullNoteException() {
        super("La agenda esta completa");
    }
}
