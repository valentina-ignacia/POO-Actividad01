package valentinaignacia;

public class Estudiante {
    /*Atributos*/
    String nombre;
    String rut;
    String carrera;
    double promedio;

    /*Constructor*/
    public Estudiante (String nombre, String rut, String carrera, double promedio) {
        this.nombre = nombre;
        this.rut = rut;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    /*Métodos*/
    public void mostrarInformacion() {
        System.out.println("Nombre: "+nombre);
        System.out.println("RUT: "+rut);
        System.out.println("Carrera: "+carrera);
        System.out.println("Promedio: "+promedio);
    }

    public void actualizarPromedio(double nuevoPromedio) {
        promedio = nuevoPromedio;
    }

    public double consultarPromedio() {
        return promedio;
    }
}
