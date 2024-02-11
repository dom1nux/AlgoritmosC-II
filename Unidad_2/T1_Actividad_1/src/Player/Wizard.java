package player;

import entity.Entity;
import entity.Player;

public class Wizard extends Player {
    public Wizard(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack(Entity target) {
        super.attack(target);
        int damage = 30;
        System.out.printf("%s hace %d de daño\n", name, damage);
    }
}
