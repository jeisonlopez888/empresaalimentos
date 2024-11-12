package co.edu.uniquindio.poo;

public abstract class Producto {
    public String codigo;
    public String nombre;
    public double precioCompra;
    public Proveedor proveedor;

    public Producto(String codigo, String nombre, double precioCompra, Proveedor proveedor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.proveedor = proveedor;
    }

    public abstract double calcularPrecioVenta();

    public abstract double calcularImpuesto();
}