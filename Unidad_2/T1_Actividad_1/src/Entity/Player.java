package entity;

import interfaces.CombatEntity;
import interfaces.SharedBehavior;

public class Player extends Entity implements SharedBehavior, CombatEntity {
    public Player(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack(Entity target) {
        System.out.printf("%s está atacando a %s\n", this.getName(), target.getName());
    }

    @Override
    public void takeDamage(int damage) {
        System.out.printf("%s recibe %d de daño\n", this.getName(), damage);
        this.setHealth(this.getHealth() - damage);
        if (this.getHealth() <= 0) {
            System.out.printf("%s ha sido derrotado\n Game Over\n", this.getName());
        }
    }

    @Override
    public void move(int x, int y) {
        System.out.printf("%s se mueve %d en \"x\" y %d en \"y\"\n",getName() ,x, y);
    }
}
