package constructores.ejercicio3;

import java.util.List;

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

    public Producto(String nombre, double precio, List<Integer> descuentos){
        this.nombre = nombre;
        double precioOriginal = precio;
        for(int descuento : descuentos){
            precio -= (precioOriginal * descuento / 100);
        }
        this.precio = precio;
    }

    public void mostrarInfo(){
        System.out.println(this.nombre + " " + this.precio);
    }
}
