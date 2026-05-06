package ud8.ejercicios.ejercicio10;

public class Vendedor extends Empleado {
    private double comisiones;

    public Vendedor(String nombre, double salarioBase, double comisiones) {
        super(nombre, salarioBase);
        this.comisiones = comisiones;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comisiones;
    }
}
