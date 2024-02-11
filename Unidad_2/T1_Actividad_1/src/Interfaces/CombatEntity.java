package interfaces;

import entity.Entity;

public interface CombatEntity {
    void attack(Entity target);
    void takeDamage(int damage);
}
