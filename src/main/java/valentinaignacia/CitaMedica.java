package valentinaignacia;

public class CitaMedica {
    /*Atributos*/
    String paciente;
    String fecha;
    String hora;
    boolean atendida;

    /*Constructor*/
    public CitaMedica(String paciente, String fecha, String hora) {
        this.paciente = paciente;
        this.fecha = fecha;
        this.hora = hora;
        this.atendida = false;
    }

    /*Métodos*/
    public void mostrarDatos() {
        System.out.println("Paciente: " + paciente);
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        System.out.println("¿Atendida?: " + atendida);
    }

    public void atenderCita() {
        atendida = true;
    }

    public void cancelarCita() {
        atendida = false;
    }
}
