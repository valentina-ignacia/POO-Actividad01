package valentinaignacia;

public class Curso {
    /*Atributos*/
    String nombre;
    String codigo;
    int cupos;
    int estudiantesInscritos;

    /*Constructor*/
    public Curso(String nombre, String codigo, int cupos, int estudiantesInscritos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cupos = cupos;
        this.estudiantesInscritos = estudiantesInscritos;
    }

    /*Métodos*/
    public void inscribirEstudiante() {
        if (estudiantesInscritos < cupos) {
            System.out.println("Se inscribió correctamente al estudiante.");
            estudiantesInscritos += 1;
        } else {
            System.out.println("No hay cupos disponibles.");
        }
    }

    public void borrarEstudiante() {
        estudiantesInscritos -= 1;
    }

    public int consultarCupos() {
        return cupos - estudiantesInscritos;
    }
}
