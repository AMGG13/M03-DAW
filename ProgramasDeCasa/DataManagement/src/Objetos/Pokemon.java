package Objetos;

public class Pokemon {
    private String name;
    private Types type;
    private int hp;
    private boolean alive;

    public Pokemon(String name,String type,int hp) throws MinimumNumberOfCharactersException {
        setName(name);
        setType(type);
        setHp(hp);
        alive=true;
    }
    public Pokemon(String name,String type,int hp,boolean alive) throws MinimumNumberOfCharactersException {
        setName(name);
        setType(type);
        setHp(hp);
        this.alive=alive;
    }


    public String getType() {
        return this.type.name();
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void setType(String type){
        if(Types.exist(type)){
            this.type=Enum.valueOf(Types.class, type);
        }
        else {
            System.err.println("[-] Don't exist that type. DEFAULT type to NORMAL");
            this.type=Enum.valueOf(Types.class, "NORMAL");
        }
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if(hp<100){
            System.err.println("HP must be between 100 and 1500. DEFAULT value=250");
            this.hp = 250;
        }
        else if (hp>1500){
            System.err.println("HP must be between 100 and 1500. DEFAULT value=250");
            this.hp = 250;
        }
        else
            this.hp = hp;
    }

    public void setName(String name) throws MinimumNumberOfCharactersException {
        if (name.length()<3) {
            throw new MinimumNumberOfCharactersException();
        }
        else{
            this.name = name;
        }
    }
    public boolean equals(Object obj){
        if (obj instanceof Pokemon){
            Pokemon p=(Pokemon)obj;
            if(this.name.equalsIgnoreCase(p.name)){
                return true;
            }
            else{
                return false;
            }
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "POKEMON:" +
                "name='" + name  +
                ", type='" + type +
                ", hp=" + hp +
                ", alive=" + alive;
    }

}
