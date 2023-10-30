package events.enemies;

import device.Case;

public abstract class Enemy implements Case {

    protected String name;
    protected int hp;
    protected int strength;

    public Enemy(String name, int hp, int strength) {
        this.name = name;
        this.hp = hp;
        this.strength = strength;
    }

// ici combat avec les ennemis...

}
