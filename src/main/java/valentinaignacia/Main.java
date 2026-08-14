package valentinaignacia;

public class Main {
    static void main(String[] args) {
        /* Creación objeto */
        var libro1 = new Libro("Harry Potter", "JKR", false);

        /* Correr métodos */
        libro1.leer();
        libro1.getDatos();

        if (libro1.cambiarDisponibilidad()) {
            String estado = "Disponible";
            System.out.println("Estado del libro: " + estado);
        } else {
            String estado = "No Disponible";
            System.out.println("Estado del libro: " + estado);
        }

        if (libro1.cambiarDisponibilidad()) {
            String estado = "Disponible";
            System.out.println("Estado del libro: " + estado);
        } else {
            String estado = "No Disponible";
            System.out.println("Estado del libro: " + estado);
        }

    }
}
