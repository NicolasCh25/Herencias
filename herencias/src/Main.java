public class Main {
    public static void main(String[] args) {
        // Prueba de la Clase1
        Clase1 obj1 = new Clase1();
        obj1.mostrarDatos();

        // Prueba de la Clase2
        Clase2 obj2 = new Clase2("Objeto2");
        obj2.mostrarDatos();

        // Prueba de la Clase3 y Clase3Hija
        Clase3 obj3 = new Clase3();
        Clase3Hija obj3Hija = new Clase3Hija("Descripción del Objeto3");
        obj3.mostrarDatos();
        obj3Hija.mostrarDatosHija();

        // Prueba de la Clase4 y Clase4Hija
        Clase4 obj4 = new Clase4("Categoría del Objeto4");
        Clase4Hija obj4Hija = new Clase4Hija("Categoría del Objeto4", "Detalle del Objeto4");
        obj4.mostrarDatos();
        obj4Hija.mostrarDatosHija();

        // Prueba de la Clase5
        Clase5 obj5 = new Clase5();
        obj5.setEstado("Activo");
        obj5.setCantidad(10);
        obj5.mostrarDatos();
    }
}
