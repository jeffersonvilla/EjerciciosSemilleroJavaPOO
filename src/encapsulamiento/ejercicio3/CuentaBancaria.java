package encapsulamiento.ejercicio3;

public class CuentaBancaria {

    private double saldo;
    private String titular;

    public CuentaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void depositar(double cantidad){
        if(cantidad < 0){
            System.out.println("Cantidad a depositar no puede ser negativa");
        }else{
            this.saldo += cantidad;
        }
    }

    public void retirar(double cantidad){
        if(cantidad < 0){
            System.out.println("Cantidad a retirar no puede ser negativa");
        }else if(cantidad <= saldo){
            this.saldo -= cantidad;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
}
