package ud7.ejercicios.ejercicio30;

public class Empleado {
    private int id;
    private String nombre;
    private double salario;

    private static int siguienteId = 1;
    private static int totalEmpleados = 0;

    public Empleado(String nombre, double salario) {
        this.id = siguienteId++;
        this.nombre = nombre;
        setSalario(salario);
        totalEmpleados++;
    }

    public int getId() { return id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        }
    }

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

    @Override
    public String toString() {
        return "Empleado #" + id + " " + nombre + " (" + salario + " eur)";
    }
}
