package valentinaignacia;

public class Prestamo {
    /* Atributos */
    String nombreEstudiante;
    String nombreLibro;
    boolean estDevolucion;
    int fechaPrestamo;
    int fechaDevolucion;

    /*Constructor*/
    public Prestamo (String nombreEstudiante, String nombreLibro,
                     int fechaPrestamo, int fechaDevolucion) {

        this.nombreEstudiante = nombreEstudiante;
        this.nombreLibro = nombreLibro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.estDevolucion = false;
    }

    /*Métodos*/
    public boolean estadoDevolucion() { /*Comprueba si se ha devuelto el libro o no*/
        return estDevolucion;
    }

    public void devolverLibro() { /*Se usa cuando se devuelve el libro*/
        estDevolucion = true;
    }

    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombreEstudiante);
        System.out.println("Libro: " + nombreLibro);
        System.out.println("Fecha préstamo: " + fechaPrestamo);
        System.out.println("Fecha devolución: " + fechaDevolucion);
        System.out.println("¿Devuelto?: " + estDevolucion);
    }


}
