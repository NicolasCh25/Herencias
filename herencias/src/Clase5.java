public class Clase5 {
    private String estado;
    private int cantidad;

    public Clase5() {
        // Constructor sin parámetros
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void mostrarDatos() {
        System.out.println("Clase5: Estado = " + estado + ", Cantidad = " + cantidad);
    }
}
