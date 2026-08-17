package valentinaignacia;

public class Pedido {
    /*Atributos*/
    int numeroPedido;
    String cliente;
    double precio;
    boolean entregado;

    /*Constructor*/
    public Pedido(int numeroPedido, String cliente, double precio) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.precio = precio;
        this.entregado = false;
    }

    /*Métodos*/
    public double calcularTotal(int cantidad) {
        return precio * cantidad;
    }

    public void actualizarEstado() {
        entregado = true;
    }

    public void infoPedido() {
        System.out.println("Número de pedido: " + numeroPedido);
        System.out.println("Cliente: " + cliente);
        System.out.println("Precio: $" + precio);
        System.out.println("¿Entregado?: " + entregado);
    }
}