package co.edu.uniquindio.poo;

class Proveedor {
    private String nombre;
    private String direccion;
    private String telefono;

    public Proveedor(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }
}