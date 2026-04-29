package ud3.ejercicios;

/**
 * Ejercicio 17 — Encontrar el segundo mayor
 *
 * Dado el array {14, 46, 47, 86, 92, 52, 48, 36, 66, 85},
 * encuentra el segundo valor mas grande.
 *
 * Pista: puedes buscar el maximo, y luego buscar el maximo de los que
 * NO sean el maximo. O puedes llevar dos variables: mayor y segundoMayor.
 *
 * Ejemplo de salida:
 *   El mayor es: 92
 *   El segundo mayor es: 86
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        int[] numeros = {14, 46, 47, 86, 92, 52, 48, 36, 66, 85};

        int mayor = 0;
        int segundoMayor = 0;

        if (numeros[0] > numeros[1]){
            mayor = numeros[0];
            segundoMayor = numeros[1];
        } else {
            mayor = numeros[1];
            segundoMayor = numeros[0];
        }

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > mayor){
                segundoMayor = mayor;
                mayor = numeros[i];
            } else if (numeros[i] > segundoMayor && numeros[i] != mayor) {
                segundoMayor = numeros[i];
            }
        }
        System.out.println("El mayor es: " + mayor);
        System.out.println("El segundo mayor es: " + segundoMayor);

        // Opcion 1: dos pasadas (primero busca el max, luego el segundo)
        // Opcion 2: una sola pasada con dos variables (mayor y segundoMayor)

    }
}
