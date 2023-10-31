package events.bonus.weapons;

import characters.Hero;

public class Hammer extends Weapon{

    public Hammer() {
        super("Massue", 3);
    }

    @Override
    public void interaction(Hero hero) {
        System.out.println("Vous avez récupéré une massue ! \n" + this);
    }

    @Override
    public String toString() {
        return "Prends cette " + this.name + " avec : " + this.strength + " de points de force !";
    }
}
