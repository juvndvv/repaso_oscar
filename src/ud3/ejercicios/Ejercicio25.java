package ud3.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 25 — Ejercicio integrador: Registro de temperaturas
 *
 * Pide al usuario las temperaturas de los 7 dias de la semana.
 * Almacenalas en un array y calcula:
 *   - La temperatura media de la semana
 *   - El dia mas caluroso y el mas frio (muestra el nombre del dia)
 *   - Cuantos dias estuvieron por encima de la media
 *
 * Ejemplo:
 *   Temperatura Lunes: 22.5
 *   Temperatura Martes: 25.0
 *   ...
 *   Media semanal: 23.50 grados
 *   Dia mas caluroso: Martes (25.00 grados)
 *   Dia mas frio: Domingo (18.00 grados)
 *   Dias por encima de la media: 3
 */
public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        double[] temperaturas = new double[7];




        sc.close();
    }
}
