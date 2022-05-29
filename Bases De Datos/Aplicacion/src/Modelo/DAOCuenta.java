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
import com.mongodb.client.MongoDatabase;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
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
            MongoDatabase database = conn.getDatabase(NOMBRE_DATABASE);
            MongoCollection<Document> coleccion = database.getCollection(NOMBRE_COLECCION);
            //CREACION DEL DOCUMENTO A INSERTAR
            Document documento = new Document();
            documento.put("usuario",add.getUsuario());
            documento.put("descripcion",add.getDescripcion());
            documento.put("seguidores",add.getSeguidores());
            documento.put("tipo",add.getTipo().name());
            //CREACION DEL DOCUMENTO A BUSCAR PARA VERIFICAR SI EXISTE O NO
            BasicDBObject buscar = new BasicDBObject();
            Document toFind = new Document("usuario",add.getUsuario());
            Document exist = coleccion.find(toFind).first();
            if(exist == null){// SI EL DOCUMENTO A BUSCAR ES NULL, SIGNIFICA QUE LO QUE ESTAMOS INTRODUCIENDO NO EXISTE Y PODEMOS AÑADIRLO
                coleccion.insertOne(documento);
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
            MongoDatabase database = conn.getDatabase(NOMBRE_DATABASE);
            MongoCollection<Document> coleccion = database.getCollection(NOMBRE_COLECCION);
            //CREACION DEL DOCUMENTO A BUSCAR
            BasicDBObject documento = new BasicDBObject();
            documento.put("usuario",del.getUsuario());
            long deleted = coleccion.deleteOne(documento).getDeletedCount();//BORRAMOS EL DOCUMENTO QUE SE FILTRA POR NOMBRE SE USUARIO Y DEVUELVE LA CANTIDAD DE DOCUMENTOS BORRADOS
            if(deleted >0){//SI SE HAN ELIMINADO MAS DE 0 DOCUMENTOS SIGNIFICA QUE SE HAN BORRADO
                return true;
            }else{
                System.out.println("no existe");
                return false;
            }
        }else{
            System.err.println("ERROR Al conectar");  
            return false;
        }
    }

    @Override
    public Cuenta encontrarCuenta(Cuenta find) throws NullPointerException { 
        MongoClient conn = CConect.Conect();
        if(conn != null){     
            MongoDatabase database = conn.getDatabase(NOMBRE_DATABASE);
            MongoCollection<Document> coleccion = database.getCollection(NOMBRE_COLECCION);
            //CREAMOS DOCUMENTO CON EL NOMBRE DE USUARIO A ENCONTRAR
            Document toFind = new Document("usuario",find.getUsuario());
             Document resultDocument = coleccion.find(toFind).first();
             if(resultDocument==null){// SI EL DOCUMENTO ES NULL ES QUE NO SE HA ENCONTRADO
                 return null;
             }
             String json = resultDocument.toJson();// SI EL DOCUMENTO NO ES NULL SE CONVERTIRA A JSON
             Cuenta finded = new Gson().fromJson(json, Cuenta.class);// CONVERTIREMOS EL JSON EN OBJETO CUENTA CON LA LIBRERIA GSON 
            return finded; //RETORNAMOS LA CUENTA ENCONTRADA
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
            Gson gson = new Gson();
            MongoDatabase database = conn.getDatabase(NOMBRE_DATABASE);
            MongoCollection<Document> coleccion = database.getCollection(NOMBRE_COLECCION);
            FindIterable<Document> documentos = coleccion.find();//RECOGEMOS TODOS LOS DOCUMENTOS DE LA COLECCION
            //aqui--> ESTA OPCION TAMBIEN VALDRIA
            //Con el iterador recoger los documentos a json, pasarlos a objeto y añadirlos al array
//            MongoCursor<Document> cursor = documentos.iterator();
//            Cuenta aux;
//            ArrayList<Cuenta> cuentasaux = new ArrayList<>();
//            while(cursor.hasNext()){
//                Document document = cursor.next();
//                String json = document.toJson();
//                aux = gson.fromJson(json, Cuenta.class);
//                cuentasaux.add(aux);
//            }
//            for (Cuenta cuenta : cuentasaux) {
//                System.out.println(cuenta.toString());
//            }
            String resultado = StreamSupport.stream(documentos.spliterator(), false).map(Document::toJson).collect(Collectors.joining(", ", "[", "]"));// PARSEAMOS LOS DOCUMENTOS A UN JSON ARRAY DE OBJETOS
            Type CuentasTipoDeLista = new TypeToken<ArrayList<Cuenta>>(){}.getType(); // LE INDICAMOS EL TIPO DE ARRAYLIST EN MI CASO, CUENTA
            ArrayList<Cuenta> cuentas = gson.fromJson(resultado, CuentasTipoDeLista); // Y PARSEAMOS EL JSON A UN ARRAYLIST DE CUENTAS
            //LOS DATOS POR CADA COLUMNA
            datos = new String [cuentas.size()][4]; 

            for (int filas = 0; filas < cuentas.size(); filas++) {// RECORREMOS EL ARRAY DE 2D PARA RELLENAR LOS DATOS QUE HAY EN EL ARRAYLIST
                for (int columnas = 0; columnas < datos[0].length; columnas++) {
                    String usuario = cuentas.get(filas).getUsuario();
                    String descripcion = cuentas.get(filas).getDescripcion();
                    int seguidores = cuentas.get(filas).getSeguidores();
                    String seguidoresString = String.valueOf(seguidores);
                    Tipo tipo = cuentas.get(filas).getTipo();
                    String tipoString = String.valueOf(tipo);
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
            return datos; //DEVOLVEMOS LOS DATOS
        }else{
            System.err.println("ERROR Al conectar");  
            return null;              
        }
    }
    
}
