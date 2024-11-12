package zoo.animals;

public class Animal {
    // habitate (onde vive; água, solo, floresta etc...)
    String h;
    
    // número de patas, não pode ser negativo
    int nP;
    
    // TODO: implementar o construtor pra inicializar os valores
    
    // fazer som
    public void mkSnd(){ /* deve ser sobreescrito pelas subclasses*/ }
    
    public void voar(){
        System.out.print("Voando");
    }
    
    public String getH(){
        return h;
    }
    
    public void setNP(int nP){
        this.nP = nP;
    }   
}