package herencia.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Garaje {

    private List<Vehiculo> vehiculos = new ArrayList<>();

    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }

    public void contarVehiculosPorTipo(){
        int carros = 0;
        int motos = 0;
        for(Vehiculo vehiculo: vehiculos){
            if(vehiculo instanceof Carro){
                carros++;
            }else if(vehiculo instanceof Moto){
                motos++;
            }
        }
        System.out.println("Carros: "+ carros + " Motos: " + motos);
    }
}
