package ud8.ejercicios.ejercicio10;

public class Programador extends Empleado {
    private double bonus;

    public Programador(String nombre, double salarioBase, double bonus) {
        super(nombre, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }
}
