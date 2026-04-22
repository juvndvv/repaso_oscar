package ud3.ejercicios;

import java.util.Arrays;

/**
 * Ejercicio 12 — Copiar un array en otro
 *
 * Dado el array {10, 20, 30, 40, 50}, crea un segundo array del mismo tamano
 * y copia todos los elementos del primero al segundo usando un bucle.
 * Despues modifica el primer array y muestra ambos para comprobar que son independientes.
 *
 * IMPORTANTE: No uses clone() ni Arrays.copyOf(), hazlo manualmente con un bucle.
 *
 * Ejemplo de salida:
 *   Original:  [10, 20, 30, 40, 50]
 *   Copia:     [10, 20, 30, 40, 50]
 *   -- Modifico el original --
 *   Original:  [99, 20, 30, 40, 50]
 *   Copia:     [10, 20, 30, 40, 50]    <-- no cambia!
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};
        int copia[]= new int[5];
        for (int i = 0; i < original.length; i++){
            copia[i] = original[i];
        }
        System.out.println("Copia: " + Arrays.toString(copia));
        System.out.println("Original: " + Arrays.toString(original));
        original[0] = 5;
        System.out.println("Copia: " + Arrays.toString(copia));
        System.out.println("Original: " + Arrays.toString(original));
    }
}
