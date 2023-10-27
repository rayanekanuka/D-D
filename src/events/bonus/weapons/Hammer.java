package events.bonus.weapons;

import characters.Hero;

public class Hammer extends Weapon{
    public Hammer(String name) {
        super(name);
    }

    @Override
    public void interaction(Hero hero) {
        System.out.println("Vous avez récupéré une massue !");
    }
}
