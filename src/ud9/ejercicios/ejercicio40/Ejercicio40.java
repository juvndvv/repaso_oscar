package ud9.ejercicios.ejercicio40;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio 40 — Mini sistema bancario persistente
 *
 * Define una clase Cuenta con id, titular y saldo.
 * Metodos: ingresar(double), retirar(double) que lanza SaldoInsuficienteException,
 * y toString().
 * En la clase principal:
 *   - cargarCuentas(File): lee cuentas.txt (formato id;titular;saldo) y devuelve
 *     un ArrayList de Cuenta.
 *   - guardarCuentas(File, ArrayList<Cuenta>): sobrescribe el fichero.
 * En main:
 *   - Si el fichero existe, carga las cuentas; si no, crea cuentas iniciales.
 *   - Realiza varias operaciones (ingresos, retiros), capturando la excepcion
 *     personalizada cuando se intenta retirar mas del saldo.
 *   - Guarda el resultado al final con try-with-resources.
 *
 * Ejemplo de salida:
 *   Cargando cuentas existentes...
 *   Cuenta 1 - Ana: 500.0
 *   Cuenta 2 - Luis: 200.0
 *   Ingreso 100 en Ana
 *   Retiro 250 en Luis
 *   Error: Saldo insuficiente en cuenta 1
 *   Cuentas guardadas correctamente
 */
public class Ejercicio40 {

    static ArrayList<Cuenta> cargarCuentas(File f) throws FileNotFoundException {
        ArrayList<Cuenta> lista = new ArrayList<>();
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] partes = linea.split(";");
                if (partes.length == 3) {
                    int id = Integer.parseInt(partes[0]);
                    String titular = partes[1];
                    double saldo = Double.parseDouble(partes[2]);
                    lista.add(new Cuenta(id, titular, saldo));
                }
            }
        }
        return lista;
    }

    static void guardarCuentas(File f, ArrayList<Cuenta> cuentas) throws FileNotFoundException {
        try (PrintStream ps = new PrintStream(f)) {
            for (Cuenta c : cuentas) {
                ps.println(c.toString());
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("cuentas.txt");
        ArrayList<Cuenta> cuentas;
        if (f.exists()) {
            System.out.println("Cargando cuentas existentes...");
            cuentas = cargarCuentas(f);
        } else {
            System.out.println("Creando cuentas iniciales...");
            cuentas = new ArrayList<>();
            cuentas.add(new Cuenta(1, "Ana", 500.0));
            cuentas.add(new Cuenta(2, "Luis", 200.0));
        }

        for (Cuenta c : cuentas) {
            System.out.println("Cuenta " + c.id + " - " + c.titular + ": " + c.saldo);
        }

        cuentas.get(0).ingresar(100);
        System.out.println("Ingreso 100 en " + cuentas.get(0).titular);

        try {
            cuentas.get(1).retirar(250);
            System.out.println("Retiro 250 en " + cuentas.get(1).titular);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            cuentas.get(0).retirar(9999);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }

        guardarCuentas(f, cuentas);
        System.out.println("Cuentas guardadas correctamente");
    }
}
