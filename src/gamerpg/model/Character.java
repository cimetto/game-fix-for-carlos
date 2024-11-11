package gamerpg.model;
import java.util.Random;

public class Character {
    public String name;
    public int damage;
    
    public void initCharacter(String name){
        Random generator = new Random();
        this.name = name;
        this.damage = 1 + generator.nextInt(99);
    }
    
    public void attack(Enemy enemy){
        enemy.hp -= this.damage;
        System.out.format("%s atacou %s e causou %d de dano! HP restante do inimigo: %d%n", name, enemy.name, damage, enemy.hp);
    }
}