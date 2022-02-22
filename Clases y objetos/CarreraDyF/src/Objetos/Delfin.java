/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class Delfin {
    private final int age;
    private final String raza;
    private final int speed;
    private int distancia_recorrida;

    public Delfin(int age, String raza) {
        if(age>0 && age<=60){
            this.age = age;
        }
        else{
            System.err.println("[-]Edad no permitida se colocara por defecto la edad de 30 años");
            this.age=30;
        }
        
        if(raza.equalsIgnoreCase("fosc")||raza.equalsIgnoreCase("austral")){
            this.raza = raza;
        }
        else{
            System.err.println("[-]Raza no permitida, se pondra por defecto la raza FOSC");
            this.raza= "Fosc";
        }
        if(raza.equalsIgnoreCase("fosc")){
            this.speed = this.age*10;
        }
        else if(raza.equalsIgnoreCase("austral")){
            this.speed = this.age*20;
        }
        else{
            this.speed = this.age*10;
        }
        this.distancia_recorrida = 0;
    }

    private void setDistancia_recorrida(int distancia_recorrida) {
        this.distancia_recorrida = distancia_recorrida;
    }

    public int getAge() {
        return age;
    }

    public String getRaza() {
        return raza;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDistancia_recorrida() {
        return distancia_recorrida;
    }
    private int sprintFinal(){
        Random rd = new Random();
        int random=rd.nextInt(101)+25;
        int sprint_final=getSpeed()+random;
        return sprint_final;
    }
    public void Sprint(){
        int distance;
        if(getDistancia_recorrida()<=400){
            distance=this.distancia_recorrida+=getSpeed();
            System.out.println("delfin ha recorrido "+distance);
        }
        else{
            distance=this.distancia_recorrida+=sprintFinal();
            System.out.println("delfin ha recorrido "+distance);
        }
    }
}
