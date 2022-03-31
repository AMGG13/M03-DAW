package Exceptions;

public class LimitTurnPassedException extends Exception{
    public LimitTurnPassedException() {
        super("Has introducido un turno incorrecto, debe ser entre 1 y 100");
    }
}
