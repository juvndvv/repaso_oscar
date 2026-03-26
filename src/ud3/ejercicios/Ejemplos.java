package ud3.ejercicios;

/**
 * EJEMPLOS — Operaciones basicas con Arrays y Matrices
 *
 * Este archivo es una referencia con las operaciones mas comunes.
 * Consultalo mientras haces los ejercicios.
 */
public class Ejemplos {
    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("  1. DECLARAR E INICIALIZAR ARRAYS");
        System.out.println("========================================");

        // Forma 1: declarar con valores directos
        int[] numeros = {10, 20, 30, 40, 50};

        // Forma 2: declarar con tamano fijo (todos los valores empiezan a 0)
        int[] vacio = new int[5]; // [0, 0, 0, 0, 0]

        // Forma 3: declarar y asignar despues
        String[] dias = new String[3];
        dias[0] = "Lunes";
        dias[1] = "Martes";
        dias[2] = "Miercoles";

        // Acceder a un elemento concreto
        System.out.println("Primer elemento: " + numeros[0]);   // 10
        System.out.println("Ultimo elemento: " + numeros[numeros.length - 1]); // 50
        System.out.println("Tamano del array: " + numeros.length); // 5

        // Modificar un elemento
        numeros[2] = 99; // ahora es {10, 20, 99, 40, 50}

        System.out.println();
        System.out.println("========================================");
        System.out.println("  2. RECORRER UN ARRAY");
        System.out.println("========================================");

        int[] datos = {5, 12, 8, 3, 17};

        // Con for clasico (cuando necesitas el indice)
        System.out.println("Con for clasico:");
        for (int i = 0; i < datos.length; i++) {
            System.out.println("  datos[" + i + "] = " + datos[i]);
        }

        // Con for-each (cuando solo necesitas el valor)
        System.out.println("Con for-each:");
        for (int dato : datos) {
            System.out.println("  " + dato);
        }

        System.out.println();
        System.out.println("========================================");
        System.out.println("  3. SUMAR ELEMENTOS");
        System.out.println("========================================");

        int[] valores = {4, 8, 15, 16, 23, 42};
        int suma = 0;

        for (int valor : valores) {
            suma += valor; // suma = suma + valor
        }

        System.out.println("Suma: " + suma); // 108

        System.out.println();
        System.out.println("========================================");
        System.out.println("  4. CALCULAR LA MEDIA");
        System.out.println("========================================");

        double[] notas = {7.5, 4.0, 9.2, 6.8};
        double sumaNotas = 0;

        for (double nota : notas) {
            sumaNotas += nota;
        }

        double media = sumaNotas / notas.length;
        System.out.printf("Media: %.2f%n", media); // 6.88

        System.out.println();
        System.out.println("========================================");
        System.out.println("  5. BUSCAR EL MAXIMO Y EL MINIMO");
        System.out.println("========================================");

        int[] edades = {33, 7, 91, 12, 58};

        int max = edades[0]; // empezamos asumiendo que el primero es el mayor
        int min = edades[0]; // y tambien el menor

        for (int i = 1; i < edades.length; i++) {
            if (edades[i] > max) {
                max = edades[i];
            }
            if (edades[i] < min) {
                min = edades[i];
            }
        }

        System.out.println("Maximo: " + max); // 91
        System.out.println("Minimo: " + min); // 7

        System.out.println();
        System.out.println("========================================");
        System.out.println("  6. BUSCAR UN ELEMENTO");
        System.out.println("========================================");

