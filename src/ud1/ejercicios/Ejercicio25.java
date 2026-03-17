package ud1.ejercicios;

/**
 * Ejercicio 25 — 🟡 Operadores lógicos combinados
 * Dado int a = 5, b = 10, c = 5, evalúa cada expresión.
 * Predice ANTES de ejecutar.
 */
public class Ejercicio25 {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 5;

        // PREDICCIÓN:
        // a == c && b > a          → ?
        // a != c || b < a          → ?
        // !(a == c)                → ?
        // a < b && b < 20 || c == 0 → ?

        System.out.println("a == c && b > a          → " + (a == c && b > a));
        System.out.println("a != c || b < a          → " + (a != c || b < a));
        System.out.println("!(a == c)                → " + (!(a == c)));
        System.out.println("a < b && b < 20 || c == 0 → " + (a < b && b < 20 || c == 0));

        // TODO: En la última expresión, ¿qué se evalúa primero, && o ||?
        // Explica paso a paso:
        //
    }
}
