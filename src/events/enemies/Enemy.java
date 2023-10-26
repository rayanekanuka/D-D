package events.enemies;

import device.Case;

public abstract class Enemy implements Case {
    protected String name;
    protected int hp;
    protected int attack;

    public Enemy() {
    }


  /*  public Enemy(String name, int healthPoints, int attackPoints) {
        this.name = name;
        this.hp = healthPoints;
        this.attack = attackPoints;
    } */
}
