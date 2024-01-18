package Player;

import Entity.Entity;
import Entity.Player;

public class Swordman extends Player {

    public Swordman(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack(Entity target) {
        super.attack(target);
        int damage = 40;
        System.out.printf(name + "hace %d de daño\n", damage);

    }
}
