package events.bonus.spells;

import characters.Hero;

public class Flash extends Spell {

    public Flash() {
        super("Éclair", 2);
    }

    @Override
    public void interaction(Hero hero) {
        System.out.println("Vous avez jeté un Eclair ! Aux abris ! \n" + this);
    }

    @Override
    public String toString() {
        return "Un " + this.name + " va s'abattre, avec : " + this.strength + " de points de force !";
    }
}
