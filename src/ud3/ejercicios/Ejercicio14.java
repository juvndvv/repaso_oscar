package ud3.ejercicios;

import java.util.Arrays;

/**
 * Ejercicio 14 — Desplazar elementos a la derecha
 *
 * Dado el array {1, 2, 3, 4, 5}, desplaza todos los elementos una posicion
 * a la derecha. El ultimo elemento pasa a ser el primero.
 *
 * Pista: guarda el ultimo elemento antes de empezar a mover.
 * Recorre el array de derecha a izquierda copiando el anterior en el siguiente.
 *
 * Ejemplo de salida:
 *   Original:   [1, 2, 3, 4, 5]
 *   Desplazado: [5, 1, 2, 3, 4]
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("Original: " + Arrays.toString(numeros));

        int ultimo = numeros[numeros.length - 1];

        for (int i = 0; i < numeros.length; i++){
            numeros[i + 1] = numeros[i];
        }

        numeros[0] = ultimo;

        System.out.println("Desplazado: " + Arrays.toString(numeros));
    }
}
