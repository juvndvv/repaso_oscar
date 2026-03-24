package ud1.ejercicios;

/**
 * Ejercicio 10 — 🔴 Literales float vs double
 * Explica la diferencia entre estas dos líneas:
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        float a = 3.14f;  // ← Esta línea compila

        // TODO: Descomenta la siguiente línea. ¿Qué ocurre?
        // float b = 3.14;

        // TODO: Explica la diferencia entre ambas líneas:
        // ¿Qué tipo de dato es el literal 3.14 por defecto?
        // double
        // ¿Por qué necesitamos el sufijo 'f'?
        // Porque sin 'f' el número es double, y no se puede asignar directamente a float sin conversión
        // ¿Qué error da la línea b?
        // Error de compilación: possible lossy conversion from double to float

        System.out.println(a);
    }
}
