package ud5.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 40 — Sistema de gestion de notas
 *
 * Programa integrador de toda la unidad. Implementa un menu con las
 * siguientes opciones, cada una en su propia funcion:
 *
 *   1. Introducir notas (rellena el array notas[] pidiendolas por teclado)
 *   2. Calcular media
 *   3. Mostrar mejor nota
 *   4. Mostrar peor nota
 *   5. Ordenar notas (modifica el array original — paso por referencia)
 *   6. Mostrar todas las notas
 *   0. Salir
 *
 * Demuestra: ambito de variables (notas[] declarada en main y pasada
 * como parametro), paso por referencia (las funciones que ordenan o
 * modifican el array afectan al original), composicion (main como
 * director de orquesta), procedimientos vs funciones, sobrecarga.
 *
 * Ejemplo de salida:
 *   --- MENU NOTAS ---
 *   1. Introducir notas
 *   2. Calcular media
 *   3. Mejor nota
 *   4. Peor nota
 *   5. Ordenar
 *   6. Mostrar
 *   0. Salir
 *   Opcion: 2
 *   Media: 7.25
 */
public class Ejercicio40 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = null;
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    notas = introducirNotas(sc);
                    break;
                case 2:
                    if (hayNotas(notas)) {
                        System.out.printf("Media: %.2f%n", calcularMedia(notas));
                    }
                    break;
                case 3:
                    if (hayNotas(notas)) {
                        System.out.println("Mejor nota: " + mejorNota(notas));
                    }
                    break;
                case 4:
                    if (hayNotas(notas)) {
                        System.out.println("Peor nota: " + peorNota(notas));
                    }
                    break;
                case 5:
                    if (hayNotas(notas)) {
                        ordenarNotas(notas);
                        System.out.println("Notas ordenadas");
                    }
                    break;
                case 6:
                    if (hayNotas(notas)) {
                        mostrarNotas(notas);
                    }
                    break;
                case 0:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 0);

        sc.close();
    }

    public static void mostrarMenu() {
        System.out.println();
        System.out.println("--- MENU NOTAS ---");
        System.out.println("1. Introducir notas");
        System.out.println("2. Calcular media");
        System.out.println("3. Mejor nota");
        System.out.println("4. Peor nota");
        System.out.println("5. Ordenar");
        System.out.println("6. Mostrar");
        System.out.println("0. Salir");
        System.out.print("Opcion: ");
    }

    public static double[] introducirNotas(Scanner sc) {
        System.out.print("Cuantas notas vas a introducir? ");
        int cantidad = sc.nextInt();
        double[] notas = new double[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
        return notas;
    }

    public static boolean hayNotas(double[] notas) {
        if (notas == null || notas.length == 0) {
            System.out.println("Primero introduce notas (opcion 1)");
            return false;
        }
        return true;
    }

    public static double calcularMedia(double[] notas) {
        double suma = 0;
        for (double n : notas) {
            suma += n;
        }
        return suma / notas.length;
    }

    public static double mejorNota(double[] notas) {
        double mejor = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > mejor) {
                mejor = notas[i];
            }
        }
        return mejor;
    }

    public static double peorNota(double[] notas) {
        double peor = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < peor) {
                peor = notas[i];
            }
        }
        return peor;
    }

    public static void ordenarNotas(double[] notas) {
        for (int i = 0; i < notas.length - 1; i++) {
            for (int j = 0; j < notas.length - 1 - i; j++) {
                if (notas[j] > notas[j + 1]) {
                    double tmp = notas[j];
                    notas[j] = notas[j + 1];
                    notas[j + 1] = tmp;
                }
            }
        }
    }

    public static void mostrarNotas(double[] notas) {
        System.out.print("Notas: [");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i]);
            if (i < notas.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
