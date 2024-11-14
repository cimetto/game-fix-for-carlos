package zoo.animals;

public class Cat extends Animal {
    
    public Cat(String name, String habitat, int numberOfPaws){
        super(name, habitat, numberOfPaws);
    }
    
    public void makeSound() {
        System.out.format("The cat %s make sound: Miau!\n", getName());
    }
    
}
