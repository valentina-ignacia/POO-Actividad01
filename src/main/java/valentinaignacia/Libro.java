package valentinaignacia;

public class Libro {
    /* Atributos */
    String titulo;
    String autor;
    boolean disponibilidad;
    int cantPaginas;
    String genero;

    /* Constructor */
    public Libro(String titulo, String autor, boolean disponibilidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponibilidad = disponibilidad;
    }

    /* Métodos */
    public void leer() {
        System.out.println("¡Libro leído!");
    }

    public boolean cambiarDisponibilidad(){
        disponibilidad = !disponibilidad;
        return disponibilidad;
    }

    public void getDatos() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
    }
}
