package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */

 public class App {
    
    public static void main(String[] args) {
            EmpresaAlimentos empresaAlimentos= new EmpresaAlimentos("El duo MJ");

            Proveedor proveedor1 = new Proveedor("Carlos", "Calle 123", "123456789");
    
            Perecedero producto1 = new Perecedero("001", "Leche", 1000, proveedor1, "2024-12-31");
            Refrigerado producto2 = new Refrigerado("002", "bedoyeta", 2000, proveedor1, "ABC123", -5);
            Envasado producto3 = new Envasado("003", "Enlatado", 1500, proveedor1, "2024-01-01", 500, PaisOrigen.ARGENTINA);

            System.out.println(empresaAlimentos.nombre);
            System.out.println("Producto 1 - Precio de Venta: " + producto1.calcularPrecioVenta() + ", Impuesto: " + producto1.calcularImpuesto() + producto1.toString());
            System.out.println("Producto 2 - Precio de Venta: " + producto2.calcularPrecioVenta() + ", Impuesto: " + producto2.calcularImpuesto() + producto2.toString());
            System.out.println("Producto 3 - Precio de Venta: " + producto3.calcularPrecioVenta() + ", Impuesto: " + producto3.calcularImpuesto() + producto3.toString()
             + PaisOrigen.ARGENTINA);
            producto2.iniciarProcesoRefrigeracion();

            
        }
            
    }
