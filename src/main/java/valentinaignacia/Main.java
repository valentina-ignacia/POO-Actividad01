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
        Prestamo prestamo1 = new Prestamo("Valentina", "El Principito", 1408,1409);
        prestamo1.mostrarInfo();
        prestamo1.devolverLibro();
        prestamo1.mostrarInfo();

        /* Caso 2 Ejercicio 3 */
        Producto producto1 = new Notebook("Lenovo","Notebook",500000,10);
        producto1.mostrarInformacion();
        producto1.venderProducto(1);
        System.out.println("Stock: " + producto1.consultarStock());

        /* Caso 3 Ejercicio 4 */
        CuentaBancaria cuenta1 = new CuentaBancaria("Valentina",123456789,100000,"Corriente");
        System.out.println("Saldo: "+ cuenta1.consultarSaldo());
        cuenta1.depositar(20000);
        System.out.println("Saldo: "+ cuenta1.consultarSaldo());
        cuenta1.girar(10000);
        System.out.println("Saldo: "+cuenta1.consultarSaldo());

        /* Caso 4 Ejercicio 5 */
        Estudiante estudiante1 = new Estudiante("Valentina","20.943.330-3","Analista Programador",6.5);
        estudiante1.mostrarInformacion();
        estudiante1.actualizarPromedio(7.0);
        System.out.println("Promedio: "+estudiante1.consultarPromedio());

        /* Caso 4 Ejercicio 6 */
        Curso curso1 = new Curso("POO", "DSY1102",30,25);
        System.out.println("Cupos disponibles: "+ curso1.consultarCupos());
        curso1.inscribirEstudiante();
        System.out.println("Cupos disponibles: "+ curso1.consultarCupos());
        curso1.borrarEstudiante();
        System.out.println("Cupos disponibles: "+ curso1.consultarCupos());

        /* Caso 5 Ejercicio 7 */
        Mascota mascota1 = new Mascota("Copito","Poodle",2);
        mascota1.mostrarInfo();
        mascota1.internar();
        System.out.println("¿Está internado? "+ mascota1.consultaEstado());

    }
}
