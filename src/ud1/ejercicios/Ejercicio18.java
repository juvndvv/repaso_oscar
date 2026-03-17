package ud1.ejercicios;

/**
 * Ejercicio 18 — 🟡 Operadores de asignación compuestos
 * ¿Qué valor tiene x tras cada línea? Predice ANTES de ejecutar.
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        // Escribe tu predicción:
        // Tras x += 5  → x = ?
        // Tras x -= 3  → x = ?
        // Tras x *= 2  → x = ?
        // Tras x /= 4  → x = ?
        // Tras x %= 3  → x = ?

        int x = 10;
        x += 5;
        System.out.println("Tras x += 5  → x = " + x);
        x -= 3;
        System.out.println("Tras x -= 3  → x = " + x);
        x *= 2;
        System.out.println("Tras x *= 2  → x = " + x);
        x /= 4;
        System.out.println("Tras x /= 4  → x = " + x);
        x %= 3;
        System.out.println("Tras x %= 3  → x = " + x);
    }
}
