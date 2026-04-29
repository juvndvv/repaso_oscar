package ud3.ejercicios;

/**
 * Ejercicio 20 — Eliminar duplicados
 *
 * Dado el array {4, 2, 7, 2, 4, 8, 7, 1, 4, 3}, crea un nuevo array
 * que contenga solo los valores unicos (sin repetir).
 *
 * Pista: puedes usar un array auxiliar grande (del mismo tamano) y un
 * contador para saber cuantos unicos has encontrado. Para cada elemento,
 * comprueba si ya esta en el array auxiliar antes de anadirlo.
 *
 * Ejemplo de salida:
 *   Original: [4, 2, 7, 2, 4, 8, 7, 1, 4, 3]
 *   Sin duplicados: [4, 2, 7, 8, 1, 3]
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        int[] numeros = {4, 2, 7, 2, 4, 8, 7, 1, 4, 3};

        int[] unicos = new int[numeros.length];
        int totalUnicos = 0;

        for (int i = 0; i < numeros.length; i++){
            boolean existe = false;

            for (int j = 0; j < totalUnicos; j++){
                if (unicos[j] == numeros[i]){
                    existe = true;
                    break;
                }
            }
        }


        // y un contador "totalUnicos" inicializado a 0

        //   1. Comprueba si ya existe en el array auxiliar (recorre hasta totalUnicos)
        //   2. Si no existe, anadelo al array auxiliar e incrementa totalUnicos

    }
}
