package co.edu.uniquindio.poo;

class Envasado extends Producto {

    private String fechaEnvasado;
    private int pesoEnvase;
    private Enum paisOrigen;

    public Envasado(String codigo, String nombre, double precioCompra, Proveedor proveedor, String fechaEnvasado, int pesoEnvase, Enum paisOrigen) {
        super(codigo, nombre, precioCompra, proveedor);
        this.fechaEnvasado = fechaEnvasado;
        this.pesoEnvase = pesoEnvase;
        this.paisOrigen = paisOrigen;
    }

    @Override
    public double calcularPrecioVenta() {
        return precioCompra + (300 * pesoEnvase); 
    }

    @Override
    public double calcularImpuesto() {
        return calcularPrecioVenta() * 0.10; 
    }
}