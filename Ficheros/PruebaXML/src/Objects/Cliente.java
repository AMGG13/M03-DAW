/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import java.io.Serializable;

/**
 *
 * @author alumne
 */

public class Cliente implements Serializable{
    private String name;
    private String surname;

    private int age;

    public Cliente(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Cliente() {
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String toXML(){
        return "<clientes>"+"\n"
                +"\t<name>"+getName()+"</name>"+"\n"
                +"\t<surname>"+getSurname()+"</surname>"+"\n"
                +"\t<age>"+getAge()+"</age>"+"\n"
                +"</clientes>"+"\n";
    }

    @Override
    public String toString() {
        return "Cliente{" + "name=" + name + ", surname=" + surname + ", age=" + age + '}';
    }

    
    
}
