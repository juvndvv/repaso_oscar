package ud8.ejercicios.ejercicio22;

/**
 * Ejercicio 22 - Composicion + Abstracta (Empresa con Empleados)
 *
 * Crea:
 *   - abstract class Empleado con protected String nombre, constructor y
 *     metodo abstracto double calcularPaga().
 *   - EmpleadoFijo extends Empleado con sueldo fijo (calcularPaga = sueldo).
 *   - EmpleadoPorHoras extends Empleado con horas y precioHora
 *     (calcularPaga = horas * precioHora).
 *   - Clase Empresa con private String nombre y ArrayList<Empleado>.
 *     Metodo contratar(Empleado e) y nominaTotal() que suma calcularPaga()
 *     de todos los empleados.
 *
 * En main crea Empresa con uno fijo y uno por horas y muestra la nomina total.
 *
 * Ejemplo de salida:
 *   Nomina total: 2400.0
 */
public class Ejercicio22 {
    public static void main(String[] args) {

    }
}
