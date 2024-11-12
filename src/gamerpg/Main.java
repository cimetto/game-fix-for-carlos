package gamerpg;
import gamerpg.model.Character;
import gamerpg.model.Enemy;

public class Main {
    public static void main(String[] args) {
        Character character = new Character();
        character.initCharacter("João");
        Enemy enemy = new Enemy("goblin", 100);
        character.attack(enemy);
    }    
}
