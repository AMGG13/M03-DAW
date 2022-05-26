/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.mongodb.MongoClient;

/**
 *
 * @author Usuario
 */
public class CConect {
    private String HOST="127.0.0.1";
    private Integer PUERTO=27017;
    
    public MongoClient Conect(){
        MongoClient mongo = null;
        mongo = new MongoClient(HOST,PUERTO);
        return mongo;
    }
}
