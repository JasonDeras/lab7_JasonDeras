package lab7;

import java.io.*;
import java.util.*;

public class Usuario extends Persona {

    private ArrayList<Cancion> canciones = new ArrayList();
    private ArrayList playlist = new ArrayList();
    private ArrayList<Artista> artistas = new ArrayList();

    public Usuario() {
        super();
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public ArrayList getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList playlist) {
        this.playlist = playlist;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
