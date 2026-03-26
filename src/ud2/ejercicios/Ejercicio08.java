package ud2.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 08 — Contador de dias laborables
 *
 * El usuario introduce un numero de dias naturales.
 * El programa calcula cuantos son laborables, asumiendo que cada semana
 * tiene 5 dias laborables y 2 de fin de semana.
 *
 * Ejemplo: 10 dias naturales = 1 semana completa (5 laborables) + 3 dias extra (todos laborables) = 8
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        // DATOS
        // Usuario introduce numero de dias

        // Que tengo que hacer con ellos
        // Calcular cuantos son laborables
        // Separar entre dias extra y semanas completas

        // Resultado final
        // Mostrar dias laborables
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero de dias: ");
        int dias = sc.nextInt();

        if (dias < 0){
            System.out.println("Valor no valido");
        } else {
            int semanas = dias / 7;
            int diasExtra = dias % 7;

            int laborables = semanas * 5;

            if (diasExtra <= 5) {
                laborables += diasExtra;
            } else {
                laborables += 5;
            }
            System.out.println("Dias laborables: " + laborables);
        }
    }
}
