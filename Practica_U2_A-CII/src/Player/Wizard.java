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
        int damage = 30;
        System.out.printf(name + "hace %d de daño\n", damage);
    }
}
