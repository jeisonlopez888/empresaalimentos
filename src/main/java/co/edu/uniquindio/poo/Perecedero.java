package co.edu.uniquindio.poo;

class Perecedero extends Producto {
    private String fechaVencimiento;

    public Perecedero(String codigo, String nombre, double precioCompra, Proveedor proveedor, String fechaVencimiento) {
        super(codigo, nombre, precioCompra, proveedor);
        this.fechaVencimiento = fechaVencimiento;
    }
    public double calcularPrecioVenta() {
        return precioCompra * 1.35; 
    }

    public double calcularImpuesto() {
        return calcularPrecioVenta() * 0.08;
    }
}