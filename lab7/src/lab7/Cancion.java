package lab7;

import java.util.*;

public class Cancion {

    private String nombre;
    private Date año;
    private String nombre_A;
    private int duracion;

    public Cancion(String nombre, Date año, String nombre_A, int duracion) {
        this.nombre = nombre;
        this.año = año;
        this.nombre_A = nombre_A;
        this.duracion = duracion;
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return nombre + ", año=" + año + ", nombre_A=" + nombre_A + ", duracion=" + duracion + '}';
    }

}
