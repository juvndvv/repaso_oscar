package ud1.ejercicios;

/**
 * Ejercicio 08 — 🟡 Variables locales sin inicializar
 * Declara dos variables int sin inicializar e intenta imprimirlas.
 * ¿Compila? ¿Por qué?
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        // TODO: Descomenta las siguientes líneas. ¿Compila? ¿Por qué?

        // int a;
        // int b;
        // System.out.println(a);
        // System.out.println(b);

        // TODO: Explica qué error da y por qué:
        // Error de compilación: variable a (y b) might not have been initialized
        // Porque las variables locales NO tienen valor por defecto en Java

        // TODO: ¿Cómo lo solucionarías?
        // Inicializándolas antes de usarlas, por ejemplo:
        // int a = 0;
        // int b = 0;
    }
}
