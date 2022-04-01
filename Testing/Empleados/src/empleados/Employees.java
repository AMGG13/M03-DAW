/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleados;

/**
 *
 * @author alumne
 */
public class Employees {
 
    String [] empleados={"Pedro","Federico","Jaime","Alejandro","Fermin","","",""};

    public Employees() {
    }
    
    public boolean addEmployee(String name){
        for (int i = 0; i < empleados.length; i++) {
            if(empleados[i].equals("")){
                empleados[i]=name;
                return true;
            }
        }
        return false;
    }
    
    public boolean removeEmployee(int posicion){
        empleados[posicion]="";
        return true;
    } 
    
    public boolean updateEmployee(int posicion,String newName){
        empleados[posicion]=newName;
        return true;
    }
}
