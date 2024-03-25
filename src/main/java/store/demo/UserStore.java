package store.demo;

import java.util.List;

public class UserStore {
    private int id;
    private String rut;
    private String rol;
    private String nombre;
    private String direccion;
    private String telefono;
    private String correo;
    private List<Shopping> compras;

    public UserStore(int id, String rut, String rol, String nombre, String direccion, String telefono, String correo, List<Shopping> compras){
        this.id = id;
        this.rut = rut;
        this.rol = rol;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.compras = compras;
    }

    public int getId() {
        return id;
    }

    public String getRut() {
        return rut;
    }

    public String getRol() {
        return rol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }
    public List<Shopping> getCompras() {
        return compras;
    }
}
