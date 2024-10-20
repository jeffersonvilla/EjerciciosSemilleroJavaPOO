package constructores.ejercicio2;

/*
 * Ejercicio 2: Añade un segundo constructor que acepte un descuento adicional
 * y modifique el precio según el descuento
 */
public class Main {

    public static void main(String[] args) {

        Producto producto = new Producto("producto1", 1000, 15);

        producto.mostrarInfo();
    }
}
