package ud7.ejercicios.ejercicio40;

public class CuentaBancaria {
    private String titular;
    private double saldo;
    private String iban;

    private static int siguienteIban = 1;
    public static final double COMISION_MANTENIMIENTO = 5.0;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        setSaldo(saldo);
        this.iban = generarIban();
    }

    public CuentaBancaria(String titular) {
        this(titular, 0.0);
    }

    private static String generarIban() {
        return String.format("ES%03d", siguienteIban++);
    }

    public String getTitular() { return titular; }
    public void setTitular(String titular) { this.titular = titular; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    public String getIban() { return iban; }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= this.saldo) {
            this.saldo -= cantidad;
        } else {
            System.out.println("Operacion no permitida en cuenta " + iban);
        }
    }

    public void transferir(CuentaBancaria destino, double cantidad) {
        if (destino != null && cantidad > 0 && cantidad <= this.saldo) {
            this.saldo -= cantidad;
            destino.ingresar(cantidad);
        } else {
            System.out.println("Transferencia no permitida desde " + iban);
        }
    }

    private void aplicarComision() {
        if (this.saldo >= COMISION_MANTENIMIENTO) {
            this.saldo -= COMISION_MANTENIMIENTO;
        }
    }

    public void aplicarComisionPublica() {
        aplicarComision();
    }

    @Override
    public String toString() {
        return "CuentaBancaria{iban=" + iban + ", titular=" + titular + ", saldo=" + saldo + "}";
    }
}
