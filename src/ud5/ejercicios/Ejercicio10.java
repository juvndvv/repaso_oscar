package ud5.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 10 — Factorial con bucle
 *
 * Crea una funcion factorial(int n) que devuelva el factorial de n
 * usando un bucle (no recursividad). El factorial de 0 es 1.
 * Si n es negativo, devuelve -1 como valor de error.
 *
 * Pide al usuario un numero y muestra su factorial.
 *
 * Conceptos: funcion con valor de retorno, control de errores con codigo
 * especial, composicion main + funcion auxiliar.
 *
 * Ejemplo de salida:
 *   Introduce un numero: 5
 *   5! = 120
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = sc.nextInt();

        long resultado = factorial(numero);
        if (resultado == -1) {
            System.out.println("No se puede calcular el factorial de un numero negativo");
        } else {
            System.out.println(numero + "! = " + resultado);
        }

        sc.close();
    }

    public static long factorial(int n) {
        if (n < 0) {
            return -1;
        }
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
