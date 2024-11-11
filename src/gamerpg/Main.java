package gamerpg;
import gamerpg.model.*;

public class Main {
    public static void main(String[] args) {
        gamerpg.model.Character character = new gamerpg.model.Character();
        character.initCharacter("João");
        Enemy enemy = new Enemy("goblin", 100);
        character.attack(enemy);
    }    
}
