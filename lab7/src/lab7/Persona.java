package lab7;

import java.io.*;
import java.util.*;

public class Persona implements Serializable {

    private ArrayList<Usuario> usuarios = new ArrayList();
    private ArrayList<Artista> artistas = new ArrayList();
    private String usuario;
    private String nombre;
    private String apellido;
    private String contraseña;
    private Date fecha;
    private static final long SerialVersionUID = 777L;

    public Persona(String usuario, String nombre, String apellido, String contraseña, Date fecha) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.fecha = fecha;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setUsuario(Usuario u) {
        usuarios.add(u);
    }

    public void setArtista(Artista a) {
        artistas.add(a);
    }

    @Override
    public String toString() {
        return nombre + "  " + apellido + '}';
    }

}
