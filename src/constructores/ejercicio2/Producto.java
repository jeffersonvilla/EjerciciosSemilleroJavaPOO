package constructores.ejercicio2;

public class Producto {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(String nombre, double precio, int descuento){
        this.nombre = nombre;
        this.precio = precio - (precio * descuento / 100);
    }

    public void mostrarInfo(){
        System.out.println(this.nombre + " " + this.precio);
    }
}
