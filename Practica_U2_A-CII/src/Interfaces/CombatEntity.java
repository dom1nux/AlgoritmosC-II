package Interfaces;

import Entity.Entity;

public interface CombatEntity {
    void attack(Entity target);
    void takeDamage(int damage);
}
