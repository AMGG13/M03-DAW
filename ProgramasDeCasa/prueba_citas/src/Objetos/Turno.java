package Objetos;

import Exceptions.LimitTurnPassedException;

public class Turno {
    private int num_turno;
    private int puerta;

    public Turno(int num_turno, int puerta) throws LimitTurnPassedException {
        setNum_turno(num_turno);
        this.puerta = puerta;
    }

    public Turno(int num_turno) {
        this.num_turno = num_turno;
    }

    public int getNum_turno() {
        return num_turno;
    }

    public void setNum_turno(int num_turno) throws LimitTurnPassedException {
        if(num_turno<=100 && num_turno>0)
            this.num_turno = num_turno;
        else{
            throw new LimitTurnPassedException();
        }
    }

    public int getPuerta() {
        return puerta;
    }

    public void setPuerta(int puerta) {
        this.puerta = puerta;
    }

    @Override
    public boolean equals(Object obj){
        boolean isEquals = false;
        if(obj != null && obj instanceof Turno){
            Turno t = (Turno)obj;
            isEquals = this.num_turno==t.num_turno;
        }
        return isEquals;
    }

    @Override
    public String toString() {
        return "Turno-->" + "num_turno:" + num_turno + ", puerta:"+ puerta;
    }
}
