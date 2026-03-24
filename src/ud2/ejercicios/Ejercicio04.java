package ud2.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 04 — Simulador de ahorro mensual
 *
 * El usuario introduce cuanto ahorra al mes y cuanto quiere ahorrar en total.
 * El programa calcula e imprime mes a mes cuanto lleva ahorrado
 * hasta alcanzar el objetivo.
 *
 * Ejemplo de salida:
 *   Mes 1: 200.00 euros ahorrados
 *   Mes 2: 400.00 euros ahorrados
 *   ...
 *   Objetivo alcanzado en X meses!
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        // 1. Que datos tengo
        // - Dinero que ahorro cada mes
        // - Objetivo total a ahorrar

        // 2. Que tengo que hacer con ellos
        // - Ir sumando mes a mes el ahorro
        // - Mostrar cuánto llevo acumulado en cada mes
        // - Repetir hasta alcanzar o superar el objetivo

        // 3. Resultado final
        // - Mostrar cada mes el dinero acumulado
        // - Indicar en cuántos meses se alcanza el objetivo

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuanto quieres ahorrar cada mes?");
        float ahorro = sc.nextFloat();

        System.out.println("Cuanto quieres llegar a ahorrar?");
        float objetivo = sc.nextFloat();

        float incremento = 0f;
        int mes = 0;

        while (incremento < objetivo){
            mes++;
            incremento = incremento + ahorro;
            System.out.println("El mes " + mes + "has ahorrado: " + incremento + "€");
        }
        System.out.println("Objetivo alcanzado en : " + mes + "meses");


    }
}
