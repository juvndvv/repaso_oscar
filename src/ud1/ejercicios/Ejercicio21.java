package ud1.ejercicios;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de segundos: ");
        int totalSegundos = sc.nextInt();

        System.out.println(totalSegundos / 60);
        System.out.println(totalSegundos % 60);

        int horas = totalSegundos / 3600; // 1.5 -> 1
        int minutos = (totalSegundos % 3600) / 60; // elimina las horas y convierte a minutos
        int segundos = totalSegundos % 60; // Segundos restantes

        System.out.println(horas + " horas, " + minutos + " minutos, " + segundos + " segundos");

        sc.close();
    }
}