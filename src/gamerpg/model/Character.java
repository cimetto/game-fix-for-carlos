package gamerpg.model;
import java.util.Random;

public class Character {
    private String name;
    private int damage;
    
    public void initCharacter(String name){
        Random generator = new Random();
        this.name = name;
        this.damage = 1 + generator.nextInt(99);
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
    
    public void attack(Enemy enemy) {
        enemy.takeDamage(this.damage);
        System.out.format("%s atacou %s e causou %d de dano! HP restante do inimigo: %d%n", name, enemy.getName(), damage, enemy.getHp());
    }
}