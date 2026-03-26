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


        // Dentro del bucle:
        //   - Muestra las opciones
        //   - Lee la opcion del usuario
        //   - Usa un switch para ejecutar la accion correspondiente
        //   - Opcion 1: muestra el array
        //   - Opcion 2: calcula y muestra la suma
        //   - Opcion 3: pide un numero y busca si esta en el array
        //   - Opcion 4: muestra el maximo y minimo
        //   - Opcion 5: sal del bucle

        sc.close();
    }
}
