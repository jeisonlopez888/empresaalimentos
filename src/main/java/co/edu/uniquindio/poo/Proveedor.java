package co.edu.uniquindio.poo;

public class Proveedor {
    private String nombre;
    private String direccion;
    private String telefono;

    public Proveedor(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getNombre() {
        return nombre;
    }
}