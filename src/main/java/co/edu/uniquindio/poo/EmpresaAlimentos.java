package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class EmpresaAlimentos {
    public static void main(String[] args) {
        Proveedor proveedor1 = new Proveedor("Proveedor 1", "Calle 123", "123456789");

        Perecedero producto1 = new Perecedero("001", "Leche", 1000, proveedor1, "2024-12-31");
        Refrigerado producto2 = new Refrigerado("002", "Queso", 2000, proveedor1, "ABC123", -5);
        Envasado producto3 = new Envasado("003", "Enlatado", 1500, proveedor1, "2024-01-01", 500, PaisOrigen.ARGENTINA);

        System.out.println("Producto 1 - Precio de Venta: " + producto1.calcularPrecioVenta() + ", Impuesto: " + producto1.calcularImpuesto());
        System.out.println("Producto 2 - Precio de Venta: " + producto2.calcularPrecioVenta() + ", Impuesto: " + producto2.calcularImpuesto());
        System.out.println("Producto 3 - Precio de Venta: " + producto3.calcularPrecioVenta() + ", Impuesto: " + producto3.calcularImpuesto());

        Farmacia farmacia = new Farmacia("Farmacia Central", "Avenida Principal 456");
        farmacia.iniciarProcesoRefrigeracion(producto2);
    }
}