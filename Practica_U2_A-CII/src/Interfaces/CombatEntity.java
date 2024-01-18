package Interfaces;

import Entity.Entity;

public interface CombatEntity {
    public abstract void attack(Entity target);
    public abstract void takeDamage(int damage);
}
