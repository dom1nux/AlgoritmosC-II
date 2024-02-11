package entity;

import interfaces.SharedBehavior;

public class NonPlayer extends Entity implements SharedBehavior {
    public NonPlayer(String name, int health) {
        super(name, health);
    }

    @Override
    public void move(int x, int y) {
        System.out.printf("%s se mueve %d en \"x\" y %d en \"y\"\n", getName(), x, y);
    }
}
