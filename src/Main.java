public class Main {

    public static void main(String[] args) {

        // Prueba 1: creación de objetos y contador
        System.out.println("=== Prueba 1: contador ===");
        System.out.println("Total de aplicaciones: " + Aplicacion.getTotalAplicaciones());

        Aplicacion app1 = new Aplicacion("SistemaVentas", "1.0");
        Aplicacion app2 = new Aplicacion("Inventario", "2.3");
        Aplicacion app3 = new Aplicacion("Reportes", "0.9");

        System.out.println("Total de aplicaciones: " + Aplicacion.getTotalAplicaciones());

        // Prueba 2: estado inicial de cada aplicación
        System.out.println();
        System.out.println("=== Prueba 2: estado inicial ===");
        app1.mostrarInformacion();
        System.out.println();
        app2.mostrarInformacion();
        System.out.println();
        app3.mostrarInformacion();

        // Prueba 3: iniciar y cerrar aplicaciones de forma independiente
        System.out.println();
        System.out.println("=== Prueba 3: iniciar y cerrar ===");
        app1.iniciar();
        app2.iniciar();
        app1.cerrar();

        System.out.println(app1.getNombre() + " ejecutando: " + app1.isEjecutando());
        System.out.println(app2.getNombre() + " ejecutando: " + app2.isEjecutando());
        System.out.println(app3.getNombre() + " ejecutando: " + app3.isEjecutando());
        System.out.println("Total de aplicaciones: " + Aplicacion.getTotalAplicaciones());
    }
}