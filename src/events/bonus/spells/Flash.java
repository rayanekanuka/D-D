package events.bonus.spells;

import characters.Hero;
import characters.Magician;

public class Flash extends Spell {

    public Flash() {
        super("Éclair", 2);
    }

    @Override
    public void interaction(Hero hero) {
        System.out.println("Vous avez jeté un Eclair ! Aux abris ! \n" + this);
        if (hero instanceof Magician) {
            System.out.println("What a damn Pikachu!");
            buff(hero);
            System.out.println("Vous passez à " + hero.getStrength() + " de force, n'est-ce pas incroyable????");
        } else {
            System.out.println("Eh non tu n'as pas le QI pour l'utiliser musclor");
        }
    }
}
