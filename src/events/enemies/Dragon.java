package events.enemies;

import characters.Hero;

public class Dragon extends Enemy {

    public Dragon(String name, int hp, int strength) {
        super(name, hp, strength);
    }

    public Dragon() {
        this("Viserion", 15, 4);
        }

    @Override
    public void interaction(Hero hero) {
        System.out.println("Coucou Viserion, faite gaffe, ce Dragon ne rigole pas du tout !");
    }
}
