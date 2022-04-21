/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaxml;

import Objects.Cliente;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.XMLConstants;

/**
 *
 * @author alumne
 */
public class PruebaXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Cliente> Clientes = new ArrayList<>();
        añadirClientes(Clientes);
        guardarArrayEnXML(Clientes);
}

    private static void añadirClientes(ArrayList<Cliente> Clientes) {
        Cliente c1 = new Cliente("Lola","Peluso",23);
        Cliente c2 = new Cliente("Maria","Jimenez",23);
        Cliente c3 = new Cliente("Alex","Perez",28);
        Cliente c4 = new Cliente("Pedro","Suarez",28);
        Clientes.add(c1);
        Clientes.add(c2);
        Clientes.add(c3);
        Clientes.add(c4);
    }

    private static void guardarArrayEnXML(ArrayList<Cliente> Clientes) {
        try {
            FileOutputStream filexml = new FileOutputStream("clientesprueba.xml");
            XMLEncoder xml = new XMLEncoder(new BufferedOutputStream(filexml));
            for (int i = 0; i < Clientes.size(); i++) {
                xml.writeObject(Clientes.get(i));
            }
            xml.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PruebaXML.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        try {
//            FileWriter xml = new FileWriter("clientes.xml");
//            for (int i = 0; i < 1; i++) {
//                xml.write("<Supermercado>"+"\n");
//                for (Cliente Cliente1 : Clientes) {
//                    xml.write(Cliente1.toXML());
//                }
//                xml.write("</Supermercado>"+"\n");
//            }
//
//            xml.close();
//        } catch (IOException ex) {
//            Logger.getLogger(PruebaXML.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
}
