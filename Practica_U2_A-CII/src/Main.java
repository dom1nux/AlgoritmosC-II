import Enemy.Goblin;
import Enemy.Thief;
import NonPlayer.Villager;
import Player.Swordsman;
import Player.Wizard;

public class Main {
    public static void main(String[] args) {
        Wizard player1 = new Wizard("Merlín", 20);
        Goblin enemy1 = new Goblin("Goblin", 30);
        Swordsman Player2 = new Swordsman("Aragorn", 25);
        Thief Enemy2 = new Thief("Thief", 40);
        Villager Villager = new Villager("Aldeano", 15);

        player1.attack(enemy1);
        player1.move(10, 20);
        Player2.attack(Enemy2);
        Enemy2.move(5, 10);
        Player2.move(30, 40);
        Villager.move(50, 50);
    }
}