package ud1.ejercicios;

/**
 * Ejercicio 19 — 🔴 Pre/post incremento (trampa)
 * ¿Qué imprime este código? Predice ANTES de ejecutar.
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        // PREDICCIÓN:
        // a = ?
        // b = ?

        int a = 5;
        int b = a++ + ++a;
        System.out.println(a);
        System.out.println(b);

        // TODO: Explica paso a paso cómo se evalúa a++ + ++a:
        // 1. a++ → usa el valor ___ y luego a pasa a ___
        // 2. ++a → a pasa a ___ y usa el valor ___
        // 3. b = ___ + ___ = ___
    }
}
