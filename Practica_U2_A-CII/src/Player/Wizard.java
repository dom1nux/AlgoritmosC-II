package Player;

import Entity.Entity;
import Entity.Player;

public class Wizard extends Player {
    public Wizard(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack(Entity target) {
        super.attack(target);
        int damage = 4;
        System.out.printf("%d de daño\n", damage);
    }
}
