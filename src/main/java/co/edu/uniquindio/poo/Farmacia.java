package co.edu.uniquindio.poo;

class Farmacia {
    private String nombre;
    private String direccion;

    public Farmacia(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void iniciarProcesoRefrigeracion(Refrigerado producto) {
        producto.iniciarProcesoRefrigeracion();
        System.out.println("Refrigeración de medicamentos en farmacia: " + nombre);
    }
}