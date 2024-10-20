package encapsulamiento.ejercicio3;

/*
 * Ejercicio 3: Crea una clase CuentaBancaria con atributos saldo y titular.
 * Implementa métodos para depositar y retirar dinero,
 * asegurando que no se pueda retirar más del saldo disponible.
 */
public class Main {

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria(1000.0, "Pedro");

        System.out.println("Titular: " + cuenta.getTitular() + " Saldo: " + cuenta.getSaldo());

        cuenta.depositar(500.0);

        System.out.println("Titular: " + cuenta.getTitular() + " Saldo: " + cuenta.getSaldo());

        cuenta.retirar(1400.0);

        System.out.println("Titular: " + cuenta.getTitular() + " Saldo: " + cuenta.getSaldo());
    }
}
