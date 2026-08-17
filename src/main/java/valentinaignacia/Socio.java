package valentinaignacia;

public class Socio {
    /* Atributos */
    String nombre;
    String plan;
    boolean pagoVigente;
    int asistencias;

    /* Constructor */
    public Socio(String nombre, String plan) {
        this.nombre = nombre;
        this.plan = plan;
        this.pagoVigente = false;
        this.asistencias = 0;
    }

    /* Métodos */
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Plan: " + plan);
        System.out.println("Pago vigente: " + pagoVigente);
        System.out.println("Asistencias: " + asistencias);
    }

    public void registrarAsistencia() {
        asistencias++;
    }

    public String consultarPlan() {
        return plan;
    }

}
