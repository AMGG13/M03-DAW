/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

import objetos.Empleado;
import java.util.*;

/**
 *
 * @author Usuario
 */
public class UsoEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Empleado listaEmpleados[] = new Empleado [3];
        
        listaEmpleados[0]= new Empleado("Lucia", 25, 2000);
        listaEmpleados[1]= new Empleado("Jose", 35, 2100);
        listaEmpleados[2]= new Empleado("Marta", 33, 3000);
        */
       ArrayList <Empleado> listaEmpleados=new ArrayList<Empleado>();
       listaEmpleados.ensureCapacity(12);
       listaEmpleados.add(new Empleado("Lucrecia", 38, 3000));
       listaEmpleados.add(new Empleado("Ana", 27, 2800));
       listaEmpleados.add(new Empleado("Paco", 28, 2000));
       listaEmpleados.add(new Empleado("Paco", 28, 2000));
       listaEmpleados.add(new Empleado("Paco", 28, 2000));
       listaEmpleados.add(new Empleado("Paco", 28, 2000));
       listaEmpleados.add(new Empleado("Paco", 28, 2000));
       listaEmpleados.add(new Empleado("Paco", 28, 2000));
       listaEmpleados.add(new Empleado("Paco", 28, 2000));
       listaEmpleados.add(new Empleado("Paco", 28, 2000));
       listaEmpleados.add(new Empleado("Paco", 28, 2000));
       //listaEmpleados.add(new Empleado("Pimp", 22, 1800));
       
       listaEmpleados.set(2, new Empleado("Pimp", 22, 1800));
        System.out.println(listaEmpleados.size());
        listaEmpleados.trimToSize();
        
        
        for (int i = 0; i < listaEmpleados.size(); i++) {
            System.out.println(listaEmpleados.get(i).dameDatos());
        }
        
        //Para pasar ArrayList a un Array se hace de la siguiente manera
        //Empleado arrayEmpleado[]=new Empleado[listaEmpleados.size()];
        //listaEmpleados.toArray(arrayEmpleado);
       
    }
    
}
