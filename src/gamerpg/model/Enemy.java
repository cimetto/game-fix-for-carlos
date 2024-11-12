package gamerpg.model;

public class Enemy {
    private String name;
    private int hp;
    
    public Enemy(String name, int hp){
        this.hp = hp;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
    
    public void takeDamage(int damage) {
        this.hp -= damage;
    }
}