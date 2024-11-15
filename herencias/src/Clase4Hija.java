public class Clase4Hija extends Clase4 {
    private String detalle;

    public Clase4Hija(String categoria, String detalle) {
        super(categoria);
        this.detalle = detalle;
    }

    public void mostrarDatosHija() {
        System.out.println("Clase4Hija: Detalle = " + detalle);
    }
}
