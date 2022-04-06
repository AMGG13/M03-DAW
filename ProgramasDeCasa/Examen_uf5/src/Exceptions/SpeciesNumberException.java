/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptions;

/**
 *
 * @author alumne
 */
public class SpeciesNumberException extends Exception{

    public SpeciesNumberException() {
        
    }

    @Override
    public String getMessage() {
        return "No se puede mas de 10 animales";
    }
    
    
}
