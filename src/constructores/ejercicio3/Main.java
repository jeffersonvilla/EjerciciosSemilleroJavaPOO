package constructores.ejercicio3;

import java.util.List;

/*
 * Ejercicio 3: Sobrecarga los constructores para que también
 * acepten una lista de descuentos.
 */
public class Main {

    public static void main(String[] args) {

        Producto producto = new Producto("producto1", 1000, List.of(3, 6, 7));

        producto.mostrarInfo();
    }
}
