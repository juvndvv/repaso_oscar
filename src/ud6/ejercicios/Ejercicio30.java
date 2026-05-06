package ud6.ejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Ejercicio 30 - Contador de palabras
 *
 * Pide una frase por consola, cuenta cuantas veces aparece cada palabra
 * usando un HashMap<String,Integer> y muestra el resultado ordenado
 * alfabeticamente por palabra.
 *
 * Ejemplo de salida:
 *   Frase: el perro y el gato y el perro
 *   el -> 3
 *   gato -> 1
 *   perro -> 2
 *   y -> 2
 */
public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Frase: ");
        String frase = sc.nextLine();

        HashMap<String, Integer> contador = new HashMap<>();
        String[] palabras = frase.toLowerCase().split(" ");

        for (String palabra : palabras) {
            if (palabra.isEmpty()) {
                continue;
            }
            if (contador.containsKey(palabra)) {
                contador.put(palabra, contador.get(palabra) + 1);
            } else {
                contador.put(palabra, 1);
            }
        }

        TreeMap<String, Integer> ordenado = new TreeMap<>(contador);
        for (Map.Entry<String, Integer> entrada : ordenado.entrySet()) {
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }
    }
}
