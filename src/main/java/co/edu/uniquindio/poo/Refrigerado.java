package co.edu.uniquindio.poo;

public class Refrigerado extends Producto implements Farmacia {
    private String codigoAprobacion;
    private int temperaturaRefrigeracion;

    public Refrigerado(String codigo, String nombre, double precioCompra, Proveedor proveedor, String codigoAprobacion, int temperaturaRefrigeracion) {
        super(codigo, nombre, precioCompra, proveedor);
        this.codigoAprobacion = codigoAprobacion;
        this.temperaturaRefrigeracion = temperaturaRefrigeracion;
    }

    @Override
    public double calcularPrecioVenta() {
        return precioCompra + (500 * temperaturaRefrigeracion); 
    }

    @Override
    public double calcularImpuesto() {
        return calcularPrecioVenta() * 0.05; 
    }

    public void iniciarProcesoRefrigeracion() {
        System.out.println("Iniciando proceso de refrigeración para el producto refrigerado: " + nombre);
    
    
    }

    @Override
    public String toString() {
        return "\n Producto refrigerado \n nombre = " + nombre + ", \n codigoAprobacion = " + codigoAprobacion
                + ", \n temperaturaRefrigeracion = " + temperaturaRefrigeracion +  ", \n proveedor = " + proveedor.getNombre() + "";
    }
}
