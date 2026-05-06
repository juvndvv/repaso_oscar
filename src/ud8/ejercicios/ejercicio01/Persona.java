package ud8.ejercicios.ejercicio01;

public class Persona {
    private String nombre;
    private Direccion direccion;

    public Persona(String nombre, Direccion direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void presentarse() {
        System.out.println("Persona: " + nombre);
        if (direccion != null) {
            direccion.mostrar();
        }
    }
}
