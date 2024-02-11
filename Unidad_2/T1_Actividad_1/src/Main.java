import enemy.Goblin;
import enemy.Thief;
import nonplayer.Villager;
import player.Swordsman;
import player.Wizard;

public class Main {
    public static void main(String[] args) {
        Wizard player1 = new Wizard("Merlín", 20);
        Goblin enemy1 = new Goblin("Goblin", 30);
        Swordsman player2 = new Swordsman("Aragorn", 25);
        Thief enemy2 = new Thief("Robin", 40);
        Villager villager1 = new Villager("Aldeano", 15);

        player1.attack(enemy1);
        player1.move(10, 20);
        player2.attack(enemy2);
        enemy2.move(5, 10);
        player2.move(30, 40);
        villager1.move(50, 50);
    }
}