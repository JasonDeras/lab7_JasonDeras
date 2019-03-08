package lab7;

import java.util.*;

public class Artista extends Persona {

    private ArrayList<String> canciones_p = new ArrayList();
    private ArrayList seguidores = new ArrayList();
    private ArrayList albumes = new ArrayList();

    public Artista(String usuario, String nombre, String apellido, String contraseña, Date fecha) {
        super(usuario, nombre, apellido, contraseña, fecha);
    }

    public ArrayList<String> getCanciones_p() {
        return canciones_p;
    }

    public void setCanciones_p(ArrayList<String> canciones_p) {
        this.canciones_p = canciones_p;
    }

    public ArrayList<String> getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(ArrayList<String> seguidores) {
        this.seguidores = seguidores;
    }

    public ArrayList getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList albumes) {
        this.albumes = albumes;
    }

    public void setSeguidor(Usuario u) {
        seguidores.add(u);
    }

    public void setCancion(String cancion) {
        canciones_p.add(cancion);
    }

    public void setAlbum(String album) {
        albumes.add(album);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
