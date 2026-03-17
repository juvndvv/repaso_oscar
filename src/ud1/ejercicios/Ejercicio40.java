package ud1.ejercicios;

/**
 * Ejercicio 40 — 🔴 Concatenación de String vs suma (trampa)
 * ¿Qué imprime cada línea? Predice ANTES de ejecutar.
 */
public class Ejercicio40 {
    public static void main(String[] args) {
        // PREDICCIÓN:
        // Línea 1: ?
        // Línea 2: ?
        // Línea 3: ?
        // Línea 4: ?

        String s = "5";
        System.out.println(s + 3);                    // Línea 1
        System.out.println(Integer.parseInt(s) + 3);   // Línea 2
        System.out.println(s + 3 + 2);                 // Línea 3
        System.out.println(3 + 2 + s);                 // Línea 4

        // TODO: Explica por qué la línea 3 y la línea 4 dan resultados diferentes:
        // ¿En qué orden se evalúan las operaciones?
        //
    }
}
