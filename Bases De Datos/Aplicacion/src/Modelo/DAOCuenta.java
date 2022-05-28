/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import java.util.ArrayList;
import org.bson.Document;

/**
 *
 * @author Usuario
 */
public class DAOCuenta implements DAOInterface{
    private final String NOMBRE_DATABASE = "Proyecto";
    private final String NOMBRE_COLECCION = "Cuentas";
    private String [][] datos;
    
    @Override
    public boolean añadirCuenta(Cuenta add) {
        MongoClient conn = CConect.Conect();
        if(conn != null){
            DB database = conn.getDB(NOMBRE_DATABASE);
            DBCollection coleccion = database.getCollection(NOMBRE_COLECCION);
            //CREACION DEL DOCUMENTO A INSERTAR
            BasicDBObject documento = new BasicDBObject();
            documento.put("Usuario",add.getUsuario());
            documento.put("Descripcion",add.getDescripcion());
            documento.put("Seguidores",add.getSeguidores());
            documento.put("Tipo",add.getTipo());
            if(coleccion.findOne(documento)==null){
                coleccion.insert(documento);
                return true;
            }else{
                return false;
            }
        }else{
            System.err.println("ERROR Al conectar");  
            return false;
        }
    }

    @Override
    public boolean borrarCuenta(Cuenta del) {
        MongoClient conn = CConect.Conect();
        if(conn != null){
            DB database = conn.getDB(NOMBRE_DATABASE);
            DBCollection coleccion = database.getCollection(NOMBRE_COLECCION);
            //CREACION DEL DOCUMENTO A INSERTAR
            BasicDBObject documento = new BasicDBObject();
            documento.put("Usuario",del.getUsuario());
            documento.put("Descripcion",del.getDescripcion());
            documento.put("Seguidores",del.getSeguidores());
            if(coleccion.findOne(documento)!=null){
                coleccion.remove(documento);
                return true;
            }else{
                return false;
            }
        }else{
            System.err.println("ERROR Al conectar");  
            return false;
        }
    }

    @Override
    public Cuenta encontrarCuenta(Cuenta find) {
        MongoClient conn = CConect.Conect();
        if(conn != null){     
            DB database = conn.getDB(NOMBRE_DATABASE);
            MongoCollection<Document> coleccion = (MongoCollection<Document>) database.getCollection(NOMBRE_COLECCION);
            Document toFind = new Document("Usuario",find.getUsuario());
             FindIterable<Document> resultDocument = coleccion.find(toFind);
             String resultado = resultDocument.first().toJson();
             if(resultado==null){
                 return null;
             }
             Cuenta finded = new Gson().fromJson(resultado, Cuenta.class);
            return finded;
        }
        else{
            System.err.println("ERROR Al conectar");  
            return null;            
        }
    }

    @Override
    public String [][] listarCuentas() {
        MongoClient conn = CConect.Conect();
        if(conn != null){    
            DB database = conn.getDB(NOMBRE_DATABASE);
            MongoCollection<Document> coleccion = (MongoCollection<Document>) database.getCollection(NOMBRE_COLECCION);
            FindIterable<Document> resultDocument = coleccion.find();
            String resultado = resultDocument.first().toJson();
            java.lang.reflect.Type CuentasTipoDeLista = new TypeToken<ArrayList<Cuenta>>(){}.getType();
            Gson gson = new Gson();
            ArrayList<Cuenta> cuentas = gson.fromJson(resultado, CuentasTipoDeLista);
            datos = new String [cuentas.size()][4];

            for (int filas = 0; filas < cuentas.size(); filas++) {
                for (int columnas = 0; columnas < datos[0].length; columnas++) {
                    String usuario = cuentas.get(filas).getUsuario();
                    String descripcion = cuentas.get(filas).getDescripcion();
                    int seguidores = cuentas.get(filas).getSeguidores();
                    String seguidoresString = String.valueOf(seguidores);
                    Tipo tipo = cuentas.get(filas).getTipo();
                    String tipoString = tipo.name();
                    switch (columnas) {
                        case 0:
                            datos[filas][0]=usuario;
                            break;
                        case 1:
                            datos[filas][1]=descripcion;
                            break;
                        case 2:
                            datos[filas][2]=seguidoresString;
                            break;
                        case 3:
                            datos[filas][3]=tipoString;
                            break;
                        default:
                            break;
                    }
                }
            }
            return datos;
        }else{
            System.err.println("ERROR Al conectar");  
            return null;              
        }
    }
    
}
