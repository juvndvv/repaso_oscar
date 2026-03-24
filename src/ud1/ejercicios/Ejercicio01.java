package ud1.ejercicios;

/**
 * Ejercicio 01 — 🟢 Tipos primitivos
 * Declara una variable de cada tipo primitivo, asígnales un valor y muéstralas por pantalla.
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        // TODO: Declara una variable de cada tipo primitivo:
        // byte, short, int, long, float, double, char, boolean
        System.out.println();
        // TODO: Asígnales un valor adecuado a cada una
        byte miByte = 10;
        short miShort = 1000;
        int miInt = 50000;
        long miLong = 100000L;

        float miFloat = 5.75f;
        double miDouble = 19.99;

        char miChar = 'A';
        boolean miBoolean = true;
        // TODO: Muestra cada variable por pantalla con System.out.println()
        System.out.println("byte: " + miByte);
        System.out.println("short: " + miShort);
        System.out.println("int: " + miInt);
        System.out.println("long: " + miLong);
        System.out.println("float: " + miFloat);
        System.out.println("double: " + miDouble);
        System.out.println("char: " + miChar);
        System.out.println("boolean: " + miBoolean);
    }
}
