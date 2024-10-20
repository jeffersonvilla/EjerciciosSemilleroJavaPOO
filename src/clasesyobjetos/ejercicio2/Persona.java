package clasesyobjetos.ejercicio2;

public class Persona {

    private String nombre;
    private int edad;
    private String nacionalidad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre, int edad, String nacionalidad){
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+ this.nombre + " Edad: "+ this.edad);
    }

    public void actualizarEdad(int nuevaEdad){
        this.edad = nuevaEdad;
    }
}
