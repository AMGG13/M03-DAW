/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import java.util.ArrayList;

/**
 *
 * @author alumne
 */
public class Cancion {
    private final String titulo_cancion;
    private final String autor;
    private String album;
    private int durada_segons;
    
    //Constructor

    public Cancion(String titulo_cancion, String autor) {
        this.titulo_cancion = titulo_cancion;
        this.autor = autor;
    }

    public Cancion(String titulo_cancion, String autor, String album, int durada_segons) {
        this.titulo_cancion = titulo_cancion;
        this.autor = autor;
        this.album = album;
        this.durada_segons = durada_segons;
    }

    public String getTitulo_cancion() {
        return titulo_cancion;
    }

    public String getAutor() {
        return autor;
    }

    public String getAlbum() {
        return album;
    }

    public int getDurada_segons() {
        return durada_segons;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setDurada_segons(int durada_segons) {
        this.durada_segons = durada_segons;
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
        final Cancion other = (Cancion) obj;
        if (!this.titulo_cancion.equalsIgnoreCase(other.titulo_cancion)) {
            return false;
        }
        return this.autor.equalsIgnoreCase(other.autor);
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo_cancion=" + titulo_cancion + ", autor=" + autor + ", album=" + album + ", durada_segons=" + durada_segons + "segundos"+'}';
    }
    
    
    
}
