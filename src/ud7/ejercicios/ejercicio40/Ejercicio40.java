package ud7.ejercicios.ejercicio40;

/**
 * Ejercicio 40 — CuentaBancaria completa (integrador)
 *
 * Clase CuentaBancaria que integra todos los conceptos de la UD:
 *   - Atributos privados: String titular, double saldo, String iban
 *   - Atributo privado static int siguienteIban = 1
 *   - Constante public static final double COMISION_MANTENIMIENTO = 5.0
 *   - Constructor completo (titular, saldo) que asigna iban automatico
 *   - Constructor parcial (titular) con saldo 0
 *   - Getters y setters con validacion (saldo no negativo)
 *   - Metodo ingresar(double cantidad)
 *   - Metodo retirar(double cantidad) sin permitir saldo negativo
 *   - Metodo helper privado aplicarComision()
 *   - Metodo transferir(CuentaBancaria destino, double cantidad)
 *   - Sobrescribe toString()
 *
 * Main: crea 3 cuentas, hace ingresos, retiradas, transferencias y
 * aplica comision para demostrar el funcionamiento completo.
 *
 * Ejemplo de salida:
 *   CuentaBancaria{iban=ES001, titular=Ana, saldo=1000.0}
 *   CuentaBancaria{iban=ES002, titular=Luis, saldo=500.0}
 *   CuentaBancaria{iban=ES003, titular=Marta, saldo=0.0}
 *   ...
 */
public class Ejercicio40 {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria("Ana", 1000.0);
        CuentaBancaria c2 = new CuentaBancaria("Luis", 500.0);
        CuentaBancaria c3 = new CuentaBancaria("Marta");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println();
        System.out.println("Ana ingresa 200 eur");
        c1.ingresar(200.0);

        System.out.println("Luis retira 100 eur");
        c2.retirar(100.0);

        System.out.println("Ana transfiere 300 eur a Marta");
        c1.transferir(c3, 300.0);

        System.out.println();
        System.out.println("Estado tras operaciones:");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println();
        System.out.println("Comision de mantenimiento: " + CuentaBancaria.COMISION_MANTENIMIENTO + " eur");
        c1.aplicarComisionPublica();
        c2.aplicarComisionPublica();
        c3.aplicarComisionPublica();

        System.out.println();
        System.out.println("Estado final:");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
