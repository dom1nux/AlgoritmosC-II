package enemy;

import entity.Enemy;
import entity.Entity;

public class Goblin extends Enemy {
    public Goblin(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack(Entity target) {
        super.attack(target);
        int damage = 20;
        System.out.printf("El goblin hace %d de daño\n", damage);
    }
}
