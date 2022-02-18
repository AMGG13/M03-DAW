/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public class PuntoCoordenadas {
    private int x;
    private int y;
    private String nombrePunto;

    /**constructores*/
    
    public PuntoCoordenadas(int x, int y) {
        this.x = x;
        this.y = y;
        nombrePunto="punto constructor";
    }

    public PuntoCoordenadas(int x) {
        this.x = x;
        this.y = 0;
        nombrePunto="";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getNombrePunto() {
        return nombrePunto;
    }

    public void setNombrePunto(String nombrePunto) {
        this.nombrePunto = nombrePunto;
    }
    
    
    
    public String todasCoordenadas()
    {
        return " x=" + this.x +  " , y=" + this.y + " nombre del punto=" + this.nombrePunto;
    }



    @Override
    public boolean equals(Object obj) {
        //en este caso son iguales si coinciden x e y , sin importar el nombre
        //es necesario para que el arraylist funcionen metodos como el contains o el remove(PuntoCoordenas)
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PuntoCoordenadas other = (PuntoCoordenadas) obj;
        if (this.x != other.x) {
            return false;
        }
        return this.y == other.y;
    }
    
    
    
    
    
    
}
