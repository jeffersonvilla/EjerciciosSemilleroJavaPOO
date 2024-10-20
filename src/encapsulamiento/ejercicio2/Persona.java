package encapsulamiento.ejercicio2;

public class Persona {

    private String nombre;
    private int edad;
    private String nacionalidad;

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public String getNacionalidad(){
        return this.nacionalidad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        if(edad < 0){
            System.out.println("La edad no puede ser menor a cero");
        }else{
            this.edad = edad;
        }
    }

    public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + this.nombre + " Edad: " + this.edad + " Nacionalidad: " + this.nacionalidad);
    }
}
