public class Clase3Hija extends Clase3 {
    private String descripcion;

    public Clase3Hija(String descripcion) {
        this.descripcion = descripcion;
    }

    public void mostrarDatosHija() {
        System.out.println("Clase3Hija: Descripción = " + descripcion);
    }
}
