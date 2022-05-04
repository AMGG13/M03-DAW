/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaxml;

import Objects.Cliente;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        ArrayList<Cliente> Clientes = new ArrayList<>();
        añadirClientes(Clientes);
        guardarArrayEnXML(Clientes);
//        ArrayList<Cliente> recuperado=cargarXMLEnArray();
//        for (Cliente cliente : recuperado) {
//            System.out.println(cliente.toString());
//        }
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
            System.out.println("Mochila guardada en un xml correctamente");
            
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

//    private static List<Cliente> cargarXMLEnArray() throws FileNotFoundException, IOException, ClassNotFoundException {
//        FileInputStream savecustomers = new FileInputStream("clientesprueba.xml");
//        BufferedInputStream bis = new BufferedInputStream(savecustomers);
//        XMLDecoder xml = new XMLDecoder(bis);
//        List<Cliente> customers =(List<Cliente>) xml.readObject();
//        xml.close();
//        customers.
//        return customers;
//    }
}
