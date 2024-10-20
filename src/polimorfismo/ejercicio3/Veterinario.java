package polimorfismo.ejercicio3;

public class Veterinario {

    public void atenderAnimal(Animal animal){
        System.out.println("El veterinario esta atendiendo un animal");
        animal.hacerSonido();
    }
}
