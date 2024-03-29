package events.enemies;

import characters.Hero;

public class Gobelin extends Enemy {
    public Gobelin(String name, int hp, int strength) {
        super(name, hp, strength);
    }

    public Gobelin() {
        this("Gobelin", 6, 1);
    }

    @Override
    public void interaction(Hero hero) {
        System.out.println("Hey c'est le Gobelin, nouvel habitant de la Moria ! \n" + this);
        super.attack(hero);
    }
}
