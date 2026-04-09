package ud3.ejercicios;

/**
 * Ejercicio 03 — Suma de los elementos de un array
 *
 * Dado el array {4, 8, 15, 16, 23, 42}, calcula la suma de todos sus elementos.
 *
 * Ejemplo de salida:
 *   La suma es: 108
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 15, 16, 23, 42};
        int suma = 0;
        for (int i=0 ; i < numeros.length ; i++ ){
            suma = numeros[i] + suma;
        }
        System.out.println("La suma es: " + suma);


    }
}
