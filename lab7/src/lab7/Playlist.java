package lab7;

import java.util.*;

public class Playlist implements Runnable {

    private String nombre;
    private String genero;
    private Date fecha;
    private ArrayList<Cancion> canciones = new ArrayList();
    private int duracion;

    public Playlist(String nombre, String genero, Date fecha, int duracion) {
        this.nombre = nombre;
        this.genero = genero;
        this.fecha = fecha;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setCancion(Cancion c) {
        canciones.add(c);
    }

    @Override
    public String toString() {
        return nombre + ", genero=" + genero + ", duracion=" + duracion + '}';
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
