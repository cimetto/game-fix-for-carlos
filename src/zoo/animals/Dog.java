package zoo.animals;

public class Dog extends Animal {

    public Dog(String name, String habitat, int numberOfPaws){
        super(name, habitat, numberOfPaws);
    }
    
    public void makeSound() {
        System.out.format("The dog %s make sound: Au Au!\n", getName());
    }
    
}
