/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Objeto.Botella;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class DAOBotellas {
    private ArrayList<Botella> inventario;

    public DAOBotellas() {
        this.inventario = new ArrayList<Botella>();
    }
    
    public ArrayList<Botella> getInventario(){
        return inventario;
    }
    public int getCantidadBotella(){
        return inventario.size();
    }
    public boolean añadirBotella(Botella añadir){
        if(inventario.contains(añadir)){
            return false;
        }else{
            inventario.add(añadir);
            System.out.println("Executing: "+(new Exception()).getStackTrace()[0].getMethodName());
            try {
                Connection conn = DbConnect.getConnection();
                if (conn != null) {
                    Statement stmt = conn.createStatement();
                    String query
                            = "insert into botellas values "
                            + "("+añadir.getBotella_id()+",'"+añadir.getMarca()+"',"+añadir.getLitros()+","+añadir.getPrecio()+")";
                    int numRowsAffected = stmt.executeUpdate(query);
                    System.out.format("%d rows created\n", numRowsAffected);
                    //close resources.
                    stmt.close();
                    conn.close();
                }
            } catch (SQLException ex) {
                //Logger.getLogger(ShowCountriesJdbcMySql.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println(ex.getMessage());
            }
            return true;
        }
    }
    public boolean eliminarBotella(Botella eliminar){
        if(!inventario.contains(eliminar)){
            return false;
        }else{
            inventario.remove(inventario.indexOf(eliminar));
            System.out.println("Executing: "+(new Exception()).getStackTrace()[0].getMethodName());
            try {
                Connection conn = DbConnect.getConnection();
                if (conn != null) {
                    Statement stmt = conn.createStatement();
                    String query
                            = "delete from botellas where botella_id="+eliminar.getBotella_id();
                    int numRowsAffected = stmt.executeUpdate(query);
                    System.out.format("%d rows deleted\n", numRowsAffected);
                    stmt.close();
                    conn.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
            return true;
        }
    }
    public int mostrarBotellas(){
        try {
            Connection conn = DbConnect.getConnection();
            if(conn !=null){
                Statement stmt = conn.createStatement();
                String query = "SELECT * FROM botellas";
                ResultSet res = stmt.executeQuery(query);
                int numRowsAffected = 0;
                System.out.println("ID  -   MARCA   -   LITROS  -   PRECIO");
                while (res.next()) {
                    int botella_id = res.getInt("botella_id");
                    String marca = res.getString("marca");
                    double litros = res.getDouble("litros");
                    double precio = res.getDouble("precio");
                    Botella country = new Botella(botella_id, marca, litros, precio);
                    System.out.println(
                    botella_id + "      " + marca + "       " + litros + "      " + precio);
                    numRowsAffected++;
                }
                res.close();
                stmt.close();
                conn.close();
                return numRowsAffected;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOBotellas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    public boolean buscarBotellaPorID(int id){
        Botella aux = new Botella(id,"none",0,0);
        if(!inventario.contains(aux)){
            return false;
        }else{
            try {
                Connection conn = DbConnect.getConnection();
                if(conn !=null){
                    Statement stmt = conn.createStatement();
                    String query = "SELECT * FROM botellas WHERE botella_id="+id;
                    ResultSet res = stmt.executeQuery(query);
                    while (res.next()) {
                        int botella_id = res.getInt("botella_id");
                        String marca = res.getString("marca");
                        double litros = res.getDouble("litros");
                        double precio = res.getDouble("precio");
                        Botella country = new Botella(botella_id, marca, litros, precio);
                        System.out.println(
                        botella_id + " \t" + marca + " \t " + litros + " \t " + precio);
                    }
                    res.close();
                    stmt.close();
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAOBotellas.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        }
    }
    public int modificarBotella(double aux_litros,double aux_precio){
        System.out.println("Executing: "+(new Exception()).getStackTrace()[0].getMethodName());
        try {
            //get a connection to database.
            Connection conn = DbConnect.getConnection();
            if (conn != null) {
                //create a statement to perform queries.
                Statement stmt = conn.createStatement();
                //execute the query.
                String query = "update botellas set precio ="+aux_precio+" where litros="+aux_litros;//Capital de España a Catalunya.
                int numRowsAffected = stmt.executeUpdate(query);
                //close resources.
                stmt.close();
                conn.close();
                return numRowsAffected;
            }
        } catch (SQLException ex) {
            //Logger.getLogger(ShowCountriesJdbcMySql.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex.getMessage());
        }
        return -1;
    }
}

