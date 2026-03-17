package ud1.ejercicios;

/**
 * Ejercicio 29 — 🔴 Precedencia de operadores mixtos
 * Evalúa paso a paso la siguiente expresión.
 */
public class Ejercicio29 {
    public static void main(String[] args) {
        int a = 4, b = 2, c = 8;
        boolean r = a * b >= c || c / b == a && b != 3;

        // TODO: Evalúa paso a paso (rellena los huecos):
        // Paso 1 — Multiplicaciones/divisiones: a * b = ?, c / b = ?
        // Paso 2 — Comparaciones: ___ >= c → ?, ___ == a → ?, b != 3 → ?
        // Paso 3 — AND (&&): ___ && ___ → ?
        // Paso 4 — OR (||): ___ || ___ → ?
        // Resultado final: r = ?

        System.out.println("r = " + r);
    }
}
