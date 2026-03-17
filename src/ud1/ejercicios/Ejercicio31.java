package ud1.ejercicios;

/**
 * Ejercicio 31 — 🟢 Casting implícito vs explícito
 * ¿Cuál de estas asignaciones necesita casting explícito y cuál no?
 */
public class Ejercicio31 {
    public static void main(String[] args) {
        int a = 10;
        long b = a;           // ¿Necesita casting? →
        double c = a;         // ¿Necesita casting? →
        int d = (int) 3.9;   // ¿Qué valor tiene d? →
        float e = (float) a; // ¿Es necesario el casting explícito? →

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        // TODO: Explica qué es el "widening" (ampliación) y el "narrowing" (estrechamiento):
        //
    }
}
