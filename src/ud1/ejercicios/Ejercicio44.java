package ud1.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 44 — 🟡 Bug del salto de línea con Scanner
 * El siguiente código tiene un bug. Encuéntralo y corrígelo.
 */
public class Ejercicio44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        System.out.print("Ciudad: ");
        String ciudad = sc.nextLine();  // BUG: se salta la lectura

        System.out.println(ciudad + ", " + edad + " años.");

        // TODO: Ejecuta el programa tal cual. ¿Qué ocurre con la lectura de la ciudad?

        // TODO: Explica por qué ocurre el bug:
        // ¿Qué queda en el buffer tras nextInt()?
        //

        // TODO: Corrige el código añadiendo UNA línea en el lugar adecuado
        // Pista: necesitas consumir el salto de línea que queda en el buffer

        sc.close();
    }
}
