package zoo.animals;

public class Pigeon extends Animal {

    public Pigeon(String name, String habitat, int numberOfPaws){
        super(name, habitat, numberOfPaws);
    }
    
    public void makeSound() {
        System.out.format("The pigeon %s make sound: Pruuu~!\n", getName());
    }
    
    public void fly(){
        System.out.println("Flying high in the sky!");
    }
}