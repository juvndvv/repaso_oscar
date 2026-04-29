package ud3.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 18 — Menu de operaciones con array
 *
 * Crea un array de 5 enteros rellenado por el usuario.
 * Muestra un menu con estas opciones:
 *   1. Mostrar el array
 *   2. Sumar todos los elementos
 *   3. Buscar un numero
 *   4. Mostrar el maximo y el minimo
 *   5. Salir
 *
 * El menu se repite hasta que el usuario elija salir.
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Introduce el numero: " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int opcion;

        do {
            System.out.println("---MENU---");
            System.out.println("1. Mostrar el array");
            System.out.println("2. Sumar todos los elementos");
            System.out.println("3. Buscar un numero");
            System.out.println("4. Mostrar el maximo y el minimo");
            System.out.println("5. Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Array: ");
                    for (int i = 0; i < numeros.length; i++){
                        System.out.printf(numeros[i] + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    int suma = 0;
                    for (int i = 0; i < numeros.length; i++){
                        suma += numeros[i];
                    }
                    System.out.println("Suma: " + suma);
                    break;
                case 3:
                    System.out.println("Que numero quieres buscar?: ");
                    int buscado = sc.nextInt();
                    boolean encontrado = false;

                    for (int i = 0; i < numeros.length; i++){
                        if (numeros[i] == buscado){
                            encontrado = true;
                            break;
                        }
                    }
                    if (encontrado){
                        System.out.println("El numero SI que esta en el array");
                    } else {
                        System.out.println("El numero NO esta en el array");
                    }
                    break;
                case 4:
                    int max = numeros[0];
                    int min = numeros[0];
                    for (int i = 0; i < numeros.length; i++){
                        if (numeros[i] > max){
                            max = numeros[i];
                        } else if (numeros[i] < min){
                            min = numeros[i];
                        }
                    }
                    System.out.println("Máximo: " + max);
                    System.out.println("Mínimo: " + min);
                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}
