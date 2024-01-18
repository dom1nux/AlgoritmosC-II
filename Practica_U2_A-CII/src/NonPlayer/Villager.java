package NonPlayer;

import Entity.NonPlayer;
import Interfaces.SharedBehavior;

public class Villager extends NonPlayer implements SharedBehavior {
    public Villager(String name, int health) {
        super(name, health);
    }
}
