package valentinaignacia;

public abstract class Producto {

    /*Atributos*/
    String nombre;
    String categoria;
    double precio;
    int stock;

    /*Constructor*/
    public Producto (String nombre, String categoria, double precio, int stock) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    public void venderProducto(int cantidad) {
        stock -= cantidad;
    }

    public int consultarStock() {
        return stock;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Categoría: " + categoria);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
    }
}
