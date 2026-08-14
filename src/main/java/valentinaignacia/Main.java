package valentinaignacia;

public class Main {
    static void main(String[] args) {

        /* Caso 1 Ejercicio 1 */
        var libro1 = new Libro("Harry Potter", "JKR", false);
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

        /* Caso 1 Ejercicio 2 */
    }
}
