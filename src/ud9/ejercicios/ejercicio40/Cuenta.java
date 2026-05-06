package ud9.ejercicios.ejercicio40;

public class Cuenta {
    int id;
    String titular;
    double saldo;

    Cuenta(int id, String titular, double saldo) {
        this.id = id;
        this.titular = titular;
        this.saldo = saldo;
    }

    void ingresar(double cantidad) {
        saldo += cantidad;
    }

    void retirar(double cantidad) throws SaldoInsuficienteException {
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente en cuenta " + id);
        }
        saldo -= cantidad;
    }

    @Override
    public String toString() {
        return id + ";" + titular + ";" + saldo;
    }
}
