package ud8.ejercicios.ejercicio40;

public abstract class AnimalZoo {
    protected String nombre;
    protected int edad;

    public AnimalZoo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void emitirSonido();

    public void mostrar() {
        System.out.println(getClass().getSimpleName() + " " + nombre + " (" + edad + " anyos)");
    }
}
