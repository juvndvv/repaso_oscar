package ud7.ejercicios.ejercicio30;

/**
 * Ejercicio 30 — Empleado completo (static + encapsulamiento + toString)
 *
 * Crea una clase Empleado con:
 *   - Atributos privados: int id, String nombre, double salario
 *   - Atributo static private int siguienteId = 1
 *   - Atributo static private int totalEmpleados = 0
 *   - Constructor que reciba nombre y salario; el id se asigna
 *     automaticamente desde siguienteId
 *   - Getters y setters (el setter de salario rechaza valores < 0)
 *   - Metodo static int getTotalEmpleados()
 *   - toString() con formato: "Empleado #ID nombre (salario eur)"
 *
 * En main crea 3 empleados, muestralos y muestra el total.
 *
 * Ejemplo de salida:
 *   Empleado #1 Ana (1500.0 eur)
 *   Empleado #2 Luis (1800.0 eur)
 *   Empleado #3 Marta (2000.0 eur)
 *   Total empleados: 3
 */
public class Ejercicio30 {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Ana", 1500.0);
        Empleado e2 = new Empleado("Luis", 1800.0);
        Empleado e3 = new Empleado("Marta", 2000.0);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("Total empleados: " + Empleado.getTotalEmpleados());
    }
}
