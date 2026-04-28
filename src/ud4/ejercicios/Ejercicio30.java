package ud4.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 30 — Registro de notas por alumno y asignatura
 *
 * Pide al usuario las notas de 4 alumnos en 3 asignaturas y almacenalas
 * en una matriz donde cada fila es un alumno y cada columna una asignatura.
 * Calcula y muestra:
 *   - La nota media de cada alumno
 *   - La nota media de cada asignatura
 *   - El alumno con la mejor media
 *
 * Ejemplo:
 *   Nota alumno 1, asignatura 1: 7.5
 *   ...
 *   Media alumno 1: 6.50
 *   Media alumno 2: 8.00
 *   Media alumno 3: 5.33
 *   Media alumno 4: 7.17
 *   Media asignatura 1: 7.00
 *   Media asignatura 2: 6.50
 *   Media asignatura 3: 6.75
 *   Mejor alumno: alumno 2 (media = 8.00)
 */
public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAlumnos = 4;
        int numAsignaturas = 3;
        double[][] notas = new double[numAlumnos][numAsignaturas];

        sc.close();
    }
}
