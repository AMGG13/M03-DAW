/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptions;

/**
 *
 * @author alumne
 */
public class LimitAnimalException extends Exception{

    public LimitAnimalException() {
        super();
    }

    @Override
    public String getMessage() {
        return "Lista completa";
    }
    
    
}
