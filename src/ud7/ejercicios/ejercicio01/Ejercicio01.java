package ud7.ejercicios.ejercicio01;

/**
 * Ejercicio 01 — Clase Punto
 *
 * Crea una clase Punto con atributos privados x e y, constructor completo,
 * getters/setters y un metodo mostrar() que imprima sus coordenadas.
 *
 * Ejemplo de salida:
 *   Punto A: (3.0, 5.0)
 *   Punto B: (-1.0, 2.0)
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Punto a = new Punto(3.0, 5.0);
        Punto b = new Punto(-1.0, 2.0);
        System.out.print("Punto A: ");
        a.mostrar();
        System.out.print("Punto B: ");
        b.mostrar();
    }
}
