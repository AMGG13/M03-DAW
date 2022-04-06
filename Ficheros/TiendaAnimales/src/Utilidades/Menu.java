/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import Objetos.Mascotas;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Menu {
    private String Title;
    private ArrayList<Option> options;

    public Menu(String Title) {
        this.Title = Title;
        options = new ArrayList<Option>(); //para inicializar arrayList
    }

    //añadir opcion menú
    public void add(Option nueva)
    {
        //aqui podria poner validaciones antes de añadirla
        options.add(nueva);
    }
    
    //removes
    public boolean removes(Option opcion)
    {
        return options.remove(opcion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("------" + this.getTitle() + "-------");
        sb.append("\n");
            for (Option opcion : options) {
                sb.append(opcion.toString());
            }
            
           // Iterator it = options.iterator();
            
        return sb.toString();
        }
        
        
    
    //showMenu()
    public void showMenu()
    {
        //Iterator it = options.iterator();
        System.out.println("----" + this.Title + "-----");
        for (int i = 0; i < options.size(); i++) {
            System.out.format("%d - %s \n",i,options.get(i).toString());
            //format muy similar al printf
            //System.out.println(options.get(i).toString());
        }
    }
    
    
    public int choose()
    {
        System.out.print("Select option: ");
        Scanner sc = new Scanner(System.in);
        int opt;
        do{
            opt = sc.nextInt();
        }while (opt<0 || opt > options.size());
        return opt;
    }
    
    
    
    public Option removes(int index)
    {
        return options.remove(index);
    }
    
    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public ArrayList<Option> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<Option> options) {
        this.options = options;
    }
    
    
    
}