        int[] lista = {10, 25, 33, 47, 58};
        int buscado = 33;
        boolean encontrado = false;
        int posicion = -1;

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == buscado) {
                encontrado = true;
                posicion = i;
                break; // ya lo encontramos, salimos del bucle
            }
        }

        if (encontrado) {
            System.out.println(buscado + " encontrado en posicion " + posicion);
        } else {
            System.out.println(buscado + " no encontrado");
        }

        System.out.println();
        System.out.println("========================================");
        System.out.println("  7. INVERTIR UN ARRAY");
        System.out.println("========================================");

        int[] original = {1, 2, 3, 4, 5};

        // Intercambiamos el primero con el ultimo, el segundo con el penultimo, etc.
        for (int i = 0; i < original.length / 2; i++) {
            int temp = original[i];
            original[i] = original[original.length - 1 - i];
            original[original.length - 1 - i] = temp;
        }

        System.out.print("Invertido: ");
        for (int num : original) {
            System.out.print(num + " ");
        }
        System.out.println(); // {5, 4, 3, 2, 1}

        System.out.println();
        System.out.println("========================================");
        System.out.println("  8. ORDENAR CON BURBUJA");
        System.out.println("========================================");

        int[] desordenado = {64, 34, 25, 12, 22, 11, 90};

        for (int i = 0; i < desordenado.length - 1; i++) {
            for (int j = 0; j < desordenado.length - 1 - i; j++) {
                if (desordenado[j] > desordenado[j + 1]) {
                    // Intercambiar
                    int temp = desordenado[j];
                    desordenado[j] = desordenado[j + 1];
                    desordenado[j + 1] = temp;
                }
            }
        }

        System.out.print("Ordenado: ");
        for (int num : desordenado) {
            System.out.print(num + " ");
        }
        System.out.println(); // 11 12 22 25 34 64 90

        System.out.println();
        System.out.println("========================================");
        System.out.println("  9. COPIAR UN ARRAY");
        System.out.println("========================================");

        int[] origen = {10, 20, 30};
        int[] copia = new int[origen.length];

        for (int i = 0; i < origen.length; i++) {
            copia[i] = origen[i];
        }

        // CUIDADO: esto NO copia, ambas variables apuntan al mismo array:
        // int[] mal = origen;  <-- si modificas "mal", tambien cambia "origen"

        System.out.print("Origen: ");
        for (int num : origen) System.out.print(num + " ");
        System.out.println();
        System.out.print("Copia:  ");
        for (int num : copia) System.out.print(num + " ");
        System.out.println();

        System.out.println();
        System.out.println("========================================");
        System.out.println("  10. MOSTRAR UN ARRAY BONITO");
        System.out.println("========================================");

        int[] ejemplo = {1, 2, 3, 4, 5};

        // Forma manual con formato [1, 2, 3, 4, 5]
        System.out.print("[");
        for (int i = 0; i < ejemplo.length; i++) {
            System.out.print(ejemplo[i]);
            if (i < ejemplo.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Forma rapida con Arrays.toString (necesita import java.util.Arrays)
        // System.out.println(java.util.Arrays.toString(ejemplo));

        System.out.println();
        System.out.println("========================================");
        System.out.println("========================================");
        System.out.println("         MATRICES (ARRAYS 2D)");
        System.out.println("========================================");
        System.out.println("========================================");

        System.out.println();
        System.out.println("========================================");
        System.out.println("  11. DECLARAR E INICIALIZAR UNA MATRIZ");
        System.out.println("========================================");

        // Forma 1: con valores directos
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Forma 2: con tamano fijo (todo a 0)
        int[][] matrizVacia = new int[3][4]; // 3 filas, 4 columnas

        // Acceder a un elemento: matriz[fila][columna]
        System.out.println("Elemento [1][2]: " + matriz[1][2]); // 6

        // Tamano
        System.out.println("Numero de filas: " + matriz.length);        // 3
        System.out.println("Columnas fila 0: " + matriz[0].length);     // 3

        System.out.println();
        System.out.println("========================================");
        System.out.println("  12. RECORRER UNA MATRIZ");
        System.out.println("========================================");

        int[][] tabla = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Dos bucles for anidados: externo = filas, interno = columnas
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.printf("%4d", tabla[i][j]);
            }
            System.out.println(); // salto de linea al acabar cada fila
        }

        System.out.println();
        System.out.println("========================================");
        System.out.println("  13. SUMA DE FILAS");
        System.out.println("========================================");

        int[][] datos2d = {
            {3, 5, 7},
            {2, 4, 6},
            {1, 8, 9}
        };

        for (int i = 0; i < datos2d.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < datos2d[i].length; j++) {
                sumaFila += datos2d[i][j];
            }
            System.out.println("Suma fila " + i + ": " + sumaFila);
        }

        System.out.println();
        System.out.println("========================================");
        System.out.println("  14. SUMA DE COLUMNAS");
        System.out.println("========================================");

        // Ahora el bucle externo son las columnas y el interno las filas
        for (int j = 0; j < datos2d[0].length; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < datos2d.length; i++) {
                sumaColumna += datos2d[i][j];
            }
            System.out.println("Suma columna " + j + ": " + sumaColumna);
        }

        System.out.println();
        System.out.println("========================================");
        System.out.println("  15. DIAGONAL PRINCIPAL");
        System.out.println("========================================");

        // Solo funciona con matrices cuadradas (mismas filas que columnas)
        int[][] cuadrada = {
            {5, 1, 2},
            {4, 8, 6},
            {9, 2, 3}
        };

        // La diagonal son los elementos donde fila == columna
        System.out.print("Diagonal: ");
        int sumaDiag = 0;
        for (int i = 0; i < cuadrada.length; i++) {
            System.out.print(cuadrada[i][i] + " ");
            sumaDiag += cuadrada[i][i];
        }
        System.out.println();
        System.out.println("Suma diagonal: " + sumaDiag); // 5 + 8 + 3 = 16

        System.out.println();
        System.out.println("========================================");
        System.out.println("  16. MODIFICAR UNA MATRIZ");
        System.out.println("========================================");

        // Rellenar toda una matriz con un valor
        int[][] rellena = new int[3][3];
        for (int i = 0; i < rellena.length; i++) {
            for (int j = 0; j < rellena[i].length; j++) {
                rellena[i][j] = i * 3 + j + 1; // rellena con 1,2,3,4,5,6,7,8,9
            }
        }

        // Mostrar resultado
        for (int i = 0; i < rellena.length; i++) {
            for (int j = 0; j < rellena[i].length; j++) {
                System.out.printf("%4d", rellena[i][j]);
            }
            System.out.println();
        }
    }
}
