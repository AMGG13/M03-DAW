/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;

/**
 *
 * @author Usuario
 */
public class DAOCuenta implements DAOInterface{
    private CConect conect = new CConect();
    private MongoClient mongo = conect.Conect();
    private final String NOMBRE_DATABASE = "Proyecto";
    private final String NOMBRE_COLECCION = "Cuentas";
    

    private MongoClient getMongo() {
        return mongo;
    }
    private DB getDatabase(){
        if(mongo!=null){
            DB database = mongo.getDB(NOMBRE_DATABASE);
            return database;
        }
        return null;
    }
    
    @Override
    public boolean añadirCuenta(Cuenta add) {
        DBCollection coleccion = getDatabase().getCollection(NOMBRE_COLECCION);
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
    }

    @Override
    public boolean borrarCuenta(Cuenta del) {
        DBCollection coleccion = getDatabase().getCollection(NOMBRE_COLECCION);
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
    }

    @Override
    public String encontrarCuenta(Cuenta find) {
        MongoCollection<Document> coleccion = (MongoCollection<Document>) getDatabase().getCollection(NOMBRE_COLECCION);
        Document toFind = new Document("Usuario",find.getUsuario());
         FindIterable<Document> resultDocument = coleccion.find(toFind);
         String resultado = resultDocument.first().toJson();
         if(resultado==null){
             return "No se ha encontrado la cuenta";
         }
        return resultado;
    }

    @Override
    public String listarCuentas() {
        MongoCollection<Document> coleccion = (MongoCollection<Document>) getDatabase().getCollection(NOMBRE_COLECCION);
        FindIterable<Document> resultDocument = coleccion.find();
        String resultado = resultDocument.first().toJson();
        return resultado;
    }
    
}
