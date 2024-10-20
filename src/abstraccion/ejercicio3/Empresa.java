package abstraccion.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Empleado> empleados = new ArrayList<>();

    public void agregarEmpleado(Empleado empleado){
        this.empleados.add(empleado);
    }

    public void procesarSalarios(){
        for(Empleado empleado : empleados){
            double salario = empleado.calcularSalario();
            System.out.println(empleado.mostrarDetalles());
            System.out.println("Salario: "+ salario + "\n--------------------");
        }
    }
}
