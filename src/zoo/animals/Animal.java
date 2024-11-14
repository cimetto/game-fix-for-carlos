package zoo.animals;

public class Animal {
    
    private String habitat;
    private String name; // habitate (onde vive; água, solo, floresta etc...)
    private int numberOfPaws; // número de patas, não pode ser negativo   
    
    public Animal(String name, String habitat, int numberOfPaws){
        this.name = name;
        this.habitat = habitat;
        this.numberOfPaws = numberOfPaws;
    }
    // fazer som
    public void makeSound(){
    /* deve ser sobreescrito pelas subclasses*/ 
    }
    
    public void infoAnimal(){
        System.out.format("Name: %s\nHabitat: %s\nPaws: %d\n", name, habitat, numberOfPaws);
    }
       
    public String getHabitate(){
        return habitat;
    }
    
    public String getName(){
        return name;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }
      
}