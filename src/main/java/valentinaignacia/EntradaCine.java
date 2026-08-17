package valentinaignacia;

public class EntradaCine {
    /* Atributos */
    String pelicula;
    String sala;
    double precio;
    boolean utilizada;

    /* Constructor */
    public EntradaCine(String pelicula, String sala, double precio) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.precio = precio;
        this.utilizada = false;
    }

    /* Métodos */
    public void usarEntrada() {
        utilizada = true;
    }

    public boolean estaUtilizada() { /*Consulta el estado de la entrada*/
        return utilizada;
    }

    public void mostrarDatos() {
        System.out.println("Película: " + pelicula);
        System.out.println("Sala: " + sala);
        System.out.println("Precio: $" + precio);
        System.out.println("¿Utilizada?: " + utilizada);
    }
}
