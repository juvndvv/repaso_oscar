package ud2.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 03 — Sistema de login basico
 *
 * El programa tiene un usuario y contrasena fijos (por ejemplo, "admin" y "1234").
 * El usuario tiene 3 intentos para acertar ambos.
 * Si falla los 3, muestra "Cuenta bloqueada".
 * Si acierta, muestra "Bienvenido".
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String USER = "admin";
        final String PASS = "1234";

        int intento = 0;
        do {
            System.out.println("Introduce tu usuario: ");
            String usuario = sc.nextLine();

            System.out.println("Introduce la contraseña");
            String contrasena = sc.nextLine();

            if (usuario.equals(USER) && contrasena.equals(PASS)) {
                break;
            }

            intento++;
        } while (intento < 3);

        sc.close();
    }
}
