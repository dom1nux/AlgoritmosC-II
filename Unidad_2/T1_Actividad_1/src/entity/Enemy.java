package entity;

import interfaces.CombatEntity;
import interfaces.SharedBehavior;

public class Enemy extends Entity implements SharedBehavior, CombatEntity {
    public Enemy(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack(Entity target) {}

    @Override
    public void takeDamage(int damage) {}

    @Override
    public void move(int x, int y) {}
}
