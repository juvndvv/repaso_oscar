package ud8.ejercicios.ejercicio01;

public class Direccion {
    private String calle;
    private String ciudad;

    public Direccion(String calle, String ciudad) {
        this.calle = calle;
        this.ciudad = ciudad;
    }

    public void mostrar() {
        System.out.println("Vive en " + calle + ", " + ciudad);
    }
}
