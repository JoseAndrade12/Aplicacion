public class Aplicacion {
    private int id;
    private String nombre;
    private String version;
    private boolean ejecutando;

    // Contador compartido por toda la clase
    private static int totalAplicaciones = 0;

    public Aplicacion(String nombre, String version) {
        totalAplicaciones++;
        this.id = totalAplicaciones;
        this.nombre = nombre;
        this.version = version;
        this.ejecutando = false;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getVersion() {
        return version;
    }

    public boolean isEjecutando() {
        return ejecutando;
    }

    // Setters (el id y el estado de ejecución se manejan con métodos propios)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void iniciar() {
        ejecutando = true;
        System.out.println(nombre + " v" + version + " iniciada");
    }

    public void cerrar() {
        ejecutando = false;
        System.out.println(nombre + " v" + version + " cerrada");
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Versión: " + version);
        System.out.println("Ejecutando: " + ejecutando);
    }

    public static int getTotalAplicaciones() {
        return totalAplicaciones;
    }
}
}
