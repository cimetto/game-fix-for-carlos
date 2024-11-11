package gamerpg.model;
import java.util.Random;

public class Character {
    public String name;
    public int hp;
    public int damage;
    
    // rng
    public Random generator = new Random();
    
    /*
     Ao criar um objeto Character é necessario que seu
     valores sejam iniciados
    */
    public void initCharacter(String name){
        this.name = name;
        this.hp = generator.nextInt();
        this.damage = generator.nextInt();
    }
    
    public void attack(Enemy enemy){
        enemy.hp -= this.damage;
    }
}