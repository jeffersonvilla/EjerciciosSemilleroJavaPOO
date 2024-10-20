package constructores.ejercicio1;

/*
 * Ejercicio 1: Crea una clase Producto con un constructor
 * que acepte un nombre y un precio.
 */
public class Main {

    public static void main(String[] args) {

        Producto producto = new Producto("producto1", 1000);

        producto.mostrarInfo();
    }
}
