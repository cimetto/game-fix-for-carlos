package zoo;

import zoo.animals.Cat;
import zoo.animals.Dog;
import zoo.animals.Pigeon;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Junin", "Casa", 4);
        dog.infoAnimal();
        dog.makeSound();
        
        System.out.println("--------------------------------");
        
        Cat cat = new Cat("Garfield", "Cama", 4);
        cat.infoAnimal();
        cat.makeSound();
        
        System.out.println("--------------------------------");
        
        Pigeon pigeon = new Pigeon("SEDEX", "Cidade", 2);
        pigeon.infoAnimal();
        pigeon.makeSound();
        pigeon.fly();
    }
}