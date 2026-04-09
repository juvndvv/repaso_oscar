package ud3.ejercicios;

/**
 * Ejercicio 06 — Encontrar el minimo y su posicion
 *
 * Dado el array {33, 7, 91, 12, 58, 3, 44}, encuentra el valor minimo
 * y en que posicion del array se encuentra.
 *
 * Ejemplo de salida:
 *   El minimo es: 3, en la posicion: 5
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        int[] numeros = {33, 7, 91, 12, 58, 3, 44};
        int min = numeros[0];
        int posicion = 0;
        for (int i=0 ; i < numeros.length ; i++){
            if (numeros[i] < min){
                min = numeros[i];
                posicion = i;
            }
        }
        System.out.println("El minimo es: " + min);
        System.out.println("La posicion es: " + posicion);
    }
}
