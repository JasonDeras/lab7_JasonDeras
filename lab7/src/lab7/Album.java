package lab7;

import java.util.*;

public class Album {

    private String nombre;
    private Date año;
    private String nombre_A;
    private ArrayList<Cancion> canciones = new ArrayList();

    public Album(String nombre, Date año, String nombre_A) {
        this.nombre = nombre;
        this.año = año;
        this.nombre_A = nombre_A;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getAño() {
        return año;
    }

    public void setAño(Date año) {
        this.año = año;
    }

    public String getNombre_A() {
        return nombre_A;
    }

    public void setNombre_A(String nombre_A) {
        this.nombre_A = nombre_A;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public void setCancion(Cancion c) {
        canciones.add(c);
    }

    @Override
    public String toString() {
        return  nombre + ", año=" + año + ", nombre_A=" + nombre_A + ", canciones=" + canciones + '}';
    }

}
