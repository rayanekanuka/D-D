package events.bonus.weapons;

import characters.Hero;

public class Hammer extends Weapon{
    public Hammer(String name, int attack) {
        super(name, attack);
    }

    public Hammer() {
        this("Massue", 3);
    }

    @Override
    public void interaction(Hero hero) {
        System.out.println("Vous avez récupéré une massue ! \n" + this);
    }

    @Override
    public String toString() {
        return "Nom de votre arme : " + this.name + "avec : " + this.strength + " de points de force !";
    }
}
