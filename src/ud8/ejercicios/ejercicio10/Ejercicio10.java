package ud8.ejercicios.ejercicio10;

/**
 * Ejercicio 10 - Empleados con calculo de salario
 *
 * Clase abstracta Empleado con nombre, salarioBase y metodo abstracto
 * calcularSalario(). Hijas Vendedor (anyade comisiones) y Programador
 * (anyade bonus). Cada una implementa calcularSalario() de forma distinta.
 *
 * Demuestra polimorfismo: array de Empleado con un Vendedor y un Programador,
 * recorre y muestra el salario calculado de cada uno.
 *
 * Ejemplo de salida:
 *   Vendedor Ana cobra 1700.0
 *   Programador Luis cobra 2300.0
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[2];
        empleados[0] = new Vendedor("Ana", 1500, 200);
        empleados[1] = new Programador("Luis", 2000, 300);

        for (Empleado e : empleados) {
            e.mostrarSalario();
        }
    }
}
