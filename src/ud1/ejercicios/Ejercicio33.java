package ud1.ejercicios;

/**
 * Ejercicio 33 — 🟡 Trampa: división entera antes de casting
 * ¿Qué valor tienen f1 y f2? Predice ANTES de ejecutar.
 */
public class Ejercicio33 {
    public static void main(String[] args) {
        // PREDICCIÓN:
        // f1 = ?
        // f2 = ?

        float f1 = 5 / 2;
        float f2 = (float) 5 / 2;

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        // TODO: Explica por qué f1 y f2 tienen valores diferentes:
        // ¿En qué momento se aplica el casting en cada caso?
        //
    }
}
