package ud5.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 30 — Factorial recursivo
 *
 * Crea una funcion factorialRecursivo(int n) que calcule el factorial
 * de n usando recursividad (la funcion se llama a si misma).
 *
 * Caso base:    n <= 1  -> devuelve 1
 * Caso general: factorialRecursivo(n) = n * factorialRecursivo(n - 1)
 *
 * Pide al usuario un numero y muestra su factorial.
 *
 * Conceptos: recursividad, caso base, caso general, pila de llamadas.
 *
 * Ejemplo de salida:
 *   Introduce un numero: 5
 *   5! = 120
 */
public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("No se puede calcular el factorial de un numero negativo");
        } else {
            long resultado = factorialRecursivo(numero);
            System.out.println(numero + "! = " + resultado);
        }

        sc.close();
    }

    public static long factorialRecursivo(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorialRecursivo(n - 1);
    }
}
