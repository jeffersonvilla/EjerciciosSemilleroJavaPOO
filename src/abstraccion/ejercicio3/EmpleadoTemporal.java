package abstraccion.ejercicio3;

public class EmpleadoTemporal extends Empleado{

    private double valorHora;
    private int horasTrabajadas;

    public EmpleadoTemporal(double valorHora, int horasTrabajadas) {
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return this.valorHora * this.horasTrabajadas;
    }

    @Override
    public String mostrarDetalles() {
        return "EmpleadoTemporal{" +
                "valorHora=" + valorHora +
                ", horasTrabajadas=" + horasTrabajadas +
                '}';
    }

}
