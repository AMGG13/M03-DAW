package Objetos;

public enum Types {
    AGUA,TIERRA,FUEGO,PLANTA,ROCA,ELECTRICO,NORMAL;

    public static boolean exist(String type){
        try {
            type=type.toUpperCase();
            Types tipos = Enum.valueOf(Types.class,type);
        } catch (IllegalArgumentException e) {
            return false;
        }
        return true;
    }
}
