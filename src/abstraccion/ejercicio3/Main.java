package abstraccion.ejercicio3;

/*
 * Ejercicio 3: Crea una clase abstracta `Empleado` con los métodos abstractos
 * `calcularSalario` y `mostrarDetalles`. Crea clases `EmpleadoFijo` y `EmpleadoTemporal`
 * que hereden de `Empleado` y sobrescriban los métodos para calcular el salario y
 * mostrar detalles específicos.
 * Luego, crea una clase `Empresa` que tenga una lista de `Empleado` y un metodo
 * `procesarSalarios`, que utilice polimorfismo para calcular y mostrar el salario
 * de cada empleado.
 */
public class Main {

    public static void main(String[] args) {

        EmpleadoFijo empleadoFijo = new EmpleadoFijo(1300.0, 200.0);
        EmpleadoTemporal empleadoTemporal = new EmpleadoTemporal(10.0, 120);

        Empresa empresa = new Empresa();

        empresa.agregarEmpleado(empleadoFijo);
        empresa.agregarEmpleado(empleadoTemporal);

        empresa.procesarSalarios();
    }
}
