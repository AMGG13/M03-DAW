/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author alumne
 */
public class EnteroDAO {
    private int num;

    public EnteroDAO(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public void aumentarEnUno(){
        num++;
    }
    public void restarEnUno(){
        num--;
    }
}
