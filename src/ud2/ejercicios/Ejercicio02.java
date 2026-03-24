package ud2.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 02 — Calculadora de combustible
 *
 * El usuario introduce los km recorridos y los litros consumidos.
 * Calcula el consumo por cada 100 km.
 * Si el consumo es mayor a 8L/100km, avisa que el coche gasta demasiado.
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        /*
        30km -> 10L
        100km -> x

        100 * consumo / km

         */
        Scanner sc = new Scanner(System.in);

        // Pedir datos
        System.out.println("Introduce los km recorridos: ");
        double km = sc.nextDouble();

        System.out.println("Introduce los litros consumidos: ");
        double litros = sc.nextDouble();

        // Cálculo consumo cada 100 km
        double consumo = (litros * 100) / km;

        // Mostrar resultado
        System.out.println("Consumo: " + consumo + " L/100km");

        // Condición
        if (consumo > 8) {
            System.out.println("El coche gasta demasiado");
        }

        sc.close();

    }
}
