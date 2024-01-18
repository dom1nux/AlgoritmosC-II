import Enemy.Goblin;
import Enemy.Thief;
import Player.Swordman;
import Player.Wizard;

public class Main {
    public static void main(String[] args) {


        Wizard player1 = new Wizard("Merlín", 20);
        Goblin enemy1 = new Goblin("Goblin", 30);
        Swordman Player2 = new Swordman("Aragorn", 25);
        Thief Enemy2 = new Thief("Thief", 40);

                player1.attack(enemy1);
                enemy1.takeDamage(30);
                player1.move(10, 20);
                Player2.attack(Enemy2);
                Enemy2.takeDamage(40);
                Enemy2.move(5, 10);
                Player2.move(30, 40);




    }
}