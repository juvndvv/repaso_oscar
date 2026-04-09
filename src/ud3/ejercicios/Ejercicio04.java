package ud3.ejercicios;

/**
 * Ejercicio 04 — Media aritmetica de un array
 *
 * Dado un array de doubles {5.5, 8.0, 3.5, 9.0, 7.5}, calcula la media aritmetica.
 *
 * Recuerda: media = suma de todos los elementos / numero de elementos
 *
 * Ejemplo de salida:
 *   La media es: 6.70
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        double[] notas = {5.5, 8.0, 3.5, 9.0, 7.5};
        double suma = 0;
        for (int i=0 ; i < notas.length ; i++){
            suma = notas[i] + suma;
        }
        System.out.println("La media es: " + suma/notas.length);

    }
}
