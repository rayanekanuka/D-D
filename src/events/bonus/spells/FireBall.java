package events.bonus.spells;

import characters.Hero;

public class FireBall extends Spell {

    public FireBall() {
        super("Boule de Feu", 7);
    }

    @Override
    public void interaction(Hero hero) {
        System.out.println("Vite saisissez cette Boule de Feu ! \n" + this);
    }

    @Override
    public String toString() {
        return "Une " + this.name + " va s'abattre, avec : " + this.strength + " de points de force !";
    }
}
