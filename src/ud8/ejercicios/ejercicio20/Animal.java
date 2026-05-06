package ud8.ejercicios.ejercicio20;

public abstract class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void comer() {
        System.out.println(nombre + " esta comiendo");
    }

    public abstract void emitirSonido();
}
