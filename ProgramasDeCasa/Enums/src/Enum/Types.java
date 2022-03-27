package Enum;

public enum Types {
    AGUA,TIERRA,FUEGO,PLANTA,ROCA,ELECTRICO,NORMAL;

    public static boolean exist(String type){
        try {
            Types tipos = Enum.valueOf(Types.class, type);
        } catch (IllegalArgumentException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String tipo = "Tortuga";
        Types.exist(tipo);
        if(Types.exist(tipo)){
            System.out.println("Existe");
        }
        else{
            System.out.println("No existe");

        }
    }
}
