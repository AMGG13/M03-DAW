package Objetos;

public enum Types {
    AGUA,TIERRA,FUEGO,PLANTA,ROCA,ELECTRICO,NORMAL;

    public static boolean exist(String type){
        type.toUpperCase();
        try {
            Types tipos = Enum.valueOf(Types.class, type);
        } catch (IllegalArgumentException e) {
            return false;
        }
        return true;
    }
}
