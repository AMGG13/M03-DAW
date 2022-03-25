/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author Raul
 */
public class Cromos {

    private int numCard;
    private String description;

    public Cromos( int numCard, String description) throws DescriptionException {
        this.setDescription(description);
        this.numCard = numCard;
    }

    public Cromos(int numCard) {
        this.numCard = numCard;
        this.description = "Sin Descripción";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) throws DescriptionException {
     
        //MAB no hay el bucle, por que sino si te llega una description corta
        //entrarias en un bucle por que no pides nunca una nueva descripcion
        //el bucle en caso de quererlo, deberia ir a la linea que llama al 
        //setdescritpiton
            if (description.length() >= 3) {
                this.description = description;
            } else {
                throw new  DescriptionException("La descripción debe contener 3 o más carácteres"); 
            }
     

    }

    public int getNumCard() {
        return numCard;
    }

    public void setNumCard(int numCard) {
        this.numCard = numCard;
    }

    @Override
    public String toString() {
        return  "Nombre : " + description + ", numero: " + numCard ;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Cromos)) {
            return false;
        }
        final Cromos other = (Cromos) obj;
        if (this.numCard != other.numCard) {
            return false;
        }
        return true;
    }

}
