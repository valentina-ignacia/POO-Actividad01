package valentinaignacia;

public class Paciente {
    /*Atributos*/
    String nombre;
    String rut;
    int edad;
    boolean internado;

    /* Constructor */
    public Paciente(String nombre, String rut, int edad) {
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
        this.internado = false;
    }

    /* Métodos */
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("RUT: " + rut);
        System.out.println("Edad: " + edad);
        System.out.println("¿Está internado?: " + internado);
    }

    public void internar() {
        internado = true;
    }

    public void darDeAlta() {
        internado = false;
    }

}
