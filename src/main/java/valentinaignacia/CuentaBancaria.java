package valentinaignacia;

public class CuentaBancaria {
    /*Atributos*/
    String titular;
    int numeroCuenta;
    double saldo;
    String tipoCuenta;

    /*Constructor*/
    public CuentaBancaria(String titular, int numeroCuenta, double saldo, String tipoCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    /*Métodos*/
    public double consultarSaldo() {
        return saldo;
    }

    public void depositar(double cantidadMeter) {
        saldo += cantidadMeter;
    }

    public void girar(double cantidadSacar) {
        saldo -= cantidadSacar;
    }

}
