package enemy;

import entity.Enemy;
import entity.Entity;

public class Thief extends Enemy {
    public Thief(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack(Entity target) {
        super.attack(target);
        int damage = 25;
        System.out.printf("El ladron hace %d de daño\n", damage);
    }
}
