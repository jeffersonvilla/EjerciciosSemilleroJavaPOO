package clasesyobjetos.ejercicio1;

public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+ this.nombre + " Edad: "+ this.edad);
    }
}
