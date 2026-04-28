package ud4.ejercicios;

/**
 * Ejercicio 25 — Suma del borde de una matriz
 *
 * Dada una matriz rectangular, calcula la suma de los elementos
 * que forman el borde exterior (primera fila, ultima fila,
 * primera columna y ultima columna), sin contar los esquinas dos veces.
 *
 * Matriz:
 *   { {1,  2,  3,  4},
 *     {5,  6,  7,  8},
 *     {9,  10, 11, 12} }
 *
 * Ejemplo de salida:
 *   Suma del borde: 64
 *
 * Pista: recorre la primera y ultima fila completas,
 *        luego solo las columnas extremas de las filas intermedias.
 */
public class Ejercicio25 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9,  10, 11, 12}
        };

    }
}
