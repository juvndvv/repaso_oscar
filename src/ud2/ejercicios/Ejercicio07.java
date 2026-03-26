package ud2.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 07 — Control de velocidad
 *
 * El usuario introduce la velocidad de un vehiculo. El programa informa:
 *   - Menor de 90 km/h       -> "Velocidad correcta"
 *   - Entre 90 y 120 km/h    -> "Atencion, al limite"
 *   - Mayor de 120 km/h      -> Multa de 10 euros por cada km/h de exceso sobre 120
 *
 * Ejemplo: a 135 km/h -> exceso de 15 km/h -> multa de 150 euros
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        //  Que datos tengo?
        // - Usuario introduce velocidad de un vehiculo

        // Que tengo que hacer con ellos?
        // - Rangos de velocidades
        // - Calcular la multa si es +120

        // Resultado final
        // - Velocidad en rango y multa si corresponde

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la velocidad a la que va un vehiculo: ");
        int velocidad = sc.nextInt();

        if (velocidad < 0 || velocidad > 400) {
            System.out.println("Valor no valido");
        } else if (velocidad < 90 ){
            System.out.println("Velocidad correcta");
        } else if (velocidad <= 120) {
            System.out.println("Atencion, al limite");
        } else {
            int exceso = velocidad - 120;
            int multa = exceso * 10;
            System.out.println("Multa de " + multa + " euros");
        }
    }
}
//  int multa = velocidad * 10;