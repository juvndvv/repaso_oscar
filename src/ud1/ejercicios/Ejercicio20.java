package ud1.ejercicios;

/**
 * Ejercicio 20 — 🔴 Pre/post incremento con multiplicación
 * ¿Qué imprime este código? Predice ANTES de ejecutar.
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        // PREDICCIÓN:
        // Línea 1: 8
        // Línea 2: 4
        // Línea 3: 8
        // Línea 4: 5

        int x = 3;
        System.out.println(x++ * 2);  // Línea 1
        System.out.println(x);        // Línea 2
        System.out.println(++x * 2);  // Línea 3
        System.out.println(x);        // Línea 4

    }
}
