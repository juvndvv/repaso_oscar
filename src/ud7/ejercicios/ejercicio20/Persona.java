package ud7.ejercicios.ejercicio20;

public class Persona {
    private String nombre;
    private int edad;

    public Persona() {
        this.nombre = "Desconocido";
        this.edad = 0;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        setEdad(edad);
    }

    public Persona(Persona otra) {
        this.nombre = otra.nombre;
        this.edad = otra.edad;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        }
    }

    public void presentarse() {
        System.out.println("Hola, me llamo " + nombre + " y tengo " + edad + " anyos");
    }
}
