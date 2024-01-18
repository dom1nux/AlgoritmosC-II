package Entity;

import Entity.Entity;
import Interfaces.CombatEntity;
import Interfaces.SharedBehavior;

public class NonPlayer extends Entity implements SharedBehavior, CombatEntity {
    public NonPlayer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack(Entity target) {

    }

    @Override
    public void takeDamage(int damage) {

    }

    @Override
    public void move(int x, int y) {
        System.out.printf("%s se mueve %d horizontalmente y %d verticalmente\n",getName() ,x, y);
    }
}
