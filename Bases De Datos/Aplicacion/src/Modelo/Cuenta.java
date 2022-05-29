/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Cuenta {
    private String usuario;
    private String descripcion;
    private int seguidores;
    private Tipo tipo;
    

    public Cuenta(String usuario, String descripcion, int seguidores,Tipo tipo) {
        setUsuario(usuario);
        setDescripcion(descripcion);
        setSeguidores(seguidores);
        setTipo(tipo);
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    

    /**
     * Si el parametro de descripcion esta vacio, por defecto dejara la descripcion inicializada a la variable newAcc
     * @param descripcion 
     */
    public void setDescripcion(String descripcion) {
        String newAcc = "Hello, Im new using Instagram :)";
        if(descripcion.isEmpty()){
            this.descripcion = newAcc;
        }else
        this.descripcion = descripcion;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getSeguidores() {
        return seguidores;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cuenta other = (Cuenta) obj;
        return Objects.equals(this.usuario, other.usuario);
    }

    @Override
    public String toString() {
        return "Usuario:" + usuario+" Seguidores:"+seguidores;
    }
    
    
    
    
    
}
