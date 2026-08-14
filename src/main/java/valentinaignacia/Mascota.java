package valentinaignacia;

public class Mascota {
    /*Atributos*/
    String nombre;
    String especie;
    int edad;
    boolean internado;

    /*Constructor*/
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.internado = false;
    }

    /*Métodos*/
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
        System.out.println("¿Está internado?: " + internado);
    }

    public void internar() {
        internado = true;
    }

    public void darAlta() {
        internado = false;
    }

    public boolean consultaEstado() {
        return internado;
    }
}
