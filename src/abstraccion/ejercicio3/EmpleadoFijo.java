package abstraccion.ejercicio3;

public class EmpleadoFijo extends Empleado{

    private double salarioBase;
    private double bonificacion;

    public EmpleadoFijo(double salarioBase, double bonificacion) {
        this.salarioBase = salarioBase;
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase + this.bonificacion;
    }

    @Override
    public String mostrarDetalles() {
        return "EmpleadoFijo{" +
                "salarioBase=" + salarioBase +
                ", bonificacion=" + bonificacion +
                '}';
    }
}
