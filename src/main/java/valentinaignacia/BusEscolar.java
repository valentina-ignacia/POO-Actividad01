package valentinaignacia;

public class BusEscolar {
    /* Atributos */
    String patente;
    int capacidad;
    String recorrido;
    boolean operativo;

    /* Constructor */
    public BusEscolar(String patente, int capacidad, String recorrido) {
        this.patente = patente;
        this.capacidad = capacidad;
        this.recorrido = recorrido;
        this.operativo = true;
    }

    /* Métodos */
    public void mostrarDatos() {
        System.out.println("Patente: " + patente);
        System.out.println("Capacidad: " + capacidad + " estudiantes");
        System.out.println("Recorrido: " + recorrido);
        System.out.println("¿Está operativo?: " + operativo);
    }

    public boolean estaOperativo() {
        return operativo;
    }

    public int consultarCapacidad() {
        return capacidad;
    }
}
